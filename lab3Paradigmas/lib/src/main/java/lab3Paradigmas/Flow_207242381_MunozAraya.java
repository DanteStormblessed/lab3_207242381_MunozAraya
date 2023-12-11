package lab3Paradigmas;

import java.util.ArrayList;

public class Flow_207242381_MunozAraya extends Identificador_207242381_MunozAraya {
	ArrayList<Option_207242381_MunozAraya> options;
	
	//constructor del TDA flow
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
	
	public Flow_207242381_MunozAraya(){
		this.options = new ArrayList<>();

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

    public ArrayList<Option_207242381_MunozAraya> getOptions() {
        return new ArrayList<>(options);
    }

    public void setOptions(ArrayList<Option_207242381_MunozAraya> options) {
        this.options = new ArrayList<>(options);
    }
    //MODIFICADOR
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
