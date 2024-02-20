public class stringQuestion {


// Q1. palindrom check
    // public static boolean IsPalindrom(String str){
    //     for (int i = 0; i < str.length()/2; i++) {
    //         int n=str.length();
    //         if(str.charAt(i)!=str.charAt(n-1-i)){
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }

    // Q2. find shortest path 

    // public static float shortestpath(String path ){
    //     int x=0,y=0;
    //     for (int i = 0; i < path.length(); i++) {
    //         char dir=path.charAt(i);
    //         // east
    //         if(dir=='E'){
    //             x++;
    //         }
    //         else if(dir=='W'){//west
    //             x--;
    //         }
    //         else if(dir=='N'){
    //             y++;
    //         }
    //         else{
    //             y--;
    //         }
    //     }
    //     int X2=x*x;
    //     int Y2=y*y;
    //     return (float)Math.sqrt(X2+Y2);
    // }



    // Q4. CONVERT FIRST LETTER OF THE WORD IN CAPITAL
        // public static String touppercase(String str){
        //     StringBuilder sb= new StringBuilder("");
        //     char ch= Character.toUpperCase(str.charAt(0));
        //     sb.append(ch);
        //     for (int i = 0; i < str.length(); i++) {
        //         if(str.charAt(i)==' ' && i<str.length()-1){
        //             sb.append(str.charAt(i));
        //             i++;
        //             sb.append(Character.toUpperCase(str.charAt(i)));
        //         }
        //         else{
        //             sb.append(str.charAt(i));
        //         }
                
        //     }
        //     return sb.toString();
        // }


            // Q5. STRING COMPRESSION
            public static String compress(String str){
                String newstr="";
                for(int i=0;i<str.length();i++){
                    Integer count=1;
                    while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                        count ++;
                        i++;
                    }
                    newstr+=str.charAt(i);
                    if(count>1){
                        newstr+=count.toString();
                    }
                }
                return newstr;

            }
    
    public static void main(String[] args) {
        
        // String str="lavval";
        // System.out.println(IsPalindrom(str));
        
        //     String path="EEEN";
        //    System.out.println(shortestpath(path)); 
        


        // Q3. LARGEST STRING FROM A GIVEN SET OF STRINGS
        // String arr[]={"mango","apple","ananaass","kela"};
        // String largest=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(largest.compareTo(arr[i])<0){
        //         largest=arr[i];
        //     }
        // }
        // System.out.println(largest);

        // String str="my name is unknown";
        // System.out.println(touppercase(str));

        String str="aaghkktjkdhhh";
        System.out.println(compress(str));
    }
}
