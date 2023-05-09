package FileReadingProgram;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class thread1 extends Thread{
	public void run() {
		File file1 = new File("txt1.txt");		
		try {
			FileReader f1 = new FileReader(file1);
			char r1[] = new char[(int) file1.length()];
			f1.read(r1);
			for(int i=0;i<r1.length;i++) {
			System.out.println(r1[i]);}
//			f.close();
			f1.close();
		
		} catch (IOException e) {}
			
	}
}