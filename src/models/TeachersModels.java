package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Statement;

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
	
	public boolean edit(String id, String name, String lstName, String email, String tel, String birthDate, String schoolGrade) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("UPDATE profesores SET Nombre=?,Apellido=?,Email=?, Telefono=?, Fecha_Nacimiento=?,Grado_Estudios=? WHERE ID=?");

			insertar.setString(1,name);
			insertar.setString(2, lstName);
			insertar.setString(5, birthDate);
			insertar.setString(3, email);
			insertar.setString(4, tel);
			insertar.setString(6, schoolGrade);
			insertar.setInt(7, Integer.parseInt(id));

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
	
	public void search(String id, JTextField name, JTextField lstName, JTextField email, JTextField phone, JTextField birthDate, JTextField school) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("SELECT * FROM profesores WHERE ID= ?");
			insertar.setString(1, id);

			ResultSet rs = insertar.executeQuery();
			
			if(rs.next()) {
				name.setText(rs.getString("Nombre"));
				lstName.setText(rs.getString("Apellido"));
				email.setText(rs.getString("Email"));
				phone.setText(rs.getString("Telefono"));
				birthDate.setText(String.valueOf(rs.getDate("Fecha_Nacimiento")));
				school.setText(rs.getString("Grado_Estudios"));
				
			}else {
				JOptionPane.showMessageDialog(null, "No se encontró un Docente con ese ID", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
			con.close();
		
			
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
			
		}
		
	}
	
	public void dataTable(JTable table) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("SELECT * FROM profesores");
			
			DefaultTableModel model = new DefaultTableModel();
			
			model.addColumn("ID");
			model.addColumn("Nombre");
			model.addColumn("Apellido");
			model.addColumn("Fecha_Nacimiento");
			model.addColumn("Email");
			model.addColumn("Telefono");
			model.addColumn("Foto");
			model.addColumn("Grado_Estudios");
			
			table.setModel(model);
			
			String [] data = new String[8];
			
			ResultSet rs = insertar.executeQuery();
			
			while(rs.next()) {
				data[0] = rs.getString(1);
				data[1] = rs.getString(2);
				data[2] = rs.getString(3);
				data[3] = rs.getString(4);
				data[4] = rs.getString(5);
				data[5] = rs.getString(6);
				data[6] = rs.getString(7);
				data[7] = rs.getString(8);
				
				model.addRow(data);
			}
			con.close();
			
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
}
