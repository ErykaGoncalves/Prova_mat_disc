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

public class Netuno {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	int distnetuno = 4504300*1000;


	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("PLANETA NETUNO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(566, 11, 377, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\NETUNO1.png"));
		lblNewLabel_1.setBounds(850, 92, 558, 647);
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
				{"PLANET", "NEPTUNE"},
				{"SURFACE AREA", "7,618 \u00D7 10^9 km\u00B2"},
				{"MASS", "1,024 \u00D7 10^26 kg (17,15 M\u2295)"},
				{"VOLUME", "6,254\u00D71013 km\u00B3"},
				{"ROTATION PERIOD", "16 h 6 min 36 s"},
				{"GRAVITY EQUATORIAL", "11,15 m/s\u00B2"},
				{"DISTANCE FROM THE SUN", "4,495 \u00D7 10^9 km"},
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
		table.setBounds(57, 232, 539, 112);
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
