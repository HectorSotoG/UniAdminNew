package designer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentAdd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameRequest;
	private JTextField lstNameReq;
	private JTextField emailRequest;
	private JTextField phoneReq;
	private JTextField dayBirth;
	private JTextField monthBirth;
	private JTextField yearBirth;
	private JTextField schoolGrade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherAdd frame = new TeacherAdd();
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
	public StudentAdd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel addPanel = new JPanel();
		addPanel.setBounds(0, 0, 461, 611);
		addPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(addPanel);
		addPanel.setLayout(null);
		
		JLabel addTxt = new JLabel("Añadir Docente");
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
		
		nameRequest = new JTextField();
		nameRequest.setBackground(new Color(230, 230, 230));
		nameRequest.setBounds(24, 124, 181, 20);
		addPanel.add(nameRequest);
		nameRequest.setColumns(10);
		
		lstNameReq = new JTextField();
		lstNameReq.setBackground(new Color(230, 230, 230));
		lstNameReq.setColumns(10);
		lstNameReq.setBounds(231, 124, 187, 20);
		addPanel.add(lstNameReq);
		
		JLabel lblIngresarEmail = new JLabel("Ingresar Email");
		lblIngresarEmail.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarEmail.setBounds(24, 187, 129, 20);
		addPanel.add(lblIngresarEmail);
		
		emailRequest = new JTextField();
		emailRequest.setColumns(10);
		emailRequest.setBackground(new Color(230, 230, 230));
		emailRequest.setBounds(24, 216, 181, 20);
		addPanel.add(emailRequest);
		
		JLabel lblIngresarTelefono = new JLabel("Ingresar Telefono");
		lblIngresarTelefono.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarTelefono.setBounds(24, 282, 129, 20);
		addPanel.add(lblIngresarTelefono);
		
		phoneReq = new JTextField();
		phoneReq.setColumns(10);
		phoneReq.setBackground(new Color(230, 230, 230));
		phoneReq.setBounds(24, 311, 181, 20);
		addPanel.add(phoneReq);
		
		JLabel lblIngresarFechaDe = new JLabel("Ingresar Fecha de Nacimiento");
		lblIngresarFechaDe.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarFechaDe.setBounds(24, 365, 204, 20);
		addPanel.add(lblIngresarFechaDe);
		
		dayBirth = new JTextField();
		dayBirth.setColumns(10);
		dayBirth.setBackground(new Color(230, 230, 230));
		dayBirth.setBounds(24, 394, 70, 20);
		addPanel.add(dayBirth);
		
		monthBirth = new JTextField();
		monthBirth.setColumns(10);
		monthBirth.setBackground(new Color(230, 230, 230));
		monthBirth.setBounds(106, 394, 70, 20);
		addPanel.add(monthBirth);
		
		yearBirth = new JTextField();
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
		
		schoolGrade = new JTextField();
		schoolGrade.setFont(new Font("Lato", Font.PLAIN, 11));
		schoolGrade.setColumns(10);
		schoolGrade.setBackground(new Color(230, 230, 230));
		schoolGrade.setBounds(24, 484, 232, 20);
		addPanel.add(schoolGrade);
		
		JLabel lblIngresarGradoDe = new JLabel("Ingresar Grado de Estudios");
		lblIngresarGradoDe.setFont(new Font("Lato", Font.PLAIN, 16));
		lblIngresarGradoDe.setBounds(24, 455, 232, 20);
		addPanel.add(lblIngresarGradoDe);
		
		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBounds(24, 553, 152, 36);
		addPanel.add(backToMenu);
		
		JButton addTeachBtn = new JButton("Añadir");
		addTeachBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addTeachBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		addTeachBtn.setBackground(new Color(252, 209, 156));
		addTeachBtn.setBounds(266, 553, 152, 36);
		addPanel.add(addTeachBtn);
		
		JButton addPhoto = new JButton("Añadir Foto");
		addPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		contentPane.add(navPanel);
		navPanel.setLayout(null);
		
		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		goToEdit.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-edit-100.png")));
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
	}
}
