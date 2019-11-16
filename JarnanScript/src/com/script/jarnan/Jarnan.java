package com.script.jarnan;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Jarnan extends JFrame{
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
 	public String str;
 	public int strInt;

 	TextArea txt_AreaCodigo = new TextArea(10, 70);
	TextArea txt_AreaResultado = new TextArea(10, 70);
 
	public ArrayList<String> setvariavel = new ArrayList<String>();
	public ArrayList<String> getvariavel = new ArrayList<String>();

	
 public Jarnan() {
	        super("Jarnan Script-1.0v");
	      
	        setSize(400, 300);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			Adiciona();
			setContentPane(painel);
			this.setLocation(50,250);
			
			
			pack();
	        }
	 public void Adiciona() {
			
		 
		 	painel = new JPanel();
			painel.add(txt_AreaCodigo);
		    	b=new JButton("Run");
	       		b.setBounds(100, 150, 150, 100);
			b.setFont(new Font("Verdana", Font.BOLD, 14));
			painel.add(b);
			label=new JLabel("Console:");
	        	painel.add(label);
			painel.add(txt_AreaResultado);
			painel.setVisible(true);
			painel.setFocusable(false);
			painel.setLayout(null);
	     		painel.setBounds(10, 10, 10, 10);
	      		painel.setLayout(new FlowLayout());
	      		b.setLayout(new FlowLayout());	
			txt_AreaCodigo.setFocusable(true);
			txt_AreaCodigo.setCaretPosition(txt_AreaCodigo.getText().length());
			txt_AreaResultado.setEditable(false);
			txt_AreaResultado.setFocusable(true);
			txt_AreaResultado.setCaretPosition(txt_AreaResultado.getText().length());
			
			  b.addActionListener(new ActionListener() {
					

					public void actionPerformed(ActionEvent e) {
						
						
						String str1 ="pr:";
						str = txt_AreaCodigo.getText();
						
						
						
						if (str.contains(str1)) {
							
							
							print();
						
							
						}	
						
						String str2 =":";
						str = txt_AreaCodigo.getText();
						if (str.contains(str2)) {
					
						SetVariavel();
						
							
						}
						String str3 ="clear";
						if (str.contains(str3)) {
							
							
							txt_AreaResultado.setText(" ");
							
							
						}
						String str4="v:";
						
						if(str.contains(str4))
						{
							String[] s = str.split("v:");
							String x = s[1];
							str= x;
							
							GetVariavel();
						}
						
					}	
				});
			  
	 }
public void print()
{
	String[] s = str.split("pr:");
	String x = s[1];
	
	
			
			txt_AreaResultado.setText(x);
		
		
}
		

public void SetVariavel()
{
	
	
	String[] s = str.split(":");
		
			
		
				
	setvariavel.add(s[0]);
	System.out.print(s[0]);
	getvariavel.add(s[1]);
	System.out.print(s[1]);

}
public void GetVariavel()
{
	
	for (int i = 0; i <= 100; i++) {
		
		if(str.trim().equals(setvariavel.get(i).toString()))
			{
		txt_AreaResultado.setText(" ");
		
		txt_AreaResultado.setText(getvariavel.get(i).toString());
	
		System.out.print(getvariavel.get(i).toString());
	
			}else
			{
				
			}
		}
	
}
	 
public static void main(String[] args) 
	{
	        final Jarnan j = new Jarnan();
	       
	                j.setVisible(true);
	           
	      
	}
}
