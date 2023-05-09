package FileReadingProgram;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class thread2 extends Thread{
	 public void run() {
		File file = new File("txt2.txt");
		
		try {
			FileReader f = new FileReader(file);
			char r[] = new char[(int) file.length()];
			f.read(r);
			System.out.println(r);
			f.close();
			
		} catch (IOException e) {}
			
	}
}