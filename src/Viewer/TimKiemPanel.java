package Viewer;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class TimKiemPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TimKiemPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 197, 120);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(197, 0, 197, 120);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(393, 0, 185, 120);
		add(panel_2);
		panel_2.setLayout(null);

	}
}
