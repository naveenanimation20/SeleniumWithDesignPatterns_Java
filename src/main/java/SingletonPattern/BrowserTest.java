package SingletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrowserTest {

	public static void main(String[] args) {

		Browser instance1 = Browser.getInstance();
		Browser instance2 = null;
		
		try {
			Constructor<Browser> construcutor = Browser.class.getDeclaredConstructor();
			construcutor.setAccessible(true);
			instance2 = construcutor.newInstance();
			
			System.out.println("haschode of instance1 : " + instance1.hashCode());
			System.out.println("haschode of instance2 : " + instance2.hashCode());

			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
