package hibernate_pejm16;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gaurav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Employee employee = entityManager.find(Employee.class, 2);
//		
//		if(employee != null)
//		{
//			entityTransaction.begin();
//			entityManager.remove(employee);
//			entityTransaction.commit();
//			
//		}
//		else
//		{
//			System.out.println("Employee With Given Id Not Found");
//		}
		
		
		
		// Using Scanner Class
		
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		Employee employee = entityManager.find(Employee.class, id);
		
		if(employee != null)
		{
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			
			System.out.println(" "+id+" "+"Remove Sucessfully");
		}
		else
		{
			System.out.println("given"+ " "+ id+" "+ "Not Found");
		}
	}
}
