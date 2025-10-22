package _1022;

import _1015.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest extends JFrame {
    JTextField tf;  //한줄 입력 컴포넌트
    JTextArea ta;   //여러줄 입력 컴포넌트
    JPasswordField pf;//암호 입력 컴포넌트
    public TextFieldTest(){
        tf = new JTextField(10);
        ta = new JTextArea(5,10);
        pf = new JPasswordField(10);
        JButton btn = new JButton("ShowMessage");
        //교수님은 변수 하나씩 getText를 선언하셨고 내 코드는 변수 하나에 한번에 연결 연산자를 사용함
        ActionListener btnListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = tf.getText() + "\n"
                        + ta.getText() + "\n"
                        + new String(pf.getPassword());
                JOptionPane.showMessageDialog(null, msg);

            }
        };
        btn.addActionListener(btnListener);
        setLayout(new FlowLayout());

        add(tf);
        JScrollPane sp = new JScrollPane(ta);
        add(sp);
        add(pf);
        add(btn);

        setTitle("텍스트 입력 가능 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(250,250);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldTest();
    }
}
