package assignment_4_java;
//Q 2 Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000.
//3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per day is more than 6 hours.

class employee{
	double salary;
	int w_per_hours;
	void getInfo(double salary, int w_per_hours) {
		this.salary = salary;
		this.w_per_hours = w_per_hours;
	}
	void addSal() {
		if(salary < 50000) {
			salary +=10000;
		}
	}
	void addWork() {
		if(w_per_hours > 6) {
			salary += 5000;
		}
	}
	void show() {
		System.out.println("Slary "+ salary);
//		System.out.println("Slary "+ salary);
	}
}
public class Employee {

	public static void main(String[] args) {
		employee e = new employee();
		e.getInfo(20000, 30);
		e.addSal();
		e.addWork();

	}

}
