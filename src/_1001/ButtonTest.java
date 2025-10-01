package _1001;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest extends JFrame {
    public  ButtonTest() {

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setTitle("ButtonTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btn = new JButton("클릭");
        btn.addActionListener(btnListener);
        add(btn);

        JButton btn2 = new JButton("인공지능소프트웨어과");
        btn2.addActionListener(btnListener);
        add(btn2);

        setBounds(200,200,300,200);
        setVisible(true);

    }
    ActionListener btnListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, e.getActionCommand()+"버튼을 선택했습니다.");
        }
    };

    public static void main(String[] args) {
        new ButtonTest();
    }
}
