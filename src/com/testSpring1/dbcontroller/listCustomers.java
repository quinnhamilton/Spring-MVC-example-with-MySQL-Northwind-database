package com.testSpring1.dbcontroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class listCustomers {
	
	@RequestMapping("/welcome4")
	public ModelAndView listData() {
		
		
		try {
			
			
			//load the driver, make sure catch statement is "Exception" to cover all exceptions
			Class.forName("com.mysql.jdbc.Driver");
		
			//create connection string
			Connection c;
			String connectionString = "jdbc:mysql://localhost:3306/northwind";
			//with root and password
			c = DriverManager.getConnection(connectionString, "root", "admin123");
			
			//create statement 
			Statement s = c.createStatement();
			
			//execute query
			ResultSet results = s.executeQuery("select * from customers");
			
			//store customerID info in Array List
			ArrayList<String> customerID = new ArrayList<>();
			
			//start from column 1 in database
			while (results.next()) {
				
				customerID.add(results.getString(1));
			}
			
			//return ModelAndView
			return new ModelAndView("welcome4", "cList", customerID);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return new ModelAndView("error", "errorMessage", e.getMessage());
		}
	}

}
