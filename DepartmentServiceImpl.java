package com.sbi.dept;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
		DepartmentRepository deptr;
	@Override
	public void fetchAllDepartmentsService() {
		// TODO Auto-generated method stub
		System.out.println("service layer method invoked..");
		List<Department> dept=deptr.getAllDepartments();
		
		System.out.println("Query Fired!!!");
		for (Department department : dept) {
			System.out.println("Department ID: "+department.getDepartmentNumber());
			System.out.println("Department Name: "+department.getDepartmentName());
			System.out.println("Department Location: "+department.getDepartmentLocation());
			System.out.println("---------------------------------");
			
		}
	}

}
