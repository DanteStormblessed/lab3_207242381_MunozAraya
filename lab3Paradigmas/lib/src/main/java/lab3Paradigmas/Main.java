package lab3Paradigmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	
	
        Option_207242381_MunozAraya opcion = new Option_207242381_MunozAraya(1, "Hola", 1, 2);
        opcion.addKeywords("Hola, hola, Hello");
    	ArrayList<Option_207242381_MunozAraya> opciones = new ArrayList<>();
        opciones.add(opcion);
    	Flow_207242381_MunozAraya flujo = new Flow_207242381_MunozAraya(1, "Escribe Hola para empezar a chatear", opciones);
    	ArrayList<Flow_207242381_MunozAraya> flows = new ArrayList<>();
        flows.add(flujo);
        Chatbot_207242381_MunozAraya chatbot1 = new Chatbot_207242381_MunozAraya(1, "Chatbot1", "Bienvenid@ al sistema de prueba [Escriba 'Salir' para volver al menu]", 1, flows);
        ArrayList<Chatbot_207242381_MunozAraya> chatbots = new ArrayList<>();
        chatbots.add(chatbot1);
    	System_207242381_MunozAraya sistema1 = new System_207242381_MunozAraya("sistema", 1, chatbots);
    	Message_207242381_MunozAraya mensajeIni = new Message_207242381_MunozAraya("Hola", 1, 1, 2);
    	ArrayList<Message_207242381_MunozAraya> mensajesIni = new ArrayList<>();
    	mensajesIni.add(mensajeIni);
    	
    	Option_207242381_MunozAraya opcion2_1 = new Option_207242381_MunozAraya(1, "Buscar peliculas", 1, 3);
        opcion2_1.addKeywords("Peliculas", "peliculas", "pelis");
        Option_207242381_MunozAraya opcion2_2 = new Option_207242381_MunozAraya(2, "Buscar Juegos", 1, 4);
        opcion2_2.addKeywords("Juegos", "juegos", "jugar");
        Option_207242381_MunozAraya opcion2_3 = new Option_207242381_MunozAraya(3, "Volver", 1, 1);
        opcion2_3.addKeywords("Volver", "volver", "anterior");
        
        ArrayList<Option_207242381_MunozAraya> opciones2 = new ArrayList<>();
        opciones2.add(opcion2_1);
        opciones2.add(opcion2_2);
        opciones2.add(opcion2_3);
        
    	Flow_207242381_MunozAraya flujo2 = new Flow_207242381_MunozAraya(2, "¿Que deseas hacer?", opciones2);
        chatbot1.ChatbotAddFlow(flujo2);
	    
        Option_207242381_MunozAraya opcion3_1 = new Option_207242381_MunozAraya(1, "Terror", 1, 3);
        opcion3_1.addKeywords("Miedo", "Terror", "Horror");
        Option_207242381_MunozAraya opcion3_2 = new Option_207242381_MunozAraya(2, "Fantasia", 1, 3);
        opcion3_2.addKeywords("fantasia", "medieval", "magia");
        Option_207242381_MunozAraya opcion3_3 = new Option_207242381_MunozAraya(3, "Ciencia Ficcion", 1, 3);
        opcion3_3.addKeywords("Ciencia", "Ficcion", "futuristica");
        Option_207242381_MunozAraya opcion3_4 = new Option_207242381_MunozAraya(4, "Volver", 1, 2);
        opcion3_4.addKeywords("Volver", "volver", "anterior");
        
        ArrayList<Option_207242381_MunozAraya> opciones3 = new ArrayList<>();
        opciones3.add(opcion3_1);
        opciones3.add(opcion3_2);
        opciones3.add(opcion3_3);
        opciones3.add(opcion3_4);
        
    	Flow_207242381_MunozAraya flujo3 = new Flow_207242381_MunozAraya(3, "¿Que tipo de pelicula?", opciones3);
        chatbot1.ChatbotAddFlow(flujo3); 
        
        
        Option_207242381_MunozAraya opcion4_1 = new Option_207242381_MunozAraya(1, "Shooter", 1, 4);
        opcion4_1.addKeywords("Fps", "Disparos", "shooter");
        Option_207242381_MunozAraya opcion4_2 = new Option_207242381_MunozAraya(2, "Supervivencia", 1, 4);
        opcion4_2.addKeywords("survival", "Sobrevivir", "Aventura");
        Option_207242381_MunozAraya opcion4_3 = new Option_207242381_MunozAraya(3, "Carreras", 1, 4);
        opcion4_3.addKeywords("Autos", "Conduccion", "carreras");
        Option_207242381_MunozAraya opcion4_4 = new Option_207242381_MunozAraya(4, "Volver", 1, 2);
        opcion4_4.addKeywords("Volver", "volver", "anterior");
        
        ArrayList<Option_207242381_MunozAraya> opciones4 = new ArrayList<>();
        opciones4.add(opcion4_1);
        opciones4.add(opcion4_2);
        opciones4.add(opcion4_3);
        opciones4.add(opcion4_4);
        
    	Flow_207242381_MunozAraya flujo4 = new Flow_207242381_MunozAraya(4, "¿Que tipo de juego?", opciones4);
        chatbot1.ChatbotAddFlow(flujo4);
        
        
        

        
        
        User_207242381_MunozAraya admin = new User_207242381_MunozAraya("admin","admin", true);
        ChatHistory_207242381_MunozAraya chatHistoryAdmin = new ChatHistory_207242381_MunozAraya(admin,mensajesIni); 
        admin.setHistorial(chatHistoryAdmin);
        sistema1.systemAddUser(admin);
    	
    	Scanner scanner = new Scanner(System.in);
	    int opcionMenu1;
	    do {
	        System.out.println("\n### Sistema de Chatbots - Inicio ###");
	        System.out.println("[Ya existe un usuario administrador para realizar pruebas]-> nombre: admin, password: admin");
	        System.out.println("1. Login de Usuario");
	        System.out.println("2. Registro de Usuario");
	        System.out.print("Seleccione una opcion: ");
	        opcionMenu1 = scanner.nextInt();
	        scanner.nextLine();
	        switch (opcionMenu1) {
	            case 1:
	            	sistema1.systemLogout();
	            	ArrayList<User_207242381_MunozAraya> listaUsuariosRegistrados = sistema1.getRegisteredUsers();
	            	int i = 0;
	            	for(User_207242381_MunozAraya user : listaUsuariosRegistrados) {
	            		System.out.println(i + ". " + user.getUsername());
	            		i++;
	            	}
	            	System.out.println("Ingrese el usuario que desea logear(Numero):");
	            	int opcionUsuario = scanner.nextInt();
	            	scanner.nextLine();
	            	if(opcionUsuario >= 0 && opcionUsuario <= i) {
	            		User_207242381_MunozAraya logedUser = listaUsuariosRegistrados.get(opcionUsuario);
	            		
	            		
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
	        	        System.out.print("Seleccione una opcion: ");
	        	        
	        	        // Leer la opción ingresada por el usuario
	        	        opcionMenu2 = scanner.nextInt();
	        	        scanner.nextLine();
	        	        switch (opcionMenu2) {
	        	            case 1:
	        	            	System.out.print("Ingrese el nombre del usuario: ");
	                            String username = scanner.nextLine();
	                            System.out.print("Ingrese la constraseña: ");
	                            String userPassword = scanner.nextLine();
	        	            	User_207242381_MunozAraya newUser = new User_207242381_MunozAraya(username, userPassword, false);
	        	            	ChatHistory_207242381_MunozAraya chathistory = new ChatHistory_207242381_MunozAraya(newUser,  mensajesIni);
	        	            	newUser.setHistorial(chathistory);
	        	            	sistema1.systemAddUser(newUser);
	        	                break;
	        	            case 2:
	        	            	System.out.print("Ingrese el nombre del usuario: ");
	                            String usernameAdmin = scanner.nextLine();
	                            System.out.print("Ingrese la constraseña: ");
	                            String userPasswordAdmin = scanner.nextLine();
	        	            	User_207242381_MunozAraya newUserAdmin = new User_207242381_MunozAraya(usernameAdmin, userPasswordAdmin, true);
	        	            	ChatHistory_207242381_MunozAraya chathistoryAdmin = new ChatHistory_207242381_MunozAraya(newUserAdmin,  mensajesIni);
	        	            	newUserAdmin.setHistorial(chathistoryAdmin);
	        	            	sistema1.systemAddUser(newUserAdmin);
	        	                break;	        	                
	        	            case 0:
	        	            	break;
	        	            default:
	        	                System.out.println("Opcion no valida. Por favor, selecciona una opcion valida.");
	        	                break;
	        	        }
	        	    } while (opcionMenu2 != 0);
	                break;
	            default:
	                System.out.println("Opcion no valida. Por favor, selecciona una opcion valida.");
	                break;
	        }
	    } while (opcionMenu1 != 1);
	    
	    
	    
	    
	    
	    User_207242381_MunozAraya logedUser = sistema1.obtenerPrimerUsuarioActivo();
	    if(logedUser.isAdmin()) {//Este menu es exclusivo para un administrador
	    	
		    int opcionMenu3;
		    do {
		        System.out.println("\n### Sistema de Chatbots - Inicio ###");
		        System.out.println("1. Crear un chatbot");
		        System.out.println("2. Ejecutar un Chatbot");
		        System.out.println("3. Visualizar todos los chatbots existentes en el sistema");
		        System.out.println("4. Ver una sinstesis del usuario");
		        System.out.println("0. Salir");
		        System.out.print("Seleccione una opcion: ");
		        opcionMenu3 = scanner.nextInt();
		        scanner.nextLine();
		        switch (opcionMenu3) {
		            case 1:
		            	Chatbot_207242381_MunozAraya newChatbot = new Chatbot_207242381_MunozAraya();
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
				            System.out.print("Seleccione una opcion: ");
				            
				            // Leer la opción ingresada por el usuario
				            opcionMenu5 = scanner.nextInt();
				            scanner.nextLine();
				            
				            switch (opcionMenu5) {
				                case 1:
				                	Flow_207242381_MunozAraya newFlow = new Flow_207242381_MunozAraya();
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
					                    System.out.print("Seleccione una opcion: ");
					                    
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
					                                System.out.print("Seleccione una opcion: ");
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
					                                        System.out.println("Opcion no valida. Por favor, selecciona una opcion valida.");
					                                        break;
					                                }
					                            } while (opcionKey != 0);
					                            Option_207242381_MunozAraya newOption = new Option_207242381_MunozAraya(idOption, messageOption, idChatbot, keywords,idFlow);
					                            newFlow.FlowAddOption(newOption);
					                            
					                            break;
					                        case 2:
					                        	for(Option_207242381_MunozAraya option : newFlow.getOptions()){
					                        		System.out.println(option.getId() + ". " + option.getMessage());
					                        	}
					                        	System.out.println("Ingrese la id de la opcion que desea eliminar:");
					                        	int opcionEliminar = scanner.nextInt();
				                                scanner.nextLine();
				                                for(Option_207242381_MunozAraya option : newFlow.getOptions()){
					                        		if(opcionEliminar == option.getId()) {
					                        			newFlow.getOptions().remove(option);
					                        		}
					                        	}

					                            break;
					                        case 3:
					                        	for(Option_207242381_MunozAraya option : newFlow.getOptions()){
					                        		System.out.println(option.getId() + ". " + option.getMessage());
					                        	}
					                            break;
					                        case 0:
					                            System.out.println("Volviendo");
					                            break;
					                        default:
					                            System.out.println("Opcion no valida. Por favor, selecciona una opcion valida.");
					                            break;
					                    }
					                } while (opcionMenu6 != 0);

					            	//______________________________________________________________________________________
				                    break;
				                case 2:
				                    for(Flow_207242381_MunozAraya flow : newChatbot.getFlows()) {
				                    	System.out.println(flow.getId() + ". " + flow.getMessage());
				                    }
				                    int flowEliminar = scanner.nextInt();
	                                scanner.nextLine();
	                                for(Flow_207242381_MunozAraya flow : newChatbot.getFlows()){
		                        		if(flowEliminar == flow.getId()) {
		                        			newChatbot.getFlows().remove(flow);
		                        		}
		                        	}
				                    break;
				                case 3:
				                	for(Flow_207242381_MunozAraya flow : newChatbot.getFlows()) {
				                    	System.out.println(flow.getId() + ". " + flow.getMessage());
				                    }
				                    break;
				                case 0:
				                    break;
				                default:
				                    System.out.println("Opcion no válida. Por favor, selecciona una opcion valida.");
				                    break;
				            }
				        } while (opcionMenu5 != 0);

				        
				        
		                break;
		            case 2:
		            	int k = 0;
		            	System.out.println("¿Que chatbot desea ejecutar?");
		            	for(Chatbot_207242381_MunozAraya chatbot : sistema1.getChatbots()) {
		            		System.out.println(k +". "+ chatbot.getName());
		            		k++;
		            	}
		            	System.out.println("Ingrese un numero: ");
		            	int opcion2 = scanner.nextInt();
                        scanner.nextLine();
                        if(opcion2 >= 0 && opcion2 < k) {
                        	boolean salir = false;
                        	if(opcion2 != 0) {
                        		ChatHistory_207242381_MunozAraya historialLogedUser = logedUser.getHistorial();
                                ArrayList<Message_207242381_MunozAraya> mensajesLogedUser = historialLogedUser.getMessages();
                                ArrayList<Chatbot_207242381_MunozAraya> chatbotsSeleccionados = sistema1.getChatbots();
                                Chatbot_207242381_MunozAraya chatbotSeleccionado = new Chatbot_207242381_MunozAraya();
                                for (Chatbot_207242381_MunozAraya chatbot : chatbotsSeleccionados) {
                                	if(chatbot.getChatbotID() == opcion2) {
                                		chatbotSeleccionado = chatbot;
                                	}
                                }                          
                                Message_207242381_MunozAraya mensajeNuevoLU = new Message_207242381_MunozAraya(" ", chatbotSeleccionado.getChatbotID(),chatbotSeleccionado.getStartFlowId(), 1);
                                mensajesLogedUser.add(mensajeNuevoLU);
                        	}else {
                        		ChatHistory_207242381_MunozAraya historialLogedUser = logedUser.getHistorial();
                                ArrayList<Message_207242381_MunozAraya> mensajesLogedUser = historialLogedUser.getMessages();
                                mensajesLogedUser.add(mensajeIni);
                                sistema1.systemTalk("Hola");
                        	}
                        	do {
                        		String mensajeRespuesta;
        	        	        System.out.println("Respuesta:");
        	        	        mensajeRespuesta = scanner.nextLine();
        	        	        sistema1.systemTalk(mensajeRespuesta);
        	        	        if (mensajeRespuesta.equals("salir") || mensajeRespuesta.equals("Salir")) {
        	        	        	salir = true;
        	        	        }
        	        	        
        	        	    } while (salir == false);
                        	
                        }else {
                        	System.out.println("Opcion no valida.");
                        }
		                break;
		            case 3:
		            	for(Chatbot_207242381_MunozAraya chatbot : sistema1.getChatbots()) {
		            		System.out.println("-Nombre del Chatbot: " + chatbot.getName() + " ID: " + chatbot.getChatbotID());	
		            	}
		            	
		            	break;
		            case 4:
		            	System.out.println("Los usuarios registrados son:");
		            	for(User_207242381_MunozAraya user : sistema1.getRegisteredUsers()) {
		            		System.out.println("-" + user.getUsername());
		            	}
		            	System.out.println("Ingrese el NOMBRE del usuario que desea ver el historial: ");
		            	String nombreUser = scanner.nextLine();
		            	boolean buscar = false;
		            	for(User_207242381_MunozAraya user : sistema1.getRegisteredUsers()) {
		            		if(user.getUsername().equals(nombreUser)) {
		            			buscar = true;
		            		}
		            	}
		            	if(buscar == true) {
		            		System.out.println("_______________________SINTESIS DEL USUARIO_______________________");
		            		sistema1.systemSynthesis(nombreUser);
		            		System.out.println("__________________________________________________________________");
		            	}else {
		            		System.out.println("No se encontro el usuario");
		            	}
		            	break;
		            case 0:
		            	break;
		            	
		            default:
		                System.out.println("Opcion no válida. Por favor, selecciona una opción valida.");
		                break;
		        }
		    } while (opcionMenu3 != 0);
		    scanner.close();
	    }else {//El usuario no es administrador
	    	int opcionMenu3;
		    do {
		        System.out.println("\n### Sistema de Chatbots - Inicio ###");
		        System.out.println("1. Ejecutar un Chatbot");
		        System.out.println("2. Visualizar todos los chatbots existentes en el sistema");
		        System.out.println("3. Ver una sinstesis del usuario");
		        System.out.println("0. Salir");
		        System.out.print("Seleccione una opcion: ");
		        opcionMenu3 = scanner.nextInt();
		        scanner.nextLine();
		        switch (opcionMenu3) {
		            case 1:
		            	int k = 0;
		            	System.out.println("¿Que chatbot desea ejecutar?");
		            	for(Chatbot_207242381_MunozAraya chatbot : sistema1.getChatbots()) {
		            		System.out.println(k +". "+ chatbot.getName());
		            		k++;
		            	}
		            	System.out.println("Ingrese un numero: ");
		            	int opcion2 = scanner.nextInt();
                        scanner.nextLine();
                        if(opcion2 >= 0 && opcion2 < k) {
                        	boolean salir = false;
                        	if(opcion2 != 0) {
                        		ChatHistory_207242381_MunozAraya historialLogedUser = logedUser.getHistorial();
                                ArrayList<Message_207242381_MunozAraya> mensajesLogedUser = historialLogedUser.getMessages();
                                ArrayList<Chatbot_207242381_MunozAraya> chatbotsSeleccionados = sistema1.getChatbots();
                                Chatbot_207242381_MunozAraya chatbotSeleccionado = new Chatbot_207242381_MunozAraya();
                                for (Chatbot_207242381_MunozAraya chatbot : chatbotsSeleccionados) {
                                	if(chatbot.getChatbotID() == opcion2) {
                                		chatbotSeleccionado = chatbot;
                                	}
                                }                          
                                Message_207242381_MunozAraya mensajeNuevoLU = new Message_207242381_MunozAraya(" ", chatbotSeleccionado.getChatbotID(),chatbotSeleccionado.getStartFlowId(), 1);
                                mensajesLogedUser.add(mensajeNuevoLU);
                        	}else {
                        		ChatHistory_207242381_MunozAraya historialLogedUser = logedUser.getHistorial();
                                ArrayList<Message_207242381_MunozAraya> mensajesLogedUser = historialLogedUser.getMessages();
                                mensajesLogedUser.add(mensajeIni);
                                sistema1.systemTalk("Hola");
                        	}
                        	do {
                        		String mensajeRespuesta;
        	        	        System.out.println("Respuesta:");
        	        	        mensajeRespuesta = scanner.nextLine();
        	        	        sistema1.systemTalk(mensajeRespuesta);
        	        	        if (mensajeRespuesta.equals("salir") || mensajeRespuesta.equals("Salir")) {
        	        	        	salir = true;
        	        	        }
        	        	        
        	        	    } while (salir == false);
                        	
                        }else {
                        	System.out.println("Opcion no valida.");
                        }
                        break;
		            case 2:
		            	for(Chatbot_207242381_MunozAraya chatbot : sistema1.getChatbots()) {
		            		System.out.println("-Nombre del Chatbot: " + chatbot.getName() + " ID: " + chatbot.getChatbotID());	
		            	}
		            	break;                
		            case 3:
		            	System.out.println("Los usuarios registrados son:");
		            	for(User_207242381_MunozAraya user : sistema1.getRegisteredUsers()) {
		            		System.out.println("-" + user.getUsername());
		            	}
		            	System.out.println("Ingrese el NOMBRE del usuario que desea ver el historial: ");
		            	String nombreUser = scanner.nextLine();
		            	boolean buscar = false;
		            	for(User_207242381_MunozAraya user : sistema1.getRegisteredUsers()) {
		            		if(user.getUsername().equals(nombreUser)) {
		            			buscar = true;
		            		}
		            	}
		            	if(buscar == true) {
		            		System.out.println("_______________________SINTESIS DEL USUARIO_______________________");
		            		sistema1.systemSynthesis(nombreUser);
		            		System.out.println("__________________________________________________________________");
		            	}else {
		            		System.out.println("No se encontro el usuario");
		            	}
		            	
		            	break;
		            case 0:
		            	break;      	
		            default:
		                System.out.println("Opcion no válida. Por favor, selecciona una opción valida.");
		                break;
		        }
		    } while (opcionMenu3 != 0);	
	    }
	    scanner.close();
	    
	}
}
