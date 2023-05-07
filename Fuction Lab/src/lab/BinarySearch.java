package lab;

public class BinarySearch {
  public void binary_search(int[] a, int n) {
	  int first_pos = 0;
	  int last_pos  = a.length-1;
	  int found = 0;
	  while(last_pos>=first_pos) {
		  int mid;
		  mid = (first_pos + last_pos)/2;
		  
		  if(a[mid]<n) {
			  first_pos = mid+1;
			}else if(a[mid]>n){
			  last_pos = mid-1;
		 }
		  else if(a[mid]==n) {
			  System.out.println("Element found at "+mid);
			  found += 1;
			  break;
		 }
	  }
	  if(found == 0) {
		  System.out.println("Element is not in the array");
	  }
  }
}
