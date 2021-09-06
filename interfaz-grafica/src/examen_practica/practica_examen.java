package examen_practica;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class practica_examen extends JFrame{

	

		public practica_examen() {
			
			//establecemos el tamaño de la ventana
			setSize(500,500);
			//LO SIGUIENTE ES PARA QUE CUANDO LE DEMOS A CERRAR LA VENTANA
			//TERMINE EL PROGRAMA
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			//AGREGAMOS UN TITULO A LA VENTANA
			setTitle("buenos dias");
			//ponemos la ventana en el centro o en la posicion que se quiera
			//setLocation(100, 200);
			//setBounds(100, 200, 500, 500);
			
			
			//setLocationRelativeTo al ponerlo en null  lo pone en el centro 
			setLocationRelativeTo(null);
			
			setMinimumSize(new Dimension(200,200));
			
			iniciarComponentes();
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
		
		private void iniciarComponentes() {
			
			//creamos un panel
			JPanel panel=new JPanel();
			
			//panel.setBackground(Color.GREEN);
			this.getContentPane().add(panel);
			
			JLabel etiqueta= new JLabel();
			//etiqueta.setVisible(true);
			
			etiqueta.setText("hola");
			etiqueta.setBounds(10, 10, 20, 30);
			panel.add(etiqueta);
		}
		
	}


