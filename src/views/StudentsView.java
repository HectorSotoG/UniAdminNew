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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.HomeController;
import controllers.StudentsController;
import controllers.TeachersController;
import designer.TeacherMenu;
import models.StudentsModel;
import models.TeachersModels;

public class StudentsView {
	
	private JFrame frame;
	private JPanel contentPane;
	private StudentsController controller;
	private HomeController home;
	private StudentsModel functions;
	
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
		
	}
	
	public void edit() {
		
	}
	
	public void search() {
		
	}
	
	public void download() {
		
	}
	
	public void delete() {
		
	}
	
}

