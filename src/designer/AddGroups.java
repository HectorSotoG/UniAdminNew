package designer;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controllers.StudentsController;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AddGroups extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idStudent;
	private JTextField idClass;
	private JTable table;
	private JTextField idTeacher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddGroups frame = new AddGroups();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddGroups() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(252, 209, 156));
		navPanel.setBounds(459, 0, 225, 611);
		contentPane.add(navPanel);
		navPanel.setLayout(null);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		goToEdit.setIcon(new ImageIcon(AddGroups.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 38, 131, 105);
		navPanel.add(goToEdit);

		JButton goToSearch = new JButton("");
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		goToSearch.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-search-100.png")));
		goToSearch.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToSearch.setBackground(new Color(252, 209, 156));
		goToSearch.setBounds(57, 181, 131, 105);
		navPanel.add(goToSearch);

		JButton goToDelete = new JButton("");
		goToDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		goToDelete.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-delete-100.png")));
		goToDelete.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDelete.setBackground(new Color(252, 209, 156));
		goToDelete.setBounds(57, 324, 131, 105);
		navPanel.add(goToDelete);

		JButton goToDwnld = new JButton("");
		goToDwnld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 467, 131, 105);
		navPanel.add(goToDwnld);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 458, 611);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel titleTxtx = new JLabel("Añadir Grupo");
		titleTxtx.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxtx.setBounds(13, 11, 385, 60);
		panel.add(titleTxtx);
		
		JLabel idStudentTxt = new JLabel("Introduzca ID del Alumno");
		idStudentTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idStudentTxt.setBounds(9, 113, 188, 20);
		panel.add(idStudentTxt);
		
		idStudent = new JTextField();
		idStudent.setBackground(new Color(230, 230, 230));
		idStudent.setBackground(new Color(230, 230, 230));
		idStudent.setFont(new Font("Lato", Font.PLAIN, 14));
		idStudent.setBounds(206, 113, 145, 20);
		panel.add(idStudent);
		idStudent.setColumns(10);
		
		JButton addStudentID = new JButton("Añadir");
		addStudentID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addStudentID.setFont(new Font("Lato", Font.PLAIN, 14));
		addStudentID.setBackground(new Color(252, 209, 156));
		addStudentID.setBounds(360, 113, 89, 20);
		panel.add(addStudentID);
		
		JButton addClassID = new JButton("Añadir");
		addClassID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addClassID.setFont(new Font("Lato", Font.PLAIN, 14));
		addClassID.setBackground(new Color(252, 209, 156));
		addClassID.setBounds(360, 151, 89, 20);
		panel.add(addClassID);
		
		idClass = new JTextField();
		idClass.setFont(new Font("Lato", Font.PLAIN, 14));
		idClass.setColumns(10);
		idClass.setBackground(new Color(230, 230, 230));
		idClass.setBounds(206, 151, 145, 20);
		panel.add(idClass);
		
		JLabel idClassTxt = new JLabel("Introduzca ID Asignatura");
		idClassTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idClassTxt.setBounds(9, 151, 188, 20);
		panel.add(idClassTxt);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(230, 230, 230)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Estudiantes", "Asignaturas"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setBounds(13, 182, 435, 318);
		panel.add(table);
		
		JButton addTeacherID = new JButton("Añadir");
		addTeacherID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addTeacherID.setFont(new Font("Lato", Font.PLAIN, 14));
		addTeacherID.setBackground(new Color(252, 209, 156));
		addTeacherID.setBounds(364, 523, 89, 20);
		panel.add(addTeacherID);
		
		idTeacher = new JTextField();
		idTeacher.setFont(new Font("Lato", Font.PLAIN, 14));
		idTeacher.setColumns(10);
		idTeacher.setBackground(new Color(230, 230, 230));
		idTeacher.setBounds(210, 523, 145, 20);
		panel.add(idTeacher);
		
		JLabel idTeacherTxt = new JLabel("Introduzca ID del Docente");
		idTeacherTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTeacherTxt.setBounds(13, 523, 188, 20);
		panel.add(idTeacherTxt);
		
		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setBounds(13, 566, 150, 34);
		panel.add(backToMenu);
		
		JButton addGroup = new JButton("Añadir Grupo");
		addGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addGroup.setFont(new Font("Lato", Font.PLAIN, 16));
		addGroup.setBackground(new Color(252, 209, 156));
		addGroup.setBounds(303, 566, 150, 34);
		panel.add(addGroup);
	}
}
