package status;

import task.Task_Status;

public class InProgress extends Status{

	public InProgress(String nombre, String descripcion, Task_Status anterior, Task_Status siguiente) {
		super(nombre, descripcion, anterior, siguiente);
		
		siguiente = Task_Status.PENDING_TO_BUILD;
	}



}
