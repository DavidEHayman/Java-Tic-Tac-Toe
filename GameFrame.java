
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame {

    GameFrame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(900,900);
        this.setVisible(true);
        this.setLayout(null);
        Panel panel =  new Panel();
        this.add(panel);
        panel.setBounds(0, 0, 882, 882);

    }

    public class Panel extends JPanel {
        Cell cell;
        Panel() {
        }
        protected void paintComponent(Graphics g) {
    
            for (int i = 4; i < 891; i+=294) {
                System.out.println(i);
                for (int k = 4; k < 891; k+=294) {
                    g.setColor(Color.GRAY);
                    g.fillRect(i, k, 294, 294);
                    g.setColor(Color.BLACK);
                    g.drawRect(i, k, 294, 294);

                }
            }
        }
    }

}
