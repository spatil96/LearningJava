package LeetCode.Strings;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "\"A man, a plan, a canal: Pana";//"A man, a plan, a canal: Panama
		if(isPalindrome(string)) {
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}
	public static boolean isPalindrome(String s) {
		 int i = 0, j = s.length() - 1;
		 while (i < j) {
		 while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
		 while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
		 if (Character.toLowerCase(s.charAt(i))
		 != Character.toLowerCase(s.charAt(j))) {
		 return false;
		 }
		 i++; j--;
		 }
		 return true; }

}
