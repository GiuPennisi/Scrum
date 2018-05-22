package status;

import task.Task_Status;

public class ReadyForTest extends Status{

	public ReadyForTest(Task_Status anterior, Task_Status siguiente) {
		super("Ready For Test", "Lorem ipsum dolor sit amet, consectetur adipiscing elit");
		
		siguiente = Task_Status.TESTING;
	}



}
