package atividade6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Blood Donation Eligibility Checker
public class TelaAtividade6 {

	private JFrame frame;
	private JTextField idade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade6 window = new TelaAtividade6();
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
	public TelaAtividade6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 168, 120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Idade:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 43, 19);
		frame.getContentPane().add(lblNewLabel);
		
		idade = new JTextField();
		idade.setBounds(54, 12, 86, 20);
		frame.getContentPane().add(idade);
		idade.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double aidade = Double.parseDouble(idade.getText());
			if (aidade>= 18 & aidade<=67) {
				JOptionPane.showMessageDialog(null,"Pode doar sangue.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Não pode doar sangue.");
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 43, 130, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
