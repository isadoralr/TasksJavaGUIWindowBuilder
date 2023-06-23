package atividade10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Student Performance Analyzer
//Em exame = on probation
//Aprovado = passed the exam
//Reprovado = failed the exam

public class TelaAtividade10 extends Atividade10{

	private JFrame frame;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;
	private JTextField nome;
	private JTextField idade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade10 window = new TelaAtividade10();
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
	public TelaAtividade10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 442, 152);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do aluno:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 103, 17);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPrimeiraNota = new JLabel("Primeira nota:");
		lblPrimeiraNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrimeiraNota.setBounds(10, 39, 85, 17);
		frame.getContentPane().add(lblPrimeiraNota);
		
		JLabel lblSegundaNota = new JLabel("Segunda nota:");
		lblSegundaNota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSegundaNota.setBounds(146, 39, 97, 17);
		frame.getContentPane().add(lblSegundaNota);
		
		JLabel lblTerceiranota = new JLabel("Terceira nota:");
		lblTerceiranota.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTerceiranota.setBounds(286, 39, 85, 17);
		frame.getContentPane().add(lblTerceiranota);
		
		nota1 = new JTextField();
		nota1.setBounds(96, 39, 45, 20);
		frame.getContentPane().add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.setColumns(10);
		nota2.setBounds(237, 39, 45, 20);
		frame.getContentPane().add(nota2);
		
		nota3 = new JTextField();
		nota3.setColumns(10);
		nota3.setBounds(371, 39, 45, 20);
		frame.getContentPane().add(nota3);
		
		nome = new JTextField();
		nome.setBounds(111, 11, 157, 20);
		frame.getContentPane().add(nome);
		nome.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular média");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double n1 = Double.parseDouble(nota1.getText());
			double n2 = Double.parseDouble(nota2.getText());
			double n3 = Double.parseDouble(nota3.getText());
			JOptionPane.showMessageDialog(null,"A média do aluno "+nome.getText()+" é: "+calcularMedia(n1,n2,n3));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 67, 135, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Verificar aprovação");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double n1 = Double.parseDouble(nota1.getText());
			double n2 = Double.parseDouble(nota2.getText());
			double n3 = Double.parseDouble(nota3.getText());
			calcularMedia(n1,n2,n3);
			JOptionPane.showMessageDialog(null,"O aluno "+nome.getText()+" está "+verificarAprovacao());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(218, 67, 198, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblIdadeDoAluno = new JLabel("Idade do aluno:");
		lblIdadeDoAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdadeDoAluno.setBounds(274, 11, 97, 17);
		frame.getContentPane().add(lblIdadeDoAluno);
		
		idade = new JTextField();
		idade.setColumns(10);
		idade.setBounds(371, 11, 45, 20);
		frame.getContentPane().add(idade);
	}

}
