package atividade14;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Product register and price Adjustment
public class TelaAtividade14 {

	private JFrame frame;
	private JTextField nome1;
	private JTextField preco1;
	private JTextField peso1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade14 window = new TelaAtividade14();
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
	public TelaAtividade14() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Produto 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 72, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(92, 15, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Preço:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(225, 13, 46, 18);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Peso:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(353, 15, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		nome1 = new JTextField();
		nome1.setBounds(133, 14, 86, 20);
		frame.getContentPane().add(nome1);
		nome1.setColumns(10);
		
		preco1 = new JTextField();
		preco1.setBounds(267, 14, 72, 20);
		frame.getContentPane().add(preco1);
		preco1.setColumns(10);
		
		peso1 = new JTextField();
		peso1.setColumns(10);
		peso1.setBounds(389, 14, 62, 20);
		frame.getContentPane().add(peso1);
		
		JButton btnNewButton = new JButton("Preço final");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double apreco1 = Double.parseDouble(preco1.getText());
			JOptionPane.showMessageDialog(null,"Preço normal: "+apreco1);
			if (apreco1<=50) {
				double reajuste = apreco1*20/100;
				double aumento = apreco1 + apreco1*20/100;
				JOptionPane.showMessageDialog(null,"O reajuste do produto "+nome1.getText()+" foi de "+reajuste+"R$ e o preço final é R$"+aumento);
			}
			else if (apreco1>50) {
			 double reajuste = apreco1 * 10/100;
			 double aumento = apreco1 + apreco1*10/100;
			 JOptionPane.showMessageDialog(null,"O reajuste do produto "+nome1.getText()+" foi de "+reajuste+"R$ e o preço final é R$"+aumento);
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(74, 44, 298, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
