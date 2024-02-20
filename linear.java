public class linear {
    public static void main(String arg[]){
        int num[]={32,5,212,43,66,7,769};
        int target=769;
        // int ans=linear_search(num,target);
        // int ans=linear_search2(num,target);
        boolean ans=linear_search3(num,target);
        System.out.println(ans);
    }


    // this return the index of the target element in the array

    // static int linear_search(int[] num,int target){
    //     if(num.length==0){
    //         return -1;
    //     }
    //     for (int i = 0; i < num.length; i++) {
    //         if(num[i]==target){
    //             return i;
    //         }

    //     }
    //     // this return statementn executed when above return statement will not executed
    //     return -1;
    // }


    
//  this return the target value if it is found in the array

    // static int linear_search2(int[] num,int target){
    //     if(num.length==0){
    //         return -1;
    //     }
    //     for (int i = 0; i < num.length; i++) {
    //         if(num[i]==target){
    //             return target;
    //         }

    //     }
    //     // this return statement executed when above return statement will not executed
    //     return Integer.MAX_VALUE;
    // }
    

    // this return the true if element is found in the array else return false

    static boolean linear_search3(int[] num,int target){
        if(num.length==0){
            return false;
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i]==target){
                return true;
            }
        }
        // this return statement executed when above return statement will not executed
        return false;
    }
}
