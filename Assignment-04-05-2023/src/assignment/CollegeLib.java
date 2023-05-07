package assignment;

public class CollegeLib {
	Book a;
	Banner b;
	void data(Book a,Banner b) {
		a.input();
		a.show();
	    b.msg();
	}
	public static void main(String[] args) {
		CollegeLib l = new CollegeLib();
		l.data(new Book(), new Banner());

	}

}
