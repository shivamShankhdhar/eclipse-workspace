package EMS2;

public class MainEmployee {
	static void sortEmp(Employee e[]) {
//		using bubble sort to sort the employee object
		for(int i=0; i<e.length;i++) {
			for(int j=0; j<(e.length-i-1);j++) {
				int temp =e[j].emp_name.compareTo(e[j+1].emp_name);
				if(temp >0) {
					Employee temp1 = e[j];
					e[j] = e[j+1];
					e[j+1]= temp1;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Employee[] e = new Employee[4];
		System.out.println("Enter details for employee 1");
		e[0]=new Employee();
		e[1]=new Employee(2,"shivam",200000,888111);
		System.out.println("Enter details for employee 3");
		e[2]=new Employee();
		e[3]=new Employee(4,"aman",250000,74098);
		sortEmp(e);
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i]);
		}
	}
}
/*Q 4  1 Define package EMS2 Define a class Employee having fields like empno , ename ,  salary , phone
3 Define parameterized and no argument constructor
4 Also define Display method to display all employee record
5 Create another class MainEmployee having method
6 void sortEmp (Employee e[])
The above method sort the employee data in ascending order and display it
7 create main method that call sort Employee and pass Employee array to it
*/
