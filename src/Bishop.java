import javax.swing.*;
public class Bishop extends Piece {
    public Bishop(boolean isBlackPlayer) {
        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true) {
            image= new ImageIcon("bbishop.gif");
        }
        if(isBlackPlayer==false){
            image=new ImageIcon("wbishop.gif");
        }
    }
}
