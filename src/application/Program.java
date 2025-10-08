package application;

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
		
		
		
		
	}

}
