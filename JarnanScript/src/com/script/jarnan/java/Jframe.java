package com.data.java;

import javax.swing.JFrame;
import com.data.visao.DrawLines;
import com.script.jarnan.Jarnan;

public class Jframe {

	public static void main(String[] args) {
		
		 Jarnan j = new Jarnan();
	       
         j.setVisible(true);
          
		
		DrawLines panel = new DrawLines();
		
	 
	 	JFrame frame= new JFrame("Jarnan DataScience 1.0v");

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( 250, 250 );
        frame.setVisible( true);
        frame.add( panel );
    	frame.setLocation(50,10);
	       
	}

}
