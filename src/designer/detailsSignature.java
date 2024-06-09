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

public class detailsSignature extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detailsSignature frame = new detailsSignature();
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
	public detailsSignature() {
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
		goToAdd.setIcon(new ImageIcon(addSignature.class.getResource("/Icons/icons8-add-100.png")));
		goToAdd.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToAdd.setBackground(new Color(252, 209, 156));
		goToAdd.setBounds(57, 74, 131, 105);
		navPanel.add(goToAdd);

		JButton goToDetails = new JButton("");
		goToDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		goToDetails.setIcon(new ImageIcon(detailsSignature.class.getResource("/Icons/icons8-download-100.png")));
		goToDetails.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToDetails.setBackground(new Color(252, 209, 156));
		goToDetails.setBounds(57, 253, 131, 105);
		navPanel.add(goToDetails);

		JButton goToEdit = new JButton("");
		goToEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		goToEdit.setIcon(new ImageIcon(detailsSignature.class.getResource("/Icons/icons8-edit-100.png")));
		goToEdit.setBorder(new LineBorder(new Color(210, 153, 47), 2));
		goToEdit.setBackground(new Color(252, 209, 156));
		goToEdit.setBounds(57, 432, 131, 105);
		navPanel.add(goToEdit);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 459, 611);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel titleTxt = new JLabel("Eliminar Asignatura");
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(10, 24, 403, 53);
		panel.add(titleTxt);
		
		JLabel idTxt = new JLabel("Ingresa ID de Asignatura");
		idTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		idTxt.setBounds(9, 130, 175, 20);
		panel.add(idTxt);
		
		idField = new JTextField();
		idField.setBackground(new Color(230, 230, 230));
		idField.setBounds(193, 132, 156, 20);
		panel.add(idField);
		idField.setColumns(10);
		
		JButton searchID = new JButton("Buscar");
		searchID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchID.setFont(new Font("Lato", Font.PLAIN, 16));
		searchID.setBackground(new Color(252, 209, 156));
		searchID.setBounds(358, 132, 92, 20);
		panel.add(searchID);
		
		table = new JTable();
		table.setBounds(10, 161, 439, 346);
		panel.add(table);
		
		JButton backToMenu = new JButton("Volver al Menu");
		backToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backToMenu.setBackground(new Color(252, 209, 156));
		backToMenu.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMenu.setBounds(10, 546, 145, 35);
		panel.add(backToMenu);
		
		JButton deleteBttn = new JButton("Eliminar Asignatura");
		deleteBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteBttn.setBackground(new Color(252, 209, 156));
		deleteBttn.setBounds(262, 546, 187, 35);
		panel.add(deleteBttn);
		
		
	}

}
