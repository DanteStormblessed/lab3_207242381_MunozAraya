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
		System.out.println("Se ha deslogeado correctamente.");
    }
	
	public void systemTalk(String message){
		if(chatbots.isEmpty()) {
			System.out.println("Se ha deslogeado correctamente.");
		}
						
	}
	
}
