package SingletonPattern;

import java.io.Serializable;

public class Browser implements Serializable, Cloneable{
		
	// 1. Private static instance of the class
	private volatile static Browser browser;//null

	// 2. Private constructor to prevent/avoid instantiation/object
	private Browser() {
		if(browser != null) { //handling reflection attack
			throw new IllegalStateException("object already exists");
		}
	}

	// 3. Public static getInstance method to provide access to the instance/object
	public static Browser getInstance() {
		if(browser == null) {
			synchronized (Browser.class) {
				if(browser == null) {
					browser = new Browser();
				}
			}
		}
		return browser;
	}

	// Individual public method of the class
	public void displayMesg() {
		System.out.println("browser info");
	}
	
	
	//Add readResolve() -- which will be called during De-Serialization process -- this will return Class instance
	protected Object readResolve() {
		return getInstance();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("singleton instance can not be cloned..");
	}
	
	
}
