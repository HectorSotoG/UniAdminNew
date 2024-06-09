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

public class signatureMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel addTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signatureMenu frame = new signatureMenu();
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
	public signatureMenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, "name_234449348487600");
		panel.setLayout(null);
		
		JLabel titleTxt = new JLabel("Información Asignaturas");
		titleTxt.setHorizontalAlignment(SwingConstants.CENTER);
		titleTxt.setFont(new Font("Lato", Font.PLAIN, 43));
		titleTxt.setBounds(110, 11, 487, 107);
		panel.add(titleTxt);
		
		JButton addButton = new JButton("");
		addButton.setBackground(new Color(252, 209, 156));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		addButton.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-add-100.png")));
		addButton.setFont(new Font("Lato", Font.PLAIN, 16));
		addButton.setBounds(41, 174, 170, 122);
		panel.add(addButton);
		
		addTxt = new JLabel("Añadir");
		addTxt.setHorizontalAlignment(SwingConstants.CENTER);
		addTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		addTxt.setBounds(90, 319, 72, 14);
		panel.add(addTxt);
		
		JButton editButton = new JButton("");
		editButton.setBackground(new Color(252, 209, 156));
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		editButton.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-edit-100.png")));
		editButton.setFont(new Font("Lato", Font.PLAIN, 16));
		editButton.setBounds(252, 174, 170, 122);
		panel.add(editButton);
		
		JLabel editTxt = new JLabel("Editar");
		editTxt.setHorizontalAlignment(SwingConstants.CENTER);
		editTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		editTxt.setBounds(301, 319, 72, 14);
		panel.add(editTxt);
		
		JButton detailsBttn = new JButton("");
		detailsBttn.setBackground(new Color(252, 209, 156));
		detailsBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		detailsBttn.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-download-100.png")));
		detailsBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		detailsBttn.setBounds(463, 174, 170, 122);
		panel.add(detailsBttn);
		
		JLabel detailsTxt = new JLabel("Detalles");
		detailsTxt.setHorizontalAlignment(SwingConstants.CENTER);
		detailsTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		detailsTxt.setBounds(512, 319, 72, 14);
		panel.add(detailsTxt);
		
		JButton deleteBttn = new JButton("");
		deleteBttn.setBackground(new Color(252, 209, 156));
		deleteBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		deleteBttn.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-delete-100.png")));
		deleteBttn.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteBttn.setBounds(136, 409, 170, 122);
		panel.add(deleteBttn);
		
		JLabel deleteTxt = new JLabel("Eliminar");
		deleteTxt.setHorizontalAlignment(SwingConstants.CENTER);
		deleteTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		deleteTxt.setBounds(185, 554, 72, 14);
		panel.add(deleteTxt);
		
		JButton backToMain = new JButton("");
		backToMain.setBackground(new Color(252, 209, 156));
		backToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backToMain.setIcon(new ImageIcon(signatureMenu.class.getResource("/Icons/icons8-back-100.png")));
		backToMain.setFont(new Font("Lato", Font.PLAIN, 16));
		backToMain.setBounds(397, 409, 170, 122);
		panel.add(backToMain);
		
		JLabel backTxt = new JLabel("Volver");
		backTxt.setHorizontalAlignment(SwingConstants.CENTER);
		backTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		backTxt.setBounds(446, 554, 72, 14);
		panel.add(backTxt);
	}

}
