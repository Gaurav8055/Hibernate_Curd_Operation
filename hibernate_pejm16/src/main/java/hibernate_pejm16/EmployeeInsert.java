package hibernate_pejm16;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class EmployeeInsert {

	public static void main(String[] args) {

		Employee employee = new Employee();

//		employee.setId(1);
//		employee.setName("Garry");
//		employee.setAddress("Satara");
//		employee.setEmail("g@gmail.com");
//		employee.setPhone(7820838084l);
		
		//Using Scanner 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		System.out.println("Enter Name");
	String name = sc.next();
		
		System.out.println("Enter Address");
		String address = sc.next();
		
		System.out.println("Enter Gmail");
		String email = sc.next();
		
		System.out.println("Enter Mobile no");
		long phone = sc.nextLong();
		
		
		employee.setId(id);
		employee.setName(name);
		employee.setAddress(address);
		employee.setEmail(email);
		employee.setPhone(phone);
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gaurav");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(employee);

		entityTransaction.commit();
	}

}
