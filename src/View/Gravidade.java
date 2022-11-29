package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;

public class Gravidade {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRetornar = new JButton("RETURN");
		btnRetornar.setForeground(new Color(255, 255, 255));
		btnRetornar.setBackground(new Color(0, 0, 0));
		btnRetornar.setBounds(1410, 617, 89, 23);
		frame.getContentPane().add(btnRetornar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\grafic.png"));
		lblNewLabel.setBounds(0, 535, 237, 118);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\grafic.png"));
		lblNewLabel_1.setBounds(224, 535, 237, 118);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\grafic.png"));
		lblNewLabel_2.setBounds(447, 535, 237, 118);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\grafic.png"));
		lblNewLabel_2_1.setBounds(676, 535, 237, 118);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\grafic.png"));
		lblNewLabel_2_2.setBounds(901, 535, 237, 118);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\grafic.png"));
		lblNewLabel_2_3.setBounds(1130, 535, 237, 118);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\grafic.png"));
		lblNewLabel_3.setBounds(1355, 535, 144, 118);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GRAFICOS GRAVITACIONAIS");
		lblNewLabel_4.setEnabled(false);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(472, 11, 532, 51);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\Grafic-cima.png"));
		lblNewLabel_5.setBounds(0, -18, 237, 132);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\Grafic-cima.png"));
		lblNewLabel_5_1.setBounds(224, -13, 237, 127);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("New label");
		lblNewLabel_5_2.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\Grafic-cima.png"));
		lblNewLabel_5_2.setBounds(1001, 0, 237, 114);
		frame.getContentPane().add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("New label");
		lblNewLabel_5_3.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\Grafic-cima.png"));
		lblNewLabel_5_3.setBounds(1227, 0, 237, 114);
		frame.getContentPane().add(lblNewLabel_5_3);
		
		
		 //BOTÃO DE RETORNAR
		btnRetornar.addActionListener(this::MenuEncaminhaTela_1);
		
		 //LOCALIZAR A CLASSE
		frame.setVisible(true);
		
	}
		
	
		//AÇÃO PARA RETORNAR A TELA 1
		public void MenuEncaminhaTela_1(ActionEvent actionEvent) {

			Tela_1 r1 = new Tela_1();
			r1.initialize();
			frame.setVisible(false);

		}
		
		
	}

