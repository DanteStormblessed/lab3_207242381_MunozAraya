package lab3Paradigmas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

public class Message {
    String mensaje;
    ArrayList<Integer> fecha;
    int chatbotID;
    int flowID;
    int opcionID;

    public Message(String mensaje, int chatbotID, int flowID, int opcionID) {
        this.mensaje = mensaje;
        this.chatbotID = chatbotID;
        this.flowID = flowID;
        this.opcionID = opcionID;
        this.fecha = getFecha(); // Llama al método getFecha en el constructor para obtener la fecha actual
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getChatbotID() {
        return chatbotID;
    }

    public void setChatbotID(int chatbotID) {
        this.chatbotID = chatbotID;
    }

    public int getFlowID() {
        return flowID;
    }

    public void setFlowID(int flowID) {
        this.flowID = flowID;
    }

    public int getOpcionID() {
        return opcionID;
    }

    public void setOpcionID(int opcionID) {
        this.opcionID = opcionID;
    }

    public ArrayList<Integer> getFecha() {
        // Obtener la fecha y hora actual
        Calendar calendario = Calendar.getInstance(TimeZone.getDefault());

        // Obtener los valores de la fecha y hora actual
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1; // Los meses empiezan en 0, sumamos 1 para obtener el mes actual
        int anio = calendario.get(Calendar.YEAR);
        int horas = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);

        // Crear un ArrayList con los valores obtenidos
        ArrayList<Integer> fechaHora = new ArrayList<>();
        fechaHora.add(dia);
        fechaHora.add(mes);
        fechaHora.add(anio);
        fechaHora.add(horas);
        fechaHora.add(minutos);

        return fechaHora;
    }
}
