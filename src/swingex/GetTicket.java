package swingex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class GetTicket extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("BOARDING PASS");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetTicket frame = new GetTicket();
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
	public GetTicket() {
		setBackground(new Color(192, 192, 192));
		setIconImage(Toolkit.getDefaultToolkit().getImage(GetTicket.class.getResource("/images/bgw.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 236, 236));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\plane.png"));
		lblNewLabel_9.setBounds(165, 169, 189, 81);
		contentPane.add(lblNewLabel_9);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(564, 10, 23, 253);
		contentPane.add(separator);
		
		JLabel lblNewLabel_16 = new JLabel("First Class");
		lblNewLabel_16.setBounds(440, 226, 131, 37);
		contentPane.add(lblNewLabel_16);
		lblNewLabel_16.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(157, 206, 255));
		panel_1.setBounds(-35, 235, 784, 28);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\logosm.png"));
		lblNewLabel_1.setBounds(-6, 10, 133, 75);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(133, 206, 245));
		panel.setBounds(-16, 10, 752, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setBounds(147, 21, 330, 44);
		lblNewLabel.setIcon(null);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 40));
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(541, 10, 1, 1);
		panel.add(verticalGlue);
		
		JLabel lblNewLabel_2 = new JLabel("Passenger");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(10, 95, 117, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Flight");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(165, 97, 90, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date");
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(277, 97, 81, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Seat");
		lblNewLabel_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(411, 95, 81, 28);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\Sample1.png"));
		lblNewLabel_7.setBounds(604, 161, 81, 64);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\bar.png"));
		lblNewLabel_8.setBounds(484, 93, 70, 132);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("Bangladesh");
		lblNewLabel_10.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(44, 186, 133, 39);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("USA");
		lblNewLabel_11.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(354, 176, 138, 58);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Wasiu jahan");
		lblNewLabel_12.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 17));
		lblNewLabel_12.setBounds(10, 121, 107, 28);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("MahDu");
		lblNewLabel_13.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(165, 122, 95, 27);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("7Th Nov");
		lblNewLabel_14.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(277, 122, 81, 27);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("5b");
		lblNewLabel_15.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 19));
		lblNewLabel_15.setBounds(421, 125, 63, 19);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_17 = new JLabel("7Th Nov 2023");
		lblNewLabel_17.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_17.setBounds(581, 87, 180, 44);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_5_1 = new JLabel("Seat");
		lblNewLabel_5_1.setBounds(604, 123, 45, 28);
		contentPane.add(lblNewLabel_5_1);
		lblNewLabel_5_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		
		JLabel lblNewLabel_15_1 = new JLabel("5b");
		lblNewLabel_15_1.setBounds(644, 121, 39, 37);
		contentPane.add(lblNewLabel_15_1);
		lblNewLabel_15_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
	}
}
