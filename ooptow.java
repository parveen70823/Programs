public class ooptow {
    public static void main(String args[]) {
        // Calculator cal = new Calculator();
        // System.out.println(cal.sum(4, 5));
        // System.out.println(cal.sum((float) 4.5, (float) 5.5));
        // System.out.println(cal.sum(4, 5, 5));

        Deer d=new Deer();
        d.eat();
    }
} 

// class Calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }

// }

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
