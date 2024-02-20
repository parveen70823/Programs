// import java.util.ArrayList;
// import java.util.Collections;
// //import java.util.*;
// public class Arraylist1 {

//     public static void swap(ArrayList<Integer> list,int i1, int i2){
//         int temp=list.get(i1);
//         list.set(i1,list.get(i2));
//         list.set(i2,temp);
//         System.out.println(list);
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         ArrayList<Boolean> list1=new ArrayList<>();
//         ArrayList<String> list2=new ArrayList<>();
//         ArrayList<Character> list3=new ArrayList<>();
//         //ClassName objectName=new ClassName();

//         //add operation
//         list.add(1);//o(1)
//         list.add(2);
//         list.add(4);  
//         list.add(23);  
//         list.add(8);  

//         System.out.println(list.size());
//         // for(int i=0;i<list.size();i++){
//         //     System.out.print(list.get(i)+" ");
//         // }

//         //FINDING MAX ELEMENT IN THE ARRAYLIST
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<list.size();i++){
//             if(max<list.get(i)){ 
//                 max=list.get(i);
//             }
//             // max=Math.max(max,list.get(i));
//         }
//         System.out.println("max element=" +max);

//         //SWAP TWO NUMBERS
//         // int idx1=1,idx2=3;
//         // swap(list,idx1,idx2);

//         System.out.println(list); 
//         Collections.sort(list);//------>in ascending
//         System.out.println(list);

//         //in decending order
//         Collections.sort(list,Collections.reverseOrder());
//         System.out.println(list);



//         // list.add(4,2324);//0(n)
//         // System.out.println(list);

//         // //GET OPERATION=0(1)
//         // int element=list.get(2);
//         // System.out.println(element);

//         // //remove element=o(n)
//         // list.remove(3);
//         // System.out.println(list);

//         //set element at index
//         // list.set(2,123) 
        
//         //conatins
//         // System.out.println(list.contains(3));



//     }
// }

