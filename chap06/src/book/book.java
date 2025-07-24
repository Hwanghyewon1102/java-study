package book;

import sec05.exam04.Singleton;

public class book {
	private static book singleton = new book();
	
	private book() {}
	
	static book getInstance() {
		return singleton;
	}
}
