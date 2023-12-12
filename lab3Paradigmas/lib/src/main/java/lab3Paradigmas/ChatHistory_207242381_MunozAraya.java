package lab3Paradigmas;

import java.util.ArrayList;

/**
 * Clase ChatHistory, representa el historial de conversaciones de un usuario
 * @author Alvaro Muñoz
 */

public class ChatHistory_207242381_MunozAraya {
	User_207242381_MunozAraya usuario;
	ArrayList<Message_207242381_MunozAraya> messages;
	
	/**
	 * Metodo constructor de un historial, crea un historial a partir de un usuario y una lista
	 * de Message
	 * @param usuario
	 * @param messages
	 */
	public ChatHistory_207242381_MunozAraya(User_207242381_MunozAraya usuario, ArrayList<Message_207242381_MunozAraya> messages) {
		this.usuario = usuario;
		this.messages = messages;
	}
	
	/**
	 * usuario getter
	 * @return usuario
	 */
	public User_207242381_MunozAraya getUsuario() {
		return usuario;
	}
	
	/**
	 * usuario setter
	 * @param usuario
	 */
	public void setUsuario(User_207242381_MunozAraya usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * messages getter
	 * @return messages
	 */
	public ArrayList<Message_207242381_MunozAraya> getMessages() {
		return messages;
	}
	
	/**
	 * messages setter
	 * @param messages
	 */
	public void setMessages(ArrayList<Message_207242381_MunozAraya> messages) {
		this.messages = messages;
	}
	
	
	
}
