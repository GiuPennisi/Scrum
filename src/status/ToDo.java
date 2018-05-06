package status;

import task.Task_Status;

public class ToDo extends Status{

	public ToDo(String nombre, String descripcion, Task_Status anterior, Task_Status siguiente) {
		super(nombre, descripcion, anterior, siguiente);
		
		siguiente = Task_Status.IN_PROGRESS;
	}


}
