package com.data.java;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.data.visao.DrawLines;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.script.jarnan.Jarnan;

@SuppressWarnings("unused")
public class Jframe {

	public static void main(String[] args) {

		Jarnan j = new Jarnan();
		j.setVisible(true);

		// Jframe obj = new Jframe();
		// obj.run();

	}

	public void run() {
		/*
		 * try { Reader reader =
		 * Files.newBufferedReader(Paths.get("C:\\Users\\2025\\Desktop\\notas.csv"));
		 * CSVReader csvReader = new CSVReaderBuilder(reader) .withSkipLines(1)//para o
		 * caso do CSV ter cabeçalho. .build();
		 * 
		 * java.util.List<String[]> linhas = csvReader.readAll(); for (String[] linha :
		 * linhas) for (String coluna : linha) System.out.println(coluna);
		 * 
		 * }
		 * 
		 * catch(IOException e) { e.printStackTrace(); }
		 * 
		 * 
		 * String arquivoCSV = "C:\\Users\\2025\\Desktop\\notas.csv"; BufferedReader br
		 * = null; String linha = ""; String csvDivisor = ","; try {
		 * 
		 * br = new BufferedReader(new FileReader(arquivoCSV)); while ((linha =
		 * br.readLine()) != null) {
		 * 
		 * String[] dados = linha.split(csvDivisor); /* for(String x : dados) {
		 * System.out.println(x); }
		 * 
		 * 
		 * System.out.println(dados[dados.length-1].toString());
		 * 
		 * }
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); } finally { if (br != null) { try { br.close(); }
		 * catch (IOException e) { e.printStackTrace(); } } }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
	}
}
