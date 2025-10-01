package _1001;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest2 extends JFrame {
    JTextField tf;
    public ButtonTest2() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int fw = 500;
        int fh = 500;
        int x = screenWidth/2 - fw/2;
        int y = screenHeight/2 - fh/2;

        setLayout(new FlowLayout());
        setTitle("ButtonTest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btn = new JButton("확인");
        tf= new JTextField(20);
        add(btn); add(tf);
        btn.addActionListener(btnListener);
        setBounds(x,y,fw,fh);
        setVisible(true);
    }
    ActionListener btnListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, tf.getText()+"버튼을 선택했습니다.");
        }
    };

    public static void main(String[] args) {
        new ButtonTest2();
    }
}
