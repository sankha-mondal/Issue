package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProjectDao {
	
		//	Insert data Operation:-       					[Operation 1]
		public int storeProject(Project1 pp) {
				try {
					EntityManagerFactory emf = Persistence.createEntityManagerFactory("test"); 	//  means 14 15 | here "test" is persistence-unit name
					EntityManager manager = emf.createEntityManager();							// 	means 16 17
					EntityTransaction tran = manager.getTransaction();
					
					tran.begin();						
						manager.persist(pp);		//	save method
					tran.commit();
				return 1;
				}
				catch (Exception e) {
					System.err.println(e);
				}
				return 0;
		}
		
		//	Update data Operation:-     					[Operation 2]
		public int updateProject(Project1 pp) {
				
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test"); 	//  means 14 15 | here "test" is persistence-unit name
			EntityManager manager = emf.createEntityManager();							// 	means 16 17
			EntityTransaction tran = manager.getTransaction();
				
			Project1 p = manager.get(Project1.class, pp.getPid());	
				/* getId() is used because here id is PK, 
				so it is a possibility id is present or Not	*/
				if(p == null) {
					return 0;
				} else {
					tran.begin();
						p.setProject(pp.getProject());
						manager.update(p);
					tran.commit();
					return 1;
				}
		}
		
		//	Delete data Operation:-    						 [Operation 3]	
		public int deleteProject(int id) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test"); 	//  means 14 15 | here "test" is persistence-unit name
			EntityManager manager = emf.createEntityManager();							// 	means 16 17
			EntityTransaction tran = manager.getTransaction();
					
				Project1 p = session.get(Project1.class, id);	
				/* id is used because here we delete data 
					based upon the id*/
				if(p == null) {
					return 0;
				} else {
					tran.begin();
						session.delete(p);
					tran.commit();
					return 1;
				}
			}
		
		
		//	Retrieve one data Operation:-    				[Operation 4]
		public Project1 findEmployeeById(int id) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("test"); 	//  means 14 15 | here "test" is persistence-unit name
			EntityManager manager = emf.createEntityManager();							// 	means 16 17
			EntityTransaction tran = manager.getTransaction();				
						
				Project1 e = session.get(Project1.class, id);	
				/* id is used because here we Retrieve one 
					based upon the id*/
				if(e == null) {
					return null;
				} else {
					return e;
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
