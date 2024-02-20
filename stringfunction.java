// import javax.xml.transform.Source;

public class stringfunction {

    // public static String substring(String str,int si, int ei){
    //     String s="";
    //     for(int i=si;i<ei-1;i++){
    //         s+=str.charAt(i);
    //     }
    //     return s;
    // }


    public static void main(String[] args) {

        // STRING COMAPRISON
        // String s1="parveen";
        // String s2="parveen";
        // String s3=new String("parveen");
        // if(s1==s2){
        //     System.out.println("strings are equal");
        // }
        // else{
        //     System.out.println("strings are not equal");
        // }

        //  if(s1==s3){
        //     System.out.println("strings are equal");
        // }
        // else{
        //     System.out.println("strings are not equal");
        // }

        // // EQUAL FUNCTION OF STRINGS
        // if(s1.equals(s3)){
        //     System.out.println("string equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }


        // SUBSTRING IN STRING
        // String str="my name is parveen";
        // System.out.println(substring(str,4,10));

        // System.out.println(str.substring(0,9));



        // STRINGBUILDER
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch+" ");
        }
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
