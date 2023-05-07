package lab;
public class Anagram {
public static void check_anagram(char[] a, char[] b) {
		if(a.length == b.length) {
			int count = 0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a.length; j++) {
					if(a[i] == b[j]) {
//						count = 0;
						if(j==a.length-1) {
							count = 1;
							}
						}else {
							count = 0;
						}
				}
			}
			if(count == 0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}else {
			System.out.println("String length is not equals");
		}
	}
}
