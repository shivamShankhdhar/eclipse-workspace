package binary_search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] y = {11,22,33,44,55,66,77};
		int s = 661215;
		int f_pos = 0;
		int l_pos = y.length-1;
//		int counter = 0;
		while(f_pos <= l_pos) {
			int mid = (f_pos + l_pos )/2;
			if(y[mid] == s) {
				System.out.println(" Record Found " );
				break;
				}
			else if(y[mid]< s) {
				f_pos = mid+1;
			}
			else if (y[mid] > s) {
				l_pos = mid -1;
				}
//			counter+=2;
			}
		if(f_pos > l_pos) {
			System.out.println("Record not found");
		}
		}

	}


