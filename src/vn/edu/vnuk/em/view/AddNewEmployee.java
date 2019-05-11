package vn.edu.vnuk.em.view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import vn.edu.vnuk.em.define.Define;
import vn.edu.vnuk.em.model.Person;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AddNewEmployee extends JFrame {
	private JComboBox<String> cbxtypeOfEmployee;
	private JTextField tbxId;
	private JTextField tbxFullname;
	private JTextField tbxYearOfBirth;
	private WorkerPanel workerPanel;
	private StaffPanel staffPanel;
	private LecturerPanel lecturerPanel;
	
	/**
	 * Create the panel.
	 */
	public AddNewEmployee(Person person, int typeOfAction) {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setBounds(63, 22, 77, 21);
		getContentPane().add(lblNewLabel);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setBounds(63, 60, 77, 21);
		getContentPane().add(lblType);
		
		JLabel lblFullname = new JLabel("Fullname :");
		lblFullname.setBounds(63, 98, 103, 21);
		getContentPane().add(lblFullname);
		
		JLabel lblYearOfBirth = new JLabel("Year of birth :");
		lblYearOfBirth.setBounds(63, 136, 150, 21);
		getContentPane().add(lblYearOfBirth);
		
		tbxId = new JTextField();
		tbxId.setEditable(false);
		tbxId.setBounds(231, 20, 217, 26);
		tbxId.setColumns(10);
		getContentPane().add(tbxId);
		
		tbxFullname = new JTextField();
		tbxFullname.setBounds(231, 96, 217, 26);
		tbxFullname.setColumns(10);
		getContentPane().add(tbxFullname);
		
		tbxYearOfBirth = new JTextField();
		tbxYearOfBirth.setBounds(231, 134, 217, 26);
		tbxYearOfBirth.setColumns(10);
		getContentPane().add(tbxYearOfBirth);
		
		cbxtypeOfEmployee = new JComboBox<String>();		
		cbxtypeOfEmployee.setEditable(false);
		cbxtypeOfEmployee.setBounds(231, 58, 217, 26);
		cbxtypeOfEmployee.addItem(Define.NAME_OF_LECTURER);
		cbxtypeOfEmployee.addItem(Define.NAME_OF_STAFF);
		cbxtypeOfEmployee.addItem(Define.NAME_OF_CASUAL_WORKER);		
		getContentPane().add(cbxtypeOfEmployee);
		// 63 172
		cbxtypeOfEmployee.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				setEmployeePanelVisibleByType(cbxtypeOfEmployee.getSelectedIndex());
			}
		});
		
		workerPanel = new WorkerPanel();
		workerPanel.setBounds(454, 172, 385, 64);
		workerPanel.setVisible(false);
		getContentPane().add(workerPanel);
		
		staffPanel = new StaffPanel();
		staffPanel.setBounds(454, 248, 385, 255);
		staffPanel.setVisible(false);
		getContentPane().add(staffPanel);
		
		lecturerPanel = new LecturerPanel();
		lecturerPanel.setBounds(63, 169, 385, 255);
		lecturerPanel.setVisible(false);
		getContentPane().add(lecturerPanel);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(345, 436, 103, 25);
		getContentPane().add(btnNewButton);
	}
	
	public int getId() {
		return Integer.parseInt(tbxId.getText());
	}
	
	public void setId(int id) {
		this.tbxId.setText(String.valueOf(id));
	}
	
	public String getFullname() {
		return tbxFullname.getText();
	}
	
	public void setFullname(String fullname) {
		this.tbxFullname.setText(fullname);
	}
	
	public String getYearOfBirth() {
		return this.tbxYearOfBirth.getText();
	}
	
	public void setYearOfBirth(String yearOfBirth) {
		this.tbxYearOfBirth.setText(yearOfBirth);
	}
	
	public int getTypeOfEmployee() {
		return cbxtypeOfEmployee.getSelectedIndex();
	}
	
	public void setTypeOfEmployee(int typeOfEmployee) {
		this.cbxtypeOfEmployee.setSelectedIndex(typeOfEmployee);
	}
	
	public void setEmployeePanelVisibleByType(int type) {
		switch(type) {
		case Define.TYPE_OF_LECTURER:
			workerPanel.setVisible(false);
			staffPanel.setVisible(false);
			lecturerPanel.setVisible(true);
			lecturerPanel.setLocation(63, 172);
			break;
			
		case Define.TYPE_OF_STAFF:
			workerPanel.setVisible(false);
			staffPanel.setVisible(true);
			lecturerPanel.setVisible(false);
			staffPanel.setLocation(63, 172);
			break;
		
		case Define.TYPE_OF_CASUAL_WORKER:
			workerPanel.setVisible(true);
			staffPanel.setVisible(false);
			lecturerPanel.setVisible(false);
			workerPanel.setLocation(63, 172);
			break;
		}
	}
}
