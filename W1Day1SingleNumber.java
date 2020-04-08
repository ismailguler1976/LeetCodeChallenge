package Week1;
import java.util.HashMap;
import java.util.Map;

public class W1Day1SingleNumber {

	public static void main(String[] args) {

		int[] a = { 4, 1, 2, 1, 2 };
		int[] b = { 2, 2, 1 };

		System.out.println(singleNumber(a));
		System.out.println(singleNumber(b));
	}

	public static int singleNumber(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer i : nums) {
			if (map.containsKey(i)) {
				map.remove(i);
			} else {
				map.put(i, 1);
			}
		}
		int unique = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			unique = (entry.getKey());
		}

		return unique;
	}
}
