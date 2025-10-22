package _1022;

import _1015.CenterFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFoodTest extends JFrame {
    JComboBox combo;
    JLabel imgLbl;
    String[] items = {"칼국수", "순대국밥", "김밥", "라면", "피자"};

    public SelectFoodTest() {
        JPanel north = new JPanel();
        JLabel lb = new JLabel("음식: ");
        combo = new JComboBox(items);
        JButton btn = new JButton("선택");

        north.add(lb);
        north.add(combo);
        north.add(btn);
        add(north, "North");

        imgLbl = new JLabel(new ImageIcon());
        add(imgLbl, "Center");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String food = (String) combo.getSelectedItem();
                String path = null;

                if (food.equals("칼국수")) path = "D:/java/javaproject/src/_1022/kal.jpg";
                else if (food.equals("순대국밥")) path = "D:/java/javaproject/src/_1022/bab.jpg";
                else if (food.equals("김밥")) path = "D:/java/javaproject/src/_1022/kimbab.jpg";
                else if (food.equals("라면")) path = "D:/java/javaproject/src/_1022/lamen.jpg";
                else if (food.equals("피자")) path = "D:/java/javaproject/src/_1022/pizza.jpg";

                if (path != null) {
                    imgLbl.setIcon(new ImageIcon(path));
                } else {
                    JOptionPane.showMessageDialog(null, "이미지를 찾을 수 없습니다.");
                }
            }
        });

        setTitle("항목선택");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(1000, 1000);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    public static void main(String[] args) {
        new SelectFoodTest();
    }
}
