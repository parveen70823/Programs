public class oops {
    public static void main(String args[]){
        pen p1= new pen();//created a pen object called p1
        p1.setcolor("magentaa");
        System.out.println(p1.getcolor());

        p1.settip(6);
        System.out.println(p1.gettip());

        p1.setcolor("yellow");
        System.out.println(p1.getcolor());

        
        // Bankaccount myacc=new Bankaccount();
        // myacc.username="japanese";
        // System.out.println(myacc.username);

        // myacc.password="abcdefghi";
        // myacc.setPassword("abcdefghi");
    }
}
class pen{
    private String color;
    
    private int tip;

        String getcolor(){
            return this.color;
        }
         int gettip(){
            return this.tip;
        }
      
      void setcolor(String newcolor){
            this.color=newcolor;
        }
        void settip(int newtip){
            this.tip=newtip;
        }
    } 


    // class Bankaccount{
    //     public String username;
    //     private String password;
    //     public void setPassword(String str){
    //         password=str;
    //     }
       
    // }

class student{
    int age;
    String name;
    float percentage;
    void calpercentage(int p, int c, int m){
        percentage=(p+c+m)/3;
    } 
}
