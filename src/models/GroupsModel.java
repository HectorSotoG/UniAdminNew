package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GroupsModel {
	
	public GroupsModel() {
		
	}
	
	public void add() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_HectorSoto", "Xwy$zFx9AT$XZNN");

			PreparedStatement insertar = con.prepareStatement("INSERT INTO estudiantes VALUES(?,?,?,?,?,?,?,?)");
			
		}catch(Exception e) {
			
		}
	}

}


