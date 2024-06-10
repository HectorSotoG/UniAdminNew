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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controllers.HomeController;
import controllers.StudentsController;
import controllers.TeachersController;
import designer.TeacherAdd;
import designer.TeacherDelete;
import designer.TeacherDwnld;
import designer.TeacherEdit;
import designer.TeacherMenu;
import designer.TeacherSearch;
import models.StudentsModel;
import models.TeachersModels;

public class StudentsView {
	
	private JFrame frame;
	private JPanel contentPane;
	private StudentsController controller;
	private HomeController home;
	private StudentsModel functions;
	private String pictureRoot = "/Icons/icons8-circled-user-100.png";
	public StudentsView() {
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

		functions = new StudentsModel();
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

				controller = new StudentsController();
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

				controller = new StudentsController();
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

				controller = new StudentsController();
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
				controller = new StudentsController();
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

				controller = new StudentsController();
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

		JPanel addPanel = new JPanel();
		addPanel.setBounds(0, 0, 461, 611);
		addPanel.setBackground(new Color(255, 255, 255));
		addPanel.setLayout(null);

		JLabel addTxt = new JLabel("Añadir Alumno");
		addTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		addTxt.setBounds(24, 21, 394, 48);
		addPanel.add(addTxt);

		JLabel nameTxt = new JLabel("Ingresar Nombre");
		nameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		nameTxt.setBounds(24, 95, 129, 20);
		addPanel.add(nameTxt);

		JLabel lblIngresarApellido = new JLabel("Ingresar Apellido");
		lblIngresarApellido.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarApellido.setBounds(231, 95, 129, 20);
		addPanel.add(lblIngresarApellido);

		JTextField nameRequest = new JTextField();
		nameRequest.setBackground(new Color(230, 230, 230));
		nameRequest.setBounds(24, 124, 181, 20);
		addPanel.add(nameRequest);
		nameRequest.setColumns(10);

		JTextField lstNameReq = new JTextField();
		lstNameReq.setBackground(new Color(230, 230, 230));
		lstNameReq.setColumns(10);
		lstNameReq.setBounds(231, 124, 187, 20);
		addPanel.add(lstNameReq);

		JLabel lblIngresarEmail = new JLabel("Ingresar Email");
		lblIngresarEmail.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarEmail.setBounds(24, 187, 129, 20);
		addPanel.add(lblIngresarEmail);

		JTextField emailRequest = new JTextField();
		emailRequest.setColumns(10);
		emailRequest.setBackground(new Color(230, 230, 230));
		emailRequest.setBounds(24, 216, 181, 20);
		addPanel.add(emailRequest);

		JLabel lblIngresarTelefono = new JLabel("Ingresar Telefono");
		lblIngresarTelefono.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarTelefono.setBounds(24, 282, 129, 20);
		addPanel.add(lblIngresarTelefono);

		JTextField phoneReq = new JTextField();
		phoneReq.setColumns(10);
		phoneReq.setBackground(new Color(230, 230, 230));
		phoneReq.setBounds(24, 311, 181, 20);
		addPanel.add(phoneReq);

		JLabel lblIngresarFechaDe = new JLabel("Ingresar Fecha de Nacimiento");
		lblIngresarFechaDe.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarFechaDe.setBounds(24, 365, 204, 20);
		addPanel.add(lblIngresarFechaDe);

		JTextField dayBirth = new JTextField();
		dayBirth.setColumns(10);
		dayBirth.setBackground(new Color(230, 230, 230));
		dayBirth.setBounds(24, 394, 70, 20);
		addPanel.add(dayBirth);

		JTextField monthBirth = new JTextField();
		monthBirth.setColumns(10);
		monthBirth.setBackground(new Color(230, 230, 230));
		monthBirth.setBounds(106, 394, 70, 20);
		addPanel.add(monthBirth);

		JTextField yearBirth = new JTextField();
		yearBirth.setColumns(10);
		yearBirth.setBackground(new Color(230, 230, 230));
		yearBirth.setBounds(186, 394, 70, 20);
		addPanel.add(yearBirth);

		JLabel lblNewLabel = new JLabel("dd");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lato", Font.ITALIC, 14));
		lblNewLabel.setBounds(34, 418, 46, 14);
		addPanel.add(lblNewLabel);

		JLabel lblMm = new JLabel("mm");
		lblMm.setHorizontalAlignment(SwingConstants.CENTER);
		lblMm.setFont(new Font("Lato", Font.ITALIC, 14));
		lblMm.setBounds(116, 418, 46, 14);
		addPanel.add(lblMm);

		JLabel lblYyyy = new JLabel("yyyy");
		lblYyyy.setHorizontalAlignment(SwingConstants.CENTER);
		lblYyyy.setFont(new Font("Lato", Font.ITALIC, 14));
		lblYyyy.setBounds(196, 418, 46, 14);
		addPanel.add(lblYyyy);

		JTextField schoolGrade = new JTextField();
		schoolGrade.setColumns(10);
		schoolGrade.setBackground(new Color(230, 230, 230));
		schoolGrade.setBounds(24, 484, 232, 20);
		addPanel.add(schoolGrade);

		JLabel lblIngresarGradoDe = new JLabel("Ingresar Semestre");
		lblIngresarGradoDe.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarGradoDe.setBounds(24, 455, 232, 20);
		addPanel.add(lblIngresarGradoDe);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.menu();
			}
		});
		backToMenu.setBounds(24, 553, 152, 36);
		addPanel.add(backToMenu);

		JButton addTeachBtn = new JButton("Añadir");
		addTeachBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = nameRequest.getText();
				String lstName = lstNameReq.getText();
				String birthDate = yearBirth.getText().concat(monthBirth.getText()).concat(dayBirth.getText());
				String email = emailRequest.getText();
				String tel = phoneReq.getText();
				String school = schoolGrade.getText();

				if (name.isEmpty() || lstName.isEmpty() || birthDate.isEmpty() || email.isEmpty() || tel.isEmpty()
						|| school.isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Algun campo está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);

				} else if (functions.add(name, lstName, email, tel, birthDate, school)) {
					System.out.println("Añadido");

					nameRequest.setText("");
					lstNameReq.setText("");
					yearBirth.setText("");
					monthBirth.setText("");
					dayBirth.setText("");
					emailRequest.setText("");
					phoneReq.setText("");
					schoolGrade.setText("");

					nameRequest.requestFocus();

					JOptionPane.showMessageDialog(null, "Alumno añadido con éxito", "HECHO",
							JOptionPane.INFORMATION_MESSAGE);
				} else {

					JOptionPane.showMessageDialog(null, "Algo salio mal", "ERROR", JOptionPane.ERROR_MESSAGE);

					nameRequest.setText("");
					lstNameReq.setText("");
					yearBirth.setText("");
					monthBirth.setText("");
					dayBirth.setText("");
					emailRequest.setText("");
					phoneReq.setText("");
					schoolGrade.setText("");

					nameRequest.requestFocus();
				}
			}
		});
		addTeachBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		addTeachBtn.setBackground(new Color(252, 209, 156));
		addTeachBtn.setBounds(266, 553, 152, 36);
		addPanel.add(addTeachBtn);

		JButton addPhoto = new JButton("Añadir Foto");
		addPhoto.setFont(new Font("Lato", Font.PLAIN, 16));
		addPhoto.setBackground(new Color(252, 209, 156));
		addPhoto.setBounds(289, 302, 129, 29);
		addPanel.add(addPhoto);

		JLabel pictureHolder = new JLabel("");
		pictureHolder.setHorizontalAlignment(SwingConstants.CENTER);
		pictureHolder.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-circled-user-100.png")));
		pictureHolder.setBounds(289, 172, 129, 130);
		addPanel.add(pictureHolder);
		
		JLabel lblNumerosRomanos = new JLabel("Numeros Romanos");
		lblNumerosRomanos.setFont(new Font("Lato", Font.ITALIC, 14));
		lblNumerosRomanos.setBounds(24, 504, 149, 27);
		addPanel.add(lblNumerosRomanos);
		

		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(252, 209, 156));
		navPanel.setBounds(459, 0, 225, 611);
		navPanel.setLayout(null);

		JButton goToEdit = new JButton("");
		goToEdit.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.edit();
			}
		});
		goToEdit.setBounds(57, 38, 131, 105);
		navPanel.add(goToEdit);

		JButton goToSearch = new JButton("");
		goToSearch.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-search-100.png")));
		goToSearch.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToSearch.setBackground(new Color(252, 209, 156));
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.search();
			}
		});
		goToSearch.setBounds(57, 181, 131, 105);
		navPanel.add(goToSearch);

		JButton goToDelete = new JButton("");
		goToDelete.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-delete-100.png")));
		goToDelete.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDelete.setBackground(new Color(252, 209, 156));
		goToDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.delete();
			}
		});
		goToDelete.setBounds(57, 324, 131, 105);
		navPanel.add(goToDelete);

		JButton goToDwnld = new JButton("");
		goToDwnld.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.download();
			}
		});
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 467, 131, 105);
		navPanel.add(goToDwnld);

		contentPane.add(navPanel);
		contentPane.add(addPanel);
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
				controller = new StudentsController();
				controller.add();
			}
		});
		goToAdd.setIcon(new ImageIcon(TeacherEdit.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

		JButton goToSearch = new JButton("");
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
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
				controller = new StudentsController();
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
				controller = new StudentsController();
				controller.download();
			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 467, 131, 105);
		navPanel.add(goToDwnld);

		JPanel editPanel = new JPanel();
		editPanel.setBounds(0, 0, 461, 611);
		editPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(editPanel);
		editPanel.setLayout(null);

		JLabel editTxt = new JLabel("Editar Info. Alumno");
		editTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		editTxt.setBounds(24, 21, 394, 48);
		editPanel.add(editTxt);

		JLabel nameTxt = new JLabel("Editar Nombre");
		nameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		nameTxt.setBounds(24, 135, 129, 20);
		editPanel.add(nameTxt);

		JLabel lblIngresarApellido = new JLabel("Editar Apellido");
		lblIngresarApellido.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarApellido.setBounds(231, 135, 129, 20);
		editPanel.add(lblIngresarApellido);

		JTextField nameRequest = new JTextField();
		nameRequest.setBackground(new Color(230, 230, 230));
		nameRequest.setBounds(24, 164, 181, 20);
		editPanel.add(nameRequest);
		nameRequest.setColumns(10);

		JTextField lstNameReq = new JTextField();
		lstNameReq.setBackground(new Color(230, 230, 230));
		lstNameReq.setColumns(10);
		lstNameReq.setBounds(231, 164, 187, 20);
		editPanel.add(lstNameReq);

		JLabel lblIngresarEmail = new JLabel("Editar Email");
		lblIngresarEmail.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarEmail.setBounds(24, 210, 129, 20);
		editPanel.add(lblIngresarEmail);

		JTextField emailRequest = new JTextField();
		emailRequest.setColumns(10);
		emailRequest.setBackground(new Color(230, 230, 230));
		emailRequest.setBounds(24, 239, 181, 20);
		editPanel.add(emailRequest);

		JLabel lblIngresarTelefono = new JLabel("Editar Telefono");
		lblIngresarTelefono.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarTelefono.setBounds(24, 282, 129, 20);
		editPanel.add(lblIngresarTelefono);

		JTextField phoneReq = new JTextField();
		phoneReq.setColumns(10);
		phoneReq.setBackground(new Color(230, 230, 230));
		phoneReq.setBounds(24, 311, 181, 20);
		editPanel.add(phoneReq);

		JLabel lblIngresarFechaDe = new JLabel("Editar Fecha de Nacimiento");
		lblIngresarFechaDe.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarFechaDe.setBounds(24, 365, 204, 20);
		editPanel.add(lblIngresarFechaDe);

		JTextField birthDate = new JTextField();
		birthDate.setColumns(10);
		birthDate.setBackground(new Color(230, 230, 230));
		birthDate.setBounds(24, 394, 186, 20);
		editPanel.add(birthDate);


		JTextField schoolGrade = new JTextField();
		schoolGrade.setColumns(10);
		schoolGrade.setBackground(new Color(230, 230, 230));
		schoolGrade.setBounds(24, 484, 232, 20);
		editPanel.add(schoolGrade);

		JLabel lblIngresarGradoDe = new JLabel("Editar Semestre");
		lblIngresarGradoDe.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarGradoDe.setBounds(24, 455, 232, 20);
		editPanel.add(lblIngresarGradoDe);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.menu();
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBounds(24, 553, 152, 36);
		editPanel.add(backToMenu);

		JLabel IdTxt = new JLabel("Ingresar ID del Alumno");
		IdTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		IdTxt.setBounds(24, 93, 187, 20);
		editPanel.add(IdTxt);

		JTextField idField = new JTextField();
		idField.setColumns(10);
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(231, 93, 86, 20);
		editPanel.add(idField);

		JButton searchID = new JButton("Buscar");
		searchID.setFont(new Font("Lato", Font.PLAIN, 16));
		searchID.setBackground(new Color(252, 209, 156));
		searchID.setBounds(327, 92, 91, 22);
		searchID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				
				functions.searchForEdit(id,nameRequest,lstNameReq,emailRequest,phoneReq,birthDate, schoolGrade);
			}
		});
		editPanel.add(searchID);
		
		JButton addTeachBtn = new JButton("Completar");
		addTeachBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				String name = nameRequest.getText();
				String lstName = lstNameReq.getText();
				String email = emailRequest.getText();
				String phone = phoneReq.getText();
				String birth = birthDate.getText();
				String school = schoolGrade.getText();
				
				if(id.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No se introdujo ningún ID", "ERROR", JOptionPane.ERROR_MESSAGE);
					idField.requestFocus();
					
				}else if(functions.edit(id,name,lstName,email,phone,birth,school)) {
					JOptionPane.showMessageDialog(null, "Modificación Exitosa", "HECHO", JOptionPane.INFORMATION_MESSAGE);
					
					idField.setText("");
					nameRequest.setText("");
					lstNameReq.setText("");
					emailRequest.setText("");
					phoneReq.setText("");
					birthDate.setText("");
					schoolGrade.setText("");
					
					idField.requestFocus();
				}else {
					JOptionPane.showMessageDialog(null, "No se pudo modificar", "ERROR", JOptionPane.ERROR_MESSAGE);
					idField.setText("");
					nameRequest.setText("");
					lstNameReq.setText("");
					emailRequest.setText("");
					phoneReq.setText("");
					birthDate.setText("");
					schoolGrade.setText("");
					
					idField.requestFocus();
				}
				
			}
		});
		addTeachBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		addTeachBtn.setBackground(new Color(252, 209, 156));
		addTeachBtn.setBounds(266, 553, 152, 36);
		editPanel.add(addTeachBtn);

		JButton editPhoto = new JButton("Editar Foto");
		editPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		editPhoto.setFont(new Font("Lato", Font.PLAIN, 16));
		editPhoto.setBackground(new Color(252, 209, 156));
		editPhoto.setBounds(289, 325, 129, 29);
		editPanel.add(editPhoto);

		JLabel pictureHolder = new JLabel("");
		pictureHolder.setHorizontalAlignment(SwingConstants.CENTER);
		pictureHolder.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-circled-user-100.png")));
		pictureHolder.setBounds(289, 195, 129, 130);
		editPanel.add(pictureHolder);


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
				controller = new StudentsController();
				controller.add();
			}
		});
		goToAdd.setIcon(new ImageIcon(TeacherEdit.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.edit();
			}
		});
		goToEdit.setIcon(new ImageIcon(TeacherSearch.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 181, 131, 105);
		navPanel.add(goToEdit);

		JButton goToDelete = new JButton("");
		goToDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
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
				controller = new StudentsController();
				controller.download();
			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 467, 131, 105);
		navPanel.add(goToDwnld);

		JPanel searchPanel = new JPanel();
		searchPanel.setBackground(new Color(255, 255, 255));
		searchPanel.setBounds(0, 0, 460, 611);
		contentPane.add(searchPanel);
		searchPanel.setLayout(null);

		JLabel titleTxt = new JLabel("Consultar Info. de Registros");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 35));
		titleTxt.setBounds(10, 21, 426, 48);
		searchPanel.add(titleTxt);

		JTable table = new JTable();
		table.setFont(new Font("Lato", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Apellido", "Fecha_Nacimiento", "Email", "Telefono", "Foto", "Semestre"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(104);
		table.getColumnModel().getColumn(7).setPreferredWidth(92);
		table.setBounds(16, 152, 426, 361);
		searchPanel.add(table);

		JButton searchID = new JButton("Mostrar Registros");
		searchID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				functions.dataTable(table);
			}
		});
		searchID.setFont(new Font("Lato", Font.PLAIN, 16));
		searchID.setBackground(new Color(252, 209, 156));
		searchID.setBounds(31, 91, 125, 30);
		searchPanel.add(searchID);
		

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.menu();
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setBounds(10, 551, 152, 36);
		searchPanel.add(backToMenu);

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
				controller = new StudentsController();
				controller.add();
			}
		});
		goToAdd.setIcon(new ImageIcon(TeacherEdit.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

		JButton goToSearch = new JButton("");
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
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
				controller = new StudentsController();
				controller.delete();
			}
		});
		goToDelete.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-delete-100.png")));
		goToDelete.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDelete.setBackground(new Color(252, 209, 156));
		goToDelete.setBounds(57, 324, 131, 105);
		navPanel.add(goToDelete);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.edit();
			}
		});
		goToEdit.setIcon(new ImageIcon(TeacherDwnld.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 467, 131, 105);
		navPanel.add(goToEdit);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 461, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Descargar Info. del Alumno");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 35));
		titleTxt.setBounds(10, 11, 441, 53);
		panel.add(titleTxt);

		JLabel idTxt = new JLabel("Introduzca ID del Alumno");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(10, 140, 195, 20);
		panel.add(idTxt);
		
		JTextField idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(199, 140, 136, 20);
		panel.add(idField);
		idField.setColumns(10);
		
		JLabel pictureHolder = new JLabel("");
		pictureHolder.setHorizontalAlignment(SwingConstants.CENTER);
		pictureHolder.setIcon(new ImageIcon(TeacherDwnld.class.getResource(pictureRoot)));
		pictureHolder.setBounds(24, 235, 220, 200);
		panel.add(pictureHolder);

		JButton searchBtn = new JButton("Buscar");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				//functions.downloadSearch(id); PENDIENTEEE
			}
		});
		searchBtn.setBackground(new Color(252, 209, 156));
		searchBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		searchBtn.setBounds(345, 139, 89, 23);
		panel.add(searchBtn);

		

		JButton dwnldInfo = new JButton("Descargar Info.");
		dwnldInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				if(functions.download(id)) {
					JOptionPane.showMessageDialog(null, "PDF descargado con éxito", "HECHO", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Un error ha ocurrido", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		dwnldInfo.setBackground(new Color(252, 209, 156));
		dwnldInfo.setFont(new Font("Lato", Font.PLAIN, 16));
		dwnldInfo.setBounds(267, 276, 167, 32);
		panel.add(dwnldInfo);

		JButton generateCred = new JButton("Generar Credencial");
		generateCred.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		generateCred.setBackground(new Color(252, 209, 156));
		generateCred.setFont(new Font("Lato", Font.PLAIN, 16));
		generateCred.setBounds(267, 362, 167, 32);
		panel.add(generateCred);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.menu();
			}
		});
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setBounds(10, 553, 152, 36);
		panel.add(backToMenu);

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
				controller = new StudentsController();
				controller.add();
			}
		});
		goToAdd.setIcon(new ImageIcon(TeacherEdit.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

		JButton goToSearch = new JButton("");
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
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
				controller = new StudentsController();
				controller.download();
			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherDelete.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 324, 131, 105);
		navPanel.add(goToDwnld);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.edit();
			}
		});
		goToEdit.setIcon(new ImageIcon(TeacherDwnld.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 467, 131, 105);
		navPanel.add(goToEdit);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 460, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblEliminarInfoDocente = new JLabel("Eliminar Info. Alumno");
		lblEliminarInfoDocente.setFont(new Font("Lato", Font.PLAIN, 35));
		lblEliminarInfoDocente.setBounds(10, 11, 441, 53);
		panel.add(lblEliminarInfoDocente);

		JLabel pictureHolder = new JLabel("");
		pictureHolder.setIcon(new ImageIcon(TeacherDelete.class.getResource("/Icons/icons8-circled-user-200.png")));
		pictureHolder.setHorizontalAlignment(SwingConstants.CENTER);
		pictureHolder.setBounds(24, 235, 220, 200);
		panel.add(pictureHolder);

		JButton searchBtn = new JButton("Buscar");
		searchBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		searchBtn.setBackground(new Color(252, 209, 156));
		searchBtn.setBounds(345, 119, 89, 23);
		panel.add(searchBtn);

		JTextField idField = new JTextField();
		idField.setColumns(10);
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(199, 120, 136, 20);
		panel.add(idField);

		JLabel idTxt = new JLabel("Introduzca ID del Alumno");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(10, 120, 195, 20);
		panel.add(idTxt);
		
		JButton deleteBtn = new JButton("Eliminar Alumno");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				
				if(id.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Campo ID está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);
				}else if(functions.delete(id)) {
					JOptionPane.showMessageDialog(null, "Se eliminó correctamente", "HECHO", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "No se encontró ese ID", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		deleteBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteBtn.setBackground(new Color(252, 209, 156));
		deleteBtn.setBounds(267, 319, 167, 32);
		panel.add(deleteBtn);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				controller = new StudentsController();
				controller.menu();
			}
		});
		backToMenu.setBounds(10, 553, 152, 36);
		panel.add(backToMenu);

		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
		
	}
	
}

