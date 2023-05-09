package FileReadingProgram;
import java.io.*;

public class ques2 {

	public static void main(String[] args) {
		thread1 t1 = new thread1();
		t1.start();
		thread2 t2 = new thread2();
		t2.start();
	}

}
