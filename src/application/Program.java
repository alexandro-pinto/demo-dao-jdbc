package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("========== Test 1: seller findById ==========");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n\n========== Test 2: seller findDepartment ==========");
		Department department = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n========== Test 3: seller findAll ==========");
		List<Seller> list1 = sellerDao.findAll();
		for (Seller obj : list1) {
			System.out.println(obj);
		}
				
		System.out.println("\n\n========== Test 4: seller insert ==========");
		Seller newSeller = new Seller(null, "Giancarlo Pinto", "giancarlo@gmail.com", new Date(), 5000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n\n========== Test 5: seller update ==========");
		seller = sellerDao.findById(1);
		seller.setName("Abobrinha C. Carne");
		sellerDao.update(seller);
		System.out.println("Update Completed!");
		
		
		System.out.println("\n\n========== Test 6: seller Delete ==========");
		System.out.println("Enter id for delete teste: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Complete");
		
		
		sc.close();
	}

}














