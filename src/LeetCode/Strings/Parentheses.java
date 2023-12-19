package LeetCode.Strings;

import java.util.Stack;

public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{{[[[[[][}}";
		if(isValid(s)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	public static boolean isValid(String input_str) {
        Stack<Character> s = new Stack<Character>();
   // Iterating over the entire string.
   for (char st : input_str.toCharArray()) {
     //  If the input string contains an opening parenthesis,
     //  push in on to the stack.
     if (st == '(' || st == '{' || st == '[') {
       s.push(st);
     }
     else {
       // In the case of valid parentheses, the stack cannot be 
       // be empty if a closing parenthesis is encountered.
         if(s.empty()) {
           
           return false;
         }
         else{
         // If the input string contains a closing bracket,
         // then pop the corresponding opening parenthesis if
         // present.
         char top = (Character) s.peek();
         if(st == ')' && top == '(' ||
         st == '}' && top == '{' ||
         st == ']' && top == '['){
           s.pop();
         }
         else{
           
           return false;
         }
       }
     }
   }
   //  Checking the status of the stack to determine the
   //  validity of the string.
   if(s.empty()) {
     return true;
   }
   else{
     return false;
   }

   }
}
