package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Tabela extends JFrame {
public JFrame frame;
    public JPanel contentPane;
    public JTextField textField;

    
    public void initialize() {
        
        // TODO Auto-generated method stub
    	EventQueue.invokeLater(() -> new Tabela().setVisible(true));
    }
   /* public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Tabela().setVisible(true));
    }*/

    public Tabela() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1515, 679));
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JPanel panelField = new JPanel();
        panelField.setBackground(new Color(0, 0, 0));
        panelField.setBounds(564, 45, 424, 30);
        contentPane.add(panelField);

        textField = new JTextField();
        panelField.add(textField);
        textField.setColumns(20);

        String[] columnNames = new String[] { "PLANETAS FAVORITOS" };

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);
        table.setFont(new Font("Tahoma", Font.PLAIN, 15));
        table.setBackground(new Color(255, 255, 255));
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(500, 164, 564, 310);

        contentPane.add(scroll);

        JPanel panelBtn = new JPanel();
        panelBtn.setBackground(new Color(0, 0, 0));
        panelBtn.setBounds(550, 550, 438, 44);
        contentPane.add(panelBtn);
        panelBtn.setLayout(null);

        JButton jbutton = new JButton("Adicionar");
        jbutton.setForeground(new Color(255, 255, 255));
        jbutton.setBounds(165, 11, 102, 28);
        jbutton.setBackground(new Color(0, 0, 0));
        panelBtn.add(jbutton);
        
        JButton btnRetornar = new JButton("RETURN");
        btnRetornar.setForeground(new Color(255, 255, 255));
        btnRetornar.setBackground(new Color(0, 0, 0));
        btnRetornar.setBounds(1410, 617, 89, 23);
        contentPane.add(btnRetornar);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Erika\\OneDrive\\Documentos\\TABELA_IMG.jpg"));
        lblNewLabel.setBounds(-473, 112, 1972, 640);
        contentPane.add(lblNewLabel);

        jbutton.addActionListener(e -> {

            String text = textField.getText();

            if (text.length() > 0 && text.contains(" ")) {

                String[] values = text.split(" ");

                for (int i = 0; i < values.length; i++) {
                    model.addRow(new Object[] {  values[i]});
                }
            }
        });
        pack();
        
        btnRetornar.addActionListener(this::MenuEncaminhaTela_1);
        
        frame.setVisible(true);
    }
    
    public void MenuEncaminhaTela_1(ActionEvent actionEvent) {

		Tela_1 r1 = new Tela_1();
		r1.initialize();
		frame.setVisible(false);
}
}