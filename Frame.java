import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Frame extends JFrame {
    public JButton Begin, X, O;


    public Frame(){

        Begin = new JButton("Begin");
        X = new JButton("X");
        O = new JButton("O");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.gray);

        this.add(Begin);
        this.add(X);
        this.add(O);

        X.setFont(new Font("Dialog",0, 50));
        X.setBounds(80, 350, 200, 100);

        X.addActionListener(e ->{
            Begin.setBounds(280, 350, 200, 100);
            Begin.setFont(new Font("Dialog",0, 50));
        });

        O.setFont(new Font("Dialog",0, 50));
        O.setBounds(480, 350, 200, 100);

        O.addActionListener(e ->{
            Begin.setBounds(280, 350, 200, 100);
            Begin.setFont(new Font("Dialog",0, 50));

        });


        //New window for Game Start
        Begin.addActionListener(e -> {
            this.dispose();
            new GameFrame();
        });

    }
    public void paint(Graphics g){
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("C:\\Users\\David\\Documents\\GitHub\\Outside school\\Java Tic Tac Toe\\Java-Tic-Tac-Toe\\tic-tac-toe logo.png");
        g.drawImage(i,0,0, 800, 350, this);


    }

    public static void main(String[] args) {
        new Frame();
    }

}
