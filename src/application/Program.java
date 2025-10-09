package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("***TEST 1: seller findByID***");
		Seller sel = sellerDao.findById(4);
		System.out.println(sel);
		
		System.out.println("***TEST 2: seller findByDepartment***");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDeparment(department);
		for (Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("***TEST 3: seller findAll***");
		list = sellerDao.findAll();
		for (Seller obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("***TEST 4: seller insert***");
		Seller newSeller = new Seller(null, "PP", "pp@ff.com", new Date(), 2500.0, department);
		
		sellerDao.insert(newSeller);
		System.out.println("Inserted new seller = " + newSeller.getId());
		
		
		
		
	}

}
