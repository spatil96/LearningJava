package LeetCode.Stack;

import java.util.Stack;

public class SimplyfyPath71 {
    public static void main(String[] args) {
//        System.out.println(simplifyPath("//home/")); //expected->/home
//        System.out.println(simplifyPath("/../")); //expected->/
//        System.out.println(simplifyPath("/home//foo/..")); //expected->/home/foo
        System.out.println(simplifyPath("/a/./b/../c/")); //expected->/"/c"
    }
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.equals(".") && !component.isEmpty()) {
                stack.push(component);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder canonicalPath = new StringBuilder();
        for (String dir : stack) {
            canonicalPath.append("/").append(dir);
        }

        return canonicalPath.toString();
    }
    public static String simplifyPathToFix(String path) {
        Stack<String> s= new Stack<>();
        s.push(String.valueOf(path.charAt(0)));
        for(int i=1; i<=path.length()-1; i++){
            char ch = path.charAt(i);
            if(s.peek().equalsIgnoreCase(".") && ch == '.'){
                s.pop();
                continue;
            }
            if(!(s.peek().equalsIgnoreCase("/") && ch == '/')){
                s.push(String.valueOf(ch));
            }
        }
        if(s.peek().equalsIgnoreCase("/") && s.size()!=1){
            s.pop();
        }
        //converting stack to String
        StringBuilder sb = new StringBuilder();
        for(String str: s ){
            sb.append(str);
        }
        return sb.toString();
    }
}
