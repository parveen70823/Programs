import java.util.*;
public class climbStairDP {

    /*public static int MemoClimbing(int n, int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        ways[n]= MemoClimbing(n-1,ways) +MemoClimbing(n-2,ways);
        return ways[n];
    }
    */
     
    public static int tabuloClimb(int n){
        int dp[] =new int[n+1];
        dp[0]=1;
        for(int i=1;i<n+1;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }else{
                dp[i] =dp[i-1]+ dp[i-2];
            }
            
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=6;
        int ways[]=new int [n+1];
        Arrays.fill(ways,-1);
        // System.out.println(MemoClimbing(n,ways)); 
        System.out.println(tabuloClimb(n)); 

    }
}
