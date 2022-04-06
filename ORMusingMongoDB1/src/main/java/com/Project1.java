package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project1 {
		@Id
		private int pid;
		private String project;
		
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getProject() {
			return project;
		}
		public void setProject(String project) {
			this.project = project;
		}
		
		public Project1() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Project1(int pid, String project) {
			super();
			this.pid = pid;
			this.project = project;
		}
		@Override
		public String toString() {
			return "Project1 [pid=" + pid + ", project=" + project + "]";
		}
		
		
}