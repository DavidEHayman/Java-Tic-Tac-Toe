

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameFrame extends JFrame {

    GameFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(900,1000);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.gray);
        Grid Maingrid = new Grid(40, 100);
        this.add(Maingrid);

    }
    public class Grid extends JPanel{
        public JButton grid[][];
        int width, height;
        public Grid(int w, int h){
            width = w;
            height = h;
            grid = new JButton[3][3];

            this.setBounds(width, height,   800, 800);
            this.setLayout(new GridLayout(3,3));
            gridloop();
            
        }

        public void gridloop(){
            int a = 0;
            for(int i = 0; i < grid.length; i++) {
                for(int k = 0; k < grid.length; k++){
                    a++;
                    grid[i][k] = new JButton(""+a);
                    this.add(grid[i][k]);
                }
            }
        }
    }
}


