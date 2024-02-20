// import javax.sound.sampled.SourceDataLine;

public class oopsfour {
    public static void main(String[] args) {
        // Queen  q= new Queen();
        // q.moves(   );

        Bear b=new Bear();
        b.eat();
    }
}

interface herbivore{
    void eat();
}
interface carnivore{
    void eats();
}

class Bear implements herbivore,carnivore{
    public void eat(){
        System.out.println("eats grass");
    }
    public void eats(){
        System.out.println("eat meat");
    }
}
// interface chessplayer{
//     void moves();
// }

// class Queen implements chessplayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal(in all four directions)");
//     }
// }

// class rook implements chessplayer{
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }
// }

// class king implements chessplayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diagonal by 1 step");
//     }
// }