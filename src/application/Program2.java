package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("========== Test 1: seller findById ==========");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("========== Test 2: department deletebyId ==========");
		//departmentDao.deleteById(6);
		System.out.println("ID Deletado");
		
		System.out.println("========== Test 3: department update ==========");
		departmentDao.update(new Department(4, "Food"));
		System.out.println("Modificado");
		
		System.out.println("========== Test 4: department isert ==========");
		//departmentDao.insert(department = new Department(4, "Cat"));
		//System.out.println("Novo Id: " + department.getId());
		
		
		
	
	}

}
