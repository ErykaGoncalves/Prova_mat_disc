package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class SistemaSolar {

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

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\PLANETAS SS..png"));
		lblNewLabel.setBounds(0, -11, 553, 407);
		frame.getContentPane().add(lblNewLabel);

		JButton btnRetornar = new JButton("RETURN");
		btnRetornar.setForeground(new Color(255, 255, 255));
		btnRetornar.setBackground(new Color(0, 0, 0));
		btnRetornar.setBounds(1410, 617, 89, 23);
		frame.getContentPane().add(btnRetornar);
		
		JLabel lblNewLabel_1 = new JLabel("SISTEMA SOLAR");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(605, 170, 383, 53);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea TEXTO = new JTextArea();
		TEXTO.setEditable(false);
		TEXTO.setBackground(new Color(0, 0, 0));
		TEXTO.setForeground(new Color(255, 255, 255));
		TEXTO.setFont(new Font("Monospaced", Font.PLAIN, 20));
		TEXTO.setText("O Sistema Solar \u00E9 uma estrutura astron\u00F4mica formada por oito planetas, \r\nal\u00E9m de diversos outros corpos celestes, que orbitam o Sol. Sua origem, \r\nconforme estudos cient\u00EDficos diversos, foi poss\u00EDvel mediante o colapso \r\nde uma nuvem de objetos celestes. O Sistema Solar \u00E9 formado por oito planetas:\r\nMerc\u00FArio, V\u00EAnus, Terra, Marte, J\u00FApiter, Saturno, Urano e Netuno. J\u00E1 Plut\u00E3o,\r\nanteriormente classificado como planeta, foi rebaixado para planeta an\u00E3o. \r\nAl\u00E9m dos planetas, h\u00E1 diversos corpos celestes que fazem parte do nosso \r\nsistema, como os sat\u00E9lites naturais, al\u00E9m de asteroides, cometas e meteoroides.");
		TEXTO.setBounds(301, 398, 945, 242);
		frame.getContentPane().add(TEXTO);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Erika\\Downloads\\QR_CODE.png"));
		lblNewLabel_2.setBounds(1260, 11, 229, 253);
		frame.getContentPane().add(lblNewLabel_2);
		
	

		frame.setVisible(true);

		btnRetornar.addActionListener(this::MenuEncaminhaTela_1);
	}

	public void MenuEncaminhaTela_1(ActionEvent actionEvent) {
		Tela_1 r1 = new Tela_1();
		r1.initialize();
		frame.setVisible(false);
	}
}
