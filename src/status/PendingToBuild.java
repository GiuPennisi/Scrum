package status;

import task.Task_Status;

public class PendingToBuild extends Status{

	public PendingToBuild(Task_Status anterior, Task_Status siguiente) {
		super("Pending to Build", "Lorem ipsum dolor sit amet, consectetur adipiscing elit");

		anterior = Task_Status.TO_DO;
		siguiente = Task_Status.READY_FOR_TEST;
	}



}
