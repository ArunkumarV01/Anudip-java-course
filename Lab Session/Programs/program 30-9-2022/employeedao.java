package com.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.model.employee;
public class employeedao
{
	public static void main(String[]args)
			{
		
		     Configuration con = new Configuration();
		     con.configure("resource/hibernate.cfg.xml");
		    
				SessionFactory sf = con.buildSessionFactory();
				
				
				Session session = sf.openSession();
				employee emp = new employee();
				
				emp.setEmpid(9);
				emp.setName("aghgh");
				emp.setSalary(15000);
				emp.setJoingDate(new Date());
				emp.setDepartment("Department");
				
				session.save(emp);
				
				session.beginTransaction().commit();		
				System.out.println("done");
		
		/** reading data **/		
				
			Object readObj= session.get(employee.class,01);
		    employee read =(employee) readObj;
		    System.out.println(read.getEmpid()+","+read.getName()+","+read.getSalary()+","+read.getJoingDate());
		    String query="select salary from employees";
		    Query sendq=session.createQuery(query);
		    List list=sendq.list();
		    System.out.println(list.size());
		    list.stream().forEach((t)-> System.out.println(t));
		    
		    
		    
		    
		    
			}
}
