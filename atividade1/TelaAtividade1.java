package atividade1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Predecessor Finder
public class TelaAtividade1 {
	
	private JFrame frame;
	private JTextField txtnumero;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade1 window = new TelaAtividade1();
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
	public TelaAtividade1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 302, 129);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insira o número:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 210, 24);
		frame.getContentPane().add(lblNewLabel);
		
		txtnumero = new JTextField();
		txtnumero.setBounds(152, 15, 112, 20);
		frame.getContentPane().add(txtnumero);
		txtnumero.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Antecessor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double antecessor = Double.parseDouble(txtnumero.getText());
			JOptionPane.showMessageDialog(null,"O antecessor do número inserido é: "+(antecessor-1));
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(20, 56, 204, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
