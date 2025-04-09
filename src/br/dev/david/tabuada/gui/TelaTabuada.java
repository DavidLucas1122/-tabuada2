package br.dev.david.tabuada.gui;

import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JScrollPane scrollTabuada;
	private JList listTabuada;
	
	private void exibirTabuada(){
		
	}
	
	private void limparTabuada(){
		
	}
	public void criarTelaTabuada(){
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(400, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
                                            
		// Vamos criar os componentes da tela
		// Multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(160, 20, 40, 30);
		
		// Min. Multiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mín. multiplicador: ");
		labelMinMultiplicador.setBounds(20, 80, 150, 30);
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(160, 80, 40, 30);
		
		// Max. Multiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Max. multiplicador: ");
		labelMaxMultiplicador.setBounds(20, 140, 150, 30);
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(160, 140, 40, 30);
		
		//Botões
		buttonCalcular = new JButton();
		
		// Obtemos o painel de conteúdo e adicionamos o labelMultiplicando nesse painel
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMinMultiplicador);
		tela.getContentPane().add(labelMaxMultiplicador);
		tela.getContentPane().add(textMultiplicando);
		tela.getContentPane().add(textMinMultiplicador);
		tela.getContentPane().add(textMaxMultiplicador);
		
		// Essa linha deve ser a última linha deste método
		tela.setVisible(true);
	}
}
