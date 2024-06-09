package designer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class searchGroup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idField;
	private JTextField studentCount;
	private JTextField signatureField;
	private JTextField teacherField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchGroup frame = new searchGroup();
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
	public searchGroup() {
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

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		goToEdit.setIcon(new ImageIcon(searchGroup.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 181, 131, 105);
		navPanel.add(goToEdit);

		JButton goToSearch = new JButton("");
		goToSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		goToSearch.setIcon(new ImageIcon(TeacherAdd.class.getResource("/Icons/icons8-delete-100.png")));
		goToSearch.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToSearch.setBackground(new Color(252, 209, 156));
		goToSearch.setBounds(57, 324, 131, 105);
		navPanel.add(goToSearch);

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
		
		JLabel titleTxt = new JLabel("Consultar Grupo");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(10, 36, 439, 43);
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
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre Grupo", "Cantidad Estudiantes", "Profesor", "Asignatura", "Turno"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(84);
		table.getColumnModel().getColumn(2).setPreferredWidth(118);
		table.setBounds(19, 205, 421, 281);
		panel.add(table);
		
		JButton deleteBtn = new JButton("Eliminar Grupo");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteBtn.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteBtn.setBackground(new Color(252, 209, 156));
		deleteBtn.setBounds(293, 558, 147, 31);
		panel.add(deleteBtn);
		
		
	}
}
