package java_function_assignment;


//Q 1) create a class three methods
//a) void cube(int a)
//b) void square (int b)
//c) void greater(int a,int b,int c)

public class class1 {
void cube(int a) {
	System.out.println(a*a*a);
}
void square(int a) {
	System.out.println(a*a);
}
void greater(int a, int b, int c) {
	int r = (a>b?(a>c?a:c):(b>c?b:c));
	System.out.println("Greater number is "+ r);
}
}
