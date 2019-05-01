package vn.edu.vnuk.em.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ModifyListOfEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyListOfEmployee frame = new ModifyListOfEmployee();
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
	public ModifyListOfEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add New Employee");
		btnNewButton.setBounds(0, 0, 147, 150);
		contentPane.add(btnNewButton);
		
		JButton btnModifyListOf = new JButton("Modify List Employee");
		btnModifyListOf.setBounds(0, 146, 147, 150);
		contentPane.add(btnModifyListOf);
		
		JButton btnUpdateBasicSalary = new JButton("Update Basic Salary");
		btnUpdateBasicSalary.setBounds(0, 292, 147, 150);
		contentPane.add(btnUpdateBasicSalary);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(0, 439, 147, 150);
		contentPane.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(149, 6, 651, 87);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(17, 6, 130, 27);
		panel_2.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.setBounds(410, 43, 130, 29);
		panel_2.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(190, 5, 350, 26);
		panel_2.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(159, 103, 641, 486);
		contentPane.add(table);
		
		JPanel panel = new JPanel();
		
	}
}
