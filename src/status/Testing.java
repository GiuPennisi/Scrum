package status;

import task.Task_Status;

public class Testing extends Status{

	public Testing(String nombre, String descripcion, Task_Status anterior, Task_Status siguiente) {
		super(nombre, descripcion, anterior, siguiente);
		
		anterior = Task_Status.TO_DO;
		siguiente = Task_Status.DONE;
	}

	

}
