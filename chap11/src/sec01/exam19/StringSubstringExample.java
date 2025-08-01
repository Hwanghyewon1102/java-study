package sec01.exam19;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String fString = ssn.substring(0, 6);
		System.out.println(fString);
		String secondString = ssn.substring(7);
		System.out.println(secondString);
	}

}
