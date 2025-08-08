package sec03.exam03.quiz;

import java.io.File;

public class FileManger {
	public void deleteFile() {
		File dir = new File("C:\\test\\sub\\2025");
        File file1 = new File("C:\\test\\sub\\test1.txt");
        File file2 = new File("C:\\test\\sub\\test2.txt");
        File file3 = new File("C:\\test\\sub\\test3.txt");

        File[] files = { file1, file2, file3 };

        for (File file : files) {
            if (file.delete()) {
                System.out.println(file.getPath() + " -> 삭제 완료");
            } else {
                System.out.println(file.getPath() + " -> 삭제 실패");
            }
        }

        if (dir.delete()) {
            System.out.println(dir.getPath() + " -> 삭제 완료");
        } else {
            System.out.println(dir.getPath() + " -> 삭제 안됨");
        }
		
	}
	
}
