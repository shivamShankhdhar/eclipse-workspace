
/*Q 1   Write a multi- threaded program that prints even and odd number 
 * one after another .create two separate classes to print even and odd 
 * number and call there objects in main.
*/
package MultiThreadAssignment;
class Thread1 extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=1;i<10;i++) {
			if(i%2!=0) {
				System.out.println(i);
				
			}
		}
	}
}

public class Ques1 {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();

	}
}
