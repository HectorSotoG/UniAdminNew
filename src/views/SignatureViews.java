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
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controllers.HomeController;
import controllers.SignatureController;
import designer.AddGroups;
import designer.TeacherAdd;
import designer.addSignature;
import designer.detailsSignature;
import designer.signatureMenu;
import models.SignatureModel;
import models.StudentsModel;

public class SignatureViews {
	private JFrame frame;
	private JPanel contentPane;
	private SignatureController controller;
	private HomeController home;
	private SignatureModel functions;

	public SignatureViews() {
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

		functions = new SignatureModel();
	}

	public void menu() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "name_234449348487600");
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Información Asignaturas");
		titleTxt.setHorizontalAlignment(SwingConstants.CENTER);
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(110, 11, 487, 107);
		panel.add(titleTxt);

		JButton addButton = new JButton("");
		addButton.setBackground(new Color(252, 209, 156));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.add();
			}
		});
		addButton.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-add-100.png")));
		addButton.setFont(new Font("Lato", Font.PLAIN, 16));
		addButton.setBounds(41, 174, 170, 122);
		panel.add(addButton);

		JLabel addTxt = new JLabel("Añadir");
		addTxt.setHorizontalAlignment(SwingConstants.CENTER);
		addTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		addTxt.setBounds(90, 319, 72, 14);
		panel.add(addTxt);

		JButton editButton = new JButton("");
		editButton.setBackground(new Color(252, 209, 156));
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.edit();
			}
		});
		editButton.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-edit-100.png")));
		editButton.setFont(new Font("Lato", Font.PLAIN, 16));
		editButton.setBounds(252, 174, 170, 122);
		panel.add(editButton);

		JLabel editTxt = new JLabel("Editar");
		editTxt.setHorizontalAlignment(SwingConstants.CENTER);
		editTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		editTxt.setBounds(301, 319, 72, 14);
		panel.add(editTxt);

		JButton detailsBttn = new JButton("");
		detailsBttn.setBackground(new Color(252, 209, 156));
		detailsBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.details();
			}
		});
		detailsBttn.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-download-100.png")));
		detailsBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		detailsBttn.setBounds(463, 174, 170, 122);
		panel.add(detailsBttn);

		JLabel detailsTxt = new JLabel("Detalles");
		detailsTxt.setHorizontalAlignment(SwingConstants.CENTER);
		detailsTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		detailsTxt.setBounds(512, 319, 72, 14);
		panel.add(detailsTxt);

		JButton deleteBttn = new JButton("");
		deleteBttn.setBackground(new Color(252, 209, 156));
		deleteBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();

				controller = new SignatureController();
				controller.delete();
			}
		});
		deleteBttn.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-delete-100.png")));
		deleteBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteBttn.setBounds(136, 409, 170, 122);
		panel.add(deleteBttn);

		JLabel deleteTxt = new JLabel("Eliminar");
		deleteTxt.setHorizontalAlignment(SwingConstants.CENTER);
		deleteTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteTxt.setBounds(185, 554, 72, 14);
		panel.add(deleteTxt);

		JButton backToMain = new JButton("");
		backToMain.setBackground(new Color(252, 209, 156));
		backToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				home = new HomeController();
				home.dashboard();
			}
		});
		backToMain.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-back-100.png")));
		backToMain.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMain.setBounds(397, 409, 170, 122);
		panel.add(backToMain);

		JLabel backTxt = new JLabel("Volver");
		backTxt.setHorizontalAlignment(SwingConstants.CENTER);
		backTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		backTxt.setBounds(446, 554, 72, 14);
		panel.add(backTxt);

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

				controller = new SignatureController();
				controller.edit();
			}
		});
		goToEdit.setIcon(new ImageIcon(AddGroups.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 74, 131, 105);
		navPanel.add(goToEdit);

		JButton goToDelete = new JButton("");
		goToDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.delete();

			}
		});
		goToDelete.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-delete-100.png")));
		goToDelete.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDelete.setBackground(new Color(252, 209, 156));
		goToDelete.setBounds(57, 253, 131, 105);
		navPanel.add(goToDelete);

		JButton goToDetails = new JButton("");
		goToDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.details();
			}
		});
		goToDetails.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDetails.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDetails.setBackground(new Color(252, 209, 156));
		goToDetails.setBounds(57, 432, 131, 105);
		navPanel.add(goToDetails);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 460, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Añadir Asignatura");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(23, 24, 403, 53);
		panel.add(titleTxt);

		JLabel nameTxt = new JLabel("Introduzca Nombre de Asignatura");
		nameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		nameTxt.setBounds(23, 130, 244, 20);
		panel.add(nameTxt);

		JTextField nameField = new JTextField();
		nameField.setBackground(new Color(230, 230, 230));
		nameField.setBounds(23, 168, 403, 20);
		panel.add(nameField);
		nameField.setColumns(10);

		JTextField careerField = new JTextField();
		careerField.setBackground(new Color(230, 230, 230));
		careerField.setColumns(10);
		careerField.setBackground(new Color(230, 230, 230));
		careerField.setBounds(23, 251, 403, 20);
		panel.add(careerField);

		JLabel careerNameTxt = new JLabel("Introduzca Carrera donde se Imparte");
		careerNameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		careerNameTxt.setBounds(23, 213, 300, 20);
		panel.add(careerNameTxt);

		JLabel teacherID = new JLabel("Introduzca ID del Profesor");
		teacherID.setFont(new Font("Lato", Font.PLAIN, 16));
		teacherID.setBounds(23, 294, 300, 20);
		panel.add(teacherID);

		JTextField teacherField = new JTextField();
		teacherField.setColumns(10);
		teacherField.setBackground(new Color(230, 230, 230));
		teacherField.setBounds(23, 332, 403, 20);
		panel.add(teacherField);

		JRadioButton optional = new JRadioButton("Marcar si es Optativa");
		optional.setBackground(new Color(255, 255, 255));
		optional.setFont(new Font("Lato", Font.ITALIC, 16));
		optional.setBounds(23, 398, 192, 23);
		panel.add(optional);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.menu();
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBounds(23, 546, 145, 35);
		panel.add(backToMenu);

		JButton addBttn = new JButton("Añadir Asignatura");
		addBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = nameField.getText();
				String teacher = teacherField.getText();
				String isOptional;

				if (optional.isSelected()) {
					isOptional = "Si";
				} else {
					isOptional = "No";
				}

				String career = careerField.getText();

				if (name.isEmpty() || teacher.isEmpty() || career.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Algún campo está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else if (functions.add(name, teacher, isOptional, career)) {
					JOptionPane.showMessageDialog(null, "Nueva asignatura registrada", "HECHO",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "No se pudo añadir la asignatura", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		addBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		addBttn.setBackground(new Color(252, 209, 156));
		addBttn.setBounds(267, 546, 159, 35);
		panel.add(addBttn);

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

				controller = new SignatureController();
				controller.add();
			}
		});
		goToAdd.setIcon(new ImageIcon(addSignature.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 74, 131, 105);
		navPanel.add(goToAdd);

		JButton goToDelete = new JButton("");
		goToDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.delete();

			}
		});
		goToDelete.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-delete-100.png")));
		goToDelete.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDelete.setBackground(new Color(252, 209, 156));
		goToDelete.setBounds(57, 253, 131, 105);
		navPanel.add(goToDelete);

		JButton goToDwnld = new JButton("");
		goToDwnld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.details();
			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 432, 131, 105);
		navPanel.add(goToDwnld);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 460, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Editar Asignatura");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(23, 24, 403, 53);
		panel.add(titleTxt);

		JLabel signatureIdTxt = new JLabel("Ingresa ID de la Asignatura");
		signatureIdTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		signatureIdTxt.setBounds(23, 137, 244, 20);
		panel.add(signatureIdTxt);

		JTextField idField = new JTextField();
		idField.setColumns(10);
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(218, 137, 105, 20);
		panel.add(idField);

		JLabel nameTxt = new JLabel("Editar Nombre de Asignatura");
		nameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		nameTxt.setBounds(23, 186, 244, 20);
		panel.add(nameTxt);

		JTextField nameField = new JTextField();
		nameField.setBackground(new Color(230, 230, 230));
		nameField.setBounds(23, 224, 403, 20);
		panel.add(nameField);
		nameField.setColumns(10);

		JTextField careerField = new JTextField();
		careerField.setBackground(new Color(230, 230, 230));
		careerField.setColumns(10);
		careerField.setBackground(new Color(230, 230, 230));
		careerField.setBounds(23, 307, 403, 20);
		panel.add(careerField);

		JLabel careerNameTxt = new JLabel("Editar Carrera donde se Imparte");
		careerNameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		careerNameTxt.setBounds(23, 269, 300, 20);
		panel.add(careerNameTxt);

		JLabel teacherID = new JLabel("Editar ID del Profesor");
		teacherID.setFont(new Font("Lato", Font.PLAIN, 16));
		teacherID.setBounds(23, 350, 300, 20);
		panel.add(teacherID);

		JTextField teacherField = new JTextField();
		teacherField.setColumns(10);
		teacherField.setBackground(new Color(230, 230, 230));
		teacherField.setBounds(23, 388, 403, 20);
		panel.add(teacherField);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.menu();
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBounds(23, 546, 145, 35);
		panel.add(backToMenu);

		JRadioButton optional = new JRadioButton("Marcar si es Optativa");
		optional.setBackground(new Color(255, 255, 255));
		optional.setFont(new Font("Lato", Font.ITALIC, 16));
		optional.setBounds(23, 454, 192, 23);
		panel.add(optional);

		JButton searchBttn = new JButton("Buscar");
		searchBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();

				functions.searchEdit(id, nameField, teacherField, optional, careerField);
			}
		});
		searchBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		searchBttn.setBackground(new Color(252, 209, 156));
		searchBttn.setBounds(333, 137, 97, 20);
		panel.add(searchBttn);

		JButton editBttn = new JButton("Editar Asignatura");
		editBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				String name = nameField.getText();
				String teacher = teacherField.getText();
				String career = careerField.getText();
				String isOptional;

				if (optional.isSelected()) {
					isOptional = "Si";
				} else {
					isOptional = "No";
				}

				if (name.isEmpty() || teacher.isEmpty() || career.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Algún campo está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else if (functions.edit(id, name, teacher, isOptional, career)) {
					JOptionPane.showMessageDialog(null, "Modificación Exitosa", "HECHO",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "No fue posible Modificar", "ERROR", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		editBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		editBttn.setBackground(new Color(252, 209, 156));
		editBttn.setBounds(267, 546, 159, 35);
		panel.add(editBttn);

		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}

	public void details() {
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

				controller = new SignatureController();
				controller.add();
			}
		});
		goToAdd.setIcon(new ImageIcon(addSignature.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 74, 131, 105);
		navPanel.add(goToAdd);

		JButton goToDelete = new JButton("");
		goToDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();

				controller = new SignatureController();
				controller.delete();

			}
		});
		goToDelete.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-delete-100.png")));
		goToDelete.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDelete.setBackground(new Color(252, 209, 156));
		goToDelete.setBounds(57, 253, 131, 105);
		navPanel.add(goToDelete);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.edit();
			}
		});
		goToEdit.setIcon(new ImageIcon(detailsSignature.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 432, 131, 105);
		navPanel.add(goToEdit);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 459, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Detalles Asignatura");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(10, 24, 403, 53);
		panel.add(titleTxt);

		JLabel idTxt = new JLabel("Ingresa ID de Asignatura");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(9, 130, 175, 20);
		panel.add(idTxt);

		JTextField idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(193, 132, 156, 20);
		panel.add(idField);
		idField.setColumns(10);

		JTable table = new JTable();
		table.setBounds(10, 161, 439, 346);
		panel.add(table);

		JButton searchID = new JButton("Buscar");
		searchID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();

				if (id.isEmpty()) {
					JOptionPane.showMessageDialog(null, "el campo ID está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					functions.dataTable(table, id);
				}
			}
		});
		searchID.setFont(new Font("Lato", Font.PLAIN, 16));
		searchID.setBackground(new Color(252, 209, 156));
		searchID.setBounds(358, 132, 92, 20);
		panel.add(searchID);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.menu();
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBounds(10, 546, 145, 35);
		panel.add(backToMenu);

		JButton editBttn = new JButton("Descargar");
		editBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();

				if (id.isEmpty()) {
					JOptionPane.showMessageDialog(null, "el campo ID está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else if (functions.download(id)) {
					JOptionPane.showMessageDialog(null, "PDF descargado con Éxito", "HECHO",
							JOptionPane.INFORMATION_MESSAGE);
				} else {

					JOptionPane.showMessageDialog(null, "No se pudo ejecutar la descarga", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		editBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		editBttn.setBackground(new Color(252, 209, 156));
		editBttn.setBounds(290, 546, 159, 35);
		panel.add(editBttn);

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

				controller = new SignatureController();
				controller.add();
			}
		});
		goToAdd.setIcon(new ImageIcon(addSignature.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 74, 131, 105);
		navPanel.add(goToAdd);

		JButton goToDetails = new JButton("");
		goToDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.details();

			}
		});
		goToDetails.setIcon(new ImageIcon(detailsSignature.class.getResource("/Icons/icons8-download-100.png")));
		goToDetails.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDetails.setBackground(new Color(252, 209, 156));
		goToDetails.setBounds(57, 253, 131, 105);
		navPanel.add(goToDetails);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.edit();
			}
		});
		goToEdit.setIcon(new ImageIcon(detailsSignature.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 432, 131, 105);
		navPanel.add(goToEdit);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 459, 611);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel titleTxt = new JLabel("Eliminar Asignatura");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(10, 24, 403, 53);
		panel.add(titleTxt);

		JLabel idTxt = new JLabel("Ingresa ID de Asignatura");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(9, 130, 175, 20);
		panel.add(idTxt);

		JTextField idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(193, 132, 156, 20);
		panel.add(idField);
		idField.setColumns(10);

		JTable table = new JTable();
		table.setBounds(10, 161, 439, 346);
		panel.add(table);

		JButton searchID = new JButton("Buscar");
		searchID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();

				if (id.isEmpty()) {
					JOptionPane.showMessageDialog(null, "El campo ID está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					functions.dataTable(table, id);
				}
			}
		});
		searchID.setFont(new Font("Lato", Font.PLAIN, 16));
		searchID.setBackground(new Color(252, 209, 156));
		searchID.setBounds(358, 132, 92, 20);
		panel.add(searchID);

		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

				controller = new SignatureController();
				controller.menu();
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBounds(10, 546, 145, 35);
		panel.add(backToMenu);

		JButton deleteBttn = new JButton("Eliminar Asignatura");
		deleteBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = idField.getText();

				if (id.isEmpty()) {
					JOptionPane.showMessageDialog(null, "El campo ID está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else if (functions.delete(id)) {
					JOptionPane.showMessageDialog(null, "Asignatura eliminada", "HECHO",
							JOptionPane.INFORMATION_MESSAGE);
				} else {

					JOptionPane.showMessageDialog(null, "No se logró eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		deleteBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteBttn.setBackground(new Color(252, 209, 156));
		deleteBttn.setBounds(262, 546, 187, 35);
		panel.add(deleteBttn);

		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}
}
