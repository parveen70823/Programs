import java.util.*;

public class StackParenthesis {

    // Q2.----->VALID STRIING
    // public static boolean isValid(String str){
    // Stack<Character> s=new Stack<>();
    // for(int i=0;i<str.length();i++){
    // char ch=str.charAt(i);

    // if(ch=='(' || ch=='[' ||ch=='{'){//opening
    // s.push(ch);
    // }else{
    // if(s.isEmpty()){
    // return false;//condition like )))))
    // }
    // if((s.peek()=='(' && ch==')')//()
    // ||s.peek()=='{' && ch=='}'//{}
    // || s.peek()=='[' && ch==']'){//[]
    // s.pop();
    // }else{
    // return false;
    // }
    // }
    // }
    // if(s.isEmpty()){
    // return true;
    // }else{
    // return false;
    // }

    // }

    // Q1.---->dUPLICATE PARENTHESES
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                // while(!s.isEmpty() && s.peek()=='('){  is empty is removed because it is given that a valid strign
                // while (s.peek() != '(') {
                //     s.pop();
                //     count++;
                // }
                // if (count < 1) {
                //     return true; // duplicate
                // } else {
                //     s.pop();// opening pair
                // }
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } 
            } else {
                // opening
                s.push(ch);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        // String str="({})[](";//true
        // System.out.println(isValid(str));

        String str = "((a+b)-(c+d))";
        String str2 = "(((a+b)))";
        System.out.println(isDuplicate(str2));
    }
}
