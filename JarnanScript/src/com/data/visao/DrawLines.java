package com.data.visao;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JPanel;

import com.opencsv.CSVReader;
import com.script.jarnan.*;

@SuppressWarnings("unused")
public class DrawLines extends JPanel {

	public int valorx = 10;
	public boolean pint = true;
	public Graphics2D g2d;
	public String[] valores = new String[100];

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		// valores();
		super.paintComponent(g);
		g2d = (Graphics2D) g.create();

		g2d.drawOval(100, 470, 10, 10);

		// grafico de 10 até 100
		// base y

		g.drawString("0", -1, 100);
		g.drawString("10", -1, 200);
		g.drawString("20", -1, 190);
		g.drawString("30", -1, 180);
		g.drawString("40", -1, 170);
		g.drawString("50", -1, 160);
		g.drawString("60", -1, 150);
		g.drawString("70", -1, 140);
		g.drawString("80", -1, 130);
		g.drawString("90", -1, 120);
		g.drawString("100", -2, 110);
		g.drawString("110", -2, 100);
		g.drawString("120", -2, 90);
		g.drawString("130", -2, 80);
		g.drawString("140", -2, 70);
		g.drawString("150", -2, 60);
		g.drawString("Dados de 10 até 150", 25, 40);
		// base x
		g.drawString("0", 20, 220);
		g.drawString("1", 40, 220);
		g.drawString("2", 60, 220);
		g.drawString("3", 80, 220);
		g.drawString("4", 100, 220);
		g.drawString("5", 120, 220);
		g.drawString("6", 140, 220);
		g.drawString("7", 160, 220);
		g.drawString("8", 180, 220);
		g.drawString("9", 200, 220);
		g.drawString("10", 220, 220);

		// ____________________________________
		// grafico de 1 até 5
		g.drawString("Dados de media", 25, 290);
		g.drawString("M", 5, 290);
		g.drawString(" Total", 150, 290);
		g.drawString("5", -1, 310);
		g.drawString("5.5", -1, 320);
		g.drawString("5.4", -1, 330);
		g.drawString("5.3", -1, 340);
		g.drawString("5.2", -1, 350);
		g.drawString("5.1", 0, 360);
		g.drawString("4.5", -1, 370);
		g.drawString("4.4", -1, 380);
		g.drawString("4.3", -1, 390);
		g.drawString("4.2", -1, 400);
		g.drawString("4.1", -1, 410);
		g.drawString("4", 0, 420);
		g.drawString("3.5", -1, 430);
		g.drawString("3.4", -1, 440);
		g.drawString("3.3", -1, 450);
		g.drawString("3.2", -1, 460);
		g.drawString("3.1", -2, 470);
		g.drawString("3", 0, 480);
		g.drawString("2.5", -2, 490);
		g.drawString("2.4", -2, 500);
		g.drawString("2.3", -2, 510);
		g.drawString("2.2", -2, 520);
		g.drawString("2.1", -2, 530);
		g.drawString("2", 0, 540);
		g.drawString("1.5", -2, 550);
		g.drawString("1.4", -2, 560);
		g.drawString("1.3", -2, 570);
		g.drawString("1.2", -2, 580);
		g.drawString("1.1", -2, 590);
		g.drawString("1", 0, 600);
		g.drawString("0", 0, 610);

		g.drawString("5", 155, 310);
		g.drawString("5.5", 155, 320);
		g.drawString("5.4", 155, 330);
		g.drawString("5.3", 155, 340);
		g.drawString("5.2", 155, 350);
		g.drawString("5.1", 155, 360);
		g.drawString("4.5", 155, 370);
		g.drawString("4.4", 155, 380);
		g.drawString("4.3", 155, 390);
		g.drawString("4.2", 155, 400);
		g.drawString("4.1", 155, 410);
		g.drawString("4", 155, 420);
		g.drawString("3.5", 155, 430);
		g.drawString("3.4", 155, 440);
		g.drawString("3.3", 155, 450);
		g.drawString("3.2", 155, 460);
		g.drawString("3.1", 155, 470);
		g.drawString("3", 155, 480);
		g.drawString("2.5", 155, 490);
		g.drawString("2.4", 155, 500);
		g.drawString("2.3", 155, 510);
		g.drawString("2.2", 155, 520);
		g.drawString("2.1", 155, 530);
		g.drawString("2", 155, 540);
		g.drawString("1.5", 155, 550);
		g.drawString("1.4", 155, 560);
		g.drawString("1.3", 155, 570);
		g.drawString("1.2", 155, 580);
		g.drawString("1.1", 155, 590);
		g.drawString("1", 155, 600);
		g.drawString("0", 155, 610);

		redrawbarra(20);

