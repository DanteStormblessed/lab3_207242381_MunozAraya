package lab3Paradigmas;

import java.util.ArrayList;

public class Chatbot {
	//Atributos
	int chatbotID;
	String name;
	String welcomeMessage;
	int startFlowId;
	ArrayList<Flow> flows;
	//constructor
	public Chatbot(int chatbotID, String name, String welcomeMessage, int startFlowId, ArrayList<Flow> flows) {
		this.chatbotID = chatbotID;
		this.name = name;
		this.welcomeMessage = welcomeMessage;
		this.startFlowId = startFlowId;
		this.flows = new ArrayList<>();
		for (Flow flow : flows) {
            boolean exists = false;
            for (Flow existingFlow : this.flows) {
                if (existingFlow.getId() == flow.getId()) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                this.flows.add(flow);
            } else {
                System.out.println("El Flow con ID " + flow.getId() + " ya está en el chatbot.");
            }
        }
	}
	public Chatbot() {
	}
	
	//getters y setters
	public int getChatbotID() {
		return chatbotID;
	}
	public void setChatbotID(int chatbotID) {
		this.chatbotID = chatbotID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWelcomeMessage() {
		return welcomeMessage;
	}
	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	public int getStartFlowId() {
		return startFlowId;
	}
	public void setStartFlowId(int startFlowId) {
		this.startFlowId = startFlowId;
	}
	public ArrayList<Flow> getFlows() {
		return flows;
	}
	public void setFlows(ArrayList<Flow> flows) {
		this.flows = flows;
	}
	public void ChatbotAddFlow(Flow newFlow) {
        boolean exists = false;
        for (Flow flow : flows) {
            if (flow.getId() == newFlow.getId()) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            flows.add(newFlow);
        } else {
            System.out.println("El Flow con ID " + newFlow.getId() + " ya está en el Chatbot.");
        }
    }	
}
