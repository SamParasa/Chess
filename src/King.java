import javax.swing.*;
public class King extends Piece {
    public King(boolean isBlackPlayer) {
        this.isBlackPlayer = isBlackPlayer;
        if (isBlackPlayer == true) {
            image= new ImageIcon("bking.gif");
        }
        if(isBlackPlayer==false){
            image=new ImageIcon("wking.gif");
        }
    }
}

