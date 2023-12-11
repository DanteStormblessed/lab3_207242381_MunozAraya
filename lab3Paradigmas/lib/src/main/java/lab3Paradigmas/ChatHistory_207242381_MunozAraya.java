package lab3Paradigmas;

import java.util.ArrayList;

public class ChatHistory_207242381_MunozAraya {
	User_207242381_MunozAraya usuario;
	ArrayList<Message_207242381_MunozAraya> messages;
	
	public ChatHistory_207242381_MunozAraya(User_207242381_MunozAraya usuario, ArrayList<Message_207242381_MunozAraya> messages) {
		this.usuario = usuario;
		this.messages = messages;
	}
	public User_207242381_MunozAraya getUsuario() {
		return usuario;
	}
	public void setUsuario(User_207242381_MunozAraya usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Message_207242381_MunozAraya> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Message_207242381_MunozAraya> messages) {
		this.messages = messages;
	}
	
	
	
}
