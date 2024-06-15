import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Formulario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE));
		panel.setBounds(5, 11, 424, 239);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE));
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(36, 11, 350, 30);
		panel.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.BLUE, Color.BLUE, Color.BLUE));
		panel_2.setBounds(36, 52, 350, 157);
		panel.add(panel_2);

		JButton btnNewButton = new JButton("SAIR");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(297, 210, 90, 20);
		panel.add(btnNewButton);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
	}
}
