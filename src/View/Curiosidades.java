package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Curiosidades {

	private JFrame frame;

	/**
	 * @wbp.parser.entryPoint
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
		lblNewLabel.setIcon(
				new ImageIcon("C:\\Users\\Erika\\OneDrive\\Área de Trabalho\\teste-joptionpane-teste\\CURIOSIDADES.jpg"));
		lblNewLabel.setBounds(272, 0, 1227, 640);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);

		JTree tree = new JTree();

		tree.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.ABOVE_BOTTOM, null, new Color(128, 0, 0)));
		tree.setForeground(new Color(0, 0, 0));
		tree.setBackground(new Color(0, 0, 0));
		tree.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("FAVORITE") {
			{
				DefaultMutableTreeNode node_1;
				node_1 = new DefaultMutableTreeNode("PLANETS");
				node_1.add(new DefaultMutableTreeNode("MERCURY"));
				node_1.add(new DefaultMutableTreeNode("VENUS"));
				node_1.add(new DefaultMutableTreeNode("EARTH"));
				node_1.add(new DefaultMutableTreeNode("MARS"));
				node_1.add(new DefaultMutableTreeNode("JUPITER"));
				node_1.add(new DefaultMutableTreeNode("SATURN"));
				node_1.add(new DefaultMutableTreeNode("URANUS"));
				node_1.add(new DefaultMutableTreeNode("NEPTUNE"));
				node_1.add(new DefaultMutableTreeNode("SUN"));
				node_1.add(new DefaultMutableTreeNode("MOON"));
				add(node_1);

			}

		}

		));
		tree.setBounds(0, 55, 262, 585);
		frame.getContentPane().add(tree);

		JLabel lblNewLabel_1 = new JLabel("CURIOSIDADES");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(31, 11, 231, 33);
		frame.getContentPane().add(lblNewLabel_1);

		btnRetornar.addActionListener(this::MenuEncaminhaTela_1);

		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String menu = tree.getLastSelectedPathComponent().toString();

				if (menu.equals("MERCURY")) {

					Mercurio M1 = new Mercurio();
					M1.initialize();
					frame.setVisible(false);

				}

				if (menu.equals("VENUS")) {

					Venus V1 = new Venus();
					V1.initialize();
					frame.setVisible(false);

				}

				if (menu.equals("EARTH")) {

					Terra T1 = new Terra();
					T1.initialize();
					frame.setVisible(false);

				}

				if (menu.equals("MARS")) {

					Marte M1 = new Marte();
					M1.initialize();
					frame.setVisible(false);

				}

				if (menu.equals("JUPITER")) {

					Jupiter J1 = new Jupiter();
					J1.initialize();
					frame.setVisible(false);

				}

				if (menu.equals("SATURN")) {

					Saturno S1 = new Saturno();
					S1.initialize();
					frame.setVisible(false);


				}

				if (menu.equals("URANUS")) {

					Urano u1 = new Urano();
					u1.initialize();
					frame.setVisible(false);

				}

				if (menu.equals("NEPTUNE")) {

					Netuno N1 = new Netuno();
					N1.initialize();
					frame.setVisible(false);

				}

				if (menu.equals("SUN")) {

					Sol S1 = new Sol();
					S1.initialize();
					frame.setVisible(false);

				}

				if (menu.equals("MOON")) {

					Lua l1 = new Lua();
					l1.initialize();
					frame.setVisible(false);

				}

				

			}
		});

	}

	public void MenuEncaminhaTela_1(ActionEvent actionEvent) {

		Tela_1 r1 = new Tela_1();
		r1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaLua(ActionEvent actionEvent) {

		Lua l1 = new Lua();
		l1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaSaturno(ActionEvent actionEvent) {

		Saturno S1 = new Saturno();
		S1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaVenus(ActionEvent actionEvent) {

		Venus V1 = new Venus();
		V1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaMarte(ActionEvent actionEvent) {

		Marte M1 = new Marte();
		M1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaUrano(ActionEvent actionEvent) {

		Urano u1 = new Urano();
		u1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaMercurio(ActionEvent actionEvent) {

		Mercurio M1 = new Mercurio();
		M1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaSol(ActionEvent actionEvent) {

		Sol S1 = new Sol();
		S1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaTerra(ActionEvent actionEvent) {

		Terra T1 = new Terra();
		T1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaNetuno(ActionEvent actionEvent) {

		Netuno N1 = new Netuno();
		N1.initialize();
		frame.setVisible(false);

	}

	public void MenuEncaminhaJupiter(ActionEvent actionEvent) {

		Jupiter J1 = new Jupiter();
		J1.initialize();
		frame.setVisible(false);

	}
}
