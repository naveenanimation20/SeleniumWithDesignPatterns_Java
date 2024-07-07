package SingletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BrowerReadResolve {

	public static void main(String[] args) {
		try {
			Browser instance1 = Browser.getInstance();

			//Serialize the Browser instance
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("browser.json"));
			out.writeObject(instance1);
			out.close();

			// De-Serialize the Browser instance
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("browser.json"));
			Browser instance2 = (Browser) in.readObject();
			in.close();
			
			ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("browser.json"));
			Browser instance3 = (Browser) in1.readObject();
			in1.close();

			System.out.println("Instance1 hash code: " + instance1.hashCode());
			System.out.println("Instance2 hash code: " + instance2.hashCode());
			System.out.println("Instance3 hash code: " + instance3.hashCode());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



//POJO ( java class)  ----> JSON/XML/Byte Stream
//JSON/XML/Byte Stream ----> JAVA (POJO) -- Browser -- creating a new Browser instance







