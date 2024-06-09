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
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class editGroups extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idField;
	private JTextField studentCount;
	private JTextField signatureField;
	private JTextField teacherField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editGroups frame = new editGroups();
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
	public editGroups() {
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
		goToAdd.setIcon(new ImageIcon(editGroups.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 38, 131, 105);
		navPanel.add(goToAdd);

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
		
		idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(185, 141, 147, 22);
		panel.add(idField);
		idField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Lato", Font.PLAIN, 16));
		btnNewButton.setBounds(351, 141, 89, 23);
		panel.add(btnNewButton);
		
		JLabel studentCountTxt = new JLabel("Cantidad de Estudiantes");
		studentCountTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		studentCountTxt.setBounds(19, 253, 187, 20);
		panel.add(studentCountTxt);
		
		studentCount = new JTextField();
		studentCount.setColumns(10);
		studentCount.setBackground(new Color(230, 230, 230));
		studentCount.setBounds(215, 254, 225, 22);
		panel.add(studentCount);
		
		JLabel signatureTxt = new JLabel("Asignatura");
		signatureTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		signatureTxt.setBounds(19, 322, 147, 20);
		panel.add(signatureTxt);
		
		signatureField = new JTextField();
		signatureField.setColumns(10);
		signatureField.setBackground(new Color(230, 230, 230));
		signatureField.setBounds(215, 323, 225, 22);
		panel.add(signatureField);
		
		JLabel teacherTxt = new JLabel("Profesor");
		teacherTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		teacherTxt.setBounds(19, 404, 147, 20);
		panel.add(teacherTxt);
		
		teacherField = new JTextField();
		teacherField.setColumns(10);
		teacherField.setBackground(new Color(230, 230, 230));
		teacherField.setBounds(215, 404, 225, 22);
		panel.add(teacherField);
		
		
	}
}
