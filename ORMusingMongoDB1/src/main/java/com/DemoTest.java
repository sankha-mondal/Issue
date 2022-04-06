package com;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class DemoTest {

	public static void main(String[] args) {
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test"); 	//  means 14 15 | here "test" is persistence-unit name
		EntityManager manager = emf.createEntityManager();							// 	means 16 17
		EntityTransaction tran = manager.getTransaction();							// 	means 18
		
		//  //  Insert data Statically :- 
		/**
		Project1 pp = new Project1();
		pp.setPid(101);	
		pp.setProject("Java");
				
		tran.begin();						// 	means 19
				manager.persist(pp);		//	save method
		tran.commit();						// 	means 20
		
		System.out.println("Record inserted Successfully");
		*/
		
		
	//  Insert data Dynamically
			Scanner sc = new Scanner(System.in);
			ProjectService ps = new ProjectService();		//  Create EmployeeService Object
			
			int pid; String project; 						//  Project attributes as Column names
			int choice; String con, res;
			
			do {
				System.out.println("Press 1.Add Project:\nPress 2.Update Project:\nPress 3.Delete Project:");
				System.out.println("Press 4.Retrieve Project data By Id:\nPress 5.Retrieve All Project:");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				switch (choice) {
				
			case 1:													// Press 1. Insert Project data:
				System.out.println("Enter pId to insert: ");
				pid = sc.nextInt();
				System.out.println("Enter Project to insert: ");
				project = sc.next();
				Project1 p1 = new Project1(pid, project);
				res = ps.storeProject(p1);
				System.out.println(res);
				break;
			
			case 2:
				System.out.println("Enter pId for update: ");
				pid = sc.nextInt();
				System.out.println("Enter Project to update: ");
				project = sc.next();					
				Project1 p2 = new Project1();						// Press 2. Update Project data:
				p2.setPid(pid);
				p2.setProject(project);
				res = ps.updateProject(p2);
				System.out.println(res);
				break;
				
			case 3: 
				System.out.println("Enter pId to delete data: ");
				pid = sc.nextInt();
				res = ps.deleteProject(pid);						// Press 3. Delete Project data:
				System.out.println(pid);
				System.out.println(res);
				break;
				
				
			case 4: 
				System.out.println("Enter Id to Retrieve one Employee data: ");
				pid = sc.nextInt();
				Project1 ee = ps.findEmployeeById(pid);
				if(ee == null) 										// Press 4. Retrieve one Project By Id:
					System.out.println("Record is not present");
				 else 
					System.out.println(ee);		 // toString()
				break;
				
				
				
				
				
				
		
			default:
					System.out.println("Wrong choice");
					break;
				}
				System.out.println("Do you want to continue? Enter y/n: ");
				con = sc.next();
			} while(con.equals("y"));
			
		
		
		
		
		
		
		
	}

}

