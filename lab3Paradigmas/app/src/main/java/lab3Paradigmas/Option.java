package lab3Paradigmas;

import java.util.ArrayList;
/**
 *
 * @author alvar
 */
public class Option {
    private int id;
    private String message;
    private int chatbotCodeLink;
    private ArrayList<String> keywords;

    
    public Option(int id, String message, int chatbotCodeLink, ArrayList<String> keywords) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
        this.keywords = new ArrayList<>(keywords); 
    }

    
    public Option(int id, String message, int chatbotCodeLink) {
        this.id = id;
        this.message = message;
        this.chatbotCodeLink = chatbotCodeLink;
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
    

    public void addKeyword(String keyword) {
        keywords.add(keyword);
    }
}
