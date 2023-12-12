package lab3Paradigmas;

/**
 * Clase User, representa un usuario que puede interactuar con el sistema
 * @author Alvaro Muñoz
 */
public class User_207242381_MunozAraya {
	boolean admin;
	String username;
	String userPassword;
	ChatHistory_207242381_MunozAraya historial;
	
	/**
	 * Constructor de un usuario a partir del username y userPassword
	 * @param username
	 * @param userPassword
	 */
	public User_207242381_MunozAraya(String username, String userPassword) {
        this.admin = false; // Por defecto, cada nuevo usuario no será admin
        this.username = username;
        this.userPassword = userPassword;
    }
	
	/**
	 * Constructor de la clase User que permite especificar 
	 * el estado de admin al crear el usuario
	 * @param username
	 * @param userPassword
	 * @param admin
	 */
	public User_207242381_MunozAraya(String username, String userPassword, boolean admin) {
        this.admin = admin;
        this.username = username;
        this.userPassword = userPassword;
    }
	
	/**
	 * Constructor vacio que crea un usuario con los parametros por defecto
	 */
	public User_207242381_MunozAraya() {
    }
	
	/**
	 * admin getter
	 * @return
	 */
	public boolean isAdmin() {
		return admin;
	}

	/**
	 * admin setter
	 * @param admin
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	/**
	 * userName getter
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * userName setter
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * userPassword getter
	 * @return userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * userPassword setter
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * historial getter
	 * @return historial
	 */
	public ChatHistory_207242381_MunozAraya getHistorial() {
		return historial;
	}

	/**
	 * historial setter
	 * @param historial
	 */
	public void setHistorial(ChatHistory_207242381_MunozAraya historial) {
		this.historial = historial;
	}
	
	
}
