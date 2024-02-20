import javax.xml.transform.Source;

public class recursionBasic {

    // Q2.PRINT 1 TO N IN INCREASING ORGER
    // public static void printInc(int n){
    // if(n==1){
    // System.out.print(1);
    // return;
    // }
    // printInc(n-1);
    // System.out.print(n+" ");
    // }

    // Q3. FIND THE FACTORIAL OF NUMBER N
    public static int fac(int n) {
        if (n == 0) {
            // System.out.println(1);
            return 1;
        }
        int fNm1 = fac(n - 1);
        int fN = n * fac(n - 1);
        return fN;

    }

    // Q4 PRINT SUM OF N
    public static int sum(int n) {
        if (n == 1) {
            return 1;

        }
        int Snm1 = sum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // Q5. FIBONACCI NUMBER OF Nth term
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int Fibnm1 = fib(n - 1);
        int Fibnm2 = fib(n - 2);
        int Fibn = Fibnm1 + Fibnm2;
        return Fibn;
    }

    // Q6. FIND ARR IS SORTED OR NOT
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {// base case
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // Q7. FIND THE FIRST OCCURENCE OF THE ELEMENT IN THE ARRAY
    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    // Q8 LAST OCCURENCE OF THE ELEMENT IN THE ARRAY
    public static int lastOccurence(int arr[], int key, int i) {
        // if(i==0){
        // return -1;
        // }
        // if(arr[i]==key){
        // return i;
        // }
        // return lastOccurence(arr,key,i-1);

        // 2nd method
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // Q9 PRINT X TO THE POWER N
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int mul = x * pow(x, n - 1);
        return mul;
    }

    // Q10 PRINT X TO THE POWER N in ologn comp.
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = power(x, n / 2);
        int full = halfpower * halfpower;
        if (n % 2 == 0) {
            return full;
        } else {
            return x * full;
        }
    }

    // Q11 tiling problem for 2Xn;
    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tiling(n - 1);
        int fnm2 = tiling(n - 2);
        return fnm1 + fnm2;
    }

    // Q12 REMOVE DUPLICATE FROM THE STRING WHICH HAVE ONLY LOWERCASE WORD

    public static void removeDup(String str, int idx, StringBuilder newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        // kaam
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            // duplicate
            removeDup(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            removeDup(str, idx + 1, newstr.append(currchar), map);
        }
    }

    // Q13.friends pariring
    public static int pairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int fnm1 = pairing(n - 1);

        // pair
        int fnm2 = pairing(n - 2);
        int pairways = (n - 1 * fnm2);

        // totways
        int totalways = fnm1 + pairways;
        return totalways;

        // return pairing(n-1)+(n-1)*pairing(n-2);

    }

    // Q14. BINARY STRING problem
    public static void printBinString(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        printBinString(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printBinString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // int n=8;
        // printInc(n);
        // System.out.println(fac(n)) ;

        // System.out.println(sum(n)) ;

        // System.out.println(fib(n));

        // int arr[]={3,4,5,6,9,7,8};
        // System.out.println(isSorted(arr,0)) ;

        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr,5,0));

        // int arr[]={8,3,6,9,5,10,2,5,3,5,5,5,5};
        // System.out.println(lastOccurence(arr,10,0 ));

        // System.out.println(pow(2,6));

        // System.out.println(power(2,6));

        // System.out.println(tiling(3));
 
        // String str="aaasssskkkffjjjj ";
        // removeDup(str,0,new StringBuilder(""),new boolean[26]);

        // System.out.println(pairing(3));

        printBinString(6, 0, "");
    }
}
