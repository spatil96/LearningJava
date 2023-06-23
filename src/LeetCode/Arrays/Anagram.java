package LeetCode.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "naagram";
		System.out.println(solution(s, t));
	}

	private static <T> boolean solution(String s, String t) {
		if (s.length() != t.length())
			return false;

		int[] store = new int[26];

		for (int i = 0; i < s.length(); i++) {
			store[s.charAt(i) - 'a']++;
			store[t.charAt(i) - 'a']--;
		}

		for (int n : store)
			if (n != 0)
				return false;

		return true;
	}

}
