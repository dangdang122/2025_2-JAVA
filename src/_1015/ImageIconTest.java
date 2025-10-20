package _1015;
import _1015.CenterFrame;

import javax.swing.*;

public class ImageIconTest extends JFrame {
    public ImageIconTest() {
        ImageIcon icon = new ImageIcon("C:/Users/AI-510-166/Desktop/1760403298.jpg");

        JLabel label = new JLabel(icon);
        JButton button = new JButton(icon);
        add(label, "North");
        add(button, "Center");

        setTitle("ImageIconTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JFrame이 모니터 화면 정중앙에 오도록 한다
        CenterFrame cf = new CenterFrame(500, 500);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true); //화면 출력
    }

    public static void main(String[] args) {
        new ImageIconTest();
    }
}
