package lab3Paradigmas;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Esta clase representa una opcion, la cual se 
 * asocia a un flow y un chatbot
 * @author Alvaro Muñoz Araya
 */

public class Option_207242381_MunozAraya extends Identificador_207242381_MunozAraya{
    int chatbotCodeLink;
    int initialFlowCodeLink;
    ArrayList<String> keywords;

    /**
     * Este es el constructor de un option, para el caso en que se agreguen Keywords
     * al momento de crear una nueva opcion
     * @param id
     * @param message
     * @param chatbotCodeLink
     * @param keywords
     * @param initialFlowCodeLink
     */
    public Option_207242381_MunozAraya(int id, String message, int chatbotCodeLink, ArrayList<String> keywords, int initialFlowCodeLink) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = new ArrayList<>(keywords); 
    }
    /**
     * Este es el constructor de option en el caso de que no se agreguen keywords
     * al momento de crear una nueva opcion
     * @param id
     * @param message
     * @param chatbotCodeLink
     * @param initialFlowCodeLink
     */
    public Option_207242381_MunozAraya(int id, String message, int chatbotCodeLink, int initialFlowCodeLink) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink; 
        this.keywords = new ArrayList<>(); 
    }

    /**
     * id getter
     * @return id
     */
    public int getId() {
        return id;
    }
    
    /**
     * message getter
     * @return message
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * ChatbotCodeLink getter
     * @return ChatbotCodeLink
     */
    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }
    
    /**
     * kewords getter
     * @return ArrayList<>(keywords)
     */
    public ArrayList<String> getKeywords() {
        return new ArrayList<>(keywords);
    }
    
    /**
     * Añade keywords a una opcion, el metodo recibe 1 mas parametros
     * @param newKeywords
     */
    public void addKeywords(String... newKeywords) {
        keywords.addAll(Arrays.asList(newKeywords));
    }
  
    /**
     * message setter
     * @param newMessage
     */
    public void setMessage(String newMessage) {
        this.message = newMessage;
    }
    
    /**
     * intitialFlowCodeLink getter
     * @return initialFlowCodeLink
     */
    public int getInitialFlowCodeLink() {
		return initialFlowCodeLink;
	}
	public void setInitialFlowCodeLink(int initialFlowCodeLink) {
		this.initialFlowCodeLink = initialFlowCodeLink;
	}
	
	/**
	 * Metodo que imprime una opcion por consola (se utiliza a la hora
	 * de debugear el codgio)
	 */
    public void printOptionDetails() {
        System.out.println("Opcion ID: " + getId());
        System.out.println("Mensaje: " + getMessage());
        System.out.println("Chatbot code link: " + getChatbotCodeLink());
        System.out.print("Keywords: ");
        for (String keyword : getKeywords()) {
            System.out.print(keyword + " ");
        }
    }
    /**
     * Metodo que solo imprime el mensaje de una opcion
     */
    public void printOption() {
        System.out.println(getMessage());   	
    }
}
