package assignment_4_java;
class student{
	student(int id, String name){
		System.out.println("Id "+ id + " " + "Name " + name);
	}
}
public class parameterized_constructor {

	public static void main(String[] args) {
		student obj1 = new student(12,"shivam");
		student obj2 = new student(13,"shankhdhar");

	}

}
