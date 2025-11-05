package _1029;

import _1015.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NullLayoutTest extends JFrame{
    public NullLayoutTest() {
        setLayout(null);//배치관리가 없음. 컴포넌트의 위치와 크기를 절대값으로 설정 가능
        int[] xy = {50, 70, 90, 110};

        for(int i = 0; i<xy.length; i++){
            JButton btn = new JButton("버튼"+(i+1));
            btn.setBounds(xy[i], xy[i], 70, 60);
            add(btn);
        }

        setTitle("LayoutManager Null");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(250, 250);
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
        new NullLayoutTest();
    }

}
