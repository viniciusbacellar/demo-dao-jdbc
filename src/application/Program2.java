package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		//System.out.println("==== TEST 1: department insert ====");
		//Department department = new Department(null, "Telefone");
		//departmentDao.insert(department);
		//System.out.println("Inserted! New id = " + department.getId());
		
		
		//System.out.println("==== TEST 2: department update ====");
		//department = new Department(6, "D1");
		//departmentDao.update(department);
		//System.out.println("Updated completed!");
		
		//System.out.println("==== TEST 3: department delete ====");
		//System.out.print("Enter id for delete test: ");
		//int id = sc.nextInt();
		//departmentDao.deleteById(id);
		//System.out.println("Success delete!");
		
		
		//System.out.println("==== TEST 4: department findById ====");
		//Department dep = departmentDao.findById(3);
		//System.out.println(dep);
		
		System.out.println("==== TEST 5: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		
		sc.close();
		
	}

}
