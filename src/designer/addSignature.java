package designer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controllers.GroupsController;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class addSignature extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private JTextField careerField;
	private JTextField teacherField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addSignature frame = new addSignature();
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
	public addSignature() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel navPanel = new JPanel();
		navPanel.setBackground(new Color(252, 209, 156));
		navPanel.setBounds(459, 0, 225, 611);
		contentPane.add(navPanel);
		navPanel.setLayout(null);

		JButton goToAdd = new JButton("");
		goToAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		
		JLabel nameTxt = new JLabel("Editar Nombre de Asignatura");
		nameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		nameTxt.setBounds(23, 130, 244, 20);
		panel.add(nameTxt);
		
		nameField = new JTextField();
		nameField.setBackground(new Color(230, 230, 230));
		nameField.setBounds(23, 168, 403, 20);
		panel.add(nameField);
		nameField.setColumns(10);
		
		careerField = new JTextField();
		careerField.setBackground(new Color(230, 230, 230));
		careerField.setColumns(10);
		careerField.setBackground(new Color(230, 230, 230));
		careerField.setBounds(23, 251, 403, 20);
		panel.add(careerField);
		
		JLabel careerNameTxt = new JLabel("Editar Carrera donde se Imparte");
		careerNameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		careerNameTxt.setBounds(23, 213, 300, 20);
		panel.add(careerNameTxt);
		
		JLabel teacherID = new JLabel("Editar ID del Profesor");
		teacherID.setFont(new Font("Lato", Font.PLAIN, 16));
		teacherID.setBounds(23, 294, 300, 20);
		panel.add(teacherID);
		
		teacherField = new JTextField();
		teacherField.setColumns(10);
		teacherField.setBackground(new Color(230, 230, 230));
		teacherField.setBounds(23, 332, 403, 20);
		panel.add(teacherField);
		
		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBounds(23, 546, 145, 35);
		panel.add(backToMenu);
		
		JButton editBttn = new JButton("Editar Asignatura");
		editBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		editBttn.setBackground(new Color(252, 209, 156));
		editBttn.setBounds(267, 546, 159, 35);
		panel.add(editBttn);
		
		JRadioButton optional = new JRadioButton("Marcar si es Optativa");
		optional.setBackground(new Color(255, 255, 255));
		optional.setFont(new Font("Lato", Font.ITALIC, 16));
		optional.setBounds(23, 398, 192, 23);
		panel.add(optional);
	}
}
