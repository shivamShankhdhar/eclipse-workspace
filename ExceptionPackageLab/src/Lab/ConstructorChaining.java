package Lab;
class A {
	public A() {
		System.out.println("Class A constructor");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("Class B constructor");
	}
}
class C extends B{
	public C() {
		super();
		System.out.println("Class C constructor");
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		System.out.println("-------------Object A--------------");
		A o = new A();
		System.out.println("-------------Object B--------------");
		B b = new B();
		System.out.println("-------------Object C-------------------");
		C c = new C();

	}

}
