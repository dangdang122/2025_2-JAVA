package _1029;

import _1015.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomGridDice extends JFrame {
    public RandomGridDice() {
        Random rand = new Random();
        int rows = rand.nextInt(10)+1;
        int cols = rand.nextInt(10)+1;
        setLayout(new GridLayout(rows, cols));


        Color[] colors = {Color.blue, Color.magenta, Color.red, Color.green, Color.orange, Color.pink};
        Color c = new Color(255,0,0);
        for(int i = 0; i < rows *cols; i++){
            int diceNum = rand.nextInt(6)+1;
            JButton btn = new JButton(diceNum+"");
            btn.setBackground(colors[diceNum-1]);
            add(btn);
        }

        setTitle("RandomGridDice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(500, 500);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            JButton btn = (JButton) e.getSource();
            JOptionPane.showMessageDialog(null,btn.getText()+"선택됨");
        }
    };

    public static void main(String[] args) {
        new RandomGridDice();
    }
}
