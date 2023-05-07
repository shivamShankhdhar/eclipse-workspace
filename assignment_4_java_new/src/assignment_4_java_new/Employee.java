package assignment_4_java_new;

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