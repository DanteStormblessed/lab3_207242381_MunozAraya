package lab3Paradigmas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * Clase que representa un mensaje, sirve para guardar los mensajes intoducidos por el
 * usuario, a su vez de la fecha y los id de Chatbot/flujo/option
 * @author Alvaro Muñoz
 */
public class Message_207242381_MunozAraya {
    String mensaje;
    ArrayList<Integer> fecha;
    int chatbotID;
    int flowID;
    int opcionID;

    /**
     * Metodo constructor de un mensaje, crea un mensaje a partir de un mensaje (representa la entrada del usuario), id del chatbot
     * , id del flow, id de la opcion
     * @param mensaje
     * @param chatbotID
     * @param flowID
     * @param opcionID
     */
    public Message_207242381_MunozAraya(String mensaje, int chatbotID, int flowID, int opcionID) {
        this.mensaje = mensaje;
        this.chatbotID = chatbotID;
        this.flowID = flowID;
        this.opcionID = opcionID;
        this.fecha = new ArrayList<>();
        this.fecha = getFecha(); // Llama al método getFecha en el constructor para obtener la fecha actual
    }

    /**
     * mensaje getter
     * @return mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * mensaje setter
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * chatbotID getter
     * @return chatbotID
     */
    public int getChatbotID() {
        return chatbotID;
    }

    /**
     * chatbotID setter
     * @param chatbotID
     */
    public void setChatbotID(int chatbotID) {
        this.chatbotID = chatbotID;
    }

    /**
     * flowID getter
     * @return flowID
     */
    public int getFlowID() {
        return flowID;
    }

    /**
     * flowID setter
     * @param flowID
     */
    public void setFlowID(int flowID) {
        this.flowID = flowID;
    }

    /**
     * opcionID getter
     * @return opcionID
     */
    public int getOpcionID() {
        return opcionID;
    }

    /**
     * opcionID setter
     * @param opcionID
     */
    public void setOpcionID(int opcionID) {
        this.opcionID = opcionID;
    }

    /**
     * Metodo que obtiene la fecha y hora actual, la guarda en una lista y despues la 
     * retorna
     * @return fechaHora
     */
    public ArrayList<Integer> getFecha() {
        Calendar calendario = Calendar.getInstance(TimeZone.getDefault());
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);
        int horas = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        ArrayList<Integer> fechaHora = new ArrayList<>();
        fechaHora.add(dia);
        fechaHora.add(mes);
        fechaHora.add(anio);
        fechaHora.add(horas);
        fechaHora.add(minutos);

        return fechaHora;
    }
}
