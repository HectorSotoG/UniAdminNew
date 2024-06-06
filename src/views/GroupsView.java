package views;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controllers.GroupsController;
import controllers.HomeController;
import controllers.StudentsController;
import designer.AddGroups;
import designer.TeacherAdd;
import designer.TeacherMenu;
import models.GroupsModel;
import models.StudentsModel;

public class GroupsView {
	
	private JFrame frame;
	private JPanel contentPane;
	private GroupsController controller;
	private HomeController home;
	private GroupsModel functions;
	private String pictureRoot = "/Icons/icons8-circled-user-100.png";
	
	public GroupsView() {
		frame = new JFrame();
		frame.setSize(700, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.setResizable(false);
		frame.setVisible(false);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		functions = new GroupsModel();
	}
	
	public void menu() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel menuTxt = new JLabel("Información Alumnos");
		menuTxt.setHorizontalAlignment(SwingConstants.CENTER);
		menuTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		menuTxt.setBounds(87, 15, 495, 53);
		panel.add(menuTxt);

		JButton addBtn = new JButton("");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.add();
			}
		});
		addBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-add-100.png")));
		addBtn.setBackground(new Color(252, 209, 156));
		addBtn.setBounds(44, 126, 166, 121);
		panel.add(addBtn);

		JButton editBtn = new JButton("");
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.edit();
			}
		});
		editBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-edit-100.png")));
		editBtn.setBackground(new Color(252, 209, 156));
		editBtn.setBounds(254, 126, 166, 121);
		panel.add(editBtn);

		JButton searchBtn = new JButton("");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.search();

			}
		});
		searchBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-search-100.png")));
		searchBtn.setBackground(new Color(252, 209, 156));
		searchBtn.setBounds(464, 126, 166, 121);
		panel.add(searchBtn);

		JButton backBtn = new JButton("");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				home = new HomeController();
				home.dashboard();

			}
		});
		backBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-back-100.png")));
		backBtn.setBackground(new Color(252, 209, 156));
		backBtn.setBounds(464, 351, 166, 121);
		panel.add(backBtn);

		JButton deleteBtn = new JButton("");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new GroupsController();
				controller.delete();
			}
		});
		deleteBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-delete-100.png")));
		deleteBtn.setBackground(new Color(252, 209, 156));
		deleteBtn.setBounds(254, 351, 166, 121);
		panel.add(deleteBtn);

		JButton downloadBtn = new JButton("");
		downloadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.download();
			}
		});
		downloadBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-download-100.png")));
		downloadBtn.setBackground(new Color(252, 209, 156));
		downloadBtn.setBounds(44, 351, 166, 121);
		panel.add(downloadBtn);

		contentPane.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}
	
	public void add() {
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
		
		JTextField idStudent = new JTextField();
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
		
		JTextField idClass = new JTextField();
		idClass.setFont(new Font("Lato", Font.PLAIN, 14));
		idClass.setColumns(10);
		idClass.setBackground(new Color(230, 230, 230));
		idClass.setBounds(206, 151, 145, 20);
		panel.add(idClass);
		
		JLabel idClassTxt = new JLabel("Introduzca ID Asignatura");
		idClassTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idClassTxt.setBounds(9, 151, 188, 20);
		panel.add(idClassTxt);
		
		JTable table = new JTable();
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
		
		JTextField idTeacher = new JTextField();
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
		
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
	public void edit() {
		
	}
	
	public void search() {
		
	}
	
	public void download() {
		
	}
	
	public void delete() {
		
	}

}