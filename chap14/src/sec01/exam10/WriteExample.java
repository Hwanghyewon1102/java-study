package sec01.exam10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		// Writer는 문자열 좀 더 쉽게 출력하기 위해서 write(String str) 메소드를 제공
		String str = "ABCDE";
		
		// 문자열 전체를 출력
//		writer.write(str);
		writer.write(str, 1, 2);
		
		writer.flush();
		writer.close();
	}

}
