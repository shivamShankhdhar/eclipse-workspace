package Lab;

public class MainClassStudent {

	public static void main(String[] args) {
		try {
			Student o = new Student(1,"shivam",200,"cdac");
			o.check_credentials();
			System.out.println("Successfully Executed");
		}catch(AgeNotWithinTheRangeException e) {
			System.out.println(e);
		}
		catch(NameNotValidException e) {
			System.out.println(e);
		}	
	}
}
