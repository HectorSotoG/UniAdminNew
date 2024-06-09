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
	private JTextField studentField;
	private JTextField idClass;
	private JTextField idTeacher;
	private JTextField nameField;
	private JTextField scheduleField;

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
		titleTxtx.setBounds(13, 41, 385, 60);
		panel.add(titleTxtx);
		
		JLabel studentAmountTxt = new JLabel("Introduzca la cantidad de Alumnos");
		studentAmountTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		studentAmountTxt.setBounds(13, 174, 256, 20);
		panel.add(studentAmountTxt);
		
		studentField = new JTextField();
		studentField.setBackground(new Color(230, 230, 230));
		studentField.setBackground(new Color(230, 230, 230));
		studentField.setFont(new Font("Lato", Font.PLAIN, 14));
		studentField.setBounds(264, 174, 188, 20);
		panel.add(studentField);
		studentField.setColumns(10);
		
		idClass = new JTextField();
		idClass.setFont(new Font("Lato", Font.PLAIN, 14));
		idClass.setColumns(10);
		idClass.setBackground(new Color(230, 230, 230));
		idClass.setBounds(264, 236, 188, 20);
		panel.add(idClass);
		
		JLabel idClassTxt = new JLabel("Introduzca ID Asignatura");
		idClassTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idClassTxt.setBounds(13, 236, 188, 20);
		panel.add(idClassTxt);
		
		idTeacher = new JTextField();
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
		
		nameField = new JTextField();
		nameField.setFont(new Font("Lato", Font.PLAIN, 14));
		nameField.setColumns(10);
		nameField.setBackground(new Color(230, 230, 230));
		nameField.setBounds(264, 302, 188, 20);
		panel.add(nameField);
		
		JLabel turnTxt = new JLabel("Introduzca ID del Docente");
		turnTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		turnTxt.setBounds(17, 428, 188, 20);
		panel.add(turnTxt);
		
		scheduleField = new JTextField();
		scheduleField.setFont(new Font("Lato", Font.PLAIN, 14));
		scheduleField.setColumns(10);
		scheduleField.setBackground(new Color(230, 230, 230));
		scheduleField.setBounds(264, 428, 188, 20);
		panel.add(scheduleField);
	}
}
