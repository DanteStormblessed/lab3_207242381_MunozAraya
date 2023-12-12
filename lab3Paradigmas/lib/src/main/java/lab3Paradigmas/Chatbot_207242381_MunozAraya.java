package lab3Paradigmas;

import java.util.ArrayList;
/**
 * Clase Chatbot, representa un Chatbot del sistema, el sirve para interactuar por medio
 * de los flows que contiene
 * @author Alvaro Muñoz
 */
public class Chatbot_207242381_MunozAraya extends Identificador_207242381_MunozAraya {
	String name;
	int startFlowId;
	ArrayList<Flow_207242381_MunozAraya> flows;
	
	/**
	 * Metodo constructor de un Chatbot, crea un nuevo chatbot a partir de una id, un nombre, un mensaje de bienvenida
	 * un id para el flow de inicio y una lista de flows
	 * @param chatbotID
	 * @param name
	 * @param welcomeMessage
	 * @param startFlowId
	 * @param flows
	 */
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
	
	/**
	 * Constructor vacio de un Chatbot, construye un chatbot con sus atributos de forma predeterminada
	 */
	public Chatbot_207242381_MunozAraya() {
		this.flows = new ArrayList<>();
	}
	
	/**
	 * ChatbotID getter
	 * @return id
	 */
	public int getChatbotID() {
		return id;
	}
	
	/**
	 * ChatbotID setter
	 * @param chatbotID
	 */
	public void setChatbotID(int chatbotID) {
		this.id = chatbotID;
	}
	
	/**
	 * name getter
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * name setter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * WelcomeMessage getter
	 * @return message
	 */
	public String getWelcomeMessage() {
		return message;
	}
	
	/**
	 * WelcomeMessage setter
	 * @param welcomeMessage
	 */
	public void setWelcomeMessage(String welcomeMessage) {
		this.message = welcomeMessage;
	}
	
	/**
	 * startFlowId getter
	 * @return startFlowId
	 */
	public int getStartFlowId() {
		return startFlowId;
	}
	
	/**
	 * startFlowId setter
	 * @param startFlowId
	 */
	public void setStartFlowId(int startFlowId) {
		this.startFlowId = startFlowId;
	}
	
	/**
	 * Flows getter
	 * @return flows
	 */
	public ArrayList<Flow_207242381_MunozAraya> getFlows() {
		return flows;
	}
	
	/**
	 * Flows setter
	 * @param flows
	 */
	public void setFlows(ArrayList<Flow_207242381_MunozAraya> flows) {
		this.flows = flows;
	}
	
	/**
	 * Metodo que añade un flow a un chatbot, verificando si el id del flow se encuentra
	 * en la lista de Flows
	 * @param newFlow
	 */
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
