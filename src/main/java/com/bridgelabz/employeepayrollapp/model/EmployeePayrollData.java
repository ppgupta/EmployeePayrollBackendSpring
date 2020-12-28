package com.bridgelabz.employeepayrollapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

@Entity
public @Data class EmployeePayrollData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;

	private String name;

	private long salary;

	private String gender;

	private String startDate;

	private String note;

	private String profilePic;

	@ElementCollection
	// @ManyToMany(name = "employee_department", joinColumns = @JoinColumn(name =
	// "id"))
	private List<String> departments = new ArrayList<>();

	public EmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		this.updateEmployeePayrollData(empPayrollDTO);
	}

	public void updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
		this.name = empPayrollDTO.name;
		this.salary = empPayrollDTO.salary;
		this.gender = empPayrollDTO.gender;
		this.note = empPayrollDTO.note;
		this.startDate = empPayrollDTO.startDate;
		this.profilePic = empPayrollDTO.profilePic;
		this.departments = empPayrollDTO.department;
	}

	public EmployeePayrollData() {
		super();
		// TODO Auto-generated constructor stub
	}

}
