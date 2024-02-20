import java.util.*;
public class Strings {

    public static void printLetter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String args[]){
        // char arr[]={'a','s','r','p'};
        // String str="parveen";
        // String str2=new String("%34aprjsk");
        // System.out.println(str2);

        // Scanner sc=new Scanner(System.in);
        // // String name=sc.next();
        // String name;
        // name= sc.nextLine();
        // System.out.println(name);

        // String fullname="parveen kumar";
        // System.out.print(fullname.length());

        // CONCATINATION
        String s1="parveen";
        String s2="kumar";
        String s3=s1+" "+s2;
        System.out.println(s3);
        System.out.println(s3.charAt(5));

        printLetter(s3);
    }
}
