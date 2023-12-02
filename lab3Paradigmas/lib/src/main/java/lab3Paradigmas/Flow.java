package lab3Paradigmas;

import java.util.ArrayList;

public class Flow {
	int id;
	String message;
	ArrayList<Option> options;
	
	//constructor del TDA flow
	public Flow(int id, String message, ArrayList<Option> options){
		this.id = id;
		this.message = message;
		this.options = new ArrayList<>(options);
	}
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Option> getOptions() {
        return new ArrayList<>(options);
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = new ArrayList<>(options);
    }
    //MODIFICADOR
    public void FlowAddOption(Option newOption) {
        boolean exists = false;
        for (Option option : options) {
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
