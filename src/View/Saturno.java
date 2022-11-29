package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Saturno {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	int distsaturno = 1429400*1000;


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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\SATURNO.jpeg"));
		lblNewLabel.setBounds(648, 85, 841, 527);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PLANETA SATURNO");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(506, 11, 468, 68);
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
		table.setBackground(new Color(213, 234, 255));
		table.setForeground(new Color(0, 64, 128));
		table.setModel(new DefaultTableModel(
				new Object[][]  {
					{"PLANET", "SATURN"},
					{"SURFACE AREA", "4,27 × 10^10 km²"},
					{"MASS", "5,6846 × 1026 kg"},
					{"VOLUME", "8,2713 × 1014 km³"},
					{"ROTATION PERIOD", "10h 34min"},
					{"GRAVITY EQUATORIAL", "10,44 m/s²"},
					{"DISTANCE FROM THE SUN", "1,434 × 10^9 km"},
				},
				new String[] {
					"COLUNA1", "COLUNA2"
				}
			)
		{
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
		table.setBounds(59, 248, 502, 112);
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
