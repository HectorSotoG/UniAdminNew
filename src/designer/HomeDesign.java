package designer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeDesign extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeDesign frame = new HomeDesign();
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
	public HomeDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel homePanel = new JPanel();
		homePanel.setBackground(Color.WHITE);
		contentPane.add(homePanel, "name_1146817197258100");
		homePanel.setLayout(null);
		
		JButton teacherButton = new JButton("");
		teacherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		teacherButton.setBackground(new Color(252, 209, 156));
		teacherButton.setIcon(new ImageIcon(HomeDesign.class.getResource("/Icons/icons8-hogwarts-100.png")));
		teacherButton.setFont(new Font("Lato", Font.PLAIN, 16));
		teacherButton.setBounds(55, 106, 220, 180);
		homePanel.add(teacherButton);
		
		JButton studentButton = new JButton("");
		studentButton.setBackground(new Color(252, 209, 156));
		studentButton.setIcon(new ImageIcon(HomeDesign.class.getResource("/Icons/icons8-education-100.png")));
		studentButton.setFont(new Font("Lato", Font.PLAIN, 16));
		studentButton.setBounds(396, 106, 220, 180);
		homePanel.add(studentButton);
		
		JButton classButton = new JButton("");
		classButton.setIcon(new ImageIcon(HomeDesign.class.getResource("/Icons/icons8-signature-100.png")));
		classButton.setBackground(new Color(252, 209, 156));
		classButton.setBounds(57, 361, 220, 180);
		homePanel.add(classButton);
		
		JButton groupButton = new JButton("");
		groupButton.setIcon(new ImageIcon(HomeDesign.class.getResource("/Icons/icons8-group-100.png")));
		groupButton.setBackground(new Color(252, 209, 156));
		groupButton.setBounds(396, 361, 220, 180);
		homePanel.add(groupButton);
		
		JLabel panelTxt = new JLabel("Panel Principal");
		panelTxt.setHorizontalAlignment(SwingConstants.CENTER);
		panelTxt.setFont(new Font("Lato", Font.BOLD, 43));
		panelTxt.setBounds(82, 9, 475, 72);
		homePanel.add(panelTxt);
		
		JLabel teacherTxt = new JLabel("Docentes");
		teacherTxt.setHorizontalAlignment(SwingConstants.CENTER);
		teacherTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		teacherTxt.setBounds(123, 307, 85, 30);
		homePanel.add(teacherTxt);
		
		JLabel studentTxt = new JLabel("Alumnos");
		studentTxt.setHorizontalAlignment(SwingConstants.CENTER);
		studentTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		studentTxt.setBounds(472, 309, 85, 28);
		homePanel.add(studentTxt);
		
		JLabel classTxt = new JLabel("Asignaturas");
		classTxt.setHorizontalAlignment(SwingConstants.CENTER);
		classTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		classTxt.setBounds(123, 560, 85, 30);
		homePanel.add(classTxt);
		
		JLabel groupTxt = new JLabel("Grupos");
		groupTxt.setHorizontalAlignment(SwingConstants.CENTER);
		groupTxt.setFont(new Font("Lato", Font.PLAIN, 16));
		groupTxt.setBounds(472, 562, 85, 28);
		homePanel.add(groupTxt);
	}

}
