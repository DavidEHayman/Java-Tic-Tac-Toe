import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class Frame extends JFrame{
    int width, height;

    public Frame(int w, int h){
        width =  w;
        height = h;


        this.setTitle("Window");
        this.setVisible(true);
        this.setSize(width,height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tic-Tac-Toe");
        this.setResizable(true);
        ImageIcon image = new ImageIcon("tic-tac-toe logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.gray);
    }
}
