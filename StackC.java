import java.util.*;
public class StackC {

    // Q1. PUSH THE DATA IN THE BOTTOM OF THE STACK

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    // Q2.REVERSE A STRING USING A STACK
    public static String ReverseStr(String str){
        Stack<Character> s=new Stack<>();
        for(int idx=0;idx<str.length();idx++){
            s.push(str.charAt(idx));
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    
    public static void main(String args[]) {
    //     Stack<Integer> s=new Stack<>();

    //     s.push(1);
    //     s.push(2);
    //     s.push(3);

    //     pushAtBottom(s,4);
    //     while(!s.isEmpty()){
    //         System.out.println(s.pop());
    
    //     }

    String str="abdskj";
    String result=ReverseStr(str);
    System.out.println(result);
    }


}
