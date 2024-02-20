public class oopsfive {
    public static void main(String[] args) {
        // Student s1=new Student();
        // s1.schoolname="sakl";
        
        // Student s2=new Student();
        // System.out.println(s2.schoolname);

        // Student s3=new Student();
        // s3.schoolname="aljdl";

        Horse h=new Horse();
        System.out.println(h.color);

    }   
}

// class Student{
//     String name;
//     int roll;
    
//     static  String schoolname;
//     void setname(String name){
//         this.name=name;
//     }
//     String getname(){
//         return this.name;
//     }
// }

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color="blue";
        System.out.println("horse constructor is called");
    }
}