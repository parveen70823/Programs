// public class subsequence {
//     public static void subSequence(String str, int idx, String newString){
//         if(idx==str.length()){
//             System.out.println(newString);
//             return; 
//         }
//         char currChar=str.charAt(idx);
//         // to be 
//         subSequence(str, idx+1, newString+currChar);
        
//         // or not to be 
//         subSequence(str, idx+1, newString);
        
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         subSequence(str,0,"");
    // }
    
// }




// for printing all unique subsequences of  the string 
import java.util.HashSet;
public class subsequence {
    public static void subSequence(String str, int idx, String newString,HashSet<String> Set){
        if(idx==str.length()){
            if(Set.contains(newString)){
                return;
            } else{
                System.out.println(newString);
                Set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(idx);
        // to be 
        subSequence(str, idx+1, newString+currChar,Set);
        
        // or not to be 
        subSequence(str, idx+1, newString,Set);
        
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> Set=new HashSet<>();
        subSequence(str,0,"",Set);
    }
    
}
