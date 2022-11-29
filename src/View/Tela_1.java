package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class Tela_1 {

	JButton btnDistancias;
	JButton btnPlanetas;
	JButton btnCuriosidades;
	public JFrame frame;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */

	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\ASTRONAUTA.jpeg"));
		lblNewLabel.setBounds(615, -6, 631, 700);
		frame.getContentPane().add(lblNewLabel);

		btnDistancias = new JButton("DISTANCES");
		btnDistancias.setForeground(new Color(255, 255, 255));
		btnDistancias.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		btnDistancias.setBackground(new Color(0, 0, 0));
		btnDistancias.setBounds(222, 107, 268, 62);
		frame.getContentPane().add(btnDistancias);

		JButton btnPlanetas = new JButton("SOLAR SYSTEM");
		btnPlanetas.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		btnPlanetas.setForeground(new Color(255, 255, 255));
		btnPlanetas.setBackground(new Color(0, 0, 0));
		btnPlanetas.setBounds(222, 180, 268, 57);
		frame.getContentPane().add(btnPlanetas);

		JButton btnCuriosidades = new JButton("CURIOSITIES");
		btnCuriosidades.setForeground(new Color(255, 255, 255));
		btnCuriosidades.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		btnCuriosidades.setBackground(SystemColor.desktop);
		btnCuriosidades.setBounds(222, 248, 268, 57);
		frame.getContentPane().add(btnCuriosidades);
		
		JButton btnFavoritos = new JButton("FAVORITES");
		btnFavoritos.setForeground(new Color(255, 255, 255));
		btnFavoritos.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		btnFavoritos.setBackground(SystemColor.desktop);
		btnFavoritos.setBounds(222, 316, 268, 57);
		frame.getContentPane().add(btnFavoritos);

		JLabel lblNewLabel_2 = new JLabel("LET'S KNOW A LITTLE ABOUT SPACE"); //VAMOS CONHECER UM POUCO SOBRE O ESPAÇO?
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD, 27));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(111, 11, 566, 51);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton Gravidade = new JButton("GRAVITY");
		Gravidade.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		Gravidade.setForeground(new Color(255, 255, 255));
		Gravidade.setBackground(new Color(0, 0, 0));
		Gravidade.setBounds(222, 384, 268, 57);
		frame.getContentPane().add(Gravidade);
		
		JButton exit = new JButton("EXIT");
		exit.setForeground(new Color(255, 255, 255));
		exit.setFont(new Font("Wide Latin", Font.PLAIN, 15));
		exit.setBackground(new Color(0, 0, 0));
		exit.setBounds(222, 452, 268, 51);
		frame.getContentPane().add(exit);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\BORBOLETAS.jpeg"));
		lblNewLabel_1.setBounds(29, 52, 648, 577);
		frame.getContentPane().add(lblNewLabel_1);

		
		//APÓS CLICAR NO BOTÃO ELE TE LEVARÁ A OUTRO LOCAL
		btnCuriosidades.addActionListener(this::MenuEncaminhaCuriosidades); 
		btnDistancias.addActionListener(this::MenuEncaminhaDistancias);
		btnPlanetas.addActionListener(this::MenuEncaminhaSistemaSolar);
		btnFavoritos.addActionListener(this::MenuEncaminhaFavoritos);
		Gravidade.addActionListener(this::MenuEncaminhaGravidade);
		exit.addActionListener(this::MenuEncaminhaTela_exit);
		frame.setVisible(true);

	}

		// ESSA FUNÇÃO IRÁ VISUALIZAR SUA CLASSE OU CAMINHO
	public void MenuEncaminhaCuriosidades(ActionEvent actionEvent) {
		Curiosidades c1 = new Curiosidades();
		c1.initialize();

	}


	public void MenuEncaminhaSistemaSolar(ActionEvent actionEvent) {
		SistemaSolar s1 = new SistemaSolar();
		s1.initialize();
	}

	public void MenuEncaminhaDistancias(ActionEvent actionEvent) {
		Distancias d1 = new Distancias();
		d1.initialize();
	}

	public void MenuEncaminhaGravidade(ActionEvent actionEvent) {
		Gravidade g1 = new Gravidade();
		g1.initialize();
	}
	
	public void MenuEncaminhaFavoritos(ActionEvent actionEvent) {
		Tabela f1 = new Tabela();
		f1.initialize();
	}
	
	public void MenuEncaminhaTela_exit(ActionEvent actionEvent) {
		Tela_exit T1 = new Tela_exit();
		T1.initialize();

	}
}
