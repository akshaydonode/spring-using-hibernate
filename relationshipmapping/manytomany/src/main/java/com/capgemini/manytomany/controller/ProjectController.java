package com.capgemini.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.manytomany.entity.Employee;
import com.capgemini.manytomany.entity.Project;
import com.capgemini.manytomany.service.EmployeeService;

@RestController
public class ProjectController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public void addEmployee() {
		
		Set<Employee> employee1 = new HashSet<Employee>();
		Set<Employee> employee2 = new HashSet<Employee>();
		Set<Employee> employee3 = new HashSet<Employee>();

		Set<Project> project1 = new HashSet<Project>();
		Set<Project> project2 = new HashSet<Project>();
		Set<Project> project3 = new HashSet<Project>();
		
		
		Employee emp1= new Employee(101,"AMD");
		Employee emp2= new Employee(102,"RAM");
		Employee emp3= new Employee(103,"ANU");

		Project prj1 = new Project(1,"JAVA");
		Project prj2 = new Project(2,"CLOUD");
		Project prj3 = new Project(3,".NET");


		employee1.add(emp1);
		employee1.add(emp3);
		employee2.add(emp2);
		employee3.add(emp2);
		
		prj1.setEmployee(employee1);
		prj2.setEmployee(employee2);
		prj3.setEmployee(employee3);
		
		project1.add(prj1);
		project1.add(prj3);
		project2.add(prj1);
		project3.add(prj2);
		
		service.addEmployee(employee1);
		service.addEmployee(employee2);
		service.addEmployee(employee3);

		service.addProject(project1);
		service.addProject(project2);
		service.addProject(project3);
		
	}
	
	@RequestMapping("/new")
	public Set<Employee> getDetails(){
		Set<Employee> employees = new HashSet<Employee>();
		for(int i=101;i<104;i++) {
			employees.add(service.findDetails(i));
		}
		return employees;
	}
}
