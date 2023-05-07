package lab;
public class Leader {
	protected void search_leader(int[] a) {
		for(int i=0; i<a.length; i++) {
			int count = 0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					count = 1;
				}else {
					count = 0;
					break;
				}
			}
			if(count == 1) {
				System.out.println(a[i]);
			}
		}System.out.println(a[a.length-1]);
	}
}
