package atividade2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Fuel Consumption Calculator
public class TelaAtividade2 {

	private JFrame frame;
	private JTextField distancia;
	private JTextField combustivel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade2 window = new TelaAtividade2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAtividade2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 334, 173);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Distância percorrida(km):");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 22, 187, 21);
		frame.getContentPane().add(lblNewLabel);
		
		distancia = new JTextField();
		distancia.setBounds(198, 24, 86, 20);
		frame.getContentPane().add(distancia);
		distancia.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Combustível gasto(L):");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 54, 160, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		combustivel = new JTextField();
		combustivel.setBounds(168, 55, 86, 20);
		frame.getContentPane().add(combustivel);
		combustivel.setColumns(10);
		
		JButton btnNewButton = new JButton("Consumo do veículo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double acombustivel = Double.parseDouble(combustivel.getText());
				double adistancia = Double.parseDouble(distancia.getText());
			JOptionPane.showMessageDialog(null,"O consumo do véiculo é de "+(adistancia/acombustivel)+"km/L");
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(30, 86, 254, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
