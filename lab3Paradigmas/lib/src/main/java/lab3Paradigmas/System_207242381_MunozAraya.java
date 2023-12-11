package lab3Paradigmas;

import java.util.ArrayList;

public class System_207242381_MunozAraya {
	String name;
	int initialChatbotCodeLink;
	ArrayList<Chatbot_207242381_MunozAraya> chatbots;
	ArrayList<User_207242381_MunozAraya> registeredUsers;
	ArrayList<User_207242381_MunozAraya> activeUser;
	
	
	public System_207242381_MunozAraya(String name, int initialChatbotCodeLink, ArrayList<Chatbot_207242381_MunozAraya> chatbots) {
		this.name = name;
		this.initialChatbotCodeLink = initialChatbotCodeLink;
		this.chatbots = new ArrayList<>();
		this.registeredUsers = new ArrayList<>();
		this.activeUser = new ArrayList<>();
		for (Chatbot_207242381_MunozAraya chatbot : chatbots) {
            boolean exists = false;
            for (Chatbot_207242381_MunozAraya existingChatbot : this.chatbots) {
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
	
	public System_207242381_MunozAraya(String name, int initialChatbotCodeLink, ArrayList<Chatbot_207242381_MunozAraya> chatbots, ArrayList<User_207242381_MunozAraya> activeUser) {
		this.name = name;
		this.initialChatbotCodeLink = initialChatbotCodeLink;	
		this.chatbots = new ArrayList<>();
		this.registeredUsers = new ArrayList<>();
		this.activeUser = new ArrayList<>();
		for (Chatbot_207242381_MunozAraya chatbot : chatbots) {
            boolean exists = false;
            for (Chatbot_207242381_MunozAraya existingChatbot : this.chatbots) {
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
	public System_207242381_MunozAraya(String name, int initialChatbotCodeLink, ArrayList<Chatbot_207242381_MunozAraya> chatbots, ArrayList<User_207242381_MunozAraya> registeredUsers, ArrayList<User_207242381_MunozAraya> activeUser) {
		this.name = name;
		this.initialChatbotCodeLink = initialChatbotCodeLink;	
		this.chatbots = new ArrayList<>();
		this.registeredUsers = new ArrayList<>();
		this.activeUser = new ArrayList<>();
		for (Chatbot_207242381_MunozAraya chatbot : chatbots) {
            boolean exists = false;
            for (Chatbot_207242381_MunozAraya existingChatbot : this.chatbots) {
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
		for (User_207242381_MunozAraya user : registeredUsers) {
            boolean exists = false;
            for (User_207242381_MunozAraya existingUser : this.registeredUsers) {
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

	public ArrayList<Chatbot_207242381_MunozAraya> getChatbots() {
		return chatbots;
	}

	public void setChatbots(ArrayList<Chatbot_207242381_MunozAraya> chatbots) {
		this.chatbots = chatbots;
	}
	
	
	public ArrayList<User_207242381_MunozAraya> getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(ArrayList<User_207242381_MunozAraya> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	public ArrayList<User_207242381_MunozAraya> getActiveUser() {
		return activeUser;
	}
	
	public User_207242381_MunozAraya obtenerPrimerUsuarioActivo() {
        if (activeUser != null && !activeUser.isEmpty()) {
            return activeUser.get(0);
        } else {
            System.out.println("No hay usuarios activos en este momento.");
            return null;
        }
    }

	public void setActiveUser(ArrayList<User_207242381_MunozAraya> activeUser) {
		this.activeUser = activeUser;
	}

	public void systemAddChatbot(Chatbot_207242381_MunozAraya newChatbot) {
        boolean exists = false;
        for (Chatbot_207242381_MunozAraya chatbot : chatbots) {
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
	
	public void systemAddUser(User_207242381_MunozAraya newUser) {
        boolean exists = false;
        for (User_207242381_MunozAraya existingUser : this.registeredUsers) {
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
	
	public void systemLogin(User_207242381_MunozAraya newUser) {
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
		User_207242381_MunozAraya activeUser = obtenerPrimerUsuarioActivo();
        ChatHistory_207242381_MunozAraya historial = activeUser.getHistorial();
        ArrayList<Message_207242381_MunozAraya> messages = historial.getMessages();
        

        Message_207242381_MunozAraya ultimoMensaje = messages.get(messages.size() - 1); // Obtiene el último mensaje
        int newIDChatbot = ultimoMensaje.getChatbotID();
        int newIDFlow = ultimoMensaje.getFlowID();
        Chatbot_207242381_MunozAraya chatbotActual = new Chatbot_207242381_MunozAraya();
        for (Chatbot_207242381_MunozAraya chatbot : chatbots) {
        	if(chatbot.getChatbotID() == newIDChatbot) {
        		chatbotActual = chatbot;
        	}
        }
        ArrayList<Flow_207242381_MunozAraya> flowsDelCBActual = chatbotActual.getFlows();
        Flow_207242381_MunozAraya flowActual = new Flow_207242381_MunozAraya();
        for (Flow_207242381_MunozAraya flow : flowsDelCBActual) {
        	if(flow.getId() == newIDFlow) {
        		flowActual = flow;
        	}
        }
        ArrayList<Option_207242381_MunozAraya> OpcionesActuales = flowActual.getOptions();
        
        
        
        try {
            int numeroComoEntero = Integer.parseInt(message);
            for (Option_207242381_MunozAraya option : OpcionesActuales) {
            	if(numeroComoEntero == option.getId()) {
            		String messageActual = option.getMessage();
            		int flowNextID = option.getInitialFlowCodeLink();
            		int ChatbotNextID = option.getChatbotCodeLink();
            		Message_207242381_MunozAraya newMessage = new Message_207242381_MunozAraya(messageActual, ChatbotNextID, flowNextID, numeroComoEntero);
            		messages.add(newMessage);
            	}
            }
            
        } catch (NumberFormatException e) {
        	for (Option_207242381_MunozAraya option : OpcionesActuales) {
            	String messageActual = option.getMessage();
        		if(message.toLowerCase().equals(messageActual.toLowerCase()) || option.getKeywords().contains(message) || option.getKeywords().contains(message.toLowerCase())) {
            		int optionNextID = option.getId();
            		int flowNextID = option.getInitialFlowCodeLink();
            		int ChatbotNextID = option.getChatbotCodeLink();
            		Message_207242381_MunozAraya newMessage = new Message_207242381_MunozAraya(messageActual, ChatbotNextID, flowNextID, optionNextID);
            		messages.add(newMessage);
            	}
            }
        }
     
        activeUser = obtenerPrimerUsuarioActivo();
        historial = activeUser.getHistorial();
        messages = historial.getMessages();
        

        ultimoMensaje = messages.get(messages.size() - 1); 
        newIDChatbot = ultimoMensaje.getChatbotID();
        newIDFlow = ultimoMensaje.getFlowID();
        chatbotActual = new Chatbot_207242381_MunozAraya();
        for (Chatbot_207242381_MunozAraya chatbot : chatbots) {
        	if(chatbot.getChatbotID() == newIDChatbot) {
        		chatbotActual = chatbot;
        	}
        }
        flowsDelCBActual = chatbotActual.getFlows();
        flowActual = new Flow_207242381_MunozAraya();
        for (Flow_207242381_MunozAraya flow : flowsDelCBActual) {
        	if(flow.getId() == newIDFlow) {
        		flowActual = flow;
        	}
        }
        OpcionesActuales = flowActual.getOptions();
        
        System.out.println(chatbotActual.getWelcomeMessage());
        System.out.println(flowActual.getMessage());
        for (Option_207242381_MunozAraya option : OpcionesActuales) {
        	System.out.println(option.getId()+ ") " + option.getMessage());
        }
             				
	}
	public void systemSynthesis(String usuarioBuscado) {
		User_207242381_MunozAraya usuarioEncontrado = new User_207242381_MunozAraya();
		for(User_207242381_MunozAraya usuario : registeredUsers) {
			if(usuario.getUsername().equals(usuarioBuscado)) {
				usuarioEncontrado = usuario;
			}
		}

		ChatHistory_207242381_MunozAraya historialUsuario = usuarioEncontrado.getHistorial();
		ArrayList<Message_207242381_MunozAraya>  mensajesUsuario = historialUsuario.getMessages();
		for(Message_207242381_MunozAraya message : mensajesUsuario) {
			int flowID = message.getFlowID();
			int chatbotID = message.getChatbotID();
			Chatbot_207242381_MunozAraya chatbotEncontrado = new Chatbot_207242381_MunozAraya();
			Flow_207242381_MunozAraya flowEncontrado = new Flow_207242381_MunozAraya();
			for(Chatbot_207242381_MunozAraya chatbot : chatbots) {
				if(chatbotID == chatbot.getChatbotID()) {
					chatbotEncontrado = chatbot;
				}
			}
			for(Flow_207242381_MunozAraya flow : chatbotEncontrado.getFlows()) {
				if(flowID == flow.getId()) {
					flowEncontrado = flow;
				}
			}
			System.out.println(message.getFecha() + " - " + usuarioEncontrado.getUsername() + ": "+ message.getMensaje());
			System.out.println(message.getFecha() + " - " + "flow " + flowEncontrado.getId() + " " + chatbotEncontrado.getName());
			System.out.println(flowEncontrado.getMessage());
			for(Option_207242381_MunozAraya option : flowEncontrado.getOptions()) {
				System.out.println(option.getId() + ") " + option.getMessage());
				
			}
			System.out.println("------------------------------------------");
			System.out.println("\n");
		}
	}	
}
