// class Pen{
//     String color;
//     String type;
//     public void write(){
//         System.out.println("kuch to print krade bahi");
//     }
//     public void print(){
//         System.out.println(this.color);
//     }

// }
class student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non parameter constructor
    // student(){
    //     System.out.println("new non parametrised constructor called");
    // }

    // parametrised------->
    // student(String name, int age){
    //     this.name=name;
    //     this.age=age;
    // }

    student(student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    student(){

    }
}
public class oops_practice {
    public static void main(String[] args) {
        // Pen p1=new Pen();
        // p1.color="blue";
        // p1.type="ballpoint";
        // p1.write();
        // p1.print();
        
        // System.out.println("pen class");



        student  s1=new student();
        s1.name="parkash";
        s1.age=20 ;
        // student  s1=new student("lalu",84);
        
        // copy consturctor
        student s2=new student(s1);
        s1.printinfo();


    }
}


