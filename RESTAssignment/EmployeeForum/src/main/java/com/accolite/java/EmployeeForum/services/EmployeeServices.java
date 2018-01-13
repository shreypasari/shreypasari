package com.accolite.java.EmployeeForum.services;
import java.util.*;
import com.accolite.EmployeeForum.model.*;

public class EmployeeServices {
	
	static List<Employee> employeeList = new ArrayList<Employee>();
	
	public EmployeeServices() {
		Employee n = new Employee();
		n.setId(1);
		n.setName("Shrey");
		
		employeeList.add(n);
	}


	public List<Employee> getAllEmployees(){
		return employeeList;
	}
	
	public Employee getEmployee(int id){
		
		for(Employee e: employeeList ) {
			if(e.getId() == id) {
				return e;
			}
		}
		
		return null;
	}
	
	public String insert(Employee employee){
		
		int id = employee.getId();
		for(Employee e: employeeList) {
			if(e.getId() == id){
				return "Employee id:" + id + " already Exists! Please try with another ID";
			}
		}
		
		employeeList.add(employee);
		return "Successfully inserted!!;	
	}


	public String update(int id, String name) {
		for(Employee e: employeeList){
			if(e.getId() == id){
				
				e.setName(name);
				return "Updated name successfully";
			}
		}
		
		return "There is no employee with ID:" + id;
	}


	public String delete(int id) {
		
		
		Iterator<Employee> iterator = employeeList.iterator();
		
		while(iterator.hasNext())
		{
		    Employee e = iterator.next();
		    if (e.getId() == id)
		    {
		        iterator.remove();
		        return "Successfully deleted !!;
		    }
		}
		return "No record found with ID: " + id;
	}
	
	
}
