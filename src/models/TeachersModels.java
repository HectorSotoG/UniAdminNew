package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controllers.HomeController;

public class TeachersModels {

	private TeachersModels functions;
	public void TeachersModels() {
		functions= new TeachersModels();
	}

	public boolean add(String name, String lstName, String email, String tel, String birthDate, String schoolGrade) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("INSERT INTO profesores VALUES(?,?,?,?,?,?,?,?)");

			insertar.setString(1, "0");
			insertar.setString(2, name);
			insertar.setString(3, lstName);
			insertar.setString(4, birthDate);
			insertar.setString(5, email);
			insertar.setString(6, tel);
			insertar.setString(7, "0");
			insertar.setString(8, schoolGrade);

			insertar.executeUpdate();
			
			con.close();
			
			return true;
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
		}
		return false;
	}
	
	public void edit() {
		
	}
	
	public void search(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("SELECT * FROM profesores WHERE ID= ?");
			insertar.setString(1, id);

			ResultSet rs = insertar.executeQuery();
			
			con.close();
			
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
		}
	}
	
	
}
