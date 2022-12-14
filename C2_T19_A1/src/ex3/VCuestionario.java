package ex3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;

public class VCuestionario extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VCuestionario() {
		// Creación del objeto padre donde colocaremos el resto de objetos.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		// Indicamos Layout Absolute
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Declaración de las clases JRadioButton
		// Importante usar el setActionCommand para sacar el valor de los JRadioButton
		JRadioButton rdbtn = new JRadioButton("Windows");
		rdbtn.setBounds(21, 32, 109, 23);
		contentPane.add(rdbtn);
		rdbtn.setActionCommand("Windows");
		
		JRadioButton rdbtn1 = new JRadioButton("Linux");
		rdbtn1.setBounds(21, 58, 109, 23);
		contentPane.add(rdbtn1);
		rdbtn1.setActionCommand("Linux");
		
		JRadioButton rdbtn2 = new JRadioButton("Mac");
		rdbtn2.setBounds(21, 84, 109, 23);
		contentPane.add(rdbtn2);
		rdbtn2.setActionCommand("Mac");
		
		// Agrupamos los JRadioButton en un mismo ButtonGroup
		// De esta forma el usuario solo puede elegir una de las opciones
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtn);
		bgroup.add(rdbtn1);
		bgroup.add(rdbtn2);
		
		// Declaración de las clases JCheckBox
		JCheckBox cb = new JCheckBox("Programación");
		cb.setBounds(201, 32, 119, 23);
		contentPane.add(cb);
		
		JCheckBox cb1 = new JCheckBox("Diseño Gráfico");
		cb1.setBounds(201, 58, 119, 23);
		contentPane.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Administración");
		cb2.setBounds(201, 84, 119, 23);
		contentPane.add(cb2);
		
		// Declaración de la clase JSlider
		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(21, 152, 200, 26);
		contentPane.add(slider);
		
		// Declaración de las clases JLabel
		JLabel lbl = new JLabel("Sistema Operativo");
		lbl.setBounds(21, 11, 109, 14);
		contentPane.add(lbl);
		
		JLabel lbl1 = new JLabel("Especialidad");
		lbl1.setBounds(201, 11, 74, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Horas dedicadas al ordenador");
		lbl2.setBounds(21, 127, 196, 14);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("  0");
		lbl3.setBounds(20, 179, 15, 14);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("10");
		lbl4.setBounds(206, 179, 15, 14);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel(" 5");
		lbl5.setBounds(115, 179, 15, 14);
		contentPane.add(lbl5);
		
		// Declaración de la clase JButton
		JButton btn = new JButton("Finalizar");
		btn.setBounds(110, 214, 89, 23);
		contentPane.add(btn);
		
		// Hacemos visible la interfaz gráfica
		this.setVisible(true);
		
		// Llamamos a un método para asignar un Listener al JButton
		btnListener(btn, bgroup, cb, cb1, cb2, slider);
	}
	
	// Asignar un Listener al botón para mostrar en un JOptionPane el nombre escrito
		private void btnListener(JButton btn, ButtonGroup bg, JCheckBox cb, JCheckBox cb1, JCheckBox cb2, JSlider sl) {
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){  
					
					JOptionPane.showMessageDialog(null, "Sistema Operativo: "+bg.getSelection().getActionCommand()
							+"\nEspecialidad: "+especialidades(cb, cb1, cb2)
							+"\nHoras Ordenador: " +sl.getValue());
		        }  	
			});
		}
		
		// Concatenamos los CheckBoxs en caso que hayan sido seleccionados 
		private String especialidades(JCheckBox cb, JCheckBox cb1, JCheckBox cb2) {
			String esp = "";
			
			if(cb.isSelected()) {
				esp += cb.getText()+" ";
			}
			if(cb1.isSelected()) {
				esp += cb1.getText()+" ";
			}
			if(cb2.isSelected()) {
				esp += cb2.getText()+" ";
			}
			
			return esp;
		}
}
