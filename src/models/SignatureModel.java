package models;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class SignatureModel {

	public SignatureModel() {

	}

	public boolean add(String name, String teacher, String isOptional, String career) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_HectorSoto", "Xwy$zFx9AT$XZNN");

			PreparedStatement insertar = con.prepareStatement("INSERT INTO asignaturas VALUES(?,?,?,?,?)");

			insertar.setString(1, "0");
			insertar.setString(2, name);
			insertar.setString(3, teacher);
			insertar.setString(4, isOptional);
			insertar.setString(5, career);

			insertar.executeUpdate();

			con.close();

			return true;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		return false;
	}

	public void searchEdit(String id, JTextField name, JTextField teacher, JRadioButton optional, JTextField career) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("SELECT * FROM asignaturas WHERE ID= ?");
			insertar.setString(1, id);

			ResultSet rs = insertar.executeQuery();

			if (rs.next()) {
				name.setText(rs.getString("Nombre"));
				teacher.setText(rs.getString("Profesor"));
				career.setText(rs.getString("Carrera"));

				if (rs.getString("Optativa").equals("Si")) {
					optional.setSelected(true);
				} else {
					optional.setSelected(false);
				}

			} else {
				JOptionPane.showMessageDialog(null, "No se encontró asignatura con ese ID", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}

			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

	public boolean edit(String id, String name, String teacher, String optional, String career) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con
					.prepareStatement("UPDATE asignaturas SET Nombre=?,Profesor=?,Optativa=?, Carrera=? WHERE ID=?");

			insertar.setString(1, name);
			insertar.setInt(2, Integer.parseInt(teacher));
			insertar.setString(3, optional);
			insertar.setString(4, career);
			insertar.setInt(5, Integer.parseInt(id));

			insertar.executeUpdate();

			con.close();

			return true;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		return false;
	}

	public void dataTable(JTable table, String id) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("SELECT * FROM asignaturas WHERE ID=?");
			insertar.setString(1, id);
			DefaultTableModel model = new DefaultTableModel();

			model.addColumn("ID");
			model.addColumn("Nombre");
			model.addColumn("Profesor");
			model.addColumn("Optativa");
			model.addColumn("Carrera");

			table.setModel(model);

			String[] data = new String[5];

			ResultSet rs = insertar.executeQuery();

			while (rs.next()) {
				data[0] = rs.getString(1);
				data[1] = rs.getString(2);
				data[2] = rs.getString(3);
				data[3] = rs.getString(4);
				data[4] = rs.getString(5);

				model.addRow(data);
			}
			con.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public boolean download(String id) {
		Document pdf = new Document();

		try {

			String root = System.getProperty("user.home");
			PdfWriter.getInstance(pdf, new FileOutputStream(root + "/Desktop/InfoAsignatura.pdf"));
			pdf.open();

			PdfPTable table = new PdfPTable(5);

			table.addCell("ID");
			table.addCell("Nombre");
			table.addCell("ID del Profesor");
			table.addCell("Optativa");
			table.addCell("Carrera");

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
						"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

				PreparedStatement insertar = con.prepareStatement("SELECT * FROM asignaturas WHERE ID= ?");
				insertar.setString(1, id);

				ResultSet rs = insertar.executeQuery();

				if (rs.next()) {
					table.addCell(rs.getString(1));
					table.addCell(rs.getString(2));
					table.addCell(rs.getString(3));
					table.addCell(rs.getString(4));
					table.addCell(rs.getString(5));

					pdf.add(table);
				} else {
					JOptionPane.showMessageDialog(null, "No se encontró Asignatura con ese ID");
				}

				pdf.close();
				con.close();

				return true;

			} catch (Exception e) {

			}
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, e);
		}

		return false;
	}

	public boolean delete(String id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_UniAdmin",
					"freedb_Hector Soto", "%Bm*thDf4nVtAB5");

			PreparedStatement insertar = con.prepareStatement("DELETE FROM asignaturas WHERE ID=?");
			insertar.setString(1, id);

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
