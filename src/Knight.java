import javax.swing.*;

public class Knight extends Piece{
     public Knight(boolean isBlackPlayer) {
            this.isBlackPlayer = isBlackPlayer;
            if (isBlackPlayer == true) {
                image= new ImageIcon("bknight.gif");
            }
            if(isBlackPlayer==false){
                image=new ImageIcon("wknight.gif");
            }
        }
}
