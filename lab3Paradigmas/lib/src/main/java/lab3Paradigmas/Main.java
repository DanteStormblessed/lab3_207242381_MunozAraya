package lab3Paradigmas;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("keyword1");
        keywords.add("keyword2");
        Option newOption = new Option(1, "hOLAA", 1234); 
        System.out.println("Detalles de la opción:");
        System.out.println("ID: " + newOption.getId());
        System.out.println("Mensaje: " + newOption.getMessage());
        System.out.println("Enlace al chatbot: " + newOption.getChatbotCodeLink());
    }
}