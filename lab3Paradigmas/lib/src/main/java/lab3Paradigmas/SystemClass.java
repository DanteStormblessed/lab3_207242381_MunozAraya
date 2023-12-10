package lab3Paradigmas;

import java.util.ArrayList;

public class SystemClass {
	String name;
	int initialChatbotCodeLink;
	ArrayList<Chatbot> chatbots;
	ArrayList<User> registeredUsers;
	ArrayList<User> activeUser;
	
	
	public SystemClass(String name, int initialChatbotCodeLink, ArrayList<Chatbot> chatbots) {
		this.name = name;
		this.initialChatbotCodeLink = initialChatbotCodeLink;
		this.chatbots = new ArrayList<>();
		this.registeredUsers = new ArrayList<>();
		this.activeUser = new ArrayList<>();
		for (Chatbot chatbot : chatbots) {
            boolean exists = false;
            for (Chatbot existingChatbot : this.chatbots) {
                if (existingChatbot.getChatbotID() == chatbot.getChatbotID()) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                this.chatbots.add(chatbot);
            } else {
                System.out.println("El Chatbot con ID " + chatbot.getChatbotID() + " ya está en el Systema.");
            }
        }
	}
	
	//CONSTRUCTOR DEL SISTEMA SIN INGRESAR UNA LISTA DE USUARIOS REGISTRADOS
	public SystemClass(String name, int initialChatbotCodeLink, ArrayList<Chatbot> chatbots, ArrayList<User> activeUser) {
		this.name = name;
		this.initialChatbotCodeLink = initialChatbotCodeLink;	
		this.chatbots = new ArrayList<>();
		this.registeredUsers = new ArrayList<>();
		this.activeUser = new ArrayList<>();
		for (Chatbot chatbot : chatbots) {
            boolean exists = false;
            for (Chatbot existingChatbot : this.chatbots) {
                if (existingChatbot.getChatbotID() == chatbot.getChatbotID()) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                this.chatbots.add(chatbot);
            } else {
                System.out.println("El Chatbot con ID " + chatbot.getChatbotID() + " ya está en el Systema.");
            }
        }
	}
	//CONSTRUCTOR DEL SISTEMA INGRESANDO UNA LISTA DE USUARIOS REGISTRADOS
	public SystemClass(String name, int initialChatbotCodeLink, ArrayList<Chatbot> chatbots, ArrayList<User> registeredUsers, ArrayList<User> activeUser) {
		this.name = name;
		this.initialChatbotCodeLink = initialChatbotCodeLink;	
		this.chatbots = new ArrayList<>();
		this.registeredUsers = new ArrayList<>();
		this.activeUser = new ArrayList<>();
		for (Chatbot chatbot : chatbots) {
            boolean exists = false;
            for (Chatbot existingChatbot : this.chatbots) {
                if (existingChatbot.getChatbotID() == chatbot.getChatbotID()) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                this.chatbots.add(chatbot);
            } else {
                System.out.println("El Chatbot con ID " + chatbot.getChatbotID() + " ya está en el Systema.");
            }
        }
		for (User user : registeredUsers) {
            boolean exists = false;
            for (User existingUser : this.registeredUsers) {
                if (existingUser.username.equals(user.username)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                this.registeredUsers.add(user);
            } else {
                System.out.println("El usuario " + user.username + " ya está en el Systema.");
            }
        }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInitialChatbotCodeLink() {
		return initialChatbotCodeLink;
	}

	public void setInitialChatbotCodeLink(int initialChatbotCodeLink) {
		this.initialChatbotCodeLink = initialChatbotCodeLink;
	}

	public ArrayList<Chatbot> getChatbots() {
		return chatbots;
	}

	public void setChatbots(ArrayList<Chatbot> chatbots) {
		this.chatbots = chatbots;
	}
	
	
	public ArrayList<User> getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(ArrayList<User> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	public ArrayList<User> getActiveUser() {
		return activeUser;
	}
	
	public User obtenerPrimerUsuarioActivo() {
        if (activeUser != null && !activeUser.isEmpty()) {
            return activeUser.get(0);
        } else {
            System.out.println("No hay usuarios activos en este momento.");
            return null;
        }
    }

	public void setActiveUser(ArrayList<User> activeUser) {
		this.activeUser = activeUser;
	}

	public void systemAddChatbot(Chatbot newChatbot) {
        boolean exists = false;
        for (Chatbot chatbot : chatbots) {
            if (chatbot.getChatbotID() == newChatbot.getChatbotID()) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            chatbots.add(newChatbot);
        } else {
            System.out.println("El Chatbot con ID " + newChatbot.getChatbotID() + " ya está en el systema.");
        }
    }
	
	public void systemAddUser(User newUser) {
        boolean exists = false;
        for (User existingUser : this.registeredUsers) {
            if (existingUser.username.equals(newUser.username)) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            this.registeredUsers.add(newUser);
        } else {
            System.out.println("El usuario " + newUser.username + " ya está en el Systema.");
        }
    }
	
	public void systemLogin(User newUser) {
		if(activeUser.isEmpty()) {
			activeUser.add(newUser);
		}
        else {
            System.out.println("El usuario " + newUser.username + " no puede logearse en el sistema, porque ya hay un usuario logeado.");
        }
    }
	public void systemLogout() {
		activeUser.clear();
    }
	
	public void systemTalk(String message){
		User activeUser = obtenerPrimerUsuarioActivo();
        ChatHistory historial = activeUser.getHistorial();
        ArrayList<Message> messages = historial.getMessages();
        

        Message ultimoMensaje = messages.get(messages.size() - 1); // Obtiene el último mensaje
        int newIDChatbot = ultimoMensaje.getChatbotID();
        int newIDFlow = ultimoMensaje.getFlowID();
        Chatbot chatbotActual = new Chatbot();
        for (Chatbot chatbot : chatbots) {
        	if(chatbot.getChatbotID() == newIDChatbot) {
        		chatbotActual = chatbot;
        	}
        }
        ArrayList<Flow> flowsDelCBActual = chatbotActual.getFlows();
        Flow flowActual = new Flow();
        for (Flow flow : flowsDelCBActual) {
        	if(flow.getId() == newIDFlow) {
        		flowActual = flow;
        	}
        }
        ArrayList<Option> OpcionesActuales = flowActual.getOptions();
        
        
        
        try {
            int numeroComoEntero = Integer.parseInt(message);
            for (Option option : OpcionesActuales) {
            	if(numeroComoEntero == option.getId()) {
            		String messageActual = option.getMessage();
            		int flowNextID = option.getInitialFlowCodeLink();
            		int ChatbotNextID = option.getChatbotCodeLink();
            		Message newMessage = new Message(messageActual, ChatbotNextID, flowNextID, numeroComoEntero);
            		messages.add(newMessage);
            	}
            }
            
        } catch (NumberFormatException e) {
        	for (Option option : OpcionesActuales) {
            	String messageActual = option.getMessage();
        		if(message.equals(messageActual)) {
            		int optionNextID = option.getId();
            		int flowNextID = option.getInitialFlowCodeLink();
            		int ChatbotNextID = option.getChatbotCodeLink();
            		Message newMessage = new Message(messageActual, ChatbotNextID, flowNextID, optionNextID);
            		messages.add(newMessage);
            	}
            }
        	
            System.out.println("Mensaje ingresado no es numerico, buscando segun palabras clave...");
        }
     
        activeUser = obtenerPrimerUsuarioActivo();
        historial = activeUser.getHistorial();
        messages = historial.getMessages();
        

        ultimoMensaje = messages.get(messages.size() - 1); // Obtiene el último mensaje
        newIDChatbot = ultimoMensaje.getChatbotID();
        newIDFlow = ultimoMensaje.getFlowID();
        chatbotActual = new Chatbot();
        for (Chatbot chatbot : chatbots) {
        	if(chatbot.getChatbotID() == newIDChatbot) {
        		chatbotActual = chatbot;
        	}
        }
        flowsDelCBActual = chatbotActual.getFlows();
        flowActual = new Flow();
        for (Flow flow : flowsDelCBActual) {
        	if(flow.getId() == newIDFlow) {
        		flowActual = flow;
        	}
        }
        OpcionesActuales = flowActual.getOptions();
        
      //aqui se imprime el ultimo mensaje
        System.out.println(chatbotActual.getWelcomeMessage());
        System.out.println(flowActual.getMessage());
        for (Option option : OpcionesActuales) {
        	System.out.println(option.getId()+ ") " + option.getMessage());
        }
             				
	}
}
