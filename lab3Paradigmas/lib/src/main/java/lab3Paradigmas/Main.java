package lab3Paradigmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
    	/*ASI SE IMPRIMEN LOS ATRIBUTOS DE UNA OPCION EN EL MAIN, NO COMO METODO DE LA CLASE (EL OBJETO SE LLAMA option)
        System.out.println("Detalles de la opción:");
        System.out.println("ID: " + opcion.getId());
        System.out.println("Mensaje: " + opcion.getMessage());
        System.out.println("Enlace al chatbot: " + opcion.getChatbotCodeLink());
        System.out.println("Keywords:");
        for (String keyword : opcion.getKeywords()) {
            System.out.println(keyword);
        }
    	*/
    	//SE CREA UNA OPCION CON ID 1
        /*
    	ArrayList<String> keywords = new ArrayList<>();
        keywords.add("keyword1");
        keywords.add("keyword2");
        Option opcion = new Option(1, "hOLAA", 1234);
        opcion.addKeywords("hola, hola2, hola3");
        opcion.printOptionDetails();
        
        ArrayList<Option> opciones = new ArrayList<>();
        opciones.add(opcion);
        Flow flujo = new Flow(1, "Mensaje del flujo", opciones);

        // Verificar si se agrega una opción con el mismo ID al flujo
        Option nuevaOpcion = new Option(1, "Nuevo mensaje", 5678, keywords);
        flujo.FlowAddOption(nuevaOpcion); // Esto no se añadirá al flujo porque ya existe una opción con el mismo ID

        // Verificar si se agrega una opción con un ID diferente al flujo
        Option otraOpcion = new Option(2, "Otro mensaje", 9876, keywords);
        flujo.FlowAddOption(otraOpcion); // Esto se añadirá al flujo porque el ID es diferente
        otraOpcion.printOptionDetails();
        
        
        ArrayList<Flow> flows = new ArrayList<>();
        flows.add(flujo);
        
        ArrayList<Chatbot> chatbots = new ArrayList<>();
        Chatbot chatbot1 = new Chatbot(1, "Chatbot1", "Bienvenido/a", 1, flows);
        chatbots.add(chatbot1);
        
        User usuario1 = new User("Usuario1", "contrasenia123");
        ArrayList<User> usuariosActivos = new ArrayList<>();
        usuariosActivos.add(usuario1);
        
        ArrayList<User> usuariosRegistrados = new ArrayList<>();
        usuariosRegistrados.add(usuario1);
      
        
        SystemClass sistema1 = new SystemClass("sistema 1", 1, chatbots, usuariosRegistrados, usuariosActivos);
        
        // Imprimir las opciones del flujo
        System.out.print("\n-------------------------------------------------");
        System.out.println("\nDatos de el flujo:");
        System.out.println("ID del flujo:" + flujo.getId());
        System.out.println("Mensaje del flujo:" + flujo.getMessage());
        System.out.print("\n-------------------------------------------------");
        System.out.println("Opciones del flujo:");
        for (Option opcion1 : flujo.getOptions()) {
        	opcion1.printOptionDetails();
        	System.out.println("\n");
        }
        
        
        System.out.println("\nDatos del sistema:");
        System.out.println("Nombre del sitema:" + sistema1.getName());
        System.out.println("Chatbots del sitema:");
        for (Chatbot chatbot : sistema1.getChatbots()) {
        	System.out.println("ID del chatbot: "+ chatbot.getChatbotID());
        	System.out.println("Nombre del chatbot: " + chatbot.getName());
        	System.out.println("Mensaje del chatbot: " + chatbot.getWelcomeMessage());
        	System.out.println("\n");
        }
        */
        //__________________________________________________________________________________________________________________//
        Option opcion = new Option(1, "Hola", 1, 1);
        opcion.addKeywords("Hola, hola, Hello");
    	
    	ArrayList<Option> opciones = new ArrayList<>();
        opciones.add(opcion);
    	
    	Flow flujo = new Flow(1, "Mensaje del flujo", opciones);
    	ArrayList<Flow> flows = new ArrayList<>();
        flows.add(flujo);
    	
    	
        Chatbot chatbot1 = new Chatbot(1, "Chatbot1", "Bienvenid@ al sistema", 1, flows);
        ArrayList<Chatbot> chatbots = new ArrayList<>();
        chatbots.add(chatbot1);
        
    	SystemClass sistema1 = new SystemClass("sistema", 1, chatbots);
    	//______________
    	Message mensajeIni = new Message("Hola", 1, 1, 1);
    	ArrayList<Message> mensajesIni = new ArrayList<>();
    	mensajesIni.add(mensajeIni);
        /*
    	Scanner scanner = new Scanner(System.in);
        int opcion1;
        ArrayList<Option> listadoDeOpciones = new ArrayList<>();
        do {
            // Mostrar el menú
            System.out.println("\n_____Crear opciones_____");
            System.out.println("1. Crear una nueva opcion");
            System.out.println("2. Eliminar una opcion");
            System.out.println("3. Ver listado de opciones");
            System.out.println("4. Enlazar opciones a un flujo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            // Leer la opción ingresada por el usuario
            opcion1 = scanner.nextInt();
            scanner.nextLine();
            
            
            switch (opcion1) {
                case 1:
                	System.out.println("Seleccionaste Crear una nueva opcion.");
                    System.out.print("Ingrese el id de la opcion: ");
                    String idOption = scanner.nextLine();
                    System.out.print("Ingrese el mensaje de la opcion: ");
                    String messageOption = scanner.nextLine();
                    System.out.print("Ingrese el chatbot asocion: ");
                    int chatbotCLOption = scanner.nextInt();
                    listadoDeOpciones.add(new Option(idOption, messageOption, chatbotCLOption, ArrayList<String> keywords));

                    // Mostrar la lista de sistemas
                    System.out.println("Lista de sistemas:");
                    for (Option sistema : listadoDeOpciones) {
                        System.out.println("Nombre del sistema: " + sistema.getName());
                    }
                    break;
                case 2:
                    System.out.println("Seleccionaste Eliminar un sistema.");
                    int i = 0;
                    for (Option sistema : listadoDeOpciones) {
                        System.out.println(i + ". " + sistema.getName());
                        i++;
                    }
                    
                    System.out.print("Ingresa el índice del sistema a eliminar: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    if (indexToRemove >= 0 && indexToRemove < listadoDeOpciones.size()) {
                    	listadoDeOpciones.remove(indexToRemove);
                        System.out.println("Sistema eliminado.");
                    } else {
                        System.out.println("Índice inválido. No se pudo eliminar el sistema.");
                    }

                    break;
                case 3:
                	System.out.println("Listado de sistemas creados: ");
                	int j= 0;
                    for (Option sistema : listadoDeOpciones) {
                        System.out.println(j + ". " + sistema.getName());
                        j++;
                    }

                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion1 != 0);

        scanner.close();
        */
    

	    Scanner scanner = new Scanner(System.in);
	    int opcionMenu1;
	
	    do {
	        System.out.println("\n### Sistema de Chatbots - Inicio ###");
	        System.out.println("1. Login de Usuario");
	        System.out.println("2. Registro de Usuario");
	        System.out.print("Seleccione una opción: ");
	        opcionMenu1 = scanner.nextInt();
	        scanner.nextLine();
	        switch (opcionMenu1) {
	            case 1:
	            	sistema1.systemLogout();
	            	ArrayList<User> listaUsuariosRegistrados = sistema1.getRegisteredUsers();
	            	int i = 0;
	            	for(User user : listaUsuariosRegistrados) {
	            		System.out.println(i + ". " + user.getUsername());
	            		i++;
	            	}
	            	System.out.println("Ingrese el usuario que desea logear(Numero):");
	            	int opcionUsuario = scanner.nextInt();
	            	scanner.nextLine();
	            	if(opcionUsuario >= 0 && opcionUsuario <= i) {
	            		User logedUser = listaUsuariosRegistrados.get(opcionUsuario);
	            		
	            		
	            		System.out.println("Ingrese la contraseña:");
	            		String contrasenia = scanner.nextLine();
	            		if(contrasenia.equals(logedUser.getUserPassword())) {
	            			sistema1.systemLogin(logedUser);
	            			System.out.println("El usuario " + logedUser.getUsername() + " se ha logeado correctamente");
	            		}else {
	            			System.out.println("Contraseña incorrecta");
	            			opcionMenu1 = 10;
	            		}
	            	}else {
	            		opcionMenu1 = 10;
	            	}
	                break;
	            case 2:
	        	    int opcionMenu2;
	        	    do {
	        	        // Mostrar el menú
	        	        System.out.println("\n### Sistema de Chatbots - Inicio ###");
	        	        System.out.println("1. Registrar usuario normal");
	        	        System.out.println("2. Registrar usuario administrador");
	        	        System.out.println("0. Volver");
	        	        System.out.print("Seleccione una opción: ");
	        	        
	        	        // Leer la opción ingresada por el usuario
	        	        opcionMenu2 = scanner.nextInt();
	        	        scanner.nextLine();
	        	        switch (opcionMenu2) {
	        	            case 1:
	        	            	System.out.print("Ingrese el nombre del usuario: ");
	                            String username = scanner.nextLine();
	                            System.out.print("Ingrese la constraseña: ");
	                            String userPassword = scanner.nextLine();
	        	            	User newUser = new User(username, userPassword, false);
	        	            	ChatHistory chathistory = new ChatHistory(newUser,  mensajesIni);
	        	            	newUser.setHistorial(chathistory);
	        	            	sistema1.systemAddUser(newUser);
	        	                break;
	        	            case 2:
	        	            	System.out.print("Ingrese el nombre del usuario: ");
	                            String usernameAdmin = scanner.nextLine();
	                            System.out.print("Ingrese la constraseña: ");
	                            String userPasswordAdmin = scanner.nextLine();
	        	            	User newUserAdmin = new User(usernameAdmin, userPasswordAdmin, true);
	        	            	ChatHistory chathistoryAdmin = new ChatHistory(newUserAdmin,  mensajesIni);
	        	            	newUserAdmin.setHistorial(chathistoryAdmin);
	        	            	sistema1.systemAddUser(newUserAdmin);
	        	                break;	        	                
	        	            case 0:
	        	            	break;
	        	            default:
	        	                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
	        	                break;
	        	        }
	        	    } while (opcionMenu2 != 0);
	                break;
	            default:
	                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
	                break;
	        }
	    } while (opcionMenu1 != 1);
	    scanner.close();
	    
	    
	    
	    
	    User logedUser = sistema1.obtenerPrimerUsuarioActivo();
	    if(logedUser.isAdmin()) {//Este menu es exclusivo para un administrador
	    	Scanner scanner2 = new Scanner(System.in);
		    int opcionMenu3;
		    do {
		        System.out.println("\n### Sistema de Chatbots - Inicio ###");
		        System.out.println("1. Crear un chatbot");
		        System.out.println("2. Modificar un Chatbot");
		        System.out.println("3. Ejecutar un Chatbot");
		        System.out.println("4. Visualizar todos los chatbots existentes en el sistema");
		        System.out.println("5. Visualizar todos los chatbots con sus flujos y opciones creadas");
		        System.out.println("6. Ejecutar una simulación del sistema de chatbot");
		        System.out.println("0. Salir");
		        System.out.print("Seleccione una opción: ");
		        opcionMenu3 = scanner2.nextInt();
		        scanner2.nextLine();
		        switch (opcionMenu3) {
		            case 1:
		            	Chatbot newChatbot = new Chatbot();
		            	System.out.println("Ingrese el ID del chatbot (Procure no repetir ID, ademas existe un chatbot con ID = 1): ");
		            	int idChatbot = scanner2.nextInt();
				        scanner2.nextLine();
		            	System.out.println("Ingrese el nombre del chatbot: ");
		            	String nombreChatbot = scanner2.nextLine();
		            	System.out.println("Ingrese el mensaje de bienvenida del chatbot: ");
		            	String welcomeMessage = scanner2.nextLine();
		            	System.out.println("Ingrese el StartFlowID del chatbot: ");
		            	int startFlowID = scanner2.nextInt();
				        scanner2.nextLine();
				        
				        
				        newChatbot.setChatbotID(idChatbot);
				        newChatbot.setName(nombreChatbot);
				        newChatbot.setWelcomeMessage(welcomeMessage);
				        newChatbot.setStartFlowId(startFlowID);
				        sistema1.systemAddChatbot(newChatbot);
				        System.out.println("Porfavor cree un flow con sus respectivas opciones para el chatbot: ");
				        
				        int opcionMenu5;
				        ArrayList<Option> listadoDeOpciones = new ArrayList<>();
				        do {
				            // Mostrar el menú
				            System.out.println("\n_____Crear opciones_____");
				            System.out.println("1. Crear un nuevo flow");
				            System.out.println("2. Eliminar un flow");
				            System.out.println("3. Ver listado de flows");
				            System.out.println("0. Salir");
				            System.out.print("Seleccione una opción: ");
				            
				            // Leer la opción ingresada por el usuario
				            opcionMenu5 = scanner2.nextInt();
				            scanner.nextLine();
				            
				            switch (opcionMenu5) {
				                case 1:
				                	
				                    break;
				                case 2:
				                    

				                    break;
				                case 3:
				                	

				                    break;
				                case 0:
				                    break;
				                default:
				                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
				                    break;
				            }
				        } while (opcionMenu5 != 0);

				        scanner.close();
				        
		                break;
		            case 2:
		                break;
		            case 3:
		            	break;
		            case 4:
		            	break;
		            case 5:
		            	break;
		            case 6:
		            	break;
		            case 0:
		            	break;
		            	
		            default:
		                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
		                break;
		        }
		    } while (opcionMenu3 != 0);
		    scanner2.close();
	    }
	    
	}
}
