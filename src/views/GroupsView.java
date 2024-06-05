package views;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.GroupsController;
import controllers.HomeController;
import models.GroupsModel;
import models.StudentsModel;

public class GroupsView {
	
	private JFrame frame;
	private JPanel contentPane;
	private GroupsController controller;
	private HomeController home;
	private GroupsModel functions;
	private String pictureRoot = "/Icons/icons8-circled-user-100.png";
	
	public GroupsView() {
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

		functions = new GroupsModel();
	}
	
	public void menu() {
		
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