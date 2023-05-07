package employee;
class test{
	int n;
	public test() {
		n = 0;
	}
	public test(int n) {
		this.n = n;
	}
}
public class qus10 {
	public static void main(String[] args) {
		test t = new test();
		System.out.println(t.n);
		
		test t1 = new test(3);
		System.out.println(t1.n);
	}
}
