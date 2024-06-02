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
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class TeacherDelete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherDelete frame = new TeacherDelete();
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
	public TeacherDelete() {
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
		
		JButton goToDwnld = new JButton("");
		goToDwnld.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		goToDwnld.setIcon(new ImageIcon(TeacherDelete.class.getResource("/Icons/icons8-download-100.png")));
		goToDwnld.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDwnld.setBackground(new Color(252, 209, 156));
		goToDwnld.setBounds(57, 324, 131, 105);
		navPanel.add(goToDwnld);
		
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
		panel.setBounds(0, 0, 460, 611);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEliminarInfoDocente = new JLabel("Eliminar Info. Docente");
		lblEliminarInfoDocente.setFont(new Font("Lato", Font.PLAIN, 35));
		lblEliminarInfoDocente.setBounds(10, 11, 441, 53);
		panel.add(lblEliminarInfoDocente);
		
		JLabel pictureHolder = new JLabel("");
		pictureHolder.setIcon(new ImageIcon(TeacherDelete.class.getResource("/Icons/icons8-circled-user-200.png")));
		pictureHolder.setHorizontalAlignment(SwingConstants.CENTER);
		pictureHolder.setBounds(24, 235, 220, 200);
		panel.add(pictureHolder);
		
		JButton deleteBtn = new JButton("Eliminar Docente");
		deleteBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteBtn.setBackground(new Color(252, 209, 156));
		deleteBtn.setBounds(267, 319, 167, 32);
		panel.add(deleteBtn);
		
		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setBounds(10, 553, 152, 36);
		panel.add(backToMenu);
		
		JButton searchBtn = new JButton("Buscar");
		searchBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		searchBtn.setBackground(new Color(252, 209, 156));
		searchBtn.setBounds(345, 119, 89, 23);
		panel.add(searchBtn);
		
		idField = new JTextField();
		idField.setColumns(10);
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(199, 120, 136, 20);
		panel.add(idField);
		
		JLabel idTxt = new JLabel("Introduzca ID del Docente");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(10, 120, 195, 20);
		panel.add(idTxt);
	}

}
