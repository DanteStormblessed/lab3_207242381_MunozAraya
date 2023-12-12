package lab3Paradigmas;

import java.util.ArrayList;

/**
 * Clase que representa un sistema, el sistema contiene tanto los chatbots como los usuarios registrados y el usuario logeado.
 * esto permite interactuar con cada chatbot creado
 * @author Alvaro Muñoz
 */
public class System_207242381_MunozAraya {
	String name;
	int initialChatbotCodeLink;
	ArrayList<Chatbot_207242381_MunozAraya> chatbots;
	ArrayList<User_207242381_MunozAraya> registeredUsers;
	ArrayList<User_207242381_MunozAraya> activeUser;
	
	/**
	 * Metodo constructor de un sistema, recibe un nombre, un initialChatbotCodeLink y una lista de chatbots para crear
	 * un nuevo sistema
	 * @param name
	 * @param initialChatbotCodeLink
	 * @param chatbots
	 */
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
	
	/**
	 * Metodo constructor de un sistema recibe un nombre, un initialChatbotCodeLink, una lista de chatbots y
	 * una lista que contiene al usuario logeado. crea un nuevo sistema
	 * @param name
	 * @param initialChatbotCodeLink
	 * @param chatbots
	 * @param activeUser
	 */
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

	/**
	 * Metodo constructor de un sistema que recibe nombre, un initialChatbotCodeLink, lista de chatbots, una lista de usuarios logeados y una lista con 
	 * los usuarios registrados. crea un nuevo sistema
	 * @param name
	 * @param initialChatbotCodeLink
	 * @param chatbots
	 * @param registeredUsers
	 * @param activeUser
	 */
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

	/**
	 * name getter
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name setter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * initialChatbotCodeLink getter
	 * @return initialChatbotCodeLink
	 */
	public int getInitialChatbotCodeLink() {
		return initialChatbotCodeLink;
	}

	/**
	 * initialChatbotCodeLink setter
	 * @param initialChatbotCodeLink
	 */
	public void setInitialChatbotCodeLink(int initialChatbotCodeLink) {
		this.initialChatbotCodeLink = initialChatbotCodeLink;
	}

	/**
	 * chatbots getter
	 * @return chatbots
	 */
	public ArrayList<Chatbot_207242381_MunozAraya> getChatbots() {
		return chatbots;
	}

	/**
	 * chatbots setter
	 * @param chatbots
	 */
	public void setChatbots(ArrayList<Chatbot_207242381_MunozAraya> chatbots) {
		this.chatbots = chatbots;
	}
	
	/**
	 * registeredUsers getter
	 * @return registeredUsers
	 */
	public ArrayList<User_207242381_MunozAraya> getRegisteredUsers() {
		return registeredUsers;
	}

	/**
	 * registeredUsers setter
	 * @param registeredUsers
	 */
	public void setRegisteredUsers(ArrayList<User_207242381_MunozAraya> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	/**
	 * activeUser getter
	 * @return activeUser
	 */
	public ArrayList<User_207242381_MunozAraya> getActiveUser() {
		return activeUser;
	}
	
	/**
	 * Metodo que retorna el usuario logeado en el sistema
	 * @return activeUser
	 */
	public User_207242381_MunozAraya obtenerPrimerUsuarioActivo() {
        if (activeUser != null && !activeUser.isEmpty()) {
            return activeUser.get(0);
        } else {
            System.out.println("No hay usuarios activos en este momento.");
            return null;
        }
    }

	/**
	 * activeUser setter
	 * @param activeUser
	 */
	public void setActiveUser(ArrayList<User_207242381_MunozAraya> activeUser) {
		this.activeUser = activeUser;
	}

	/**
	 * Metodo que añade un chatbot a la lista de chatbots, verifica si
	 * el id del chatbot se encuentra en la lista de chatbots
	 * @param newChatbot
	 */
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
	
	/**
	 * Metodo que añade un usario a la lista de usuarios registrados, comprobando
	 * si el nombre del usuario ya se encuentra registrado
	 * @param newUser
	 */
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
	
	/**
	 * Metodo que permite logear a un usuario al sistema, solamente si la lista de usuarios 
	 * logeados esta vacia es posible logear al usuario
	 * @param newUser
	 */
	public void systemLogin(User_207242381_MunozAraya newUser) {
		if(activeUser.isEmpty()) {
			activeUser.add(newUser);
		}
        else {
            System.out.println("El usuario " + newUser.username + " no puede logearse en el sistema, porque ya hay un usuario logeado.");
        }
    }
	/**
	 * Metodo que permite deslogear a un usuario, limpia la lista de usuario logeado
	 */
	public void systemLogout() {
		activeUser.clear();
    }
	
	/**
	 * Metodo que permite interactuar con el sistema, se ingresa un mensaje, se obtiene el usuario logeado
	 * en el sistema, se obtiene el ultimo mensaje del historial del usuario, se busca el flow correspondiente y se 
	 * compara el mensaje con todas las opciones disponibles en el flow, tanto con id como por mensaje.
	 * Luego se guarda la opcion encontrada en la ultima posicion de la lista de mensajes del historial.
	 * finalmente se imprime el ultimo mensaje del historial
	 * @param message
	 */
	public void systemTalk(String message){
		User_207242381_MunozAraya activeUser = obtenerPrimerUsuarioActivo();
        ChatHistory_207242381_MunozAraya historial = activeUser.getHistorial();
        ArrayList<Message_207242381_MunozAraya> messages = historial.getMessages();
        Message_207242381_MunozAraya ultimoMensaje = messages.get(messages.size() - 1);
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
	/**
	 * Metodo que permite imprimir por consola el historial completo de un usuario registrado en el sistema.
	 * para ello busca el usuario ingresado, busca su historial, e imprime la lista de mensajes de manera ordenada
	 * @param usuarioBuscado
	 */
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
