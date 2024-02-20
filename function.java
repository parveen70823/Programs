import java.util.*;

// public class function {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter ur name:");
//         String name=sc.next();
//         printMyName(name);
//     }
// }

public class function {
//     public static int calSum(int a, int b){
//         int sum;
//         sum=a+b; 
//         return sum;
//     }
    


// public static int calProduct(int a, int b){ 
    //     return a*b;
    // }
    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter first no:");
    //     int a=sc.nextInt();
    //     System.out.print("Enter second no:");
    //     int b=sc.nextInt();
    //     System.out.print("the procuct of two numbers is:"+calProduct(a,b));
        
    // }


    //FACTORIAL OF A NUMBER
    public static void calFactorial(int n){
        if(n<=0){
            System.out.println("Invali number");
            return;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.print("factorial of the "+ n +" is:"+fact);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of which u want to print the factorial:");
        int n=sc.nextInt();
        calFactorial(n);
    }
}

