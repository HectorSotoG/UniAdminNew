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
import designer.editGroups;
import designer.searchGroup;
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

		JLabel menuTxt = new JLabel("Información Grupos");
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
				frame.dispose();

				controller = new GroupsController();
				controller.edit();

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
				frame.dispose();

				controller = new GroupsController();
				controller.search();

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

				frame.dispose();

				controller = new GroupsController();
				controller.delete();

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
				frame.dispose();

				controller = new GroupsController();
				controller.download();

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
		titleTxtx.setBounds(13, 41, 385, 60);
		panel.add(titleTxtx);

		JLabel studentAmountTxt = new JLabel("Introduzca la cantidad de Alumnos");
		studentAmountTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		studentAmountTxt.setBounds(13, 174, 256, 20);
		panel.add(studentAmountTxt);

		JTextField studentField = new JTextField();
		studentField.setBackground(new Color(230, 230, 230));
		studentField.setBackground(new Color(230, 230, 230));
		studentField.setFont(new Font("Lato", Font.PLAIN, 14));
		studentField.setBounds(264, 174, 188, 20);
		panel.add(studentField);
		studentField.setColumns(10);

		JTextField idClass = new JTextField();
		idClass.setFont(new Font("Lato", Font.PLAIN, 14));
		idClass.setColumns(10);
		idClass.setBackground(new Color(230, 230, 230));
		idClass.setBounds(264, 236, 188, 20);
		panel.add(idClass);

		JLabel idClassTxt = new JLabel("Introduzca ID Asignatura");
		idClassTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idClassTxt.setBounds(13, 236, 188, 20);
		panel.add(idClassTxt);

		JTextField idTeacher = new JTextField();
		idTeacher.setFont(new Font("Lato", Font.PLAIN, 14));
		idTeacher.setColumns(10);
		idTeacher.setBackground(new Color(230, 230, 230));
		idTeacher.setBounds(264, 361, 188, 20);
		panel.add(idTeacher);

		JLabel idTeacherTxt = new JLabel("Introduzca ID del Docente");
		idTeacherTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTeacherTxt.setBounds(17, 361, 188, 20);
		panel.add(idTeacherTxt);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();

				controller = new GroupsController();
				controller.menu();
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

		JLabel groupNameTxt = new JLabel("Introduzca nombre del Grupo");
		groupNameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		groupNameTxt.setBounds(13, 302, 231, 20);
		panel.add(groupNameTxt);

		JTextField nameField = new JTextField();
		nameField.setFont(new Font("Lato", Font.PLAIN, 14));
		nameField.setColumns(10);
		nameField.setBackground(new Color(230, 230, 230));
		nameField.setBounds(264, 302, 188, 20);
		panel.add(nameField);

		JLabel turnTxt = new JLabel("Turno del Grupo (V o M)");
		turnTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		turnTxt.setBounds(17, 428, 188, 20);
		panel.add(turnTxt);

		JTextField scheduleField = new JTextField();
		scheduleField.setFont(new Font("Lato", Font.PLAIN, 14));
		scheduleField.setColumns(10);
		scheduleField.setBackground(new Color(230, 230, 230));
		scheduleField.setBounds(264, 428, 188, 20);
		panel.add(scheduleField);

		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

	public void edit() {
		contentPane.setLayout(null);

		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(252, 209, 156));
		navPanel.setBounds(459, 0, 225, 611);
		contentPane.add(navPanel);
		navPanel.setLayout(null);

		JButton goToAdd = new JButton("");
		goToAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();

				controller = new GroupsController();
				controller.add();

			}
		});
		goToAdd.setIcon(new ImageIcon(editGroups.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

		JButton goToSearch = new JButton("");
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.search();

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
				frame.dispose();

				controller = new GroupsController();
				controller.delete();

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
				frame.dispose();

				controller = new GroupsController();
				controller.download();

			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 467, 131, 105);
		navPanel.add(goToDwnld);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 459, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Editar Grupo");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(10, 21, 439, 43);
		panel.add(titleTxt);

		JButton goToMenu = new JButton("Volver al Menu");
		goToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();

				controller = new GroupsController();
				controller.menu();
			}
		});
		goToMenu.setBackground(new Color(252, 209, 156));
		goToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		goToMenu.setBounds(10, 558, 147, 31);
		panel.add(goToMenu);

		JButton editBtn = new JButton("Completar");
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		editBtn.setBackground(new Color(252, 209, 156));
		editBtn.setBounds(302, 558, 147, 31);
		panel.add(editBtn);

		JLabel idTxt = new JLabel("Ingrese ID del Grupo");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(19, 141, 147, 20);
		panel.add(idTxt);

		JTextField idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(185, 141, 147, 22);
		panel.add(idField);
		idField.setColumns(10);

		JButton searchGroup = new JButton("Buscar");
		searchGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchGroup.setBackground(new Color(252, 209, 156));
		searchGroup.setFont(new Font("Lato", Font.PLAIN, 16));
		searchGroup.setBounds(351, 141, 89, 23);
		panel.add(searchGroup);

		JLabel studentCountTxt = new JLabel("Cantidad de Estudiantes");
		studentCountTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		studentCountTxt.setBounds(19, 253, 187, 20);
		panel.add(studentCountTxt);

		JTextField studentCount = new JTextField();
		studentCount.setColumns(10);
		studentCount.setBackground(new Color(230, 230, 230));
		studentCount.setBounds(215, 254, 225, 22);
		panel.add(studentCount);

		JLabel signatureTxt = new JLabel("Asignatura");
		signatureTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		signatureTxt.setBounds(19, 322, 147, 20);
		panel.add(signatureTxt);

		JTextField signatureField = new JTextField();
		signatureField.setColumns(10);
		signatureField.setBackground(new Color(230, 230, 230));
		signatureField.setBounds(215, 323, 225, 22);
		panel.add(signatureField);

		JLabel teacherTxt = new JLabel("Profesor");
		teacherTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		teacherTxt.setBounds(19, 404, 147, 20);
		panel.add(teacherTxt);

		JTextField teacherField = new JTextField();
		teacherField.setColumns(10);
		teacherField.setBackground(new Color(230, 230, 230));
		teacherField.setBounds(215, 404, 225, 22);
		panel.add(teacherField);

		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}

	public void search() {

		contentPane.setLayout(null);

		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(252, 209, 156));
		navPanel.setBounds(459, 0, 225, 611);
		contentPane.add(navPanel);
		navPanel.setLayout(null);

		JButton goToAdd = new JButton("");
		goToAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new GroupsController();
				controller.add();

			}
		});
		goToAdd.setIcon(new ImageIcon(editGroups.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new GroupsController();
				controller.edit();

			}
		});
		goToEdit.setIcon(new ImageIcon(searchGroup.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 181, 131, 105);
		navPanel.add(goToEdit);

		JButton goToDelete = new JButton("");
		goToDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new GroupsController();
				controller.delete();

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
				frame.dispose();
				controller = new GroupsController();
				controller.download();

			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 467, 131, 105);
		navPanel.add(goToDwnld);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 459, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Consultar Grupo");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(10, 36, 439, 43);
		panel.add(titleTxt);

		JButton goToMenu = new JButton("Volver al Menu");
		goToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new GroupsController();
				controller.menu();
			}
		});
		goToMenu.setBackground(new Color(252, 209, 156));
		goToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		goToMenu.setBounds(10, 558, 147, 31);
		panel.add(goToMenu);

		JLabel idTxt = new JLabel("Ingrese ID del Grupo");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(19, 141, 147, 20);
		panel.add(idTxt);

		JTextField idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(185, 141, 147, 22);
		panel.add(idField);
		idField.setColumns(10);

		JButton searchGroup = new JButton("Buscar");
		searchGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		searchGroup.setBackground(new Color(252, 209, 156));
		searchGroup.setFont(new Font("Lato", Font.PLAIN, 16));
		searchGroup.setBounds(351, 141, 89, 23);
		panel.add(searchGroup);

		JTable table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "Nombre Grupo", "Cantidad Estudiantes", "Profesor", "Asignatura", "Turno" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(84);
		table.getColumnModel().getColumn(2).setPreferredWidth(118);
		table.setBounds(19, 205, 421, 281);
		panel.add(table);

		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}

	public void download() {
		contentPane.setLayout(null);

		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(252, 209, 156));
		navPanel.setBounds(459, 0, 225, 611);
		contentPane.add(navPanel);
		navPanel.setLayout(null);

		JButton goToAdd = new JButton("");
		goToAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();

				controller = new GroupsController();
				controller.add();

			}
		});
		goToAdd.setIcon(new ImageIcon(editGroups.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.edit();

			}
		});
		goToEdit.setIcon(new ImageIcon(searchGroup.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 181, 131, 105);
		navPanel.add(goToEdit);

		JButton goToDelete = new JButton("");
		goToDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.delete();

			}
		});
		goToDelete.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-delete-100.png")));
		goToDelete.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDelete.setBackground(new Color(252, 209, 156));
		goToDelete.setBounds(57, 324, 131, 105);
		navPanel.add(goToDelete);

		JButton goToSearch = new JButton("");
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.search();

			}
		});
		goToSearch.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-search-100.png")));
		goToSearch.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToSearch.setBackground(new Color(252, 209, 156));
		goToSearch.setBounds(57, 181, 131, 105);
		navPanel.add(goToSearch);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 459, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Descargar Info. Grupo");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(10, 36, 439, 43);
		panel.add(titleTxt);

		JButton goToMenu = new JButton("Volver al Menu");
		goToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.menu();
			}
		});
		goToMenu.setBackground(new Color(252, 209, 156));
		goToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		goToMenu.setBounds(10, 558, 147, 31);
		panel.add(goToMenu);

		JLabel idTxt = new JLabel("Ingrese ID del Grupo");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(19, 141, 147, 20);
		panel.add(idTxt);

		JTextField idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(185, 141, 147, 22);
		panel.add(idField);
		idField.setColumns(10);

		JButton searchGroup = new JButton("Buscar");
		searchGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		searchGroup.setBackground(new Color(252, 209, 156));
		searchGroup.setFont(new Font("Lato", Font.PLAIN, 16));
		searchGroup.setBounds(351, 141, 89, 23);
		panel.add(searchGroup);

		JTable table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "Nombre Grupo", "Cantidad Estudiantes", "Profesor", "Asignatura", "Turno" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(84);
		table.getColumnModel().getColumn(2).setPreferredWidth(118);
		table.setBounds(19, 205, 421, 281);
		panel.add(table);

		JButton downloadBtn = new JButton("Descargar Info.");
		downloadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		downloadBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		downloadBtn.setBackground(new Color(252, 209, 156));
		downloadBtn.setBounds(293, 558, 147, 31);
		panel.add(downloadBtn);

		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}

	public void delete() {
		contentPane.setLayout(null);

		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(252, 209, 156));
		navPanel.setBounds(459, 0, 225, 611);
		contentPane.add(navPanel);
		navPanel.setLayout(null);

		JButton goToAdd = new JButton("");
		goToAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.add();

			}
		});
		goToAdd.setIcon(new ImageIcon(editGroups.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.edit();

			}
		});
		goToEdit.setIcon(new ImageIcon(searchGroup.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 181, 131, 105);
		navPanel.add(goToEdit);

		JButton goToSearch = new JButton("");
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.search();

			}
		});
		goToSearch.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-search-100.png")));
		goToSearch.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToSearch.setBackground(new Color(252, 209, 156));
		goToSearch.setBounds(57, 181, 131, 105);
		navPanel.add(goToSearch);

		JButton goToDwnld = new JButton("");
		goToDwnld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.download();

			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 467, 131, 105);
		navPanel.add(goToDwnld);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 459, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Eliminar Grupo");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(10, 36, 439, 43);
		panel.add(titleTxt);

		JButton goToMenu = new JButton("Volver al Menu");
		goToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new GroupsController();
				controller.menu();
			}
		});
		goToMenu.setBackground(new Color(252, 209, 156));
		goToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		goToMenu.setBounds(10, 558, 147, 31);
		panel.add(goToMenu);

		JLabel idTxt = new JLabel("Ingrese ID del Grupo");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(19, 141, 147, 20);
		panel.add(idTxt);

		JTextField idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(185, 141, 147, 22);
		panel.add(idField);
		idField.setColumns(10);

		JButton searchGroup = new JButton("Buscar");
		searchGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		searchGroup.setBackground(new Color(252, 209, 156));
		searchGroup.setFont(new Font("Lato", Font.PLAIN, 16));
		searchGroup.setBounds(351, 141, 89, 23);
		panel.add(searchGroup);

		JTable table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "ID", "Nombre Grupo", "Cantidad Estudiantes", "Profesor", "Asignatura", "Turno" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(84);
		table.getColumnModel().getColumn(2).setPreferredWidth(118);
		table.setBounds(19, 205, 421, 281);
		panel.add(table);

		JButton deleteBtn = new JButton("Eliminar Grupo");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteBtn.setBackground(new Color(252, 209, 156));
		deleteBtn.setBounds(293, 558, 147, 31);
		panel.add(deleteBtn);

		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}

}