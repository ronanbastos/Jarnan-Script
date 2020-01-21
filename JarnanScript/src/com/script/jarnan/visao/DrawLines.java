package com.data.visao;

import java.awt.BasicStroke;package com.data.visao;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.opencsv.CSVReader;
import com.script.jarnan.*;

@SuppressWarnings("unused")
public class DrawLines extends JPanel {

	public int valorx = 10;
	public boolean pint = true;
	public Graphics2D g2d;
	public String[] valores = new String[500];
	public float  media = 0;
	public int[] ValorMax = new int[500];
	public int[] ValorMin = new int[500];
	public int total = 0;
	public float Pmedia;
	public ArrayList<String> setvalores = new ArrayList<String>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		// valores();
		super.paintComponent(g);
		g2d = (Graphics2D) g.create();

		g2d.drawOval(100, 310, 10, 10);

		// grafico de 10 até 100
		// base y
		Graphics2D g2 = (Graphics2D) g;

		g.drawString("0", -1, 210);
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
		g.drawString("Grafico", 250, 10);
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
		g.drawString("Dados da media", 25, 290);
		g.drawString("Colunas", 150, 290);
		g.drawString(valores[0], 0, 290);
		g.drawString(valores[1], 0, 310);
		g.drawString(valores[2], 0, 320);
		g.drawString(valores[3], 0, 330);
		g.drawString(valores[4], 0, 340);
		g.drawString(valores[5], -1, 350);
		g.drawString(valores[6], 0, 360);
		g.drawString(valores[7], -2, 370);
		g.drawString(valores[8], 0, 380);
		g.drawString(valores[9], -2, 390);
		g.drawString(valores[10], 0, 400);

		g.drawString("1", 155, 310);
		g.drawString("2", 155, 320);
		g.drawString("3", 155, 330);
		g.drawString("4", 155, 340);
		g.drawString("5", 155, 350);
		g.drawString("6", 155, 360);
		g.drawString("7", 155, 370);
		g.drawString("8", 155, 380);
		g.drawString("9", 155, 390);
		g.drawString("10", 155, 400);

