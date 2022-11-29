package View;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Distancias extends JFrame {
	public Distancias() {
		getContentPane().setLayout(null);
	}

	public JFrame frame;
	public JTextField text1;
	public JTextField text2;
	public JLabel result;
	public JLabel quadrantetela;
	public JLabel quadrantetela2;

	
	Jupiter jupiter = new Jupiter();
	Lua lua = new Lua();
	Marte marte = new Marte();
	Mercurio mercurio = new Mercurio();
	Netuno netuno = new Netuno();
	Saturno saturno = new Saturno();
	Sol sol = new Sol();
	Terra terra = new Terra();
	Urano urano = new Urano();
	Venus venus = new Venus();

	public void initialize() {
		
		

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("DISTANCIAS");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(571, 11, 301, 55);
		frame.getContentPane().add(lblNewLabel);

		JButton btnRetornar = new JButton("RETURN");
		btnRetornar.setForeground(new Color(255, 255, 255));
		btnRetornar.setBackground(new Color(0, 0, 0));
		btnRetornar.setBounds(1410, 617, 89, 23);
		frame.getContentPane().add(btnRetornar);

		JButton Calcular = new JButton("CLIQUE AQUI");
		Calcular.setForeground(new Color(255, 255, 255));
		Calcular.setBackground(new Color(0, 0, 0));
		Calcular.setBounds(699, 530, 154, 36);
		frame.getContentPane().add(Calcular);

		text1 = new JTextField();
		text1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text1.setForeground(new Color(255, 255, 255));
		text1.setBackground(new Color(0, 0, 0));
		text1.setBounds(373, 416, 236, 55);
		frame.getContentPane().add(text1);
		text1.setColumns(10);

		text2 = new JTextField();
		text2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text2.setForeground(new Color(255, 255, 255));
		text2.setBackground(new Color(0, 0, 0));
		text2.setColumns(10);
		text2.setBounds(906, 416, 236, 55);
		frame.getContentPane().add(text2);

		JLabel lblNewLabel_4 = new JLabel("PARA");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(744, 427, 64, 23);
		frame.getContentPane().add(lblNewLabel_4);

		// aba que ir� apresentar nosso resultado
		// JLabel Resultado = new JLabel("TESTE");
		result = new JLabel();
		result.setFont(new Font("Tahoma", Font.PLAIN, 35));
		result.setForeground(new Color(255, 255, 255));
		result.setBounds(595, 119, 284, 66);
		getContentPane().add(result);
		frame.getContentPane().add(result);

		quadrantetela = new JLabel();
		quadrantetela.setFont(new Font("Tahoma", Font.PLAIN, 35));
		quadrantetela.setForeground(new Color(255, 255, 255));
		quadrantetela.setBounds(650, 90, 450, 40);
		getContentPane().add(quadrantetela);
		frame.getContentPane().add(quadrantetela);


		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\ORDER PLANETS.png"));
		lblNewLabel_1.setBounds(10, -20, 1499, 686);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setVisible(true);

		Calcular.addActionListener(this::MenuEncaminhaResultado);
		btnRetornar.addActionListener(this::MenuEncaminhaTela_1);
	}

	public void MenuEncaminhaResultado(ActionEvent ActionEvent) {

		int Planeta1 = 0;
		int Planeta2 = 0;
		int[] vet = new int[11];

		Integer quadrante = 0;

		/*
		 * int distterra = 149600*1000; int distnetuno = 4504300*1000; int disturano =
		 * 2870990*1000; int distvenus = 108200*1000; int distmercurio = 57910*1000; int
		 * distsaturno = 1429400*1000; int distmarte = 227940*1000; int distjupiter =
		 * 778330*1000;
		 * 
		 * vet[0] = distterra; vet[1] = distnetuno; vet[2] = disturano; vet[3] =
		 * distvenus; vet[4] = distmercurio; vet[5] = distsaturno; vet[6] = distmarte;
		 * vet[7] = distjupiter;
		 */

		// String var1 = text1.getText().toLowerCase();
		// String var2 = text2.getText().toLowerCase();

		if (text1.getText().equals("terra")) {
			Planeta1 = terra.distterra;

		}
		if (text1.getText().equals("netuno")) {
			Planeta1 = netuno.distnetuno;

		}
		if (text1.getText().equals("urano")) {
			Planeta1 = urano.disturano;

		}
		if (text1.getText().equals("venus")) {
			Planeta1 = venus.distvenus;

		}
		if (text1.getText().equals("mercurio")) {
			Planeta1 = mercurio.distmercurio;

		}
		if (text1.getText().equals("saturno")) {
			Planeta1 = saturno.distsaturno;

		}
		if (text1.getText().equals("marte")) {
			Planeta1 = marte.distmarte;

		}
		if (text1.getText().equals("jupiter")) {
			Planeta1 = jupiter.distjupiter;

		}

		// ---------------------------------------//

		if (text2.getText().equals("netuno")) {
			Planeta2 = netuno.distnetuno;

		}
		if (text2.getText().equals("terra")) {
			Planeta2 = terra.distterra;

		}
		if (text2.getText().equals("urano")) {
			Planeta2 = urano.disturano;

		}
		if (text2.getText().equals("venus")) {
			Planeta2 = venus.distvenus;

		}
		if (text2.getText().equals("mercurio")) {
			Planeta2 = mercurio.distmercurio;

		}
		if (text2.getText().equals("saturno")) {
			Planeta2 = saturno.distsaturno;

		}
		if (text2.getText().equals("marte")) {
			Planeta2 = marte.distmarte;

		}
		if (text2.getText().equals("jupiter")) {
			Planeta2 = jupiter.distjupiter;

		}

		if (Planeta2 <= venus.distvenus) {
			quadrante = 1;
		} else if (Planeta2 <= marte.distmarte) {
			quadrante = 2;
		} else if (Planeta2 <= saturno.distsaturno) {
			quadrante = 3;
		} else if (Planeta2 <= netuno.distnetuno) {
			quadrante = 4;
		}
		
		
		String quadrante2 = quadrante.toString();
		Integer Subtracao = Planeta1 - Planeta2;
		String subtracao = Subtracao.toString();
		result.setText((Math.abs(Subtracao)) + " KM/H");

		quadrantetela.setText("Quadrante: " + quadrante2);

	}

	public void MenuEncaminhaTela_1(ActionEvent actionEvent) {
		Tela_1 r1 = new Tela_1();
		r1.initialize();
		frame.setVisible(false);

	}

	
}
