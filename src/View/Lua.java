package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lua {

	private JFrame frame;
	private JTable table;
	private JTable table_1;


	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("SAT\u00C9LITE NATURAL LUA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(500, 11, 462, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\LUA.jpeg"));
		lblNewLabel_1.setBounds(948, 122, 493, 472);
		frame.getContentPane().add(lblNewLabel_1);
		
		Object [][] dados = {
		        {"NOME", "TERRA", "GAIA"},
		        {"ÁREA SUPERFICIE", "x", "x"},
		        {"MASSA", "x", "x"},
		        {"DESCOBRIMENTO", "x", "x"},
		        {"DURAÇÃO DO DIA", "x", "x"},
		        {"GRAVIDADE", "x", "x"},
		        {"TEMPO DE VIAGEM", "x", "x"}
		    };

		    String [] colunas = {"Coluna 1", "Coluna 2", "Coluna 3"};

		{
			
		};
		
		table = new JTable(dados, colunas);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"NATURAL SATELLITE", "MOON"},
				{"SURFACE AREA", "3,793 x 107 km\u00B2"},
				{"MASS", "7,349 x 1022 kg"},
				{"VOLUME", "2,1958 \u00D7 1010 km\u00B3"},
				{"ROTATION PERIOD", " 27 d 7 h 43 min"},
				{"GRAVITY EQUATORIAL", " 1,62 m/s\u00B2"},
				{"DISTANCE FROM THE EARTH", "384.400 km"},
			},
			new String[] {
				"Coluna 1", "Coluna 2"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.setForeground(new Color(0, 64, 128));
		table.setBackground(new Color(213, 234, 255));
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setBounds(65, 256, 541, 112);
		frame.getContentPane().add(table);
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnRetornar = new JButton("RETURN");
		btnRetornar.setForeground(new Color(255, 255, 255));
		btnRetornar.setBackground(new Color(0, 0, 0));
		btnRetornar.setBounds(1410, 617, 89, 23);
		frame.getContentPane().add(btnRetornar);
		
		 frame.setVisible(true);
		 
		 btnRetornar.addActionListener(this::MenuEncaminhaCuriosidades);
			}

			public void MenuEncaminhaCuriosidades(ActionEvent actionEvent) {
				Curiosidades r1 = new Curiosidades();
				r1.initialize();
				frame.setVisible(false);
	}

}
