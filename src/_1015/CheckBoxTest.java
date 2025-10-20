package _1015;

import _1015.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest extends JFrame {
    JCheckBox checkBox;
    public CheckBoxTest() {
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setTitle("CheckBoxTest");
        checkBox = new JCheckBox("체크박스를 선택하세요.");
        checkBox.addActionListener(checkBoxListener);
        add(checkBox);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //JFrame이 모니터 정중앙에 나오도록 한다.
        CenterFrame cf=new CenterFrame(500,300);
        cf.centerXY();
        setBounds(cf.getX(),cf.getY(),cf.getFw(),cf.getFh());        //위치를 조정할 때 쓰는 함수
        setVisible(true);
    }

    ActionListener checkBoxListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            if (checkBox.isSelected()) {
                JOptionPane.showMessageDialog(null, "체크박스가 선택되었습니다.");
            }else{
                JOptionPane.showMessageDialog(null,"체크박스가 해제되었습니다");
            }
        }
    };
    public static void main(String[] args) {
        new CheckBoxTest();

    }
}
