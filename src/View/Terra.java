package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Terra {

	private JFrame frame;
	private JTable table;
	int distterra = 149600*1000;


	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 1515, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("terra");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\TERRA.jpeg"));
		lblNewLabel.setBounds(612, 58, 877, 516);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PLANETA TERRA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(534, 20, 718, 44);
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
					{"PLANET", "EARTH"},
					{"SURFACE AREA", "510 072 000[5][6][4] km²"},
					{"MASS", "5,9736×1024[3] kg"},
					{"VOLUME", "1,08321×1012[3] km³"},
					{"ROTATION PERIOD", "23h 56m 4,100s"},
					{"GRAVITY EQUATORIAL", "	9,780327 m/s²[7]"},
					{"DISTANCE FROM THE SUN", "149.600.000 km"},
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
		table.getColumnModel().getColumn(0).setMinWidth(38);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setBounds(65, 248, 537, 112);
		frame.getContentPane().add(table);
		
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
