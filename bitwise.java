public class bitwise {

    // given no is odd or even
    // public static void OddorEven(int n){
    //     int bitmask=1;
    //     if((bitmask & n)==1){
    //         System.out.println("odd number");
        
    //     }
    //     else{
    //         System.out.println("even number");
    //     }
    // }


    // get ith bit in a number
    // public static int getithbit(int n, int i){
    //     int bitmask=1<<i;
    //     if((n & bitmask)==0){
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }

    // TO SET THE iTH BIT OF THE NUMBER
    // public static int setithbit(int n, int i){
    //     int bitmask=1<<i;
    //     return n|bitmask;
    // }

    // // TO CLEAR THE ITH BIT
    // public static int clearithbit(int n, int i) {
    //     int bitmask=~(1<<i);
    //     return n&bitmask;
    // }

    // public static int updateithbit(int n, int i,int newBit ){
        // if(newBit==0){
        //     return clearithbit(n,i);
        // }
        // else{
        //     return setithbit(n,i);
        // }

        // 2nd method
        // n=clearithbit(n,i);
        // int bitMask=newBit<<i;
        // return n|bitMask;
    // }

    // CLEAR LAST I BITS
    // public static int clearLastibits(int n, int i){
    //     int bitmask=(~0)<<i;
    //     return bitmask & n;
    // }


    // CLEAR RANGE OF BITS
    // public static int clearRangeibits(int n, int i, int j){
    //     int a=(~0)<<(j+1);
    //     int b=(1<<i)-1;
    //     int bitmask=a|b;
    //     return bitmask&n;
    // }

    // CHECKING WHEATHER NO IS A POWER OF 2 OR NOT
    // public static  void ispowerTwo(int n){
    //     if((n & (n-1))==0){
    //         System.out.println("it is a power of 2"); ;
    //     }
    //     else{
    //         System.out.println("not a power of 2");;
    //     }
    // }

    // COUNTING THE NO. OF SET BITS
        // public static int countsetbits(int n){
        //     int count=0;
        //     while(n>0){
        //         if((n&1)!=0){
        //             count++;
        //         }
        //         n=n>>1;
        //     }
        //     return count;
        // }

        // PROBLEM OF FAST EXPONENTIATION
        public static int fastexpo(int a, int n){
            int ans=1;
            while(n>0){
                if((n&1)!=0){//check LSB
                    ans=ans*a;  
                }
                a=a*a;
                n=n>>1;
            }
            return ans;
        }


    public static void main(String args[]){

        // BITWISE OPERATORS

        // System.out.println(5 & 6 );
        // System.out.println(5 | 6 );
        // System.out.println(5 ^ 6 );
        // System.out.println(~5);
        // System.out.println(5<<2);
        // System.out.println(5>>2);
        
        // OddorEven(4);
        // OddorEven(23);
        // OddorEven(21);

        // System.out.println(getithbit(10,0));

        // System.out.println(setithbit(10,0));

        // System.out.println(clearithbit(10,3));
        // System.out.println(updateithbit(10,2,0));
        
        // System.out.println(clearLastibits(10,2));
        // System.out.println(clearRangeibits(15,1,3));

    //    ispowerTwo(16);
            // System.out.println(countsetbits(15));

            System.out.println(fastexpo(4,28));
    }
    
}
