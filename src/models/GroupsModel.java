package models;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GroupsModel {
	
	public GroupsModel() {
		
	}
	
	public boolean add(String name, String students, String teacher, String signature, String schedule) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_HectorSoto", "Xwy$zFx9AT$XZNN");

			PreparedStatement insertar = con.prepareStatement("INSERT INTO grupos VALUES(?,?,?,?,?,?)");
			
			insertar.setString(1, "0");
			insertar.setString(2, name);
			insertar.setString(3, students);
			insertar.setString(4, teacher);
			insertar.setString(5, signature);
			insertar.setString(6, schedule);
			
			insertar.executeUpdate();
			
			con.close();
			
			return true;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return false;
	}

	public void searchEdit(String id, JTextField students, JTextField signature, JTextField teacher) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("SELECT * FROM grupos WHERE ID= ?");
			insertar.setString(1, id);

			ResultSet rs = insertar.executeQuery();
			
			if(rs.next()) {
				students.setText(rs.getString("Cant_Estudiantes"));
				signature.setText(rs.getString("idAsignatura"));
				teacher.setText(rs.getString("idProfesor"));
			}
			con.close();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public boolean edit(String id, String students, String signature, String teacher) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("UPDATE grupos SET Cant_Estudiantes=?,idAsignatura=?,idProfesor=? WHERE ID=?");

			insertar.setString(1,students);
			insertar.setString(2, signature);
			insertar.setString(3, teacher);
			insertar.setInt(4, Integer.parseInt(id));

			insertar.executeUpdate();
			
			con.close();
			
			return true;
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return false;
	}

	public void dataTable(String id,JTable table) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("SELECT * FROM grupos WHERE ID=?");
			insertar.setString(1, id);
			
			DefaultTableModel model = new DefaultTableModel();
			
			model.addColumn("ID");
			model.addColumn("Grupo");
			model.addColumn("Cantidad Estudiantes");
			model.addColumn("Profesor");
			model.addColumn("Asignatura");
			model.addColumn("Turno");
			
			table.setModel(model);
			
			String [] data = new String[6];
			
			ResultSet rs = insertar.executeQuery();
			
			while(rs.next()) {
				data[0] = rs.getString(1);
				data[1] = rs.getString(2);
				data[2] = rs.getString(3);
				data[3] = rs.getString(4);
				data[4] = rs.getString(5);
				data[5] = rs.getString(6);
				
				model.addRow(data);
			}
			con.close();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public boolean download(String id) {

		Document pdf = new Document();
		
		try {
			String root = System.getProperty("user.home");
			PdfWriter.getInstance(pdf, new FileOutputStream(root + "/Desktop/InfoGrupo.pdf"));
			pdf.open();
			
			PdfPTable table = new PdfPTable(6);
			
			table.addCell("ID");
			table.addCell("Grupo");
			table.addCell("Cantidad de Estudiantes");
			table.addCell("ID Profesor");
			table.addCell("ID Asignatura");
			table.addCell("Turno");
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
						"freedb_HectorSoto", "Xwy$zFx9AT$XZNN");

				PreparedStatement insertar = con.prepareStatement("SELECT * FROM grupos WHERE ID= ?");
				insertar.setString(1, id);

				ResultSet rs = insertar.executeQuery();
				
				if(rs.next()) {
					table.addCell(rs.getString(1));
					table.addCell(rs.getString(2));
					table.addCell(rs.getString(3));
					table.addCell(rs.getString(4));
					table.addCell(rs.getString(5));
					table.addCell(rs.getString(6));
					
					pdf.add(table);
				}
				
				pdf.close();
				con.close();
				
				return true;
			}catch(Exception e) {
				
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return false;
	}

	public boolean delete(String id) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("DELETE FROM grupos WHERE ID=?");
			insertar.setString(1, id);
			
			insertar.executeUpdate();
			
			con.close();
			
			return true;
		}catch(Exception e) {
			
		}
		
		return false;
	}
}


