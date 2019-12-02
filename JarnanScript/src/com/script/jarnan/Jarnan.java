package com.script.jarnan;

import java.awt.Color;
/**
 * @author Ronan Bastos (https://github.com/ronanbastos)
 */
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import com.data.visao.DrawLines;

@SuppressWarnings("unused")
public class Jarnan extends JFrame implements Runnable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	JPanel painel;
	JLabel lblTitulo;
	JButton b;
	JTextField text;
	JScrollPane scroll;
	JLabel label;
	JLabel labeln;
	JLabel labelnn;
	JLabel labelnnn;
	JLabel labelc;
	JLabel labelverificartrue;
	JLabel labelverificarfalse;
	public String str;
	public int[] strInt;
	public Graphics2D g2d;
	TextArea txt_AreaCodigo = new TextArea(10, 70);
	TextArea txt_AreaResultado = new TextArea(10, 70);

	public ArrayList<String> setvariavel = new ArrayList<String>();
	public ArrayList<String> getvariavel = new ArrayList<String>();

	public Jarnan() {
		super("Jarnan Script-1.6v");
		Adiciona();
		setContentPane(painel);
		setLocation(380, 150);
		pack();
	}

	public void Adiciona() {

		ImageIcon imgbut = new ImageIcon("C:\\Java\\DataScience\\Utili\\btn_circled.png");
		ImageIcon imgcons = new ImageIcon("C:\\Java\\DataScience\\Utili\\console.png");
		ImageIcon img_verificafalse = new ImageIcon("C:\\Java\\DataScience\\Utili\\falsecheck.png");
		ImageIcon img_verificatrue = new ImageIcon("C:\\Java\\DataScience\\Utili\\truecheck.png");
		b = new JButton(imgbut);
		painel = new JPanel();
		painel.add(b);
		label = new JLabel(imgcons);
		labelverificartrue = new JLabel(img_verificatrue);
		labelverificarfalse = new JLabel(img_verificafalse);
		labelc = new JLabel("Console");
		labeln = new JLabel("Jarnan Script ()");
		labelnn = new JLabel("}");
		labelnnn = new JLabel("{");
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Config");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		JMenuItem newAction = new JMenuItem("Novo");
		JMenuItem openAction = new JMenuItem("Abrir...");
		JMenuItem saveAction = new JMenuItem("Salva");
		JMenuItem saveasAction = new JMenuItem("Salvar como...");
		JMenuItem helpAction = new JMenuItem("Help");
		JMenuItem sobreAction = new JMenuItem("Sobre");
		JMenuItem ajustaAction = new JMenuItem("Ajustar");
		JMenuItem cutAction = new JMenuItem("Cut");
		JMenuItem copyAction = new JMenuItem("Copy");
		JMenuItem pasteAction = new JMenuItem("Paste");
		fileMenu.add(newAction);
		fileMenu.add(openAction);
		fileMenu.add(saveAction);
		fileMenu.add(saveasAction);
		helpMenu.add(helpAction);
		helpMenu.add(sobreAction);
		helpMenu.add(ajustaAction);
		editMenu.add(cutAction);
		editMenu.add(copyAction);
		editMenu.add(pasteAction);
		painel.add(label);
		painel.add(labelc);
		painel.add(labeln);
		painel.add(labelnn);
		painel.add(labelnnn);
		painel.add(labelverificarfalse);
		painel.add(labelverificartrue);
		labelverificartrue.setVisible(true);
		labelverificarfalse.setVisible(true);
		painel.add(txt_AreaCodigo);
		painel.add(txt_AreaResultado);
		painel.setVisible(true);
		painel.setFocusable(false);
		painel.setLayout(null);
		painel.setBounds(100, 100, 100, 100);
		// painel.setLayout(new FlowLayout());
		// b.setLayout(new FlowLayout());
		label.setBounds(40, 235, 50, 15);
		labeln.setBounds(60, 15, 150, 15);
		labelnn.setBounds(65, 200, 150, 15);
		labelnnn.setBounds(65, 30, 150, 15);
		labelverificartrue.setBounds(593, 383, 15, 15);
		labelverificarfalse.setBounds(593, 383, 15, 15);
		labelc.setBounds(75, 240, 50, 10);
		b.setBounds(630, 120, 20, 20);
		txt_AreaCodigo.setBounds(60, 50, 550, 150);
		txt_AreaResultado.setBounds(60, 250, 550, 150);
		txt_AreaCodigo.setFocusable(true);
		txt_AreaCodigo.setCaretPosition(txt_AreaCodigo.getText().length());
		txt_AreaResultado.setEditable(false);
		txt_AreaResultado.setCaretPosition(txt_AreaResultado.getText().length());
		txt_AreaResultado.setRows(1);
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				labelverificartrue.setVisible(true);

				run();

			}
		});

		newAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Jarnan j = new Jarnan();
				j.setVisible(true);
				j.setSize(685, 455);
				j.setResizable(false);
				j.setLocationRelativeTo(null);
				timeThread();

			}
		});

	}

	public void print() {
		String[] s = str.split("pr: ");

		for (String x1 : s) {

			txt_AreaResultado.setText(txt_AreaResultado.getText() + x1);

		}

		timeThread();

	}

	public void println() {
		String[] s = str.split("prln: ");

		for (String x1 : s) {

			txt_AreaResultado.setText(txt_AreaResultado.getText() + x1);

		}
		txt_AreaResultado.setText(txt_AreaResultado.getText() + "\n");

		timeThread();

	}

	public void SetVariavel() {

		String[] s = str.split(":");

		setvariavel.add(new String(s[0]));
		getvariavel.add(new String(s[1]));
		txt_AreaResultado.setText(" ");
		txt_AreaResultado.setText("Set: " + s[0] + " = " + s[1]);
		timeThread();

	}

	public void GetVariavel() {

		for (int i = 0; i <= setvariavel.size(); i++) {

			if (str.trim().equals(setvariavel.get(i).toString())) {
				txt_AreaResultado.setText(" ");

				txt_AreaResultado.setText("Get: " + str + " = " + getvariavel.get(i).toString());

				break;

			} else {

			}
		}
		timeThread();

	}

	public void AtivaFor() {
		String linha = str;

		String digitos = "";
		char[] letras = linha.toCharArray();
		for (char letra : letras) {
			if (Character.isDigit(letra)) {
				digitos += letra;
			}
		}
		// Integer.parseInt(digitos);
		int x1 = Integer.parseInt(digitos) % 1;

		int x2 = Integer.parseInt(digitos) % 10000;

		txt_AreaResultado.setText(" ");

		for (int i = x1; i <= x2; i++) {

			txt_AreaResultado.setText(txt_AreaResultado.getText() + "For:" + i + "\n");
			timeThread();

		}

	}

	// ___________________________________

	public void run() {

		String str0 = "prln: ";
		str = txt_AreaCodigo.getText();

		if (str.contains(str0)) {

			println();

		}
		String str1 = "pr: ";
		str = txt_AreaCodigo.getText();

		if (str.contains(str1)) {

			print();

		}

		String str2 = ":";
		str = txt_AreaCodigo.getText();
		if (str.contains(str2)) {

			SetVariavel();
			timeThread();

		}
		String str3 = "clear";
		if (str.contains(str3)) {

			txt_AreaResultado.setText(" ");
			timeThread();

		}
		String str4 = "v->";

		if (str.contains(str4)) {
			String[] s = str.split("v->");

			String x = s[1];
			str = x;
			timeThread();
			GetVariavel();

		}
		String str5 = "for";

		if (str.contains(str5)) {

			AtivaFor();

		}
		String str6 = "g -d -> ";

		if (str.contains(str6)) {
			// "C:\\Users\\2025\\Desktop\\notas.csv"
			String[] s = str.split("g -d -> ");
			String dir = s[1];
			System.out.print(dir);

			DrawLines grafico = new DrawLines();
			grafico.valores(dir);
			JFrame frame = new JFrame("Jarnan DataScience 1.0v");
			frame.setVisible(true);
			frame.setSize(250, 250);
			frame.add(grafico);
			frame.setLocation(50, 10);

			File objFile = new File(dir);
			if (objFile.exists()) {
				if (objFile.isFile()) {
					txt_AreaResultado.setText(txt_AreaResultado.getText() + "Set csv :" + dir + "\n");
					txt_AreaResultado.setText(txt_AreaResultado.getText() + "Arquivo " + objFile.getName()
							+ " existe - Tamanho bytes:" + " " + objFile.length() + "\n");

				}
			}
			timeThread();

		}

		String str7 = "g -d -col";

		if (str.contains(str7)) {
			// "C:\\Users\\2025\\Desktop\\notas.csv"

			String[] s = str.split("g -d -col");
			String[] s1 = s[1].split(" ");
			String dir = s1[1];
			String col = s1[2];

			File objFile = new File(dir);
			if (objFile.exists()) {
				if (objFile.isFile()) {
					txt_AreaResultado.setText(txt_AreaResultado.getText() + "Set csv :" + s1[1] + "\n"
							+ "Set valor da coluna:" + s1[2] + "\n");
					txt_AreaResultado.setText(txt_AreaResultado.getText() + "Arquivo " + objFile.getName()
							+ " existe - Tamanho bytes:" + " " + objFile.length() + "\n");

				}
			}

			DrawLines grafico = new DrawLines();
			grafico.valoresColDir(dir, Integer.parseInt(col));
			JFrame frame = new JFrame("Jarnan DataScience 1.0v");
			frame.setVisible(true);
			frame.setSize(250, 250);
			frame.add(grafico);
			frame.setLocation(50, 10);
			timeThread();

		}

		String str8 = "if-> ";

		if (str.contains(str8)) {

			String variavelif1 = null;
			String variavelif2 = null;
			boolean igual = false;

			String[] s = str.split("if-> ");
			String[] s1 = s[1].split(" == ");

			 if(s[1].trim().contains(" == "))
			 {
			 igual =true;
			 }

			String ifvalor1 = s1[0];
			String ifvalor2 = s1[1];
			if(igual == true)
			{
			System.out.println(ifvalor1);
			System.out.println(ifvalor2);
			if (ifvalor1.trim().equals(ifvalor2)) {
				
				txt_AreaResultado.setText(" ");
				txt_AreaResultado.setText("True!");
			}else if((ifvalor1!=ifvalor2)&&(setvariavel.size() <= 0))
			{
			txt_AreaResultado.setText("False!");
			}else{
			
				for (int i = 0; i <= setvariavel.size(); i++) {
					if ((ifvalor1.equals(setvariavel.get(i).toString()))) {

						variavelif1 = getvariavel.get(i).toString();
						System.out.print(variavelif1);
						break;

					}
				}
				for (int j = 0; j <= setvariavel.size(); j++) {
					if ((ifvalor2.equals(setvariavel.get(j).toString()))) {
						variavelif2 = getvariavel.get(j).toString();
						System.out.print(variavelif2);
						break;

					}
				

					}
				
			

				}
			if (variavelif1.trim().equals(variavelif2)) {
				
				txt_AreaResultado.setText("True!");
			}
			else
			{
				txt_AreaResultado.setText("False!");
			}
				
			

			timeThread();
			}
		//_____
	}

		String str9 = "cache";

		if (str.contains(str9)) {

			txt_AreaResultado.setText("in cache : " + setvariavel + " " + getvariavel + " \n");

			timeThread();
		}

		String str10 = "clear cache";

		if (str.contains(str10)) {

			setvariavel.clear();
			getvariavel.clear();

			timeThread();
			}
		}

	public void timeThread() {

		new Thread(new Runnable() {
			@Override
			public void run() {

				labelverificarfalse.setVisible(false);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
				}
				labelverificarfalse.setVisible(true);
			}
		}).start();

	}

}
