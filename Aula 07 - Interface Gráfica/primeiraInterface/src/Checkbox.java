import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Checkbox extends JFrame 
{

	private JPanel contentPane;
	private JTextField textField;
	private JCheckBox boldJcheckBox;
	private JCheckBox italicJcheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try 
				{
					Checkbox frame = new Checkbox();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Checkbox()
	{
		setLayout(new FlowLayout());
		textField = new JTextField("Veja o estilo da fonte mudar", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		boldJcheckBox = new JCheckBox("Negrito");
		italicJcheckBox = new JCheckBox("Italico");
		add(boldJcheckBox);
		add(italicJcheckBox);
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJcheckBox.addItemListener(handler);
		italicJcheckBox.addItemListener(handler);
	}
	
	private class CheckBoxHandler implements ItemListener
	{
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;

		@Override
		public void itemStateChanged(ItemEvent event) 
		{
			if(event.getSource() == boldJcheckBox)
				valBold = boldJcheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
			if(event.getSource() == italicJcheckBox)
				valItalic = italicJcheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
			
			textField.setFont(new Font("Serif", valBold + valItalic, 14));
		}
		
		
	}
}
