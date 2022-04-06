package com;

public class ProjectService {
	
		//	Insert data Operation:-       					[Operation-1]
		public String storeProject(Project1 pp) {
				ProjectDao pd = new ProjectDao();
				if(pd.storeProject(pp)>0) {
					return "Record inserted successfully";
				} else {
					return "Record didn't store";
				} 
		}
		
		
		//	Logic for Update data:-							[Operation-2]
		public String updateProject(Project1 pp) {
			ProjectDao pd = new ProjectDao();
			if(pd.updateProject(pp)>0) {
				return "Record update successfully";
			} else {
				return "Record not update";
			}
		}
		
		
		//	Logic for Delete data:-							[Operation-3]
		public String deleteProject(int id) {
			ProjectDao pd = new ProjectDao();
			if(pd.deleteProject(id)>0) 
				return "Record deleted successfully";
			 else 
				return "Record is not present";	
		}
		
		
		//	Logic for Retrieve one data by Id:-				[Operation-4]
		public Project1 findEmployeeById(int id) {
			ProjectDao pd = new ProjectDao();
			return pd.findEmployeeById(id);
		}
		
		
		
		
		
		
		
		
}