package atividade13;
import java.util.ArrayList;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Notepad
public class TelaAtividade13 {

	private JFrame frame;
	private JTextField anotacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtividade13 window = new TelaAtividade13();
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
	public TelaAtividade13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ArrayList<String> listaAnotacoes = new ArrayList<>();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 488, 125);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		anotacao = new JTextField();
		anotacao.setBounds(73, 13, 284, 20);
		frame.getContentPane().add(anotacao);
		anotacao.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Anotação:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 129, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Visualizar anotações");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (listaAnotacoes.size() != 0) {
			JOptionPane.showMessageDialog(null,listaAnotacoes);	
			}else {JOptionPane.showMessageDialog(null,"LISTA VAZIA.");
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 42, 153, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnApagarAnotaes = new JButton("Apagar anotações");
		btnApagarAnotaes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			listaAnotacoes.clear();
			JOptionPane.showMessageDialog(null,"Lista limpa.");
			}
		});
		btnApagarAnotaes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApagarAnotaes.setBounds(173, 42, 153, 25);
		frame.getContentPane().add(btnApagarAnotaes);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSair.setBounds(336, 42, 125, 25);
		frame.getContentPane().add(btnSair);
		
		JButton btnNewButton_1 = new JButton("Adicionar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			listaAnotacoes.add(anotacao.getText());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(360, 11, 102, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
