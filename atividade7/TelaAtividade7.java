package atividade7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Same Height Time Estimator
public class TelaAtividade7 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade7 window = new TelaAtividade7();
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
	public TelaAtividade7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 338, 109);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int anos = 1;
			double ze = 0,chico = 1;
			while (ze != chico) {
			ze = (float) (110 + 3 * anos); 
			chico = (float) (150 + 2* anos);
			anos = anos + 1;
				}
			JOptionPane.showMessageDialog(null,"Irá levar "+anos+" anos para Zé ficar maior do que Chico.");
			}
		});
		btnNewButton.setBounds(8, 36, 305, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Quantos anos para Zé ficar maior do que Chico?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(8, 4, 305, 28);
		frame.getContentPane().add(lblNewLabel);
	}

}
