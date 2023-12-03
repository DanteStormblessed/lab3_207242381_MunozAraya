package lab3Paradigmas;

import java.util.ArrayList;

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
        
        
        
        // Imprimir las opciones del flujo
        System.out.print("\n-------------------------------------------------");
        System.out.println("\nDatos de el flujo:");
        System.out.println("ID del flujo:" + flujo.getId());
        System.out.println("Mensaje del flujo:" + flujo.getMessage());
        System.out.print("\n");
        System.out.println("Opciones del flujo:");
        for (Option opcion1 : flujo.getOptions()) {
        	opcion1.printOptionDetails();
        	System.out.println("\n");
        }
        
        
        
    }
}