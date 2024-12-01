import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Begin extends JFrame {
    public JButton Begin;
    public Begin(){

        Begin = new JButton("Begin");


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.gray);

        Begin.setBounds(300, 300, 200, 100);
        Begin.addActionListener(e -> {
            this.dispose();
            new GameFrame();
        });
        this.add(Begin);
    }

    public static void main(String[] args) {
        new Begin();
    }

}
