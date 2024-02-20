import java.util.*;
public class solution {
    public static int lengthOfLIS(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int arr[]=new int[set.size()];
        int i=0;
        for(int num : set){
            arr[i]=num;
            i++;
        }
        Arrays.sort(arr);

        return lcs(nums, arr);
    }
    public static int lcs(int nums[] , int arr[]){
        int n=nums.length;
        int m=arr.length;
         
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(nums[i-1]==arr[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        } 
        for(int i=0; i<dp.length; i++){
            for(int j=0; j< dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        int nums[]={20 ,7, 9, 6, 9, 21, 12, 3, 12, 16, 1, 27};
        lengthOfLIS(nums);
    }
}