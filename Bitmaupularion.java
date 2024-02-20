import java.util.*;
public class Bitmaupularion {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask=1<<pos;

        // GET BIT
        // if((bitmask&n)==0){
        //     System.out.println("bit is zero");
        // }
        // else{
        //     System.out.println("bit is one");
        // }

        // SET BIT
        // int NewNumber=bitmask|n;
        // System.out.println(NewNumber);

        // CLEAR BIT
        // int Number=~(bitmask);
        // int NewNumber=Number&n;
        // System.out.println(NewNumber);

        // UPDATE
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        if(oper==1){
            int NewNumber=bitmask|n;
            System.out.println(NewNumber);
        }else{
            int Number=~(bitmask);
            int NewNumber=Number&n;
             System.out.println(NewNumber);
        }

    }
}

