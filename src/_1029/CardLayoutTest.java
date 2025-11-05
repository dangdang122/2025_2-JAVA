package _1029;

import _1015.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTest extends JFrame {
    public CardLayoutTest(){
        setLayout(new CardLayout(5,5));
        for (int i =0; i<3; i++){
            JButton btn= new JButton("버튼"+(i));
            add(btn);
        }

        setTitle("GridLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(250, 250);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            JOptionPane.showMessageDialog(null, btn.getText() + "선택됨");
        }
    };

    public static void main(String[] args) {
        new CardLayoutTest();
    }


}
