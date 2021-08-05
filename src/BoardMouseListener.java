import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

public class BoardMouseListener implements MouseListener{
int startx, starty;

    @Override
    public void mouseClicked(MouseEvent e) {
        Chess.board.repaint();
    }

    public void mousePressed(MouseEvent e){
        int pressx= e.getX();
        startx=pressx/Chess.PIECESIZE;
        int pressy= e.getY()/Chess.PIECESIZE;
        starty=pressx/Chess.PIECESIZE;
        Chess.board.repaint();
    }

    public void mouseReleased(MouseEvent e){
        int endx=e.getX()/Chess.PIECESIZE;
        int endy=e.getY()/Chess.PIECESIZE;

        Chess.position[endx][endy]=Chess.position[startx][starty];
        Chess.position[startx][starty]=null;
        Chess.board.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Chess.board.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Chess.board.repaint();
    }
}
