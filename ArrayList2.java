import java.util.*;
public class ArrayList2 {

    // Q3.CONTAINER WITH  MOST WATER
    // public static int storeWater(ArrayList<Integer> height){
    //     int maxWater=0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int ht=Math.min(height.get(i),height.get(j));
    //             int wd=j-i;
    //             int currWater=ht*wd;
    //             maxWater=Math.max(maxWater,currWater);
                

    //         }
    //     }
    //     return maxWater;
    // }

    //2PTR APPROACH
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            //area calculation
            int ht=Math.min(height.get(lp),height.get(rp));
            int wd=rp-lp;
            int currWater=ht*wd;
            maxWater=Math.max(currWater,maxWater);

            // updation of pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxWater;
    }
    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> mainList =new ArrayList<>();
        // ArrayList<Integer> list1= new ArrayList<>();
        // ArrayList<Integer> list2=new ArrayList<>();
        // ArrayList<Integer> list3=new ArrayList<>();
        
        // for(int i=1;i<=5;i++){
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }


        // ArrayList<Integer> list1= new ArrayList<>();
        // list1.add(3);
        // list1.add(76);

        // ArrayList<Integer> list2=new ArrayList<>();
        // list2.add(32);
        // list2.add(98);

        
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);

        // list3.remove(4);

        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> currList=mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);

        ArrayList<Integer> height =new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }   
}
