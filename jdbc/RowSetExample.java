package com.tcs.jdbc;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {

	public static void main(String[] args) {

		int count = 0;
		try {
			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			rowSet.setUsername("Rituraj");
			rowSet.setPassword("12345");
			rowSet.setCommand("select passengerid,name,sex,age from train");
			rowSet.execute();
			rowSet.addRowSetListener(new MyListener());
			while (rowSet.next()) {
				System.out.println("-----------------------------\n\n");
				System.out.println(rowSet.getString(1));
				System.out.println(rowSet.getString(2));
				System.out.println(rowSet.getString(3));
				System.out.println(rowSet.getString(4));
				count++;
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		System.out.println("\nTotal Records are - " + count);

	}

}
