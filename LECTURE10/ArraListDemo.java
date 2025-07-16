package LECTURE10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraListDemo {
    
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		System.out.println(list.size());
		list.add(5);
		list.add(8);
		list.add(10);
		System.out.println(list.size());
		System.out.println(list);
		//remove();
		
		list.remove(list.size()-1);
		System.out.println(list);
		list.add(5);
		list.add(1);
		list.add(-1);
		list.add(0);
		System.out.println(list);

		Collections.sort(list);

		System.out.println(Collections.binarySearch(list, 5));
		System.out.println(Collections.binarySearch(list, 12)); //returns neagtive index
		
		System.out.println(list.contains(-1));
		//add(index,value);
        list.add(1,10);
        System.out.println(list);
        
//        //clear()
//        list.clear();
        System.out.println(list);
        
        //get(index);
        System.out.println(list.get(2));
        list.set(1, 9);
        System.out.println(list);
	}
}
