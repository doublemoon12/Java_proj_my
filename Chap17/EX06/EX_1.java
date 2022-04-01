package Chap17.EX06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX_1 {

	public static void main(String[] args) {
		Set<Integer> intSet1 = new HashSet();

		intSet1.add(30);
		intSet1.add(50);
		intSet1.add(100);
		intSet1.add(10);

		Iterator<Integer> inte = intSet1.iterator();

		// iterator출력, Enhanced for문을 사용해서 출력
		while (inte.hasNext()) {
			System.out.print(inte.next() + " ");
		}
		System.out.println();

		for (Integer k : intSet1) {
			System.out.print(k + " ");
		}

	}

}
