public class Rev_str_Rec {
    public static void reverseString(String a ,int idx){
        // ITRATIVE APPROACH

        // for(int i=idx;i>=0;i--){
        //     System.out.print(a.charAt(i));
        // }
        if(idx==0){
            System.out.println(a.charAt(idx));
            return ;
        } 

        System.out.println(a.charAt(idx));
        reverseString(a, idx-1);
    }
    public static void main(String[] args) {
        String a="blue";
        reverseString(a,a.length()-1);
    }
    
}
