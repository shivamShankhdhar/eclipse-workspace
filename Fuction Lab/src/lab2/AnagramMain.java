package lab2;
import lab.Anagram;
public class AnagramMain {

	public static void main(String[] args) {
		String a = "shivam";
		char[] a1 = a.toCharArray();
		String b = "hiavsm";
		char[] b1 = b.toCharArray();
		Anagram.check_anagram(a1, b1);

	}

}
