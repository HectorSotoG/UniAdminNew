package designer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeacherMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherMenu frame = new TeacherMenu();
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
	public TeacherMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "name_1225372047056300");
		panel.setLayout(null);
		
		JLabel menuTxt = new JLabel("Información Docentes");
		menuTxt.setHorizontalAlignment(SwingConstants.CENTER);
		menuTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		menuTxt.setBounds(87, 15, 495, 53);
		panel.add(menuTxt);
		
		JButton addBtn = new JButton("");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		addBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-add-100.png")));
		addBtn.setBackground(new Color(252, 209, 156));
		addBtn.setBounds(44, 126, 166, 121);
		panel.add(addBtn);
		
		JButton editBtn = new JButton("");
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-edit-100.png")));
		editBtn.setBackground(new Color(252, 209, 156));
		editBtn.setBounds(254, 126, 166, 121);
		panel.add(editBtn);
		
		JButton searchBtn = new JButton("");
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-search-100.png")));
		searchBtn.setBackground(new Color(252, 209, 156));
		searchBtn.setBounds(464, 126, 166, 121);
		panel.add(searchBtn);
		
		JButton backBtn = new JButton("");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-back-100.png")));
		backBtn.setBackground(new Color(252, 209, 156));
		backBtn.setBounds(464, 351, 166, 121);
		panel.add(backBtn);
		
		JButton deleteBtn = new JButton("");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-delete-100.png")));
		deleteBtn.setBackground(new Color(252, 209, 156));
		deleteBtn.setBounds(254, 351, 166, 121);
		panel.add(deleteBtn);
		
		JButton downloadBtn = new JButton("");
		downloadBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		downloadBtn.setIcon(new ImageIcon(TeacherMenu.class.getResource("/Icons/icons8-download-100.png")));
		downloadBtn.setBackground(new Color(252, 209, 156));
		downloadBtn.setBounds(44, 351, 166, 121);
		panel.add(downloadBtn);
	}
}
