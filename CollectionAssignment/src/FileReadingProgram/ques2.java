package FileReadingProgram;
import java.io.*;

class thread1 extends Thread{
	synchronized public void run() {
		File file = new File("txt1.txt");
		
		try {
			int i;
			FileReader f = new FileReader(file);
			while((i=f.read())!=-1) {
				System.out.println((char)i);
			}
			f.close();
		} catch (IOException e) {}
			
	}
}
class thread2 extends Thread{
	synchronized public void run() {
		File file = new File("txt2.txt");
		
		try {
			int i;
			FileReader f = new FileReader(file);
			while((i=f.read())!=-1) {
				System.out.println((char)i);
			}
			f.close();
		} catch (IOException e) {}
			
	}
}
public class ques2 {

	public static void main(String[] args) {
		thread1 t1 = new thread1();
		t1.start();
		thread2 t2 = new thread2();
		t2.start();
	}

}
