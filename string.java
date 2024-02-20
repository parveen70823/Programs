import java.util.*;

public class string {
    public static void main(String[] args) {
        // String names="what is your name";
        // Scanner sc=new Scanner(System.in);
        // String names=sc.nextLine();
        // System.out.println(names);
       
        String a = "parveen";
        String b = "kumar";
        String c = a + " " + b;
        System.out.println(c);
        System.out.println(c.length());

        
        // for printing all character  
        // for (int i = 0; i <= c.length(); i++) {
        //     System.out.println(c.charAt(i));
        // }

        if(a.compareTo(b)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("string are not equal");
        }
        // if(new String ("asdf")==new String("asdf")){
        //     System.out.println("equal");
        // }else{
        //     System.out.println("not equal");
        // }

        // GETTING SUB STRING FROM A STRING
        String sub=c.substring(7,9);
        System.out.println(sub);

    }
}
