public class sumofN {
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        // System.out.println(sum);
        printSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        int n=10;
        printSum(i,n,sum);
    }
    
}
