package _1112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RadioMouse extends JFrame {
    static int x1, y1, x2, y2;
    static JRadioButton radio1, radio2, radio3;

    static class MyPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (!radio1.isSelected()) {
                if (x1 > x2) {
                    int tmp = x1;
                    x1 = x2;
                    x2 = tmp;
                }
                if (y1 > y2) {
                    int tmp = y1;
                    y1 = y2;
                    y2 = tmp;
                }
            }

            if (radio1.isSelected())
                g.drawLine(x1, y1, x2, y2);
            else if (radio2.isSelected())
                g.drawRect(x1, y1, x2 - x1, y2 - y1);
            else
                g.drawOval(x1, y1, x2 - x1, y2 - y1);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("라디오마우스");
        frame.setLayout(null);

        radio1 = new JRadioButton("선");
        radio2 = new JRadioButton("사각형");
        radio3 = new JRadioButton("타원");
        radio1.setBounds(50, 0, 80, 30);
        radio2.setBounds(150, 0, 80, 30);
        radio3.setBounds(250, 0, 80, 30);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(radio3);

        ButtonGroup grp = new ButtonGroup();
        grp.add(radio1);
        grp.add(radio2);
        grp.add(radio3);
        radio1.setSelected(true);

        MyPanel panel = new MyPanel();
        panel.setBackground(Color.YELLOW);
        panel.setBounds(0, 30, 500, 470);
        frame.add(panel, BorderLayout.CENTER);

        panel.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                panel.repaint();
            }
            public void mouseClicked(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}