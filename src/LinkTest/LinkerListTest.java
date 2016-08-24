package LinkTest;

import java.util.*;
public class LinkerListTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList();
//		list.add(1);
//		list.add(0, 2);
//		list.add(0, 3);
//		list.add(0, 4);
//		list.add(0, 5);
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(6);
		for(int i : list){
			System.out.println(i);
		}
	}
}
