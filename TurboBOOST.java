/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TurboBOOST extends JFrame{
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;


    TurboBOOST(){
        setLayout(null);

        JLabel a1 = new JLabel ("Driver Booster 9");
        a1.setBounds(325,13,200,20);
        a1.setForeground(Color.GRAY);
        add(a1);
        Font Ateb = new Font ("calibri",Font.PLAIN,20);
        a1.setFont(Ateb);

        JLabel a11 = new JLabel();
        a11.setIcon(new ImageIcon(getClass().getResource("image/free.png")));
        a11.setBounds(465,-5,50,50);
        add(a11);

        JPanel a = new JPanel();
        a.setLayout(null);
        a.setBounds(0,0,60,600);
        a.setBackground(new Color(10,15,15,220));
        add(a);

        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("image/mass.png")));
        a2.setBounds(680,-12,50,50);
        add(a2);

        JLabel a3 = new JLabel();
        a3.setIcon(new ImageIcon(getClass().getResource("image/remove.png")));
        a3.setBounds(715,-18,50,50);
        add(a3);

        JLabel a4 = new JLabel();
        a4.setIcon(new ImageIcon(getClass().getResource("image/clipart.png")));
        a4.setBounds(742,-14,50,50);
        add(a4);

        JLabel a5 = new JLabel();
        a5.setIcon(new ImageIcon(getClass().getResource("image/new.png")));
        a5.setBounds(770,-18,50,50);
        add(a5);

        a5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                System.exit(0);
            }
        });



        JPanel b = new JPanel();
        b.setLayout(null);
        b.setBounds(80,45,5,15);
        b.setBackground(new Color(255,0,0,220));
        add(b);

        JLabel bl = new JLabel ("Fix Common Problems:");
        bl.setBounds(90,43,250,20);
        bl.setForeground(Color.GRAY);
        add(bl);
        Font Bteb = new Font ("calibri",Font.PLAIN,18);
        bl.setFont(Bteb);



        JPanel c = new JPanel();
        c.setLayout(null);
        c.setBounds(80,255,5,15);
        c.setBackground(new Color(255,0,0,220));
        add(c);

        JLabel c1 = new JLabel ("Other Useful Tools:");
        c1.setBounds(90,253,250,20);
        c1.setForeground(Color.GRAY);
        add(c1);
        Font Cteb = new Font ("calibri",Font.PLAIN,18);
        c1.setFont(Cteb);




        JPanel d = new JPanel();
        d.setLayout(null);
        d.setBounds(80,75,130,150);
        d.setBackground(new Color(46,42,43,220));
        add(d);


        JLabel d1 = new JLabel ("Backup & Restore");
        d1.setBounds(14,85,150,20);
        d1.setForeground(Color.GRAY);
        d.add(d1);

        JLabel d2 = new JLabel();
        d2.setIcon(new ImageIcon(getClass().getResource("image/backup.png")));
        d2.setBounds(40,-23,150,150);
        d.add(d2);



        d.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                d.setBackground(new Color(10,15,15,220));
            }
        });


        d.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                d.setBackground(new Color(46,42,43,220));
            }
        });



        JPanel ee = new JPanel();
        ee.setLayout(null);
        ee.setBounds(240,75,130,150);
        ee.setBackground(new Color(46,42,43,220));
        add(ee);

        JLabel ee1 = new JLabel ("Fix No Sound");
        ee1.setBounds(30,85,150,20);
        ee1.setForeground(Color.GRAY);
        ee.add(ee1);

        JLabel ee2 = new JLabel();
        ee2.setIcon(new ImageIcon(getClass().getResource("image/mute.png")));
        ee2.setBounds(40,-23,150,150);
        ee.add(ee2);

        ee.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ee.setBackground(new Color(10,15,15,220));
            }
        });

        ee.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                ee.setBackground(new Color(46,42,43,220));
            }
        });


        JPanel f = new JPanel();
        f.setLayout(null);
        f.setBounds(400,75,130,150);
        f.setBackground(new Color(46,42,43,220));
        add(f);

        JLabel f1 = new JLabel ("Fix Device Error");
        f1.setBounds(20,85,150,20);
        f1.setForeground(Color.GRAY);
        f.add(f1);

        JLabel f2 = new JLabel();
        f2.setIcon(new ImageIcon(getClass().getResource("image/error.png")));
        f2.setBounds(40,-23,150,150);
        f.add(f2);

        JLabel f5 = new JLabel();
        f5.setIcon(new ImageIcon(getClass().getResource("image/pro.png")));
        f5.setBounds(90,-49,150,150);
        f.add(f5);

        f.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                f.setBackground(new Color(10,15,15,220));
            }
        });

        f.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                f.setBackground(new Color(46,42,43,220));
            }
        });



        JPanel g = new JPanel();
        g.setLayout(null);
        g.setBounds(80,285,130,150);
        g.setBackground(new Color(46,42,43,220));
        add(g);

        JLabel g1 = new JLabel ("Offline Driver");
        g1.setBounds(28,85,150,20);
        g1.setForeground(Color.GRAY);
        g.add(g1);

        JLabel g2 = new JLabel ("Updater");
        g2.setBounds(40,96,150,20);
        g2.setForeground(Color.GRAY);
        g.add(g2);

        JLabel g3 = new JLabel();
        g3.setIcon(new ImageIcon(getClass().getResource("image/driver.png")));
        g3.setBounds(40,-23,150,150);
        g.add(g3);


        JLabel g4 = new JLabel();
        g4.setIcon(new ImageIcon(getClass().getResource("image/new 1.png")));
        g4.setBounds(90,-48,150,150);
        g.add(g4);



        g.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                g.setBackground(new Color(10,15,15,220));
            }
        });

        g.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                g.setBackground(new Color(46,42,43,220));
            }
        });

        JPanel h = new JPanel();
        h.setLayout(null);
        h.setBounds(240,285,130,150);
        h.setBackground(new Color(46,42,43,220));
        add(h);


        JLabel h1 = new JLabel ("System Information");
        h1.setBounds(10,85,150,20);
        h1.setForeground(Color.GRAY);
        h.add(h1);

        JLabel h2 = new JLabel();
        h2.setIcon(new ImageIcon(getClass().getResource("image/com12.png")));
        h2.setBounds(40,-23,150,150);
        h.add(h2);

        h.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                h.setBackground(new Color(10,15,15,220));
            }
        });

        h.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                h.setBackground(new Color(46,42,43,220));
            }
        });

        JPanel i = new JPanel();
        i.setLayout(null);
        i.setBounds(550,75,200,38);
        i.setBackground(new Color(46,42,43,220));
        add(i);

        JLabel i1 = new JLabel ("Clean Invalid Device");
        i1.setBounds(50,2,200,20);
        i1.setForeground(Color.GRAY);
        i.add(i1);

        JLabel i2 = new JLabel ("34 devices");
        i2.setBounds(50,14,200,20);
        i2.setForeground(Color.YELLOW);
        i.add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("image/cleaner.png")));
        i3.setBounds(10,-55,150,150);
        i.add(i3);



        i.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i.setBackground(new Color(10,15,15,220));
            }
        });


        i.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i.setBackground(new Color(46,42,43,220));
            }
        });



        JPanel j = new JPanel();
        j.setLayout(null);
        j.setBounds(550,130,200,38);
        j.setBackground(new Color(46,42,43,220));
        add(j);

        JLabel j1 = new JLabel ("Fix Network Failure");
        j1.setBounds(50,9,200,20);
        j1.setForeground(Color.GRAY);
        j.add(j1);

        JLabel j2 = new JLabel();
        j2.setIcon(new ImageIcon(getClass().getResource("image/no-wifi.png")));
        j2.setBounds(10,-55,150,150);
        j.add(j2);

        j.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                j.setBackground(new Color(10,15,15,220));
            }
        });

        j.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                j.setBackground(new Color(46,42,43,220));
            }
        });

        JPanel k = new JPanel();
        k.setLayout(null);
        k.setBounds(550,185,200,38);
        k.setBackground(new Color(46,42,43,220));
        add(k);

        JLabel k1 = new JLabel ("Fix Bad Resolution");
        k1.setBounds(50,9,200,20);
        k1.setForeground(Color.GRAY);
        k.add(k1);

        JLabel k2 = new JLabel();
        k2.setIcon(new ImageIcon(getClass().getResource("image/clipart.png")));
        k2.setBounds(10,-55,150,150);
        k.add(k2);

        k.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                k.setBackground(new Color(10,15,15,220));
            }
        });

        k.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                k.setBackground(new Color(46,42,43,220));
            }
        });

        JLabel l1 = new JLabel();
        l1.setIcon(new ImageIcon(getClass().getResource("image/main-menu.png")));
        l1.setBounds(15,0,150,150);
        a.add(l1);

        JLabel l2 = new JLabel();
        l2.setIcon(new ImageIcon(getClass().getResource("image/Logo.png")));
        l2.setBounds(10,120,150,150);
        a.add(l2);

        JLabel l3 = new JLabel();
        l3.setIcon(new ImageIcon(getClass().getResource("image/shuttle.png")));
        l3.setBounds(10,180,150,150);
        a.add(l3);

        JLabel l4 = new JLabel();
        l4.setIcon(new ImageIcon(getClass().getResource("image/computer.png")));
        l4.setBounds(10,240,150,150);
        a.add(l4);

        JLabel l5 = new JLabel();
        l5.setIcon(new ImageIcon(getClass().getResource("image/dashboard.png")));
        l5.setBounds(10,300,150,150);
        a.add(l5);

        setSize(800,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(50,50,50,250));
        setVisible(true);

    }
    public static void main(String[] args) {
        TurboBOOST df = new TurboBOOST();

        df.addMouseListener(new MouseListener(){
            public void mouseReleased(MouseEvent e) {

            }
            public void mousePressed(MouseEvent e) {
                mouseDownScreenCoords = e.getLocationOnScreen();
                mouseDownCompCoords = e.getPoint();
            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
            }
        });
        df.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e) {
            }
            public void mouseDragged(MouseEvent e) {


                Point currCoords = e.getLocationOnScreen();
                df.setLocation(mouseDownScreenCoords.x + (currCoords.x -
                                mouseDownScreenCoords.x) - mouseDownCompCoords.x,
                        mouseDownScreenCoords.y + (currCoords.y -
                                mouseDownScreenCoords.y) - mouseDownCompCoords.y);


            }
        });
    }

}