		redrawMedia(10 ,10);
	}

	public void redrawbarra(int x) {
		// grafico de 10 até 100
		g2d.setColor(Color.BLUE);

		int x0 = Integer.parseInt(valores[1]);
		int x1 = Integer.parseInt(valores[2]);
		int x2 = Integer.parseInt(valores[3]);
		int x3 = Integer.parseInt(valores[4]);
		int x4 = Integer.parseInt(valores[5]);
		int x5 = Integer.parseInt(valores[6]);
		int x6 = Integer.parseInt(valores[7]);
		int x7 = Integer.parseInt(valores[8]);
		int x8 = Integer.parseInt(valores[9]);
		int x9 = Integer.parseInt(valores[10]);
		int x10 = Integer.parseInt(valores[11]);
		g2d.fillRect(x, 200, 10, -x0);
		g2d.fillRect(40, 200, 10, -x1);
		g2d.fillRect(60, 200, 10, -x2);
		g2d.fillRect(80, 200, 10, -x3);
		g2d.fillRect(100, 200, 10, -x4);
		g2d.fillRect(120, 200, 10, -x5);
		g2d.fillRect(140, 200, 10, -x6);
		g2d.fillRect(160, 200, 10, -x7);
		g2d.fillRect(180, 200, 10, -x8);
		g2d.fillRect(200, 200, 10, -x9);
		g2d.fillRect(220, 200, 10, -x10);

		g2d.setColor(Color.RED);
		g2d.drawRect(0, 200, 1000, 0);
		g2d.drawRect(0, 210, 1000, 0);
		g2d.drawRect(0, 190, 1000, 0);
		g2d.drawRect(0, 180, 1000, 0);
		g2d.drawRect(0, 170, 1000, 0);
		g2d.drawRect(0, 160, 1000, 0);
		g2d.drawRect(0, 150, 1000, 0);
		g2d.drawRect(0, 140, 1000, 0);
		g2d.drawRect(0, 130, 1000, 0);
		g2d.drawRect(0, 120, 1000, 0);
		g2d.drawRect(0, 110, 1000, 0);
		g2d.drawRect(0, 100, 1000, 0);
		g2d.drawRect(0, 90, 1000, 0);
		g2d.drawRect(0, 80, 1000, 0);
		g2d.drawRect(0, 70, 1000, 0);
		g2d.drawRect(0, 60, 1000, 0);
		g2d.drawRect(0, 50, 1000, 0);
		g2d.drawRect(19, 220, 0, -200);

		this.repaint();

	}

	public void redrawMedia(int x, int y) {

		// _______________________________________________
		// grafico de 1.1 até 5.5

		g2d.drawRect(0, 610, 150, 0);
		g2d.drawRect(0, 600, 150, 0);
		g2d.drawRect(0, 590, 150, 0);
		g2d.drawRect(0, 580, 150, 0);
		g2d.drawRect(0, 570, 150, 0);
		g2d.drawRect(0, 560, 150, 0);
		g2d.drawRect(0, 550, 150, 0);
		g2d.drawRect(0, 540, 150, 0);
		g2d.drawRect(0, 530, 150, 0);
		g2d.drawRect(0, 520, 150, 0);
		g2d.drawRect(0, 510, 150, 0);
		g2d.drawRect(0, 500, 150, 0);
		g2d.drawRect(0, 490, 150, 0);
		g2d.drawRect(0, 480, 150, 0);
		g2d.drawRect(0, 470, 150, 0);
		g2d.drawRect(0, 460, 150, 0);
		g2d.drawRect(0, 450, 150, 0);
		g2d.drawRect(0, 440, 150, 0);
		g2d.drawRect(0, 430, 150, 0);
		g2d.drawRect(0, 420, 150, 0);
		g2d.drawRect(0, 410, 150, 0);
		g2d.drawRect(0, 400, 150, 0);
		g2d.drawRect(0, 390, 150, 0);
		g2d.drawRect(0, 380, 150, 0);
		g2d.drawRect(0, 370, 150, 0);
		g2d.drawRect(0, 360, 150, 0);
		g2d.drawRect(0, 350, 150, 0);
		g2d.drawRect(0, 340, 150, 0);
		g2d.drawRect(0, 330, 150, 0);
		g2d.drawRect(0, 320, 150, 0);
		g2d.drawRect(0, 310, 150, 0);
		g2d.drawRect(0, 300, 150, 0);

		// grafico de 1.1 até 5.5
		g2d.setColor(Color.red);
		g2d.drawRect(0, 610, 170, 0);
		g2d.drawRect(0, 600, 170, 0);
		g2d.drawRect(0, 590, 170, 0);
		g2d.drawRect(0, 580, 170, 0);
		g2d.drawRect(0, 570, 170, 0);
		g2d.drawRect(0, 560, 170, 0);
		g2d.drawRect(0, 550, 170, 0);
		g2d.drawRect(0, 540, 170, 0);
		g2d.drawRect(0, 530, 170, 0);
		g2d.drawRect(0, 520, 170, 0);
		g2d.drawRect(0, 510, 170, 0);
		g2d.drawRect(0, 500, 170, 0);
		g2d.drawRect(0, 490, 170, 0);
		g2d.drawRect(0, 480, 170, 0);
		g2d.drawRect(0, 470, 170, 0);
		g2d.drawRect(0, 460, 170, 0);
		g2d.drawRect(0, 450, 170, 0);
		g2d.drawRect(0, 440, 170, 0);
		g2d.drawRect(0, 430, 170, 0);
		g2d.drawRect(0, 420, 170, 0);
		g2d.drawRect(0, 410, 170, 0);
		g2d.drawRect(0, 400, 170, 0);
		g2d.drawRect(0, 390, 170, 0);
		g2d.drawRect(0, 380, 170, 0);
		g2d.drawRect(0, 370, 170, 0);
		g2d.drawRect(0, 360, 170, 0);
		g2d.drawRect(0, 350, 170, 0);
		g2d.drawRect(0, 340, 170, 0);
		g2d.drawRect(0, 330, 170, 0);
		g2d.drawRect(0, 320, 170, 0);
		g2d.drawRect(0, 310, 170, 0);
		g2d.drawRect(0, 300, 170, 0);
		g2d.drawRect(150, 620, 0, -350); /// linha reta
		g2d.drawRect(19, 620, 0, -340);

		g2d.setColor(Color.BLUE);

		g2d.drawOval(x + 20, 440, 10, y);

		this.repaint();

	}

	public void valores(String d) {
		try {
			// csv file containing data
			String strFile = d;
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = 0;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					valores[lineNumber] = nextLine[5];
					// System.out.println("Medias do "+nextLine[0]+":"+nextLine[5]);
					//System.out.println(valores[lineNumber]);
				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}