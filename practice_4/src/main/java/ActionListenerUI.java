import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ActionListenerUI  implements MouseListener {
    GameNumber gameNumber= new GameNumber();
    public ActionListenerUI(GameNumber gameNumber){
        this.gameNumber=gameNumber;
    }
//    public void actionPerformed(ActionEvent e) {
//
//        gameNumber.plusMadrid();
//        gameNumber.lastMadrid();
//        System.out.println("plus");
//    }

    public void mouseClicked(MouseEvent e) {
        gameNumber.plusMadrid();
        gameNumber.lastMadrid();
        System.out.println("plus");
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
