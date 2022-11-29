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

public class Mercurio {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	int distmercurio = 57910*1000;


	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\MERCURIO.png"));
		lblNewLabel.setBounds(944, 101, 468, 682);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PLANETA MERC\u00DARIO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBounds(519, 11, 459, 68);
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
		
	
		
		table = new JTable(dados, colunas);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"PLANET", "MERCURY"},
				{"SURFACE AREA", "74.800.000 km\u00B2"},
				{"MASS", "3,285 \u00D7 10^23 kg (0,055 M\u2295)"},
				{"VOLUME", "6,083\u00D71010 km\u00B3"},
				{"ROTATION PERIOD", "58,646 dias"},
				{"GRAVITY EQUATORIAL", "3,7 m/s\u00B2"},
				{"DISTANCE FROM THE SUN", "58.000.000 km"},
			},
			new String[] {
				"Coluna 1", "Coluna 2"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.setForeground(new Color(0, 64, 128));
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setBackground(new Color(213, 234, 255));
		table.setBounds(49, 237, 584, 112);
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
