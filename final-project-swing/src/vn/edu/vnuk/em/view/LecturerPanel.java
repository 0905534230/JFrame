package vn.edu.vnuk.em.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import vn.edu.vnuk.em.define.Define;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class LecturerPanel extends JPanel {
	private JTextField tbxHometown;
	private JTextField tbxDepartment;
	private JTextField tbxAllowance;
	private JTextField tbxPeriodsInMonth;
	private JTextField tbxSalaryRatio;
	private JTextField tbxYearOfWork;
	private JComboBox<String> cbxQualification;

	/**
	 * Create the panel.
	 */
	public LecturerPanel() {
		setLayout(null);
		
		JLabel lblHometown = new JLabel("Hometown:");
		lblHometown.setBounds(0, 0, 103, 21);
		add(lblHometown);
		
		tbxHometown = new JTextField();
		tbxHometown.setColumns(10);
		tbxHometown.setBounds(168, 0, 217, 26);
		add(tbxHometown);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(0, 40, 103, 21);
		add(lblDepartment);
		
		tbxDepartment = new JTextField();
		tbxDepartment.setColumns(10);
		tbxDepartment.setBounds(168, 38, 217, 26);
		add(tbxDepartment);
		
		JLabel lblQualification = new JLabel("Qualification:");
		lblQualification.setBounds(0, 79, 103, 21);
		add(lblQualification);
		
		cbxQualification = new JComboBox<String>();
		cbxQualification.setBounds(168, 76, 217, 26);
		add(cbxQualification);
		cbxQualification.addItem(Define.QUALIFICATION_OF_BACHELOR);
		cbxQualification.addItem(Define.QUALIFICATION_OF_MASTER);
		cbxQualification.addItem(Define.QUALIFICATION_OF_DOCTOR);
		cbxQualification.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				setAllowanceByQualification(cbxQualification.getSelectedIndex());
			}
		});
		
		JLabel lblAlowance = new JLabel("Allowance:");
		lblAlowance.setBounds(0, 116, 112, 21);
		add(lblAlowance);
		
		tbxAllowance = new JTextField();
		tbxAllowance.setEditable(false);
		tbxAllowance.setColumns(10);
		tbxAllowance.setBounds(168, 114, 217, 26);
		add(tbxAllowance);
		
		JLabel lblPeriodsInMonth = new JLabel("Periods in month:");
		lblPeriodsInMonth.setBounds(0, 154, 133, 21);
		add(lblPeriodsInMonth);
		
		tbxPeriodsInMonth = new JTextField();
		tbxPeriodsInMonth.setColumns(10);
		tbxPeriodsInMonth.setBounds(168, 152, 217, 26);
		add(tbxPeriodsInMonth);
		
		JLabel lblSalaryRatio = new JLabel("Salary ratio:");
		lblSalaryRatio.setBounds(0, 192, 112, 21);
		add(lblSalaryRatio);
		
		tbxSalaryRatio = new JTextField();
		tbxSalaryRatio.setColumns(10);
		tbxSalaryRatio.setBounds(168, 190, 217, 26);
		add(tbxSalaryRatio);
		
		JLabel lblYearOfWork = new JLabel("Year of work:");
		lblYearOfWork.setBounds(0, 230, 112, 21);
		add(lblYearOfWork);
		
		tbxYearOfWork = new JTextField();
		tbxYearOfWork.setColumns(10);
		tbxYearOfWork.setBounds(168, 228, 217, 26);
		add(tbxYearOfWork);
	}
	

	@SuppressWarnings("unused")
	private String getHometown() {
		return this.tbxHometown.getText();
	}

	@SuppressWarnings("unused")
	private void setHometown(String hometown) {
		this.tbxHometown.setText(hometown);
	}

	@SuppressWarnings("unused")
	private String getDepartment() {
		return this.tbxDepartment.getText();
	}

	@SuppressWarnings("unused")
	private void setDepartment(String department) {
		this.tbxDepartment.setText(department);
	}

	@SuppressWarnings("unused")
	private String getAllowance() {
		return this.tbxAllowance.getText();
	}

	@SuppressWarnings("unused")
	private void setAllowance(String allowance) {
		this.tbxAllowance.setText(allowance);
	}

	@SuppressWarnings("unused")
	private String getPeriodsInMonth() {
		return this.tbxPeriodsInMonth.getText();
	}

	@SuppressWarnings("unused")
	private void setPeriodsInMonth(String periodsInMonth) {
		this.tbxPeriodsInMonth.setText(periodsInMonth);
	}

	@SuppressWarnings("unused")
	private String getSalaryRatio() {
		return this.tbxSalaryRatio.getText();
	}

	@SuppressWarnings("unused")
	private void setSalaryRatio(String salaryRatio) {
		this.tbxSalaryRatio.setText(salaryRatio);
	}

	@SuppressWarnings("unused")
	private String getYearOfWork() {
		return this.tbxYearOfWork.getText();
	}

	@SuppressWarnings("unused")
	private void setYearOfWork(String yearOfWork) {
		this.tbxYearOfWork.setText(yearOfWork);
	}

	@SuppressWarnings("unused")
	private int getQualification() {
		return this.cbxQualification.getSelectedIndex();
	}

	@SuppressWarnings("unused")
	private void setQualification(int qualification) {
		setAllowanceByQualification(qualification);
		this.cbxQualification.setSelectedIndex(qualification);
	}
	
	private void setAllowanceByQualification(int qualification) {
		switch (qualification) {
		case Define.TYPE_OF_BACHELOR:
			this.tbxAllowance.setText(String.valueOf(Define.ALLOWANCE_OF_BACHELOR));
			break;

		case Define.TYPE_OF_MASTER:
			this.tbxAllowance.setText(String.valueOf(Define.ALLOWANCE_OF_MASTER));
			break;
			
		case Define.TYPE_OF_DOCTOR:
			this.tbxAllowance.setText(String.valueOf(Define.ALLOWANCE_OF_DOCTOR));
			break;
		}
	}
}
