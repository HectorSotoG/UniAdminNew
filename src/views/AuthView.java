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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controllers.AuthController;
import designer.Designs;
import models.AuthModel;

public class AuthView {

	private JFrame frame;
	private JPanel contentPane;
	private AuthController controller;
	private AuthModel functions;

	public AuthView() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(700, 650);
		frame.setResizable(false);
		frame.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		functions = new AuthModel();
	}

	public void login() {
		frame.setLocationRelativeTo(null);
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(null);
		contentPane.add(loginPanel);

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

		JTextField emailRequest = new JTextField();
		emailRequest.setBackground(new Color(230, 230, 230));
		emailRequest.setBounds(28, 178, 307, 20);
		loginPanel.add(emailRequest);
		emailRequest.setColumns(10);

		JLabel passTxt = new JLabel("Ingrese su Contraseña");
		passTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		passTxt.setBounds(28, 256, 181, 20);
		loginPanel.add(passTxt);

		JPasswordField passRequest = new JPasswordField();
		passRequest.setBackground(new Color(230, 230, 230));
		passRequest.setBounds(28, 287, 307, 20);
		loginPanel.add(passRequest);

		JButton regButton = new JButton("Registrarse");
		regButton.setBackground(new Color(252, 209, 156));
		regButton.setFont(new Font("Lato", Font.PLAIN, 16));
		regButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller = new AuthController();
				frame.remove(loginPanel);
				frame.setVisible(false);
				controller.reg();
			}
		});
		regButton.setBounds(28, 459, 142, 42);
		loginPanel.add(regButton);

		JButton loginButton = new JButton("Iniciar Sesion");
		loginButton.setBackground(new Color(252, 209, 156));
		loginButton.setFont(new Font("Lato", Font.PLAIN, 16));
		loginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 
        		if( functions.login(emailRequest.getText(),passRequest.getText()) )
        			frame.dispose();
        		 
        	}
        });
		loginButton.setBounds(193, 459, 142, 42);
		loginPanel.add(loginButton);

		frame.repaint();
		frame.revalidate();
	}
	
	public void reg() {
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
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
		
		JTextField nameReq = new JTextField();
		nameReq.setFont(new Font("Lato", Font.PLAIN, 16));
		nameReq.setBackground(new Color(230, 230, 230));
		nameReq.setBounds(14, 141, 166, 20);
		regPanel.add(nameReq);
		nameReq.setColumns(10);
		
		JLabel lstNameTxt = new JLabel("Ingrese su Apellido");
		lstNameTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		lstNameTxt.setBounds(217, 115, 160, 20);
		regPanel.add(lstNameTxt);
		
		JTextField lstNameReq = new JTextField();
		lstNameReq.setFont(new Font("Lato", Font.PLAIN, 16));
		lstNameReq.setColumns(10);
		lstNameReq.setBackground(new Color(230, 230, 230));
		lstNameReq.setBounds(217, 141, 166, 20);
		regPanel.add(lstNameReq);
		
		JLabel emailTxt = new JLabel("Ingrese su Email");
		emailTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		emailTxt.setBounds(14, 197, 181, 20);
		regPanel.add(emailTxt);
		
		JTextField emailReq = new JTextField();
		emailReq.setFont(new Font("Lato", Font.PLAIN, 16));
		emailReq.setColumns(10);
		emailReq.setBackground(new Color(230, 230, 230));
		emailReq.setBounds(14, 228, 369, 20);
		regPanel.add(emailReq);
		
		JLabel passTxt = new JLabel("Ingrese su Contraseña");
		passTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		passTxt.setBounds(14, 287, 181, 20);
		regPanel.add(passTxt);
		
		JPasswordField passReq = new JPasswordField();
		passReq.setBackground(new Color(230, 230, 230));
		passReq.setFont(new Font("Lato", Font.PLAIN, 16));
		passReq.setBounds(14, 318, 369, 20);
		regPanel.add(passReq);
		
		JPasswordField confirmPass = new JPasswordField();
		confirmPass.setFont(new Font("Lato", Font.PLAIN, 16));
		confirmPass.setBackground(new Color(230, 230, 230));
		confirmPass.setBounds(14, 413, 369, 20);
		regPanel.add(confirmPass);
		
		JLabel confirmTxt = new JLabel("Confirme su Contraseña");
		confirmTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		confirmTxt.setBounds(14, 382, 181, 20);
		regPanel.add(confirmTxt);
		
		JButton backToLogin = new JButton("Volver a Login");
		backToLogin.setBackground(new Color(252, 209, 156));
		backToLogin.setFont(new Font("Lato", Font.PLAIN, 16));
		backToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller = new AuthController();
				frame.remove(regPanel);
				frame.setVisible(false);
				controller.login();
			}
		});
		backToLogin.setBounds(14, 511, 139, 36);
		regPanel.add(backToLogin);
		
		JButton registerBtn = new JButton("Registrarse");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameReq.getText();
				String lstName = lstNameReq.getText();
				String email = emailReq.getText();
				String pass = passReq.getText();
				String confirm = confirmPass.getText();
				
				if(name.isEmpty() || lstName.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Algún campo está vacío", "ERROR", JOptionPane.ERROR_MESSAGE);
				}else if(pass.equals(confirm)) {
					if(functions.add(name, lstName, email, pass)) {
						JOptionPane.showMessageDialog(null, "Registro exitoso", "HECHO", JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showConfirmDialog(null, "Algo salió mal", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		registerBtn.setBackground(new Color(252, 209, 156));
		registerBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		registerBtn.setBounds(238, 511, 139, 36);
		regPanel.add(registerBtn);
	}
}