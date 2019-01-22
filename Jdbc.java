/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;

public class Jdbc {

   
    public static void main(String[] args) {
 try
 {
     String str="SELECT * FROM AUTHOR";
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     try(Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-2HIE6GG;databaseName=employee;user=sa;password=123456789");
             Statement stmt =con.createStatement();)
      {
          ResultSet rs=stmt.executeQuery(str);
          System.out.println("Author ID\tAuthor Name\tDesignation\tSalary");
          System.out.println("-----------------------------------------------------------");
         while (rs.next())
         {
             String id=rs.getString(1);
             String name=rs.getString(2);
             String designation=rs.getString(3);
             int salary=rs.getInt(4);
             System.out.print(id+"\t");
             System.out.print(name);
             System.out.print(designation);
             System.out.println(salary+"\t");
             
         }
     }
 }
 catch(Exception ex)
 {
     System.out.println("Error occured");
     System.out.println("Error:"+ex);
 }
    }
}

    
