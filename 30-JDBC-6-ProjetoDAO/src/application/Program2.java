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
		
		System.out.println("\n=== TEST 1: Department Insert  ===");
		Department newDepartment = new Department(null, "Soccer");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new department Id: " +newDepartment.getId() );
		
		System.out.println("\n=== TEST 2: Department Update  ===");
		Department department = departmentDao.findById(7);
		department.setName("Volley");
		departmentDao.update(department);
		System.out.println("Update Completed!");
		
		System.out.println("\n=== TEST 3: Department Delete  ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted Completed!");
		
		System.out.println("\n=== TEST 4: Department findById ===");
		department = departmentDao.findById(6);
		System.out.println(department);
		
		System.out.println("\n=== TEST 5: findAll ===");
		List<Department> listAll = departmentDao.findAll();
		for (Department dep : listAll) {
			System.out.println(dep);
		}
		
		
		sc.close();
	}

}
