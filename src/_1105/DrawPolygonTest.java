package _1105;

import _1015.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class DrawPolygonTest extends JFrame {
    public DrawPolygonTest(){
        DrawPanel dp = new DrawPanel();
        add(dp);
        setTitle("MouseEventTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(300, 300);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    public static void main (String[] args){
        new DrawPolygonTest();
    }

    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.red);
            g.drawLine(10,20, 150, 20);
            g.setColor(Color.green);
            g.drawLine(20,30, 150, 100);
            g.setColor(Color.orange);
            g.fillOval(200,30,150,100);
            g.setColor(Color.pink);
            g.fillRect(370,30,100,100);
            g.setColor(Color.magenta);
            g.fillRect(20,160,200,150);
            g.setColor(Color.black);
            g.fillRoundRect(280,190,200,200, 20, 20);
            g.setColor(Color.yellow);
            int[] xPoints = {110, 30, 180};
            int[] yPoints = {180, 215, 215};
            g.drawPolygon(xPoints, yPoints, xPoints.length);
        }
    }
}
