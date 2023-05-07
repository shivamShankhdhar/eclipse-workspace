package InnerClass;

public class knowledgeInBasicJava {

	public static void main(String[] args) {
		String first_name = args[0];
		String last_name = args[1];
		double weight = Double.parseDouble(args[2]);
		double height = Double.parseDouble(args[3]);
		double BMI = weight/(height *height);
		System.out.println("Name "+first_name+" "+last_name);
		System.out.println("BMI: "+BMI);
	}
}
