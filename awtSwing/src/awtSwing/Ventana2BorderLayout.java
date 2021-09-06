package awtSwing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana2BorderLayout extends JFrame{

	private JButton bNorth, bSouth, bWest, bEast, bCenter;
	
	
	
	public Ventana2BorderLayout() {
		
		super();
		setLayout(new BorderLayout());
		setResizable(true);
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	
	public static void main(String[]args)throws Exception {
		
		Ventana2BorderLayout vent=new Ventana2BorderLayout();
		vent.setTitle("esta es la mejor ventana");
		
		
		vent.bNorth=new JButton("norte");
		vent.add(vent.bNorth, BorderLayout.NORTH);
		
		vent.bSouth=new JButton("sur");
		vent.add(vent.bSouth, BorderLayout.SOUTH);
		
		vent.bWest=new JButton("oeste");
		vent.add(vent.bWest, BorderLayout.WEST);
		
		vent.bEast=new JButton("este");
		vent.add(vent.bEast, BorderLayout.EAST);
		
		vent.bCenter=new JButton("centro");
		vent.add(vent.bCenter, BorderLayout.CENTER);
			
			
		vent.setVisible(true);	
		
		
		
	}
	
}
