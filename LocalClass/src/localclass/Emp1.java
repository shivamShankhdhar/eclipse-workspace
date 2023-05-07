package localclass;
interface person{
	void aadharregistration();
} 
class Emp {
	void addData() {
		class newEmployee implements person{
			public void aadharregistration(){
				System.out.println("Welcome");
			}
		}
		newEmployee e = new newEmployee();
		e.aadharregistration();
	}
}
public class Emp1  {
	public static void main(String[] args) {
		Emp em = new Emp();
		em.addData();
	}
}
