// // import java.net.SocketTimeoutException;

// public class tribonacci {
//     public static int tribREC(int n,int dp[]){
//         if(n==1 || n==2){
//             return 0;
//         }
//         if(n==3){
//             return 1;
//         }
//         if(dp[n]!=0){
//             return dp[n];
//         }
//         return dp[n]=tribREC(n-1,dp) + tribREC(n-2,dp) + tribREC(n-3,dp);
//     }
//     public static void main(String args[]){
//         int n=10;
//         int dp[]=new int[n+1];
//         for(int i=1;i<=n;i++){
//         System.out.print(tribREC(i,dp) +" " );
//         }
//     }
// }
// import java.util.ArrayList;
// import java.util.List;

// public class tribonacci {
//     public static List<String> AllParenthesis(int n) {
//         List<String> dp = new ArrayList<>();
        
//         dp.add("");
//         dp.add("()");

//         for (int i = 2; i <= n; i++) {
//             StringBuilder sb = new StringBuilder();
//             for (int j = 0; j < i; j++) {
//                 String left = dp.get(j);
//                 String right = dp.get(i - j - 1);
//                 for (String leftCombo : left) {
//                     for (String rightCombo : right){
//                         sb.append("(").append(leftCombo).append(")").append(rightCombo);
//                     }
//                 }
//             }
//             dp.add(sb.toString());
//         }
        
//         return dp;
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         List<String> combinations = AllParenthesis(n);
//         for (String combination : combinations) {
//             System.out.println(combination);
//         }
//     }
// }

import java.io.*;

public class tribonacci {
    static void _printParenthesis(char str[], int pos, int n, int open, int close) {
        if (close == n) {
            for (int i = 0; i < str.length; i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        } else {
            if (open > close) {
                str[pos] = '}';
                _printParenthesis(str, pos + 1, n, open, close + 1);
            }
            if (open < n) {
                str[pos] = '{';
                _printParenthesis(str, pos + 1, n, open + 1, close);
            }
        }
    }

    static void printParenthesis(char str[], int n) {
        if (n > 0)
            _printParenthesis(str, 0, n, 0, 0);
        return;
    }

    public static void main(String[] args) {
        int n = 1;
        char[] str = new char[2 * n];
        printParenthesis(str, n);
    }
}



