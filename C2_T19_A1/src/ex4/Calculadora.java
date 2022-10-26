package ex4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtResultado;

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 34, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(125, 34, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(256, 34, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

		JButton btnSuma = new JButton("Suma");
		btnSuma.setBounds(10, 88, 89, 23);
		contentPane.add(btnSuma);

		JButton btnResta = new JButton("Resta");
		btnResta.setBounds(125, 88, 89, 23);
		contentPane.add(btnResta);

		JButton btnMul = new JButton("Multipliación");
		btnMul.setBounds(10, 122, 89, 23);
		contentPane.add(btnMul);

		JButton btnDiv = new JButton("División");
		btnDiv.setBounds(125, 122, 89, 23);
		contentPane.add(btnDiv);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(256, 122, 89, 23);
		contentPane.add(btnSalir);

		JLabel lbl = new JLabel("=");
		lbl.setBounds(231, 37, 15, 14);
		contentPane.add(lbl);

		JLabel lbl1 = new JLabel("Operaciones");
		lbl1.setBounds(10, 63, 86, 14);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("Valores");
		lbl2.setBounds(10, 9, 86, 14);
		contentPane.add(lbl2);

		JLabel lblOp = new JLabel("");
		lblOp.setBounds(106, 37, 15, 14);
		contentPane.add(lblOp);

		this.setVisible(true);

		btnSumar(btnSuma, lblOp);
		btnRestar(btnResta, lblOp);
		btnMultiplicar(btnMul, lblOp);
		btnDividir(btnDiv, lblOp);
		btnSalir(btnSalir);
	}

	// Asignar un Listener al botón de Suma
	private void btnSumar(JButton btn, JLabel op) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v1 = Double.parseDouble(textField.getText());
					double v2 = Double.parseDouble(textField_1.getText());

					op.setText("+");

					txtResultado.setText(String.valueOf(v1 + v2));
				} catch (NullPointerException | NumberFormatException ex1) {
					System.out.println("Inserte un valor correcto");
				}

			}
		});
	}

	// Asignar un Listener al botón de Resta
	private void btnRestar(JButton btn, JLabel op) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v1 = Double.parseDouble(textField.getText());
					double v2 = Double.parseDouble(textField_1.getText());

					op.setText("-");

					txtResultado.setText(String.valueOf(v1 - v2));
				} catch (NullPointerException | NumberFormatException ex1) {
					System.out.println("Inserte un valor correcto");
				}
			}
		});
	}

	// Asignar un Listener al botón de Multiplicación
	private void btnMultiplicar(JButton btn, JLabel op) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v1 = Double.parseDouble(textField.getText());
					double v2 = Double.parseDouble(textField_1.getText());

					op.setText("*");

					txtResultado.setText(String.valueOf(v1 * v2));
				} catch (NullPointerException | NumberFormatException ex1) {
					System.out.println("Inserte un valor correcto");
				}

			}
		});
	}

	// Asignar un Listener al botón de División
	private void btnDividir(JButton btn, JLabel op) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double v1 = Double.parseDouble(textField.getText());
					double v2 = Double.parseDouble(textField_1.getText());

					op.setText("/");

					txtResultado.setText(String.valueOf(v1 / v2));
				} catch (NullPointerException | NumberFormatException ex1) {
					System.out.println("Inserte un valor correcto");
				}

			}
		});
	}

	// Asignar un Listener al botón de Salir
	private void btnSalir(JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
