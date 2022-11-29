package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class Tela_exit {

	private JFrame frame;

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DESEJA ENCERRAR O PROGRAMA?");
		lblNewLabel.setFont(new Font("Wide Latin", Font.PLAIN, 10));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(42, 27, 356, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton sim = new JButton("YES");
		sim.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		sim.setForeground(new Color(255, 255, 255));
		sim.setBackground(new Color(0, 0, 0));
		sim.setBounds(63, 150, 89, 23);
		frame.getContentPane().add(sim);
		
		JButton nao = new JButton("NO");
		nao.setFont(new Font("Wide Latin", Font.PLAIN, 11));
		nao.setForeground(new Color(255, 255, 255));
		nao.setBackground(new Color(0, 0, 0));
		nao.setBounds(264, 150, 89, 23);
		frame.getContentPane().add(nao);
		
		sim.addActionListener(this::MenuEncaminhaClose);
		nao.addActionListener(this::MenuEncaminhaTela_1);
		
		
		frame.setVisible(true);
	}
	
	public void MenuEncaminhaTela_1(ActionEvent actionEvent) {
		Tela_1 r1 = new Tela_1();
		r1.initialize();
		frame.setVisible(false);

	}
	
	public void MenuEncaminhaClose (ActionEvent actionEvent) {
		System.exit(0);

}
}
