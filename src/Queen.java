import javax.swing.*;
public class Queen extends Piece {
    public Queen(boolean isBlackPlayer) {
        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true) {
            image= new ImageIcon("bqueen.gif");
        }
        if(isBlackPlayer==false){
            image=new ImageIcon("wqueen.gif");
        }
    }
}