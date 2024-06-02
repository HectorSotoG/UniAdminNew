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
import javax.swing.SwingConstants;

public class TeacherDwnld extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherDwnld frame = new TeacherDwnld();
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
	public TeacherDwnld() {
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
		goToAdd.setIcon(new ImageIcon(TeacherEdit.class.getResource("/Icons/icons8-add-100.png")));
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
		
		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JLabel titleTxt = new JLabel("Descargar Info. Docente");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 35));
		titleTxt.setBounds(10, 11, 441, 53);
		panel.add(titleTxt);
		
		JLabel idTxt = new JLabel("Introduzca ID del Docente");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(10, 140, 195, 20);
		panel.add(idTxt);
		
		JButton searchBtn = new JButton("Buscar");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchBtn.setBackground(new Color(252, 209, 156));
		searchBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		searchBtn.setBounds(345, 139, 89, 23);
		panel.add(searchBtn);
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 230, 230));
		textField.setBounds(199, 140, 136, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel pictureHolder = new JLabel("");
		pictureHolder.setHorizontalAlignment(SwingConstants.CENTER);
		pictureHolder.setIcon(new ImageIcon(TeacherDwnld.class.getResource("/Icons/icons8-circled-user-200.png")));
		pictureHolder.setBounds(24, 235, 220, 200);
		panel.add(pictureHolder);
		
		JButton dwnldInfo = new JButton("Descargar Info.");
		dwnldInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			}
		});
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setBounds(10, 553, 152, 36);
		panel.add(backToMenu);
	}
}
