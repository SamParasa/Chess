import javax.swing.*;
public class Rook extends Piece {
    public Rook(boolean isBlackPlayer) {
        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true) {
            image= new ImageIcon("brook.gif");
        }
        if(isBlackPlayer==false){
            image=new ImageIcon("wrook.gif");
        }
    }
}
