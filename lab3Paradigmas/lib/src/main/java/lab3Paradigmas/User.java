package lab3Paradigmas;

import java.util.ArrayList;

public class User {
	boolean admin;
	String username;
	String userPassword;
	ArrayList<ChatHistory> historial;
	
	
	public User(String username, String userPassword) {
        this.admin = false; // Por defecto, cada nuevo usuario no será admin
        this.username = username;
        this.userPassword = userPassword;
    }
	
	// Otro constructor que permite especificar el estado de admin al crear el usuario
	public User(String username, String userPassword, boolean admin) {
        this.admin = admin;
        this.username = username;
        this.userPassword = userPassword;
    }
	
	
	
	//GETTERS Y SETTERS
	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
