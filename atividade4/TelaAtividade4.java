package atividade4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Number Comparison tool
public class TelaAtividade4 {

	private JFrame frame;
	private JTextField primeiro;
	private JTextField segundo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade4 window = new TelaAtividade4();
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
	public TelaAtividade4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 287, 147);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insira o primeiro número:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 170, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblInsiraOSegundo = new JLabel("Insira o segundo número:");
		lblInsiraOSegundo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInsiraOSegundo.setBounds(10, 41, 170, 19);
		frame.getContentPane().add(lblInsiraOSegundo);
		
		primeiro = new JTextField();
		primeiro.setBounds(176, 12, 86, 20);
		frame.getContentPane().add(primeiro);
		primeiro.setColumns(10);
		
		segundo = new JTextField();
		segundo.setBounds(179, 42, 86, 20);
		frame.getContentPane().add(segundo);
		segundo.setColumns(10);
		
		JButton btnNewButton = new JButton("MAIOR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double asegundo = Double.parseDouble(segundo.getText());
			double aprimeiro = Double.parseDouble(primeiro.getText());
			if (aprimeiro > asegundo){
			JOptionPane.showMessageDialog(null,"O maior número é: "+aprimeiro);	
			}
			else if(aprimeiro == asegundo) {
			JOptionPane.showMessageDialog(null,"Os números são iguais.");
			}
			else {
			JOptionPane.showMessageDialog(null,"O maior número é: "+asegundo);
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(20, 71, 218, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
