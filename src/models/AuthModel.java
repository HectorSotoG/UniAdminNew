package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.Statement;

import controllers.HomeController;

public class AuthModel {

	public HomeController home;
	
	public  AuthModel() {
		

	}

	public boolean login(String user, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_HectorSoto", "Xwy$zFx9AT$XZNN");

			java.sql.Statement stmnt = con.createStatement();
			ResultSet rs = stmnt.executeQuery(
					"SELECT * FROM `Administradores` WHERE Email = '" + user + "' and Password = '" + pass + "';");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
				
				home = new HomeController();
				
				home.dashboard();
				
				return true;
			}
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	public boolean add(String name, String lstName, String email, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_HectorSoto", "Xwy$zFx9AT$XZNN");

			PreparedStatement insertar = con.prepareStatement("INSERT INTO Administradores VALUES(?,?,?,?,?,?)");

			insertar.setString(1, "0");
			insertar.setString(2, name);
			insertar.setString(3, lstName);
			insertar.setString(4, "Admin");
			insertar.setString(5, email);
			insertar.setString(6, pass);

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
	
	

}
