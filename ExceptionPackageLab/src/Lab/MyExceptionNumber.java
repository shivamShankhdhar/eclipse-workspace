package Lab;
class MyException extends Exception {
	public MyException(String m){
		super(m);
	}
public class MyExceptionNumber {
	public static void main(String[] args) {
		int first_num = Integer.parseInt(args[0]);
		int second_num = Integer.parseInt(args[1]);
		int third_num = Integer.parseInt(args[2]);
		try {
			if(first_num>10 && second_num>10 && third_num>10) {
				int sum = first_num+second_num+third_num;
				System.out.println("Sum: "+sum);
				
			}
			else {throw new MyException("All the numbers should be greater than 10");}
		}
		catch(MyException e) {
			System.out.println(e);
		}
	}
}
}

//Q 5 Write a program to check all the three number entered by command
//line argument are greater than 10 , then print sum of those numbers . If any
//number is less then 10 then throw user defined exception “MyException”
//which print message number iis lesser then 10 “
