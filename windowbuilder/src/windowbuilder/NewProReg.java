package windowbuilder;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JToggleButton;
import javax.swing.JDesktopPane;

public class NewProReg extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public NewProReg() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC2E0\uC0C1\uD488 \uB4F1\uB85D");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(12, 10, 180, 34);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(376, 32, 62, 34);
		add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 77, 426, 194);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uD488\uBC88 :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 1, 213, 48);
		lblNewLabel_2.setBackground(Color.BLUE);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(213, 10, 213, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC0C9\uC0C1 :");
		lblNewLabel_3.setBounds(0, 49, 213, 48);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 58, 213, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC0AC\uC774\uC988 : ");
		lblNewLabel_1.setBounds(0, 97, 213, 48);
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(213, 107, 213, 29);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uD310\uB9E4\uB2E8\uAC00 :");
		lblNewLabel_4.setBounds(0, 145, 213, 48);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(213, 155, 213, 29);
		panel.add(textField_3);
		textField_3.setColumns(10);

	}
}
