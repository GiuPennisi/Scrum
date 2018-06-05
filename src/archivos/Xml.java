package archivos;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import task.Task;


/**
 * Clase que implementa la serializacion (XML)
 **/
public class Xml {

	public static void almacenar(String path,
			Task task)/* throws FileNotFoundException */ {
		XStream xs = new XStream();
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(path);
			xs.toXML(task, fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Task cargar(String path) throws FileNotFoundException {
		XStream xs = new XStream(new DomDriver());
		FileReader fileReader = new FileReader(path);
		Task task = (Task) xs.fromXML(fileReader);
		return task;
	}


}