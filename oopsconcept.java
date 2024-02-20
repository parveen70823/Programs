public class oopsconcept {
    public static void main(String[] args) {
        // Student s1= new Student();
        // // Student s2= new Student("parveen");
        // // Student s3= new Student(123);
        // s1.name="parveen";
        // s1.roll =54;
        // s1.password="kjsh";
        // s1.marks[0]=100;
        // s1.marks[1]=80;
        // s1.marks[2]=90;
        
        // Student s2=new Student (s1);//copies s1 value in s2
        // s2.password="xyz";
        // s1.marks[1]=39;

        // for (int i = 0; i < 3; i++) {
        //     System.out.println(s2.marks[i]);
        // }
      


        // fish shark=new fish();
        // shark.eat();
        // dog dob=new dog();
        // dob.eat();
        // dob.legs=5;
        // System.out.println(dob.legs);

        bird b1= new bird();
        b1.eat();
        b1.fly();
    }
}  
// class Student{
//     int marks[];
//     String name;
//     int roll;
//     String password;

//     //deep copy cons.
//     Student(Student s1){
//         marks=new int[3];
//         this.name=s1.name;
//         this.roll=s1.roll;
//         for (int i = 0; i < marks.length; i++) {
//             this.marks[i]=s1.marks[i];
//         }
//     }

//     //shallow copy constructor
//     // Student(Student s1) {
//     //     marks=new int [3];
//     //     this.name=s1.name;
//     //     this.roll=s1.roll;
//     //     this.marks=s1.marks;//not completly copies but ref. is copied
//     // }
//     Student( ){
//         marks=new int [3];
//         System.out.println("constructor is called....");
//     }
//     Student(String name){
//         marks=new int [3];
//         this.name=name;
//     }
//     Student(int roll){
//         marks=new int [3];
//         this.roll=roll;
//     }

// }


//BASE CLASS
class animal{
    void eat(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("breathing");
    }
}

//DERIVED CLASS
// class fish extends animal{
//     int fins;
//     void swim(){
//         System.out.println("swimming");
//     }
// }


// EXAPMLE OF MULTILEVEL  INHERITENCE
// class mammal extends animal{
//     int legs;
// }
// class dog extends mammal{
//     String breed;
// }


//example of heirarical inheritence
class fish extends animal{
    void swim(){
        System.out.println("swim");
    }
}
class mammals extends animal{
    void walk(){
        System.out.println("walk");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("fly");
    }
}