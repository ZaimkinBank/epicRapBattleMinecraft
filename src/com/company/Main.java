package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class Main extends JPanel{
    static ceil tmpCeil = new ceil(0,0);
    static ArrayList <ceil> arr = new ArrayList<>();
    static ArrayList <ceil> arr2 = new ArrayList<>();

    Main(){
        JFrame fr = new JFrame("moving");
        fr.add(this);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setSize(1200,800);
        fr.setVisible(true);
        fr.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                arr2.add(new ceil(e.getX(), e.getY()));
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        while(true){
            repaint();
        }
    }

    public static void main(String[] args) {
        arr.add(new ceil(1,1));
        arr2.add(new ceil(1000,1000));
        new Main();
    }

    public void paintComponent( Graphics g ){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        for (int i = 0; i < arr.size(); i++)
            g.fillRect(arr.get(i).x, arr.get(i).y, 5, 5);
        tmpCeil.x = Math.abs(arr.get(arr.size() - 1).x + RandFunc());
        tmpCeil.y = Math.abs(arr.get(arr.size() - 1).y + RandFunc());
        g.fillRect(tmpCeil.x, tmpCeil.y, 5, 5);
        arr.add(new ceil(tmpCeil.x, tmpCeil.y));

        g.setColor(Color.RED);
        for (int i = 0; i < arr2.size(); i++)
            g.fillRect(arr2.get(i).x, arr2.get(i).y, 5, 5);
        tmpCeil.x = Math.abs(arr2.get(arr2.size() - 1).x + RandFunc());
        tmpCeil.y = Math.abs(arr2.get(arr2.size() - 1).y + RandFunc());
        g.fillRect(tmpCeil.x, tmpCeil.y, 5, 5);
        arr2.add(new ceil(tmpCeil.x, tmpCeil.y));

    }

    public int RandFunc(){
        Random rand = new Random();
        int tmp = rand.nextInt(3);
        if (tmp == 0)
            return -5;
        if (tmp == 1)
            return 0;
        else
            return 5;
    }
}
