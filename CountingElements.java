package Week1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingElements {
	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 1, 1, 3, 3, 5, 5, 7, 7 };
		int[] a3 = { 1, 3, 2, 3, 5, 0 };
		int[] a4 = { 1, 1, 2, 2 };
		int[] a5 = { 1, 1, 2 };

		System.out.println(countElements(a1));
		System.out.println(countElements(a2));
		System.out.println(countElements(a3));
		System.out.println(countElements(a4));
		System.out.println(countElements(a5));

	}

	public static int countElements(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int key : arr) {
			set.add(key);
		}
		int pairs = 0;
		for (int i : arr) {
			int key = i + 1;
			if (set.contains(key)) {
				pairs++;
			}
		}
		return pairs;
	}
}
