

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hana hefny
 */
public class database {

    public database() {
    }
    
     public static Statement stat;
      public static ResultSet res = null;
    
 public static void AddDataBase(String query) {
	System.out.println("-------- MySQL JDBC Connection Testing ------------");

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Net&Pocket?zeroDateTimeBehavior=convertToNull", "root","");
                stat = connection.createStatement();
                //String q="SELECT password FROM users  WHERE username='mahmoudabdelrazik'";
               stat.execute(query);
               //res = stat.executeQuery(q);
               //while (res.next()) {
                 //  String pass=res.getString("password");
               
               //System.out.println("            "+pass);
               //}
	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}

	if (connection != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
  }
 public static ResultSet Getdata(String query) {
       System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

        try {
            //1.connect to database
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Net&Pocket?zeroDateTimeBehavior=convertToNull", "root","");
            //2 creat a statment
            stat = connection.createStatement();
            //3 execute query
            stat.executeQuery(query);//get data from database
            res = stat.executeQuery(query);//output of query in resultset,table of database
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

