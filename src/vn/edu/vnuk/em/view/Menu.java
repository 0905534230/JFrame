package vn.edu.vnuk.em.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Menu(JFrame application) {
		
		this.setLayout(null);
		
		JButton button = new JButton("Add New Employee");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button.setBounds(0, 0, 147, 150);
		add(button);
		
		JButton button_1 = new JButton("Modify List Employee");
		button_1.setBounds(0, 146, 147, 150);
		add(button_1);
		
		JButton button_2 = new JButton("Update Basic Salary");
		button_2.setBounds(0, 292, 147, 150);
		add(button_2);
		
		JButton button_3 = new JButton("Exit");
		button_3.setBounds(0, 439, 147, 150);
		add(button_3);
		
		

	}
}
