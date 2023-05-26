import javax.swing.*;
import java.awt.*;

public class Score extends Rectangle {
    int width;
    int height;
    int player1;
    int player2;
    Score(int width,int height)
    {
        this.height=height;
        this.width=width;

    }
    public void draw(Graphics g)
    {
        g.setColor(Color.black);
        g.setFont(new Font("Consolas",Font.PLAIN,60));
        //while(pla)
        if(player2<3 && player1<3)
        {
            g.drawString(String.valueOf(player1),width/2-60,100);
            g.drawString(String.valueOf(player2),width/2+20,100);
        }
        else
        {
            if(player1>=3&&player2>=3)
            {
                g.drawString("IT'S A TIE",width/2-180,100);
            }
            else if(player1>=3)
            {
                g.drawString("Winner is player 1",width/2-180,100);
            }
            else
            {
                g.drawString("Winner is player 2",width/2-180,100);
            }
        }

    }


}
