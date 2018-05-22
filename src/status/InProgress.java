package status;

import task.Task_Status;

public class InProgress extends Status{

	public InProgress(Task_Status anterior, Task_Status siguiente) {
		super("In Progress", "Lorem ipsum dolor sit amet, consectetur adipiscing elit");
		
		siguiente = Task_Status.PENDING_TO_BUILD;
	}



}
