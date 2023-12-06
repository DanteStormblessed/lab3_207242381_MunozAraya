package lab3Paradigmas;

import java.util.ArrayList;

public class ChatHistory {
	User usuario;
	ArrayList<Message> messages;
	
	public ChatHistory(User usuario, ArrayList<Message> messages) {
		this.usuario = usuario;
		this.messages = messages;
	}
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Message> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}
	
	
	
}
