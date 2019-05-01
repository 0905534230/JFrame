package vn.edu.vnuk.em.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;

public class ListOfEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListOfEmployee frame = new ListOfEmployee();
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
	public ListOfEmployee() {
		
		 
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
		
		textField = new JTextField();
		textField.setBounds(318, 13, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(203, 20, 77, 21);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNewLabel);
		
		JLabel lblType = new JLabel("TYPE:");
		lblType.setBounds(203, 80, 77, 21);
		contentPane.add(lblType);
		
		JLabel lblFullname = new JLabel("FULL NAME:");
		lblFullname.setBounds(203, 140, 103, 21);
		contentPane.add(lblFullname);
		
		JLabel lblSalaryRatio = new JLabel("YEAR OF BIRTH:");
		lblSalaryRatio.setBounds(203, 200, 103, 21);
		contentPane.add(lblSalaryRatio);
		
		JLabel lblYearOfBirth = new JLabel("HOMETOWN:");
		lblYearOfBirth.setBounds(203, 260, 103, 21);
		contentPane.add(lblYearOfBirth);
		
		JLabel lblDepartment = new JLabel("DEPARTMENT:");
		lblDepartment.setBounds(203, 320, 103, 21);
		contentPane.add(lblDepartment);
		
		JLabel label_5 = new JLabel("SALARY RATIO:");
		label_5.setBounds(203, 380, 103, 21);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("YEAR OF WORK:");
		label_6.setBounds(203, 440, 112, 21);
		contentPane.add(label_6);
		
		JLabel lblFullname_1 = new JLabel("POSITION:");
		lblFullname_1.setBounds(203, 500, 77, 21);
		contentPane.add(lblFullname_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(318, 20, 130, 26);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(318, 137, 130, 26);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(318, 197, 130, 26);
		textField_4.setColumns(10);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(318, 257, 130, 26);
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(318, 317, 130, 26);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(318, 377, 130, 26);
		textField_7.setColumns(10);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(318, 437, 130, 26);
		textField_8.setColumns(10);
		contentPane.add(textField_8);
		
		@SuppressWarnings("rawtypes")
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(318, 77, 130, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(318, 498, 130, 26);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_1 = new JButton("APPLY");
		btnNewButton_1.setBounds(447, 536, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(577, 536, 117, 29);
		contentPane.add(btnDelete);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
