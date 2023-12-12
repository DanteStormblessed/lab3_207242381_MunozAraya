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
	    

        Option_207242381_MunozAraya opcion3_1 = new Option_207242381_MunozAraya(1, "Terror", 1, 8);
        opcion3_1.addKeywords("Miedo", "Terror", "Horror");
        Option_207242381_MunozAraya opcion3_2 = new Option_207242381_MunozAraya(2, "Fantasia", 1, 9);
        opcion3_2.addKeywords("fantasia", "medieval", "magia");
        Option_207242381_MunozAraya opcion3_3 = new Option_207242381_MunozAraya(3, "Ciencia Ficcion", 1, 10);
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

        Option_207242381_MunozAraya opcion4_1 = new Option_207242381_MunozAraya(1, "Shooter", 1, 5);
        opcion4_1.addKeywords("Fps", "Disparos", "shooter");
        Option_207242381_MunozAraya opcion4_2 = new Option_207242381_MunozAraya(2, "Supervivencia", 1, 6);
        opcion4_2.addKeywords("survival", "Sobrevivir", "Aventura");
        Option_207242381_MunozAraya opcion4_3 = new Option_207242381_MunozAraya(3, "Carreras", 1, 7);
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

        Option_207242381_MunozAraya opcion5_1 = new Option_207242381_MunozAraya(1, "Call of duty", 1, 5);
        opcion5_1.addKeywords("cod", "callofduty");
        Option_207242381_MunozAraya opcion5_2 = new Option_207242381_MunozAraya(2, "Battlefield", 1, 5);
        opcion5_2.addKeywords("bf", "battle field");
        Option_207242381_MunozAraya opcion5_3 = new Option_207242381_MunozAraya(3, "Volver", 1, 4);
        opcion5_3.addKeywords("Volver", "volver", "anterior");        
        ArrayList<Option_207242381_MunozAraya> opciones5 = new ArrayList<>();
        opciones5.add(opcion5_1);
        opciones5.add(opcion5_2);
        opciones5.add(opcion5_3);
    	Flow_207242381_MunozAraya flujo5 = new Flow_207242381_MunozAraya(5, "¿Cual deseas jugar?", opciones5);
        chatbot1.ChatbotAddFlow(flujo5);

        Option_207242381_MunozAraya opcion6_1 = new Option_207242381_MunozAraya(1, "Minecraft", 1, 6);
        opcion6_1.addKeywords("mine", "craft");
        Option_207242381_MunozAraya opcion6_2 = new Option_207242381_MunozAraya(2, "Terraria", 1, 6);
        opcion6_2.addKeywords("terra", "2d");
        Option_207242381_MunozAraya opcion6_3 = new Option_207242381_MunozAraya(2, "Ark", 1, 6);
        opcion6_3.addKeywords("ark survival", "dinosaurios");
        Option_207242381_MunozAraya opcion6_4 = new Option_207242381_MunozAraya(3, "Volver", 1, 4);
        opcion6_4.addKeywords("Volver", "volver", "anterior");        
        ArrayList<Option_207242381_MunozAraya> opciones6 = new ArrayList<>();
        opciones6.add(opcion6_1);
        opciones6.add(opcion6_2);
        opciones6.add(opcion6_3);
        opciones6.add(opcion6_4);
    	Flow_207242381_MunozAraya flujo6 = new Flow_207242381_MunozAraya(6, "¿Cual deseas jugar?", opciones6);
        chatbot1.ChatbotAddFlow(flujo6);

        Option_207242381_MunozAraya opcion7_1 = new Option_207242381_MunozAraya(1, "Need for speed", 1, 7);
        opcion7_1.addKeywords("speed", "need");
        Option_207242381_MunozAraya opcion7_2 = new Option_207242381_MunozAraya(2, "Forza", 1, 7);
        opcion7_2.addKeywords("forsa", "forza horizon", "forza motosport");
        Option_207242381_MunozAraya opcion7_3 = new Option_207242381_MunozAraya(3, "Mario kart", 1, 7);
        opcion7_3.addKeywords("mario", "kart");
        Option_207242381_MunozAraya opcion7_4 = new Option_207242381_MunozAraya(4, "Volver", 1, 4);
        opcion7_4.addKeywords("Volver", "volver", "anterior");        
        ArrayList<Option_207242381_MunozAraya> opciones7 = new ArrayList<>();
        opciones7.add(opcion7_1);
        opciones7.add(opcion7_2);
        opciones7.add(opcion7_3);
        opciones7.add(opcion7_4);
    	Flow_207242381_MunozAraya flujo7 = new Flow_207242381_MunozAraya(7, "¿Cual deseas jugar?", opciones7);
        chatbot1.ChatbotAddFlow(flujo7);

        Option_207242381_MunozAraya opcion8_1 = new Option_207242381_MunozAraya(1, "IT", 1, 8);
        opcion8_1.addKeywords("payaso", "i.t.");
        Option_207242381_MunozAraya opcion8_2 = new Option_207242381_MunozAraya(2, "El conjuro", 1, 8);
        opcion8_2.addKeywords("conjuro");
        Option_207242381_MunozAraya opcion8_3 = new Option_207242381_MunozAraya(3, "El exorcista", 1, 8);
        opcion8_3.addKeywords("exorcista", "exocismo");
        Option_207242381_MunozAraya opcion8_4 = new Option_207242381_MunozAraya(4, "Volver", 1, 3);
        opcion8_4.addKeywords("Volver", "volver", "anterior");        
        ArrayList<Option_207242381_MunozAraya> opciones8 = new ArrayList<>();
        opciones8.add(opcion8_1);
        opciones8.add(opcion8_2);
        opciones8.add(opcion8_3);
        opciones8.add(opcion8_4);
    	Flow_207242381_MunozAraya flujo8 = new Flow_207242381_MunozAraya(8, "¿Cual deseas ver?", opciones8);
        chatbot1.ChatbotAddFlow(flujo8);

        Option_207242381_MunozAraya opcion9_1 = new Option_207242381_MunozAraya(1, "El señor de los anillos", 1, 9);
        opcion9_1.addKeywords("esdla", "tlotr", "anillos", "el señor");
        Option_207242381_MunozAraya opcion9_2 = new Option_207242381_MunozAraya(2, "Las cronicas de Narnia", 1, 9);
        opcion9_2.addKeywords("narnia", "lcdn", "las cronicas");
        Option_207242381_MunozAraya opcion9_3 = new Option_207242381_MunozAraya(3, "Harry Potter", 1, 9);
        opcion9_3.addKeywords("HP", "harry", "potter");
        Option_207242381_MunozAraya opcion9_4 = new Option_207242381_MunozAraya(4, "Volver", 1, 3);
        opcion9_4.addKeywords("Volver", "volver", "anterior");        
        ArrayList<Option_207242381_MunozAraya> opciones9 = new ArrayList<>();
        opciones9.add(opcion9_1);
        opciones9.add(opcion9_2);
        opciones9.add(opcion9_3);
        opciones9.add(opcion9_4);
    	Flow_207242381_MunozAraya flujo9 = new Flow_207242381_MunozAraya(9, "¿Cual deseas ver?", opciones9);
        chatbot1.ChatbotAddFlow(flujo9);

        Option_207242381_MunozAraya opcion10_1 = new Option_207242381_MunozAraya(1, "Transformers", 1, 10);
        opcion10_1.addKeywords("esdla", "tlotr", "anillos", "el señor");
        Option_207242381_MunozAraya opcion10_2 = new Option_207242381_MunozAraya(2, "Los Vengadores", 1, 10);
        opcion10_2.addKeywords("vengadores", "lv", "avengers");
        Option_207242381_MunozAraya opcion10_3 = new Option_207242381_MunozAraya(3, "Interestelar", 1, 10);
        opcion10_3.addKeywords("interstellar");
        Option_207242381_MunozAraya opcion10_4 = new Option_207242381_MunozAraya(4, "Volver", 1, 3);
        opcion10_4.addKeywords("Volver", "volver", "anterior");        
        ArrayList<Option_207242381_MunozAraya> opciones10 = new ArrayList<>();
        opciones10.add(opcion10_1);
        opciones10.add(opcion10_2);
        opciones10.add(opcion10_3);
        opciones10.add(opcion10_4);
    	Flow_207242381_MunozAraya flujo10 = new Flow_207242381_MunozAraya(10, "¿Cual deseas ver?", opciones10);
        chatbot1.ChatbotAddFlow(flujo10);
        
          
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
	        	        System.out.println("\n### Sistema de Chatbots - Inicio ###");
	        	        System.out.println("1. Registrar usuario normal");
	        	        System.out.println("2. Registrar usuario administrador");
	        	        System.out.println("0. Volver");
	        	        System.out.print("Seleccione una opcion: ");
	        	        
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
	    if(logedUser.isAdmin()) {
	    	
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
				            System.out.println("\n_____Crear flow_____");
				            System.out.println("1. Crear un nuevo flow");
				            System.out.println("2. Eliminar un flow");
				            System.out.println("3. Ver listado de flows");
				            System.out.println("0. Salir");
				            System.out.print("Seleccione una opcion: ");
				            
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
	    }else {
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
