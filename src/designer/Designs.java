package designer;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Designs extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField emailRequest;
	private JPasswordField passRequest;
	private JTextField nameReq;
	private JTextField lstNameReq;
	private JTextField emailReq_1;
	private JPasswordField passReq_1;
	private JPasswordField confirmPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Designs frame = new Designs();
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
	public Designs() {
		setTitle("UniAdmin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 650);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel regPanel = new JPanel();
		regPanel.setBackground(new Color(255, 255, 255));
		regPanel.setBounds(0, 0, 404, 611);
		contentPane.add(regPanel);
		regPanel.setLayout(null);
		
		JLabel regTxt = new JLabel("REGISTRO");
		regTxt.setFont(new Font("Lato", Font.BOLD, 43));
		regTxt.setBounds(14, 31, 363, 45);
		regPanel.add(regTxt);
		
		JLabel nameTxt = new JLabel("Ingrese su Nombre");
		nameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		nameTxt.setBounds(14, 115, 130, 20);
		regPanel.add(nameTxt);
		
		nameReq = new JTextField();
		nameReq.setFont(new Font("Lato", Font.PLAIN, 16));
		nameReq.setBackground(new Color(230, 230, 230));
		nameReq.setBounds(14, 141, 166, 20);
		regPanel.add(nameReq);
		nameReq.setColumns(10);
		
		lstNameReq = new JTextField();
		lstNameReq.setFont(new Font("Lato", Font.PLAIN, 16));
		lstNameReq.setColumns(10);
		lstNameReq.setBackground(new Color(230, 230, 230));
		lstNameReq.setBounds(217, 141, 166, 20);
		regPanel.add(lstNameReq);
		
		JLabel lstNameTxt = new JLabel("Ingrese su Apellido");
		lstNameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		lstNameTxt.setBounds(217, 115, 160, 20);
		regPanel.add(lstNameTxt);
		
		JLabel emailTxt_1 = new JLabel("Ingrese su Email");
		emailTxt_1.setFont(new Font("Lato", Font.PLAIN, 16));
		emailTxt_1.setBounds(14, 197, 181, 20);
		regPanel.add(emailTxt_1);
		
		emailReq_1 = new JTextField();
		emailReq_1.setFont(new Font("Lato", Font.PLAIN, 16));
		emailReq_1.setColumns(10);
		emailReq_1.setBackground(new Color(230, 230, 230));
		emailReq_1.setBounds(14, 228, 369, 20);
		regPanel.add(emailReq_1);
		
		JLabel passTxt_1 = new JLabel("Ingrese su Contraseña");
		passTxt_1.setFont(new Font("Lato", Font.PLAIN, 16));
		passTxt_1.setBounds(14, 287, 181, 20);
		regPanel.add(passTxt_1);
		
		passReq_1 = new JPasswordField();
		passReq_1.setBackground(new Color(230, 230, 230));
		passReq_1.setFont(new Font("Lato", Font.PLAIN, 16));
		passReq_1.setBounds(14, 318, 369, 20);
		regPanel.add(passReq_1);
		
		confirmPass = new JPasswordField();
		confirmPass.setFont(new Font("Lato", Font.PLAIN, 16));
		confirmPass.setBackground(new Color(230, 230, 230));
		confirmPass.setBounds(14, 413, 369, 20);
		regPanel.add(confirmPass);
		
		JLabel passTxt_1_1 = new JLabel("Confirme su Contraseña");
		passTxt_1_1.setFont(new Font("Lato", Font.PLAIN, 16));
		passTxt_1_1.setBounds(14, 382, 181, 20);
		regPanel.add(passTxt_1_1);
		
		JButton backToLogin = new JButton("Volver a Login");
		backToLogin.setBackground(new Color(252, 209, 156));
		backToLogin.setFont(new Font("Lato", Font.PLAIN, 16));
		backToLogin.setBounds(14, 511, 139, 36);
		regPanel.add(backToLogin);
		
		JButton registerBtn = new JButton("Registrarse");
		registerBtn.setBackground(new Color(252, 209, 156));
		registerBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		registerBtn.setBounds(238, 511, 139, 36);
		regPanel.add(registerBtn);
		
		JPanel picturePanel = new JPanel();
		picturePanel.setBounds(403, 0, 281, 611);
		contentPane.add(picturePanel);
		picturePanel.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(Designs.class.getResource("/Icons/UNiAdmin (1).png")));
		logo.setBounds(56, 213, 200, 151);
		picturePanel.add(logo);
		
		JLabel blackBG = new JLabel("");
		blackBG.setOpaque(true);
		blackBG.setEnabled(false);
		blackBG.setBackground(new Color(0, 0, 0, 115));
		blackBG.setBounds(0, 0, 295, 611);
		picturePanel.add(blackBG);
		
		JLabel bgPicture = new JLabel("");
		bgPicture.setIcon(new ImageIcon(Designs.class.getResource("/Icons/booksLibraryTable.jpg")));
		bgPicture.setBounds(0, 0, 295, 611);
		picturePanel.add(bgPicture);

		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 404, 611);
		loginPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel loginTxt = new JLabel("LOGIN");
		loginTxt.setFont(new Font("Lato", Font.BOLD, 43));
		loginTxt.setBounds(28, 30, 307, 61);
		loginPanel.add(loginTxt);
		
		JLabel emailTxt = new JLabel("Ingrese su Email");
		emailTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		emailTxt.setBounds(28, 147, 181, 20);
		loginPanel.add(emailTxt);
		
		emailRequest = new JTextField();
		emailRequest.setBackground(new Color(230, 230, 230));
		emailRequest.setBounds(28, 178, 307, 20);
		loginPanel.add(emailRequest);
		emailRequest.setColumns(10);
		
		JLabel passTxt = new JLabel("Ingrese su Contraseña");
		passTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		passTxt.setBounds(28, 256, 181, 20);
		loginPanel.add(passTxt);
		
		passRequest = new JPasswordField();
		passRequest.setBackground(new Color(230, 230, 230));
		passRequest.setBounds(28, 287, 307, 20);
		loginPanel.add(passRequest);
		
		JButton regButton = new JButton("Iniciar Sesion");
		regButton.setBackground(new Color(252, 209, 156));
		regButton.setFont(new Font("Lato", Font.PLAIN, 16));
		regButton.setBounds(28, 459, 142, 42);
		loginPanel.add(regButton);
		
		JButton loginButton = new JButton("Registrarse");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.setBackground(new Color(252, 209, 156));
		loginButton.setFont(new Font("Lato", Font.PLAIN, 16));
		loginButton.setBounds(193, 459, 142, 42);
		loginPanel.add(loginButton);
	}
}
