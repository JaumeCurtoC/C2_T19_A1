package ex2;

import java.awt.event.*; 
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VPeliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;



	/**
	 * Create the frame.
	 */
	public VPeliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Escribe el título de una pelicula");
		lbl1.setBounds(10, 23, 185, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Peliculas");
		lbl2.setBounds(273, 23, 56, 14);
		contentPane.add(lbl2);
		
		textField = new JTextField();
		textField.setBounds(20, 48, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("Añadir");
		btn.setBounds(42, 79, 89, 23);
		contentPane.add(btn);
		
		JComboBox comboBox = new JComboBox<>();
		comboBox.setBounds(240, 47, 113, 22);
		contentPane.add(comboBox);
		
		this.setVisible(true);
		
		btnListener(btn, comboBox);
		
	}
	
	// Asignar un Listener al botón para añadir la pelicula al JComboBox
		private void btnListener(JButton btn, JComboBox box) {
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){  
					box.addItem(textField.getText());
		        }  	
			});
		}
}
