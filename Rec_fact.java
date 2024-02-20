public class Rec_fact {
    public static int cal_factorial(int n){
        if(n==0|n==1){
            return 1;
        }
        int fact_nM1=cal_factorial(n-1);
        int fact=n*fact_nM1;
        return fact;

    }
    public static void main(String[] args) {
        int n=6;
        int ans=cal_factorial(n);
        System.out.println(ans);
    }
    
}
