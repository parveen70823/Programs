import java.util.*;
public class stringConversion {
    public static int stringCon(String word1, String word2){
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int [n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int x=n-dp[n][m];
        int y=m-dp[n][m];
        return x+y;

    }
    public static void main(String[] args) {
        String word1="xyzfg";
        String word2="xg";
        System.out.println(stringCon(word1,word2));
    }
}
