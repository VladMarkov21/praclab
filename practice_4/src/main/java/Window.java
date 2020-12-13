import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Window extends JFrame{

    public Window(){
        super("Result table");
        GameNumber gameNumber= new GameNumber();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(550,450);
        JPanel pnl= new JPanel();
        JPanel panel= new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(new Color(187,189,87));


       pnl.setLayout(new BorderLayout());
        pnl.setBackground(new Color(169,219,216));
        MouseListener mouseListener= new ActionListenerUI(gameNumber);

        JButton buttonMadrid= new JButton("Madrid");
        buttonMadrid.addMouseListener(mouseListener);


        JLabel label=new JLabel("Result: "+gameNumber.getMilan()+" X "+gameNumber.getMadrid());
        JLabel lastScorer= new JLabel("Last Scorer:"+gameNumber.getLastScorer());
        lastScorer.setAlignmentX(JLabel.CENTER_ALIGNMENT);


        setLayout(null);
        label.setBounds(200,200,150,100);
        lastScorer.setBounds(400,400,150,100);

        pnl.add(new JButton("Milan"), BorderLayout.WEST);
        pnl.add(buttonMadrid, BorderLayout.EAST);

        //panel.add(label,FRAMEBITS);
        pnl.add(lastScorer);
        pnl.add(label);
        pnl.setSize(255,200);
        setContentPane(pnl);


    }

}