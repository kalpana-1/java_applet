/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Kalpana
 */
public class FirstApplet extends Applet implements Runnable{
    int x,y; 
   
    public void init(){
        x=0; y=0;                          //x,y initializing
        setBackground(Color.lightGray);
        setSize(1000,500);                 //applet viewer size
        }

    @Override
    public void start() {
        new Thread(this).start();
        }
        
    public void run(){
        while(true){
        x++;                               //increment x value
        try{
        Thread.sleep(10);                  //  moving speed 
        }catch(InterruptedException ie){}
        repaint();
         }
        }

    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.YELLOW); 
        g.fillRect(x+150, y+350, 200, 50);
        g.setColor(Color.BLUE);
        g.drawString("CST", x+225, y+375);
        
        g.setColor(Color.PINK); 
        g.fillOval(x+200, y+50, 80, 80);
        int xPoints[]={x+240,x+170,x+310};
        int yPoints[]={y+130,y+230,y+230};
        g.setColor(Color.BLUE);
        g.fillPolygon(xPoints,yPoints,3);
        
        g.setColor(Color.PINK);
        g.fillRect(x+190, y+230, 15, 70);
        g.fillRect(x+275, y+230, 15, 70);
        g.fillRect(x+212, y+170, 10, 50);
        g.fillRect(x+258, y+170, 10, 50);
        
        g.setColor(Color.BLUE);
        g.fillOval(x+215, y+75, 13, 9);
        g.fillOval(x+257, y+75, 13, 9);
        g.fillRect(x+237, y+90, 5, 12);
        g.fillRect(x+230, y+112, 20, 5);
        
       
        
        
    }
}
