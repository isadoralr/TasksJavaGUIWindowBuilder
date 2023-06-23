package atividade8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Calculates exponentiation of numbers
public class TelaAtividade8 extends Atividade8{

	private JFrame frame;
	private JTextField valorx;
	private JTextField valory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade8 window = new TelaAtividade8();
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
	public TelaAtividade8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 196, 170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel adsdasd = new JLabel("Valor de X:");
		adsdasd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		adsdasd.setBounds(10, 11, 78, 14);
		frame.getContentPane().add(adsdasd);
		
		JLabel wjfoisdj = new JLabel("Valor de Y:");
		wjfoisdj.setFont(new Font("Tahoma", Font.PLAIN, 15));
		wjfoisdj.setBounds(10, 48, 78, 14);
		frame.getContentPane().add(wjfoisdj);
		
		valorx = new JTextField();
		valorx.setBounds(83, 8, 87, 20);
		frame.getContentPane().add(valorx);
		valorx.setColumns(10);
		
		valory = new JTextField();
		valory.setBounds(83, 48, 87, 20);
		frame.getContentPane().add(valory);
		valory.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular potenciação");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int valorxa= Integer.parseInt(valorx.getText());
					int valorya = Integer.parseInt(valory.getText());
					JOptionPane.showMessageDialog(null,"O resultado de "+valorxa+" elevado a "+valorya+" é: "+potencia(valorxa,valorya));
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 73, 160, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
