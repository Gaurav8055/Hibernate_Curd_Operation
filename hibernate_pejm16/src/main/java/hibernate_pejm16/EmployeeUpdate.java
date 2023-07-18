package hibernate_pejm16;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id = sc.nextInt();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gaurav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
//		Employee employee = entityManager.find(Employee.class, 2);
//		if(employee != null)
//		{  
//			employee.setPhone(7894561230l);
//			
//			entityTransaction.begin();
//			entityManager.merge(employee);
//			entityTransaction.commit();
//		}
//		
//		else
//		{
//			System.out.println("Employee Not Found");
//		}
//		
		
		//------------------------------------Scanner---------------------------------------------------//
		Employee employee = entityManager.find(Employee.class, id);
		
		if(employee != null)
		{
		
		System.out.println("1. Name  ,  2. phone , 3. Address , 4 .Email");
		int op = sc.nextInt();
		
		switch (op) {
		case 1:
		
			
			System.out.println("Enter ur Update Name");
			String name = sc.next();
			
       employee.setName(name);
			
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
			break;
			
		case 2:

			System.out.println("Enter ur Update phone");
			long phone = sc.nextLong();
			
       employee.setPhone(phone);
			
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
			break;
			
		case 3:
			

			System.out.println("Enter ur Update Address");
			String address = sc.next();
			
       employee.setAddress(address);
			
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
			break;
			
		case 4:
			
			System.out.println("Enter Your Email");
            String email = sc.next();
            
            employee.setEmail(email);
        	entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			
			break;
			
			
		default:
			
			
			break;
		}
		}
		else
		{
			System.out.println(id+" "+"Not Match");
		}
		
	/////////////////////////////-------------------------update All------------------------------------------------------------//	
		
		//To update
		
//		Employee employee = new Employee();
//		
//		employee.setId(1);
//		employee.setName("Ram");
//		employee.setAddress("vakad");
//		employee.setEmail("g@gmail.com");
//		
//		
//		entityTransaction.begin();
//		entityManager.merge(employee);
//		entityTransaction.commit();
		
		

	}

}
