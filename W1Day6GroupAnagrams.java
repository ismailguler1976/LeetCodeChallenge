package Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class W1Day6GroupAnagrams {

//	Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//	Output:
//	[
//	  ["ate","eat","tea"],
//	  ["nat","tan"],
//	  ["bat"]
//	]

	public static void main(String[] args) {
		W1Day6GroupAnagrams gAnagram = new W1Day6GroupAnagrams();

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		String[] a2 = { "", "" };
		List<List<String>> lists = gAnagram.groupAnagrams(a2);
		// System.out.println(lists.toString());
		for (List<String> list : lists) {
			System.out.println(list.toString());
		}

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> m = new HashMap<String, List<String>>();
		for (String item : strs) {
			String key = sortItem(item);
			if (m.containsKey(key)) {
				List<String> val = m.get(key);
				val.add(item);
				m.put(key, val);
			} else {
				m.put(key, new ArrayList<String>(Arrays.asList(item)));
			}
		}

		List<List<String>> r = new ArrayList<List<String>>();
		for (Map.Entry<String, List<String>> entry : m.entrySet()) {
			r.add(entry.getValue());
		}
		return r;
	}

	private String sortItem(String item) {
		char[] sorted = item.toCharArray();
		Arrays.sort(sorted);
		return Arrays.toString(sorted);
	}
}
