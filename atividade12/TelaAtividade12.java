package atividade12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Car Maintenance Checker
public class TelaAtividade12 extends Atividade12{

	private JFrame frame;
	private JTextField modelo;
	private JTextField cor;
	private JTextField ano;
	private JTextField quilometragem;
	private JTextField ncor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade12 window = new TelaAtividade12();
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
	public TelaAtividade12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 397, 157);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 46, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblModelo.setBounds(95, 11, 54, 23);
		frame.getContentPane().add(lblModelo);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCor.setBounds(246, 11, 38, 23);
		frame.getContentPane().add(lblCor);
		
		JLabel lblQuilometragem = new JLabel("Quilometragem:");
		lblQuilometragem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuilometragem.setBounds(10, 45, 106, 23);
		frame.getContentPane().add(lblQuilometragem);
		
		modelo = new JTextField();
		modelo.setBounds(144, 14, 86, 20);
		frame.getContentPane().add(modelo);
		modelo.setColumns(10);
		
		cor = new JTextField();
		cor.setColumns(10);
		cor.setBounds(274, 14, 97, 20);
		frame.getContentPane().add(cor);
		
		ano = new JTextField();
		ano.setColumns(10);
		ano.setBounds(39, 14, 46, 20);
		frame.getContentPane().add(ano);
		
		quilometragem = new JTextField();
		quilometragem.setColumns(10);
		quilometragem.setBounds(108, 47, 86, 20);
		frame.getContentPane().add(quilometragem);
		
		JButton btnNewButton = new JButton("Verificar Manutenção");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double aquilometragem = Double.parseDouble(quilometragem.getText());
			JOptionPane.showMessageDialog(null,verificarManutencao(aquilometragem));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 84, 184, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exibir cor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"A cor do veículo é: "+ncor.getText());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(235, 84, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		ncor = new JTextField();
		ncor.setBounds(274, 48, 97, 20);
		frame.getContentPane().add(ncor);
		ncor.setColumns(10);
		
		JLabel lblMudarCor = new JLabel("Mudar cor:");
		lblMudarCor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMudarCor.setBounds(204, 45, 106, 23);
		frame.getContentPane().add(lblMudarCor);
	}
}
