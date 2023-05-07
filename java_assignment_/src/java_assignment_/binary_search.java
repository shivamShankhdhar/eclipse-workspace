package java_assignment_;
import java.util.Random;
public class binary_search {

	public static void main(String[] args) {
		int[] arr = {10,12,20,23,25,30,36,37,38,39,40,50,51,52,53,54,55,56,57,58,59,60,96,35,85,80};
//		sorting the array;
//		bubble sort 
		for(int i = 0;i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();		
//		searching random element in array
//		binary search
		Random random = new Random();
		int search_for = random.nextInt(100);
		System.out.println("We are searching for "+ search_for + " in the array");
		int first = 0;
		int last = arr.length-1;
		int flag = 0;
		while(last > first) {
			int mid = ( last + first ) / 2;
			if(arr[mid] == search_for) {
				flag += 1;
				System.out.println("Element found");
				break;
			}
			else if(arr[mid] > search_for) {
				last = mid - 1;
			}
			else if(arr[mid] < search_for) {
				first = mid + 1;
			}
		}
		if(flag == 0) {
			System.out.println("Element not found");
		}
	}

}
