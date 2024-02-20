import java.util.*;

public class rodCutting {
    public static int cutRod(int price[], int n) {
        //code here
        int l=price.length;
        int dp[][]=new int[l+1][n+1];
        for(int i=0 ; i<l+1; i++){
            for( int j =0; j<n+1; j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<l+1; i++){
            for(int j=1; j<n+1; j++){
                if(i<=j){
                    dp[i][j]=Math.max(price[i-1] +dp[i][j-i], dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        printrodCut(dp,l,n);
        return dp[l][n];
    }

    public static void printrodCut(int dp[][],int l,int n){
        for(int i=0;i<l+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(dp[i][j]+"  ");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int price[]={1,5,8,9,10,17,17,20};
        int n=8;
        System.out.println(cutRod(price,n));
    }
}
