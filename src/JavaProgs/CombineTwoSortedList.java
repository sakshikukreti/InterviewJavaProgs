package JavaProgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineTwoSortedList {
	
	public static void main(String[] args) {
		
	/*	List<Integer> inputList1 = new ArrayList<Integer>();
		inputList1.add(1);
		inputList1.add(3);
		inputList1.add(6);
		inputList1.add(9);
		
		System.out.println("List1" + inputList1);
		
		List<Integer> inputList2 = new ArrayList<Integer>();
		
		inputList2.add(2);
		inputList2.add(7);
		inputList2.add(8);*/
		
		//System.out.println("List2" + inputList2);
		
		//combineTwoLists(inputList1,inputList2);
		
		List<Integer> sList1 = Arrays.asList(1,1,2,5,8);
		  List<Integer> sList2 = Arrays.asList(3,4,6);
		  merge_sorted(sList1,sList2);
}

	
	public static void merge_sorted(List<Integer> sList1, List<Integer> sList2) {

		    List<Integer> mergedSortedList = new ArrayList<>();
		    int idx1 = 0;
		    int idx2 = 0;

		    while (idx1 < sList1.size() && idx2 < sList2.size()) {
		      if (sList1.get(idx1) <= sList2.get(idx2)) {
		        mergedSortedList.add(sList1.get(idx1));
		        idx1++;
		      } else {
		        mergedSortedList.add(sList2.get(idx2));
		        idx2++;
		      }
		    }

		    while (idx1 < sList1.size()) {
                mergedSortedList.add(sList1.get(idx1));
                idx1++;
            }
            while (idx2 < sList2.size()) {
                mergedSortedList.add(sList2.get(idx2));
                idx2++;
            }
            
		    System.out.println(mergedSortedList);
		  }
}


