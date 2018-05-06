package status;

import task.Task_Status;

public class ReadyForTest extends Status{

	public ReadyForTest(String nombre, String descripcion, Task_Status anterior, Task_Status siguiente) {
		super(nombre, descripcion, anterior, siguiente);
		
		siguiente = Task_Status.TESTING;
	}



}
