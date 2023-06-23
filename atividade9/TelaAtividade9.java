package atividade9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Calculator for 2 numbers
public class TelaAtividade9 extends Atividade9{

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade9 window = new TelaAtividade9();
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
	public TelaAtividade9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 125);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 73, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("Número 2:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNmero.setBounds(209, 13, 73, 14);
		frame.getContentPane().add(lblNmero);
		
		num1 = new JTextField();
		num1.setBounds(79, 10, 124, 20);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setColumns(10);
		num2.setBounds(281, 10, 124, 20);
		frame.getContentPane().add(num2);
		
		JButton btnNewButton = new JButton("SOMAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double anum1 = Double.parseDouble(num1.getText());
			double anum2 = Double.parseDouble(num2.getText());
			JOptionPane.showMessageDialog(null,"O resultado da soma é: "+somar(anum1,anum2));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 41, 99, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSubtrair = new JButton("SUBTRAIR");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double anum1 = Double.parseDouble(num1.getText());
				double anum2 = Double.parseDouble(num2.getText());
				JOptionPane.showMessageDialog(null,"O resultado da subtração do primeiro número pelo segundo é: "+subtrair(anum1,anum2));
			}
		});
		btnSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSubtrair.setBounds(119, 41, 99, 33);
		frame.getContentPane().add(btnSubtrair);
		
		JButton btnDividir = new JButton("DIVIDIR");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double anum1 = Double.parseDouble(num1.getText());
				double anum2 = Double.parseDouble(num2.getText());
				JOptionPane.showMessageDialog(null,"O resultado da divisão do primeiro número pelo segundo é: "+dividir(anum1,anum2));
			}
		});
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDividir.setBounds(228, 41, 99, 33);
		frame.getContentPane().add(btnDividir);
		
		JButton btnMultiplicar = new JButton("MULTIPLICAR");
		btnMultiplicar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		double anum1 = Double.parseDouble(num1.getText());
		double anum2 = Double.parseDouble(num2.getText());
		JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+multiplicar(anum1,anum2));
			}
		});
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMultiplicar.setBounds(337, 41, 114, 33);
		frame.getContentPane().add(btnMultiplicar);
	}

}
