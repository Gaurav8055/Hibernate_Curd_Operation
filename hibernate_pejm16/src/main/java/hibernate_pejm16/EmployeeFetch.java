package hibernate_pejm16;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFetch {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your id");
		int id = sc.nextInt();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gaurav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		Employee employee = entityManager.find(Employee.class, 1);
		Employee employee = entityManager.find(Employee.class, id);
		System.out.println(employee);
	}

}
