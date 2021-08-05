import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class BoardComponent extends JComponent {
    //public static final int height=100;
    //public static final int width=100;


    protected void paintComponent(Graphics g) {


        Color LightBrown = new Color(233, 174, 95);
        Color DarkBrown = new Color(177, 113, 24);

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        g.setColor(DarkBrown);
                        g.fillRect(j * Chess.PIECESIZE, i * Chess.PIECESIZE, Chess.PIECESIZE, Chess.PIECESIZE);
                    } else {
                        g.setColor(LightBrown);
                        g.fillRect(j * Chess.PIECESIZE, i * Chess.PIECESIZE, Chess.PIECESIZE, Chess.PIECESIZE);
                    }
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        g.setColor(LightBrown);
                        g.fillRect(j * Chess.PIECESIZE, i * Chess.PIECESIZE, Chess.PIECESIZE, Chess.PIECESIZE);
                    } else {
                        g.setColor(DarkBrown);
                        g.fillRect(j * Chess.PIECESIZE, i * Chess.PIECESIZE, Chess.PIECESIZE, Chess.PIECESIZE);
                    }

                }

            }
        }

            for(int x=0; x<8; x++){
            for(int y=0; y<8;y++) {
                if(Chess.position[x][y] != null){
                g.drawImage(Chess.position[x][y].image.getImage(), x * Chess.PIECESIZE, y * Chess.PIECESIZE, null);
            }
            }
                }
        //black pieces
            /*
                ImageIcon blackrookicon;
                blackrookicon = new ImageIcon("brook.gif");
                g.drawImage(blackrookicon.getImage(),0*Chess.PIECESIZE,0*Chess.PIECESIZE,null);
                g.drawImage(blackrookicon.getImage(),7*Chess.PIECESIZE,0*Chess.PIECESIZE,null);

                ImageIcon blackknighticon;
                blackknighticon = new ImageIcon("bknight.gif");
                g.drawImage(blackknighticon.getImage(),1*Chess.PIECESIZE,0*Chess.PIECESIZE, null);
                g.drawImage(blackknighticon.getImage(),6*Chess.PIECESIZE,0*Chess.PIECESIZE,null);

                ImageIcon blackbishopicon;
                blackbishopicon = new ImageIcon("bbishop.gif");
                g.drawImage(blackbishopicon.getImage(),2*Chess.PIECESIZE,0*Chess.PIECESIZE, null);
                g.drawImage(blackbishopicon.getImage(),5*Chess.PIECESIZE,0*Chess.PIECESIZE,null);

                ImageIcon blackqueenicon;
                blackqueenicon = new ImageIcon("bqueen.gif");
                g.drawImage(blackqueenicon.getImage(),3*Chess.PIECESIZE,0*Chess.PIECESIZE,null);

                ImageIcon blackkingicon;
                blackkingicon = new ImageIcon("bking.gif");
                g.drawImage(blackkingicon.getImage(),4*Chess.PIECESIZE,0*Chess.PIECESIZE,null);

                for(int l=0; l<=7;l++) {
                    ImageIcon blackpawnicon;
                    blackpawnicon = new ImageIcon("bpawn.gif");
                    g.drawImage(blackpawnicon.getImage(), l * Chess.PIECESIZE, 1 * Chess.PIECESIZE, null);
                }

                //white pieces
                ImageIcon whiterookicon;
                whiterookicon = new ImageIcon("wrook.gif");
                g.drawImage(whiterookicon.getImage(),0*Chess.PIECESIZE,7*Chess.PIECESIZE,null);
                g.drawImage(whiterookicon.getImage(),7*Chess.PIECESIZE,7*Chess.PIECESIZE,null);

                ImageIcon whiteknighticon;
                whiteknighticon = new ImageIcon("wknight.gif");
                g.drawImage(whiteknighticon.getImage(),1*Chess.PIECESIZE,7*Chess.PIECESIZE,null);
                g.drawImage(whiteknighticon.getImage(),6*Chess.PIECESIZE,7*Chess.PIECESIZE,null);

                ImageIcon whitebishopicon;
                whitebishopicon = new ImageIcon("wbishop.gif");
                g.drawImage(whitebishopicon.getImage(),2*Chess.PIECESIZE,7*Chess.PIECESIZE,null);
                g.drawImage(whitebishopicon.getImage(),5*Chess.PIECESIZE,7*Chess.PIECESIZE,null);

                ImageIcon whitequeenicon;
                whitequeenicon = new ImageIcon("wqueen.gif");
                g.drawImage(whitequeenicon.getImage(),4*Chess.PIECESIZE,7*Chess.PIECESIZE,null);

                ImageIcon whitekingicon;
                whitekingicon = new ImageIcon("wking.gif");
                g.drawImage(whitekingicon.getImage(),3*Chess.PIECESIZE,7*Chess.PIECESIZE,null);

        for(int l=0; l<=7;l++) {
            ImageIcon whitepawnicon;
            whitepawnicon = new ImageIcon("wpawn.gif");
            g.drawImage(whitepawnicon.getImage(), l * Chess.PIECESIZE, 6 * Chess.PIECESIZE, null);


             */
    }



}
