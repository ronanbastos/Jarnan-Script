package com.data.visao;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JPanel;
import com.script.jarnan.*;

public class DrawLines extends JPanel implements ActionListener {
	int myTimerDelay = 1000;
	
	public int valorx =10;
    public boolean pint=true;
    public Graphics2D g2d;
    public Timer tempo;
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent( Graphics g ){
    super.paintComponent(g);
    g2d = (Graphics2D) g.create();
    

    g2d.drawRect(15,205,10000,0);
    g2d.drawRect(15,205,0,-10000000);
 
    g.drawString("1",0,200);
    g.drawString("2",0,190);
    g.drawString("3",0,180);
    g.drawString("4",0,170);
    g.drawString("5",0,160);
    g.drawString("6",0,150);
    g.drawString("7",0,140);
    g.drawString("8",0,130);
    g.drawString("9",0,120);
    g.drawString("10",-2,110);
    g2d.setColor(Color.BLUE);
    g2d.drawRect(20,200,10,-10);
    g2d.drawRect(40,200,10,-20);
    g2d.drawRect(60,200,10,-30);
    g2d.drawRect(80,200,10,-40);
    g2d.drawRect(100,200,10,-50);
    g2d.drawRect(120,200,10,-60);
    g2d.drawRect(140,200,10,-100);
    redraw(160,-70);
    
    }
	
	public void redraw(int x ,int y) {
		
			
		g2d.drawRect(x,200,10,y);
		this.repaint();

			
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}