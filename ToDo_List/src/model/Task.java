package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Task extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Task() {
		setBackground(new Color(68, 68, 68));
		setLayout(null);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBackground(new Color(68, 68, 68));
		checkBox.setFont(new Font("Arial", Font.PLAIN, 20)); // Cambia el tamaño del texto
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setBounds(0, 36, 60, 21);
		add(checkBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana Pro", Font.BOLD, 20));
		textField.setMargin(new Insets(2, 5, 2, 2));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBorder(null);
		textField.setBackground(new Color(143, 143, 143));
		textField.setBounds(61, 24, 289, 45);
		add(textField);
		textField.setColumns(10);
		
		JButton deleteButton = new JButton("");
		deleteButton.setBackground(new Color(255, 92, 92));
		ImageIcon icon = new ImageIcon(getClass().getResource("/binButton.png"));
        Image img = icon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        deleteButton.setIcon(new ImageIcon(img));
		deleteButton.setBorder(null);
		deleteButton.setBounds(364, 24, 45, 45);
		add(deleteButton);
		
	}
}