		redrawbarra(20);
		redrawMedia(10);
		redrawlinha();
	}

	public void redrawlinha() {

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

		g2d.setColor(Color.BLUE);
		Point2D p1 = new Point2D.Double(320, x10);
		Point2D p2 = new Point2D.Double(340, x9);
		Point2D p3 = new Point2D.Double(360, x8);
		Point2D p4 = new Point2D.Double(380, x7);
		Point2D p5 = new Point2D.Double(400, x6);
		Point2D p6 = new Point2D.Double(420, x5);
		Point2D p7 = new Point2D.Double(440, x4);
		Point2D p8 = new Point2D.Double(460, x3);
		Point2D p9 = new Point2D.Double(480, x2);
		Point2D p10 = new Point2D.Double(500, x1);
		Point2D p11 = new Point2D.Double(510, x0);
		Line2D l1 = new Line2D.Double(p1, p2);
		Line2D l2 = new Line2D.Double(p2, p3);
		Line2D l3 = new Line2D.Double(p3, p4);
		Line2D l4 = new Line2D.Double(p4, p5);
		Line2D l5 = new Line2D.Double(p5, p6);
		Line2D l6 = new Line2D.Double(p6, p7);
		Line2D l7 = new Line2D.Double(p7, p8);
		Line2D l8 = new Line2D.Double(p8, p9);
		Line2D l9 = new Line2D.Double(p9, p10);
		Line2D l10 = new Line2D.Double(p10, p11);
		g2d.draw(l1);
		g2d.draw(l2);
		g2d.draw(l3);
		g2d.draw(l4);
		g2d.draw(l5);
		g2d.draw(l6);
		g2d.draw(l7);
		g2d.draw(l8);
		g2d.draw(l9);
		g2d.draw(l10);

		g2d.setColor(Color.red);
		g2d.drawRect(250, 0, 750, 210);

	}

	public void redrawbarra(int x) {
		// grafico de 10 até 100
		g2d.setColor(Color.BLUE);
		String titulo = valores[0];
		g2d.drawString("Coluna de " + titulo, 25, 25);
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
		g2d.drawRect(0, 200, 250, 0);
		g2d.drawRect(0, 210, 250, 0);
		g2d.drawRect(0, 190, 250, 0);
		g2d.drawRect(0, 180, 250, 0);
		g2d.drawRect(0, 170, 250, 0);
		g2d.drawRect(0, 160, 250, 0);
		g2d.drawRect(0, 150, 250, 0);
		g2d.drawRect(0, 140, 250, 0);
		g2d.drawRect(0, 130, 250, 0);
		g2d.drawRect(0, 120, 250, 0);
		g2d.drawRect(0, 110, 250, 0);
		g2d.drawRect(0, 100, 250, 0);
		g2d.drawRect(0, 90, 250, 0);
		g2d.drawRect(0, 80, 250, 0);
		g2d.drawRect(0, 70, 250, 0);
		g2d.drawRect(0, 60, 250, 0);
		g2d.drawRect(0, 50, 250, 0);
		g2d.drawRect(19, 210, 0, -200);

		this.repaint();

	}

	public void redrawMedia(int y) {

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
		g2d.drawRect(150, 620, 0, -350); // retas
		g2d.drawRect(19, 620, 0, -340);

	}

	public void valores(String d) {
		try {
			// csv file containing data
			String strFile = d;
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					valores[lineNumber] = nextLine[1];
					// System.out.println("Medias do "+nextLine[0]+":"+nextLine[5]);
					// System.out.println(valores[lineNumber]);
				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void valoresColDir(String d, int col) {
		try {
			// csv file containing data
			String strFile = d;
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					valores[lineNumber] = nextLine[col];

				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void media(String d,int col) {
		try {
			// csv file containing data
			String strFile = d;
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = 0;
			float x =0;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					media = Float.parseFloat(nextLine[col]);
					
					 x = x + media;
				}
				Pmedia = (x/lineNumber);
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void Max(int col) {
		try {
			// csv file containing data
			String strFile = JOptionPane.showInputDialog("Digite o nome do diretório ou arquivo:", 3);
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					ValorMax[lineNumber] = Integer.valueOf(nextLine[col]).intValue();

				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void Min(int col) {
		try {
			// csv file containing data
			String strFile = JOptionPane.showInputDialog("Digite o nome do diretório ou arquivo:", 3);
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					ValorMin[lineNumber] = Integer.valueOf(nextLine[col]).intValue();

				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public void Verifical(int num) {
		try {
			// csv file containing data
			String strFile = JOptionPane.showInputDialog("Digite o nome do diretório ou arquivo:", 3);
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

				//	ValorMin[lineNumber] = Integer.valueOf(nextLine[n]).intValue();

				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
}
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.opencsv.CSVReader;
import com.script.jarnan.*;

@SuppressWarnings("unused")
public class DrawLines extends JPanel {

	public int valorx = 10;
	public boolean pint = true;
	public Graphics2D g2d;
	public String[] valores = new String[500];
	public float[] media = new float[500];
	public int[] ValorMax = new int[500];
	public int[] ValorMin = new int[500];
	public int[] total = new int[500];
	public ArrayList<String> setvalores = new ArrayList<String>();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		// valores();
		super.paintComponent(g);
		g2d = (Graphics2D) g.create();

		g2d.drawOval(100, 310, 10, 10);

		// grafico de 10 até 100
		// base y
		Graphics2D g2 = (Graphics2D) g;

		g.drawString("0", -1, 210);
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
		g.drawString("Grafico", 250, 10);
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
		g.drawString(" Total", 150, 290);
		g.drawString("5.5", 0, 310);
		g.drawString("5", 0, 320);
		g.drawString("4.5", 0, 330);
		g.drawString("4", 0, 340);
		g.drawString("3.5", -1, 350);
		g.drawString("3", 0, 360);
		g.drawString("2.5", -2, 370);
		g.drawString("2", 0, 380);
		g.drawString("1.5", -2, 390);
		g.drawString("1", 0, 400);

		g.drawString("1", 155, 310);
		g.drawString("2", 155, 320);
		g.drawString("3", 155, 330);
		g.drawString("4", 155, 340);
		g.drawString("5", 155, 350);
		g.drawString("6", 155, 360);
		g.drawString("7", 155, 370);
		g.drawString("8", 155, 380);
		g.drawString("9", 155, 390);
		g.drawString("10", 155, 400);

		redrawbarra(20);
		redrawMedia(10);
		redrawlinha();
	}

	public void redrawlinha() {

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

		g2d.setColor(Color.BLUE);
		Point2D p1 = new Point2D.Double(320, x10);
		Point2D p2 = new Point2D.Double(340, x9);
		Point2D p3 = new Point2D.Double(360, x8);
		Point2D p4 = new Point2D.Double(380, x7);
		Point2D p5 = new Point2D.Double(400, x6);
		Point2D p6 = new Point2D.Double(420, x5);
		Point2D p7 = new Point2D.Double(440, x4);
		Point2D p8 = new Point2D.Double(460, x3);
		Point2D p9 = new Point2D.Double(480, x2);
		Point2D p10 = new Point2D.Double(500, x1);
		Point2D p11 = new Point2D.Double(510, x0);
		Line2D l1 = new Line2D.Double(p1, p2);
		Line2D l2 = new Line2D.Double(p2, p3);
		Line2D l3 = new Line2D.Double(p3, p4);
		Line2D l4 = new Line2D.Double(p4, p5);
		Line2D l5 = new Line2D.Double(p5, p6);
		Line2D l6 = new Line2D.Double(p6, p7);
		Line2D l7 = new Line2D.Double(p7, p8);
		Line2D l8 = new Line2D.Double(p8, p9);
		Line2D l9 = new Line2D.Double(p9, p10);
		Line2D l10 = new Line2D.Double(p10, p11);
		g2d.draw(l1);
		g2d.draw(l2);
		g2d.draw(l3);
		g2d.draw(l4);
		g2d.draw(l5);
		g2d.draw(l6);
		g2d.draw(l7);
		g2d.draw(l8);
		g2d.draw(l9);
		g2d.draw(l10);

		g2d.setColor(Color.red);
		g2d.drawRect(250, 0, 750, 210);

	}

	public void redrawbarra(int x) {
		// grafico de 10 até 100
		g2d.setColor(Color.BLUE);
		String titulo = valores[0];
		g2d.drawString("Coluna de " + titulo, 25, 25);
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
		g2d.drawRect(0, 200, 250, 0);
		g2d.drawRect(0, 210, 250, 0);
		g2d.drawRect(0, 190, 250, 0);
		g2d.drawRect(0, 180, 250, 0);
		g2d.drawRect(0, 170, 250, 0);
		g2d.drawRect(0, 160, 250, 0);
		g2d.drawRect(0, 150, 250, 0);
		g2d.drawRect(0, 140, 250, 0);
		g2d.drawRect(0, 130, 250, 0);
		g2d.drawRect(0, 120, 250, 0);
		g2d.drawRect(0, 110, 250, 0);
		g2d.drawRect(0, 100, 250, 0);
		g2d.drawRect(0, 90, 250, 0);
		g2d.drawRect(0, 80, 250, 0);
		g2d.drawRect(0, 70, 250, 0);
		g2d.drawRect(0, 60, 250, 0);
		g2d.drawRect(0, 50, 250, 0);
		g2d.drawRect(19, 210, 0, -200);

		this.repaint();

	}

	public void redrawMedia(int y) {

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
		g2d.drawRect(150, 620, 0, -350); // retas
		g2d.drawRect(19, 620, 0, -340);

	}

	public void valores(String d) {
		try {
			// csv file containing data
			String strFile = d;
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					valores[lineNumber] = nextLine[5];
					// System.out.println("Medias do "+nextLine[0]+":"+nextLine[5]);
					// System.out.println(valores[lineNumber]);
				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void valoresColDir(String d, int col) {
		try {
			// csv file containing data
			String strFile = d;
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					valores[lineNumber] = nextLine[col];

				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void media(int col) {
		try {
			// csv file containing data
			String strFile = JOptionPane.showInputDialog("Digite o nome do diretório ou arquivo:", 3);
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					media[lineNumber] = Integer.valueOf(nextLine[col]).intValue();

				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void graficoMax(int col) {
		try {
			// csv file containing data
			String strFile = JOptionPane.showInputDialog("Digite o nome do diretório ou arquivo:", 3);
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					ValorMax[lineNumber] = Integer.valueOf(nextLine[col]).intValue();

				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void graficoMin(int col) {
		try {
			// csv file containing data
			String strFile = JOptionPane.showInputDialog("Digite o nome do diretório ou arquivo:", 3);
			@SuppressWarnings("resource")
			CSVReader reader = new CSVReader(new FileReader(strFile));
			String[] nextLine;
			int lineNumber = -1;
			try {
				while ((nextLine = reader.readNext()) != null) {
					lineNumber++;

					ValorMin[lineNumber] = Integer.valueOf(nextLine[col]).intValue();

				}
			} catch (NumberFormatException | IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
