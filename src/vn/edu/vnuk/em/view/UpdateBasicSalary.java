package vn.edu.vnuk.em.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class UpdateBasicSalary extends JFrame {

	private JPanel contentPane;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateBasicSalary frame = new UpdateBasicSalary();
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
	public UpdateBasicSalary() {
		
		 
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
		textField.setBounds(431, 34, 207, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CURRENT BASIC SALARY:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(200, 27, 187, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("EDIT");
		btnNewButton_1.setBounds(424, 532, 131, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnApply = new JButton("APPLY");
		btnApply.setBounds(632, 532, 131, 40);
		contentPane.add(btnApply);
		
	}
}
