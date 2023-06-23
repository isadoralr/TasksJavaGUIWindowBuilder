package atividade11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaAtividade11 extends Atividade11{
	Atividade11 conta1 = new Atividade11();
	Atividade11 conta2 = new Atividade11();

	private JFrame frame;
	private JTextField numero1;
	private JTextField tipo1;
	private JTextField titular1;
	private JTextField numero2;
	private JTextField tipo2;
	private JTextField titular2;
	private JTextField saldo1;
	private JTextField saldo2;
	private JTextField deposito2;
	private JTextField saque2;
	private JTextField deposito1;
	private JTextField saque1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade11 window = new TelaAtividade11();
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
	public TelaAtividade11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 328);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnVerificarSaldo = new JButton("Verificar saldo");
		btnVerificarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double anumero1 = Double.parseDouble(numero1.getText());
			double asaldo1 = Double.parseDouble(saldo1.getText());
			double adeposito1= Double.parseDouble(deposito1.getText());
			double asaque1= Double.parseDouble(saque1.getText());
			conta1.setNumeroConta(anumero1);
			conta1.setSaldo(asaldo1);
			conta1.setTipoConta(tipo1.getText());
			conta1.setTitularConta(titular1.getText());
			conta1.setSaldo(conta1.getSaldo()+adeposito1);
			if (asaque1<=conta1.getSaldo()) {
			conta1.setSaldo(conta1.getSaldo()-asaque1);
			}else {
			JOptionPane.showMessageDialog(null,"Saldo insuficiente para sacar.");
			}
			JOptionPane.showMessageDialog(null,"O número da conta é: "+conta1.getNumeroConta()+
			"\n O tipo da conta é: "+conta1.getTipoConta()+
			"\n O titular da conta é: "+conta1.getTitularConta()+
			"\n O saldo é de R$"+conta1.getSaldo());
			}
		});
		btnVerificarSaldo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVerificarSaldo.setBounds(268, 93, 144, 23);
		frame.getContentPane().add(btnVerificarSaldo);
		
		JButton btnVerificarSaldo_1 = new JButton("Verificar saldo");
		btnVerificarSaldo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double anumero2 = Double.parseDouble(numero2.getText());
				double asaldo2 = Double.parseDouble(saldo2.getText());
				double adeposito2= Double.parseDouble(deposito2.getText());
				double asaque2= Double.parseDouble(saque2.getText());
				conta2.setNumeroConta(anumero2);
				conta2.setSaldo(asaldo2);
				conta2.setTipoConta(tipo2.getText());
				conta2.setTitularConta(titular2.getText());
				conta2.setSaldo(conta2.getSaldo()+adeposito2);
				if (asaque2<=conta2.getSaldo()) {
				conta2.setSaldo(conta2.getSaldo()-asaque2);
				}else {
				JOptionPane.showMessageDialog(null,"Saldo insuficiente para sacar.");
				}
				JOptionPane.showMessageDialog(null,"O número da conta é: "+conta2.getNumeroConta()+
					"\n O tipo da conta é: "+conta2.getTipoConta()+
					"\n O titular da conta é: "+conta2.getTitularConta()+
					"\n O saldo é de R$"+conta2.getSaldo());
			}
		});
		btnVerificarSaldo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVerificarSaldo_1.setBounds(268, 240, 144, 23);
		frame.getContentPane().add(btnVerificarSaldo_1);
		
		JLabel lblNewLabel = new JLabel("Conta 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 85, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblConta = new JLabel("Conta 2");
		lblConta.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConta.setBounds(10, 157, 85, 23);
		frame.getContentPane().add(lblConta);
		
		JLabel lblNewLabel_1 = new JLabel("Número:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 45, 55, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(157, 45, 55, 19);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Titular:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(281, 45, 55, 19);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		numero1 = new JTextField();
		numero1.setBounds(64, 45, 85, 20);
		frame.getContentPane().add(numero1);
		numero1.setColumns(10);
		
		tipo1 = new JTextField();
		tipo1.setBounds(190, 46, 78, 20);
		frame.getContentPane().add(tipo1);
		tipo1.setColumns(10);
		
		titular1 = new JTextField();
		titular1.setBounds(326, 46, 86, 20);
		frame.getContentPane().add(titular1);
		titular1.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("Número:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(10, 191, 55, 19);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		numero2 = new JTextField();
		numero2.setColumns(10);
		numero2.setBounds(64, 190, 85, 20);
		frame.getContentPane().add(numero2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tipo:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(157, 189, 55, 19);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		tipo2 = new JTextField();
		tipo2.setColumns(10);
		tipo2.setBounds(190, 191, 78, 20);
		frame.getContentPane().add(tipo2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Titular:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(281, 189, 55, 19);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		titular2 = new JTextField();
		titular2.setColumns(10);
		titular2.setBounds(326, 191, 86, 20);
		frame.getContentPane().add(titular2);
		
		JLabel saldoo = new JLabel("Saldo:");
		saldoo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		saldoo.setBounds(105, 11, 85, 23);
		frame.getContentPane().add(saldoo);
		
		saldo1 = new JTextField();
		saldo1.setBounds(146, 14, 86, 20);
		frame.getContentPane().add(saldo1);
		saldo1.setColumns(10);
		
		JLabel lblSaldo_1 = new JLabel("Saldo:");
		lblSaldo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSaldo_1.setBounds(105, 157, 85, 23);
		frame.getContentPane().add(lblSaldo_1);
		
		saldo2 = new JTextField();
		saldo2.setColumns(10);
		saldo2.setBounds(146, 160, 86, 20);
		frame.getContentPane().add(saldo2);
		
		deposito2 = new JTextField();
		deposito2.setBounds(74, 221, 86, 20);
		frame.getContentPane().add(deposito2);
		deposito2.setColumns(10);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Sacar:");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_2.setBounds(10, 251, 55, 19);
		frame.getContentPane().add(lblNewLabel_1_3_2);
		
		JLabel depositar1 = new JLabel("Depositar:");
		depositar1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		depositar1.setBounds(10, 75, 68, 19);
		frame.getContentPane().add(depositar1);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("Sacar:");
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_4.setBounds(10, 105, 55, 19);
		frame.getContentPane().add(lblNewLabel_1_3_4);
		
		JLabel de = new JLabel("Depositar:");
		de.setFont(new Font("Tahoma", Font.PLAIN, 14));
		de.setBounds(10, 221, 68, 19);
		frame.getContentPane().add(de);
		
		saque2 = new JTextField();
		saque2.setColumns(10);
		saque2.setBounds(49, 252, 86, 20);
		frame.getContentPane().add(saque2);
		
		deposito1 = new JTextField();
		deposito1.setColumns(10);
		deposito1.setBounds(74, 75, 86, 20);
		frame.getContentPane().add(deposito1);
		
		saque1 = new JTextField();
		saque1.setColumns(10);
		saque1.setBounds(49, 106, 86, 20);
		frame.getContentPane().add(saque1);
	}
}
