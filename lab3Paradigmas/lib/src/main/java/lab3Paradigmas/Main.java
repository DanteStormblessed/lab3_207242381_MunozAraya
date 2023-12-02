package lab3Paradigmas;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
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
        System.out.println("\nOpciones en el flujo:");
        for (Option option : flujo.getOptions()) {
        	opcion.printOptionDetails();
        }
        
        
        
    }
}