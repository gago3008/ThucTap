package Viewer;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewMain extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ViewMain() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 167, 578, 313);
		add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(576, 314, -576, -309);
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 578, 167);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 578, 47);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 11, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNghiepVu = new JButton("nghiep vu");
		btnNghiepVu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNghiepVu.setBounds(109, 11, 89, 23);
		panel_2.add(btnNghiepVu);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(208, 11, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 47, 578, 120);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

	}
}
