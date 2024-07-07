package SingletonPattern;

public class BrowserClone {

	public static void main(String[] args) {
		
		Browser instance1 = Browser.getInstance();
		
		try {
			Browser instance2 = (Browser) instance1.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
