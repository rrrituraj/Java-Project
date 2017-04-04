package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class OracleCon {

	public static void main(String[] args) {
		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;

		}

		System.out.println("Oracle JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Rituraj", "12345");

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

		try {
			Statement stmt = connection.createStatement();
			// execute query
			ResultSet rs = stmt.executeQuery("select * from reliance_nse");
			HashMap<String, String> hp = new HashMap<>();
			while (rs.next()) {
				hp.put(rs.getString("opening_date"), rs.getString("open"));

			}

			System.out.println("getting the hashmap");
			// System.out.println(hp);
			Set<Entry<String, String>> s = hp.entrySet();
			Iterator<Entry<String, String>> itr = s.iterator();
			while (itr.hasNext()) {
				System.out.println("key is "+itr.next().getKey().substring(0, 11)+"  "+" value is "+itr.next().getValue());
			}
			//close the connection object
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
