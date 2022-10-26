package ex1;

import java.awt.event.*; 
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Ventana() {
		// Creación del objeto padre donde colocaremos el resto de objetos.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		// Indicamos Layout Absolute
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Declaración de la clase JButton
		JButton btn = new JButton("Saludar");
		btn.setBounds(165, 147, 90, 25);
		contentPane.add(btn);
		
		// Declaración de la clase JTextField
		textField = new JTextField();
		textField.setBounds(140, 100, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// Declaración de la clase JLabel
		JLabel lbl = new JLabel("Escribe un nombre para saludar");
		lbl.setBounds(120, 54, 206, 20);
		contentPane.add(lbl);
		
		// Hacemos visible la interfaz gráfica
		this.setVisible(true);
		
		// Llamamos a un método para asignar un Listener al JButton
		btnListener(btn);
		
	}
	
	// Asignar un Listener al bot�n para mostrar en un JOptionPane el nombre escrito
	private void btnListener(JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
				JOptionPane.showMessageDialog(null, "Hola "+textField.getText());
	        }  	
		});
	}

}
