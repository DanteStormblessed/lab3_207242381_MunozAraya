package lab3Paradigmas;


public class User_207242381_MunozAraya {
	boolean admin;
	String username;
	String userPassword;
	ChatHistory_207242381_MunozAraya historial;
	
	
	public User_207242381_MunozAraya(String username, String userPassword) {
        this.admin = false; // Por defecto, cada nuevo usuario no será admin
        this.username = username;
        this.userPassword = userPassword;
    }
	
	// Otro constructor que permite especificar el estado de admin al crear el usuario
	public User_207242381_MunozAraya(String username, String userPassword, boolean admin) {
        this.admin = admin;
        this.username = username;
        this.userPassword = userPassword;
    }
	
	public User_207242381_MunozAraya() {
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

	public ChatHistory_207242381_MunozAraya getHistorial() {
		return historial;
	}

	public void setHistorial(ChatHistory_207242381_MunozAraya historial) {
		this.historial = historial;
	}
	
	
}
