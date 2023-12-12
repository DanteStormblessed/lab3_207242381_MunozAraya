package lab3Paradigmas;

import java.util.ArrayList;
/**
 * Esta clase representa un flow, es decir, el flujo que sigue el chatbot a la
 * hora de mostrar las opciones
 * @author alvar
 */

public class Flow_207242381_MunozAraya extends Identificador_207242381_MunozAraya {
	ArrayList<Option_207242381_MunozAraya> options;

	/**
	 * Metodo constructor de un Flow, permite crear un flow a partir de
	 * una id, un mensaje y una lista de opciones
	 * @param id
	 * @param message
	 * @param options
	 */
	public Flow_207242381_MunozAraya(int id, String message, ArrayList<Option_207242381_MunozAraya> options){
		this.id = id;
		this.message = message;
		this.options = new ArrayList<>();
		for (Option_207242381_MunozAraya option : options) {
            boolean exists = false;
            for (Option_207242381_MunozAraya existingOption : this.options) {
                if (existingOption.getId() == option.getId()) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                this.options.add(option);
            } else {
                System.out.println("El Option con ID " + option.getId() + " ya está en el flujo.");
            }
        }

	}
	/**
	 * Constructor vacio de un Flow, crea un flow con los atributos de
	 * forma predeterminada
	 */
	public Flow_207242381_MunozAraya(){
		this.options = new ArrayList<>();

	}
	
	/**
	 * id getter
	 * @return id
	 */
	public int getId() {
        return id;
    }

	/**
	 * id setter
	 * @param id
	 */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * message getter
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * message setter
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * options getter
     * @return ArrayList<>(options)
     */
    public ArrayList<Option_207242381_MunozAraya> getOptions() {
        return new ArrayList<>(options);
    }

    /**
     * options setter
     * @param options
     */
    public void setOptions(ArrayList<Option_207242381_MunozAraya> options) {
        this.options = new ArrayList<>(options);
    }

    /**
     * Metodo que permite añadir una opcion a un flujo, verifica
     * si el id de la opcion se encuentra en la lista de opciones
     * @param newOption
     */
    public void FlowAddOption(Option_207242381_MunozAraya newOption) {
        boolean exists = false;
        for (Option_207242381_MunozAraya option : options) {
            if (option.getId() == newOption.getId()) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            options.add(newOption);
        } else {
            System.out.println("El Option con ID " + newOption.getId() + " ya está en el flujo.");
        }
    }
    
}
