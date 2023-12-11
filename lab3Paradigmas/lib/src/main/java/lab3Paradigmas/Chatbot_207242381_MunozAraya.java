package lab3Paradigmas;

import java.util.ArrayList;

public class Chatbot_207242381_MunozAraya extends Identificador_207242381_MunozAraya {
	String name;
	int startFlowId;
	ArrayList<Flow_207242381_MunozAraya> flows;
	//constructor
	public Chatbot_207242381_MunozAraya(int chatbotID, String name, String welcomeMessage, int startFlowId, ArrayList<Flow_207242381_MunozAraya> flows) {
		this.id = chatbotID;
		this.name = name;
		this.message = welcomeMessage;
		this.startFlowId = startFlowId;
		this.flows = new ArrayList<>();
		for (Flow_207242381_MunozAraya flow : flows) {
            boolean exists = false;
            for (Flow_207242381_MunozAraya existingFlow : this.flows) {
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
	public Chatbot_207242381_MunozAraya() {
		this.flows = new ArrayList<>();
	}
	
	//getters y setters
	public int getChatbotID() {
		return id;
	}
	public void setChatbotID(int chatbotID) {
		this.id = chatbotID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWelcomeMessage() {
		return message;
	}
	public void setWelcomeMessage(String welcomeMessage) {
		this.message = welcomeMessage;
	}
	public int getStartFlowId() {
		return startFlowId;
	}
	public void setStartFlowId(int startFlowId) {
		this.startFlowId = startFlowId;
	}
	public ArrayList<Flow_207242381_MunozAraya> getFlows() {
		return flows;
	}
	public void setFlows(ArrayList<Flow_207242381_MunozAraya> flows) {
		this.flows = flows;
	}
	public void ChatbotAddFlow(Flow_207242381_MunozAraya newFlow) {
        boolean exists = false;
        for (Flow_207242381_MunozAraya flow : flows) {
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
