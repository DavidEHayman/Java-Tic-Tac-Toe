import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean players_turn;


    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(Color.DARK_GRAY);
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);
        title_panel.add(textfield);


        button_panel.setLayout(new GridLayout(3,3));
        for(int i = 0; i < 9; i ++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 9; i++) {
            if(e.getSource()==buttons[i]) {
                if(players_turn) {
                    if(buttons[i].getText()=="") {
                        buttons[i].setForeground(Color.BLACK);
                        buttons[i].setBackground(Color.blue);
                        buttons[i].setText("X");
                        players_turn = false;
                        textfield.setText("O turn");
                        check();
                    }
                }
                else {
                    if(buttons[i].getText()=="") {
                        buttons[i].setForeground(Color.BLACK);
                        buttons[i].setBackground(Color.green);
                        buttons[i].setText("O");
                        players_turn = true;
                        textfield.setText("X turn");
                        check();
                    }
                }
            }
        }
    }


    public void firstTurn() {
        if(random.nextInt(2)==0) {
            players_turn = false;
            textfield.setText("X turn");
        }
        else{
            players_turn = true;
            textfield.setText("O turn");
        }

    }

    public void check() {

    }

    public void Xwins(int x, int y, int z){

    }
    public void Owins(int x, int y, int z){
        
    }

}