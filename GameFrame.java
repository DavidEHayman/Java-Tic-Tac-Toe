
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
        panel.setBounds(0, 0, 900, 900);

    }

    public class Panel extends JPanel {
        Cell cell;
        Panel() {
        }
        protected void paintComponent(Graphics g) {
    
            for (int i = 0; i < 3; i++) {
                for (int k = 0; k < 3; k++) {
                    g.setColor(Color.GRAY);
                    g.fillRect(i * 300, k * 300, 300, 300);
                    g.setColor(Color.BLACK);
                    g.drawRect(i * 300, k * 300, 300, 300);
                }
            }
        }
    }

}
