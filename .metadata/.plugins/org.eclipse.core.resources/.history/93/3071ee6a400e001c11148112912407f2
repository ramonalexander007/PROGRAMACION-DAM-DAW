package c1;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class ventana extends JFrame{

	
	
	private JComboBox<c1> cmbBox;
	private static final String[] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	private JList<String> lista;
	
	public ventana() {
		this.setTitle("segunda ventana");
		this.setLayout(null);
		this.setSize(600, 400);
		dibujar();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	
	public void dibujar() {
		
		JOptionPane.showInputDialog("introduce un valor");
		
		
		DefaultComboBoxModel<c1> modelo=new DefaultComboBoxModel<c1>();
		modelo.addElement(new c1("juan", 25));
		modelo.addElement(new c1("mikel", 22));
		modelo.addElement(new c1("maria", 18));
		modelo.addElement(new c1("leire", 20));
		cmbBox=new JComboBox<>(modelo);
		cmbBox.setBounds(20, 20, 100, 100);
		this.add(cmbBox);	
		lista=new JList<String>(meses);
		JScrollPane scroll=new JScrollPane(lista);
		
	
		scroll.setBounds(140, 20, 100, 150);
		this.add(scroll);
	}
	
	public static void main(String[]args) {
		ventana vent=new ventana();
		
		
	}
}
