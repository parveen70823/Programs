public class oopsthree {
    public static void main(String[] args) {
    //  Horse h=new Horse();
    //  h.eat();
    //  h.walk();
    //  System.out.println(h.color);

    //  chicken c =new chicken();
    //  c.eat();
    //  c.walk();

     //Animal a=new Animal()   ->this cannot creat instances beacause it is a abstract type


     Mustang myhorse=new Mustang();
     //Animal->horse->mustang
    }
}


abstract class Animal{
     String color;
    Animal(){
        // color="peach"; 
        System.out.println("animal cons.. callled");
    }
    void eat(){
        System.out.println("animal eats");
    }
     abstract void walk();//here animal give a idea about further sub classes will implement this 
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changecolor(){
        color="dark brown";
    }
}


class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }

}
class chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    void changecolor(){
        color="yellow";
    }
}