package atividade3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Cigarette Spending Calculator
public class TelaAtividade3 {

	private JFrame frame;
	private JTextField anos;
	private JTextField dia;
	private JTextField preco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade3 window = new TelaAtividade3();
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
	public TelaAtividade3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 365, 188);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número de anos fumando:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 23, 179, 14);
		frame.getContentPane().add(lblNewLabel);
		
		anos = new JTextField();
		anos.setBounds(184, 21, 86, 20);
		frame.getContentPane().add(anos);
		anos.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número de cigarros fumados por dia:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 48, 242, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		dia = new JTextField();
		dia.setBounds(252, 46, 86, 20);
		frame.getContentPane().add(dia);
		dia.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Preço da carteira de cigarros:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 73, 193, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		preco = new JTextField();
		preco.setBounds(203, 74, 86, 20);
		frame.getContentPane().add(preco);
		preco.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULAR DINHEIRO GASTO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double aanos = Double.parseDouble(anos.getText());
			double adia = Double.parseDouble(dia.getText());
			double apreco = Double.parseDouble(preco.getText());
			double total = (aanos * adia * 365)/20 * apreco;
			JOptionPane.showMessageDialog(null,"O total de dinheiro gasto com cigarros é: R$"+total);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(39, 107, 261, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
