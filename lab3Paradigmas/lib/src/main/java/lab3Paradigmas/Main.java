package lab3Paradigmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
	
        Option opcion = new Option(1, "Hola", 1, 2);
        opcion.addKeywords("Hola, hola, Hello");
    	ArrayList<Option> opciones = new ArrayList<>();
        opciones.add(opcion);
    	Flow flujo = new Flow(1, "Escribe cualquier cosa para empezar a chatear", opciones);
    	ArrayList<Flow> flows = new ArrayList<>();
        flows.add(flujo);
        Chatbot chatbot1 = new Chatbot(1, "Chatbot1", "Bienvenid@ al sistema de prueba", 1, flows);
        ArrayList<Chatbot> chatbots = new ArrayList<>();
        chatbots.add(chatbot1);
    	SystemClass sistema1 = new SystemClass("sistema", 1, chatbots);
    	Message mensajeIni = new Message("Hola", 1, 1, 1);
    	ArrayList<Message> mensajesIni = new ArrayList<>();
    	mensajesIni.add(mensajeIni);
    	
    	Option opcion2_1 = new Option(1, "Buscar peliculas", 1, 2);
        opcion2_1.addKeywords("Peliculas, peliculas, pelis");
        Option opcion2_2 = new Option(2, "Buscar Juegos", 1, 3);
        opcion2_2.addKeywords("Juegos, juegos, jugar");
        Option opcion2_3 = new Option(3, "Volver", 1, 1);
        opcion2_3.addKeywords("Volver, volver, anterior");
        
        ArrayList<Option> opciones2 = new ArrayList<>();
        opciones2.add(opcion2_1);
        opciones2.add(opcion2_2);
        opciones2.add(opcion2_3);
        
    	Flow flujo2 = new Flow(2, "Escribe cualquier cosa para empezar a chatear", opciones2);
        chatbot1.ChatbotAddFlow(flujo2);
	    
        User admin = new User("admin","admin", true);
        ChatHistory chatHistoryAdmin = new ChatHistory(admin,mensajesIni); 
        admin.setHistorial(chatHistoryAdmin);
        sistema1.systemAddUser(admin);
    	
    	
    	

    	
    	Scanner scanner = new Scanner(System.in);
	    int opcionMenu1;
	    do {
	        System.out.println("\n### Sistema de Chatbots - Inicio ###");
	        System.out.println("(Usuario administrador-> nombre: admin password: admin)");
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
	    
	    
	    
	    
	    
	    User logedUser = sistema1.obtenerPrimerUsuarioActivo();
	    if(logedUser.isAdmin()) {//Este menu es exclusivo para un administrador
	    	
		    int opcionMenu3;
		    do {
		        System.out.println("\n### Sistema de Chatbots - Inicio ###");
		        System.out.println("1. Crear un chatbot");
		        System.out.println("2. Ejecutar un Chatbot");
		        System.out.println("3. Visualizar todos los chatbots existentes en el sistema");
		        System.out.println("4. Visualizar todos los chatbots con sus flujos y opciones creadas");
		        System.out.println("5. Ejecutar una simulación del sistema de chatbot");
		        System.out.println("0. Salir");
		        System.out.print("Seleccione una opción: ");
		        opcionMenu3 = scanner.nextInt();
		        scanner.nextLine();
		        switch (opcionMenu3) {
		            case 1:
		            	Chatbot newChatbot = new Chatbot();
		            	System.out.println("Ingrese el ID del chatbot (Procure no repetir ID, ademas existe un chatbot con ID = 1): ");
		            	int idChatbot = scanner.nextInt();
				        scanner.nextLine();
		            	System.out.println("Ingrese el nombre del chatbot: ");
		            	String nombreChatbot = scanner.nextLine();
		            	System.out.println("Ingrese el mensaje de bienvenida del chatbot: ");
		            	String welcomeMessage = scanner.nextLine();
		            	System.out.println("Ingrese el StartFlowID del chatbot: ");
		            	int startFlowID = scanner.nextInt();
				        scanner.nextLine();
				        
				        
				        newChatbot.setChatbotID(idChatbot);
				        newChatbot.setName(nombreChatbot);
				        newChatbot.setWelcomeMessage(welcomeMessage);
				        newChatbot.setStartFlowId(startFlowID);
				        sistema1.systemAddChatbot(newChatbot);
				        System.out.println("Porfavor cree un flow con sus respectivas opciones para el chatbot: ");
				        
				        int opcionMenu5; 
				        do {
				            // Mostrar el menú
				            System.out.println("\n_____Crear flow_____");
				            System.out.println("1. Crear un nuevo flow");
				            System.out.println("2. Eliminar un flow");
				            System.out.println("3. Ver listado de flows");
				            System.out.println("0. Salir");
				            System.out.print("Seleccione una opción: ");
				            
				            // Leer la opción ingresada por el usuario
				            opcionMenu5 = scanner.nextInt();
				            scanner.nextLine();
				            
				            switch (opcionMenu5) {
				                case 1:
				                	Flow newFlow = new Flow();
				                	System.out.println("Ingrese el ID del Flow (Flow ID = 1 ya exsistente): ");
					            	int idFlow = scanner.nextInt();
							        scanner.nextLine();
					            	System.out.println("Ingrese el mensaje del Flow: ");
					            	String mensajeFlow = scanner.nextLine();
					            	newFlow.setId(idFlow);
					            	newFlow.setMessage(mensajeFlow);
					            	//______________________________________________________________________________________
					            	System.out.println("Porfavor cree las opciones para este flow");
					            	int opcionMenu6;
					            	do {
					                    System.out.println("\n_____Crear opciones_____");
					                    System.out.println("1. Crear una nueva opcion para el flow[" + newFlow.getId() + "]");
					                    System.out.println("2. Eliminar una opcion para el flow[" + newFlow.getId() + "]");
					                    System.out.println("3. Ver listado de opciones");
					                    System.out.println("0. Salir");
					                    System.out.print("Seleccione una opción: ");
					                    
					                    // Leer la opción ingresada por el usuario
					                    opcionMenu6 = scanner.nextInt();
					                    scanner.nextLine();
					                    
					                    
					                    switch (opcionMenu6) {
					                        case 1:
					                            System.out.print("Ingrese el id de la opcion: ");
					                            int idOption = scanner.nextInt();
					                            scanner.nextLine();
					                            System.out.print("Ingrese el mensaje de la opcion: ");
					                            String messageOption = scanner.nextLine();
					                            System.out.print("¿Desea agregar una keyword?");
					                            int opcionKey;
					                            ArrayList<String> keywords = new ArrayList<>();
					                            do {
					                                System.out.println("1. Si");
					                                System.out.println("0. No");
					                                System.out.print("Seleccione una opción: ");
					                                opcionKey = scanner.nextInt();
					                                scanner.nextLine();
					                                switch (opcionKey) {
					                                    case 1:
					                                    	System.out.print("Ingrese una keyword: ");
								                            String keyword1 = scanner.nextLine();
					                                    	keywords.add(keyword1);
					                                        break;
					                                    case 0:
					                                        break;
					                                    default:
					                                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
					                                        break;
					                                }
					                            } while (opcionKey != 0);
					                            Option newOption = new Option(idOption, messageOption, idChatbot, keywords,idFlow);
					                            newFlow.FlowAddOption(newOption);
					                            
					                            break;
					                        case 2:
					                            

					                            break;
					                        case 3:
					                        	

					                            break;
					                        case 0:
					                            System.out.println("Volviendo");
					                            break;
					                        default:
					                            System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
					                            break;
					                    }
					                } while (opcionMenu6 != 0);

					            	//______________________________________________________________________________________
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

				        
				        
		                break;
		            case 2:
		            	int k = 0;
		            	System.out.println("¿Que chatbot desea ejecutar?");
		            	for(Chatbot chatbot : sistema1.getChatbots()) {
		            		System.out.println(k +")"+ " -Nombre del Chatbot: " + chatbot.getName() + " ID: " + chatbot.getChatbotID());
		            		k++;
		            	}
		            	int opcion2 = scanner.nextInt();
                        scanner.nextLine();
                        if(opcion2 >= 0 && opcion2 < k) {
                        	boolean salir = false;
                        	do {
                        		String mensajeRespuesta;
        	        	        System.out.println("Respuesta:");
        	        	        mensajeRespuesta = scanner.nextLine();
        	        	        sistema1.systemTalk(mensajeRespuesta);
        	        	        if (mensajeRespuesta.equals("salir")) {
        	        	        	salir = true;
        	        	        }
        	        	        
        	        	    } while (salir == false);
                        	
                        }else {
                        	System.out.println("Opcion no valida.");
                        }
		                break;
		            case 3:
		            	for(Chatbot chatbot : sistema1.getChatbots()) {
		            		System.out.println("-Nombre del Chatbot: " + chatbot.getName() + " ID: " + chatbot.getChatbotID());	
		            	}
		            	
		            	break;
		            case 4:
		            	break;
		            case 5:
		            	break;
		            case 0:
		            	break;
		            	
		            default:
		                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
		                break;
		        }
		    } while (opcionMenu3 != 0);
		    scanner.close();
	    }
	    
	}
}
