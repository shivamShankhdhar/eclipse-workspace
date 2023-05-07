package CompareTwoHasSet;

import java.util.*;
public class TwoHasSet {

	public static void main(String[] args) {
		HashSet<Integer> f_hs = new HashSet<Integer>();
		f_hs.add(0);
		f_hs.add(5);
		f_hs.add(1);
		f_hs.add(3);
		f_hs.add(4);
		f_hs.add(2);
		
		HashSet<Integer> s_hs = new HashSet<Integer>();
		s_hs.add(0);
		s_hs.add(2);
		s_hs.add(1);
		s_hs.add(10);
		s_hs.add(3);
		s_hs.add(4);
		
		boolean is_equal = f_hs.containsAll(s_hs);
		System.out.println("-----OUTPUT------");
		
		if(is_equal) System.out.println("Both Hash Sets are Equal");
		else System.out.println("Both Hash Sets are not Equal");

	}

}
