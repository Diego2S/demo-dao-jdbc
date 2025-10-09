package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao newDp = DaoFactory.creDepartmentDao();
		
		System.out.println("Teste insert::");
		Department dp = new Department(10, "Toys");
		
		newDp.insert(dp);
		System.out.println(dp);
		
		System.out.println("Teste Find by id::");
		System.out.println(newDp.findById(6));
		
		System.out.println("Teste update::");	
		dp = newDp.findById(7);
		dp.setName("Music");
		newDp.update(dp);
		System.out.println("Done!");
		
		System.out.println("Teste Delete::");	
//		newDp.deleteById(6);
		System.out.println("Done!");
		
		
		
		
		System.out.println("Teste FindAll::");	
		
		for (Department d :newDp.findAll()){
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
