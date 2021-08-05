import javax.swing.*;
public class Pawn extends Piece {
    public Pawn(boolean isBlackPlayer) {
        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true) {
            image= new ImageIcon("bpawn.gif");
        }
        if(isBlackPlayer==false){
            image=new ImageIcon("wpawn.gif");
        }
    }
}