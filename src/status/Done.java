package status;

import task.Task_Status;

public class Done extends Status{

	public Done(String nombre, String descripcion, Task_Status anterior, Task_Status siguiente) {
		super(nombre, descripcion, anterior, siguiente);
	}

	

}
