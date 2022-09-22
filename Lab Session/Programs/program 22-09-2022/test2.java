package com.jdbc;
//Author = Arunkumar V
//question = create,read,insert,update,delete,using JDBC


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test2 {
	
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//CRUD - create,read,update,delete or drop 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		Connection con = null;
		Statement stmt = null;
		ResultSet RS = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			stmt = con.createStatement();
			String query = "select * from Student_details"; 
		    RS = stmt.executeQuery(query);
		   
			while(RS.next())
			{
				System.out.println(RS.getInt(1)+","+RS.getString(2)+","+RS.getString(3)+","+RS.getInt(4) );
			}
            
			System.out.println("Connected ...");
			 query = "INSERT INTO Student_details VALUES(06,'Peri','B.E',90);"; //inserting values to the table
			 int i = stmt.executeUpdate(query);
			System.out.println((i > 0)?"data inserted":"not insert");
			 
			  String query11 = "select * from Student_details";  //Reading the table
			  query ="UPDATE student_details SET College_name='Vit' WHERE Student_id =08"; //updating the table
			  int k = stmt.executeUpdate(query);
			  System.out.println((k > 0)? "Table has been updated":"Got a problem");
			  System.out.println(k);
			  query ="DELETE FROM Student_details WHERE Student_id =6"; //Deleting the values in  table
		      int j = stmt.executeUpdate(query);
			  System.out.println((j > 0)? "Deleted .. ":"Not Delete");
			 
					
		}
		
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			con.close();
			stmt.close();
			RS.close();
		}
		
		System.out.println("Done");
		
		
		

	}

}



