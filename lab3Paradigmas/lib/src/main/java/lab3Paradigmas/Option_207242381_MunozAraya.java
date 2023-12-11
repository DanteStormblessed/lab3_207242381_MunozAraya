package lab3Paradigmas;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Alvaro Muñoz Araya
 */
public class Option_207242381_MunozAraya extends Identificador_207242381_MunozAraya{
    int chatbotCodeLink;
    int initialFlowCodeLink;
    ArrayList<String> keywords;

    //Constructor
    public Option_207242381_MunozAraya(int id, String message, int chatbotCodeLink, ArrayList<String> keywords, int initialFlowCodeLink) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink;
        this.keywords = new ArrayList<>(keywords); 
    }
    //Constructor en caso de que no se agreguen keywords
    public Option_207242381_MunozAraya(int id, String message, int chatbotCodeLink, int initialFlowCodeLink) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.initialFlowCodeLink = initialFlowCodeLink; 
        this.keywords = new ArrayList<>(); 
    }


    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public int getChatbotCodeLink() {
        return chatbotCodeLink;
    }

    public ArrayList<String> getKeywords() {
        return new ArrayList<>(keywords);
    }
    

    public void addKeywords(String... newKeywords) {
        keywords.addAll(Arrays.asList(newKeywords));
    }
  
    public void setMessage(String newMessage) {
        this.message = newMessage;
    }
    
    
    public int getInitialFlowCodeLink() {
		return initialFlowCodeLink;
	}
	public void setInitialFlowCodeLink(int initialFlowCodeLink) {
		this.initialFlowCodeLink = initialFlowCodeLink;
	}
	//OTROS
    public void printOptionDetails() {
        System.out.println("Opcion ID: " + getId());
        System.out.println("Mensaje: " + getMessage());
        System.out.println("Chatbot code link: " + getChatbotCodeLink());
        System.out.print("Keywords: ");
        for (String keyword : getKeywords()) {
            System.out.print(keyword + " ");
        }
    }
    public void printOption() {
        System.out.println(getMessage());   	
    }
}