package atividade5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Voting Eligibility Validator
public class TelaAtividade5 {

	private JFrame frmPodeVotar;
	private JTextField nome;
	private JTextField idade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade5 window = new TelaAtividade5();
					window.frmPodeVotar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAtividade5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPodeVotar = new JFrame();
		frmPodeVotar.setTitle("Pode votar?");
		frmPodeVotar.setBounds(100, 100, 165, 160);
		frmPodeVotar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPodeVotar.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 51, 27);
		frmPodeVotar.getContentPane().add(lblNewLabel);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIdade.setBounds(10, 49, 51, 27);
		frmPodeVotar.getContentPane().add(lblIdade);
		
		nome = new JTextField();
		nome.setBounds(55, 16, 86, 20);
		frmPodeVotar.getContentPane().add(nome);
		nome.setColumns(10);
		
		idade = new JTextField();
		idade.setBounds(55, 54, 86, 20);
		frmPodeVotar.getContentPane().add(idade);
		idade.setColumns(10);
		
		JButton btnNewButton = new JButton("Verificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double aidade = Double.parseDouble(idade.getText());
			if (aidade<16) {
				JOptionPane.showMessageDialog(null,nome.getText()+" não pode votar!");
			}
			else {
				JOptionPane.showMessageDialog(null, nome.getText()+" apto para votar!");
			}
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(10, 87, 131, 23);
		frmPodeVotar.getContentPane().add(btnNewButton);
	}

}
