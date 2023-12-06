package swingex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DropMode;

public class LableDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField textField_1;
	protected Object btnNewButton;
	
	public String from_destination;
	public String to_destination;
	public String journy_date;
	public String return_date;
	public String person;
	public String seat_class;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LableDemo frame = new LableDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
	
		});
	}
	
	public void setValue(String f_desti, String to_desti, String j_date, String r_date, String person, String s_class) {
		this.from_destination = f_desti;
		this.to_destination = to_desti;
		this.journy_date = j_date;
		this.return_date = person;
		this.person = person;
		this.seat_class = s_class;
		
	}
	
	public void getFildValue() {
		System.out.println(this.from_destination);
		System.out.println(this.to_destination);
		System.out.println(this.journy_date);
		System.out.println(this.return_date);
		System.out.println(this.person);
		
	}

	/**
	 * Create the frame.
	 */
	public LableDemo() {
		
		setAutoRequestFocus(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(LableDemo.class.getResource("/images/pogo.png")));
		setTitle("Air Ticket Poss");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1270, 791);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 240, 252));
		contentPane.setForeground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Menu");
		
		panel.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		panel.setBounds(174, 192, 832, 503);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		
		
		JLabel lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setBounds(46, 163, 70, 29);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome To Air");
		lblNewLabel.setForeground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setLabelFor(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Time");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(441, 164, 95, 29);
		panel.add(lblNewLabel_2);
		
		final JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(536, 215, 157, 19);
		panel.add(dateChooser);
		
		JLabel lblNewLabel_3 = new JLabel("Return Ticket");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(399, 203, 137, 40);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Person");
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(42, 262, 84, 23);
		panel.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setDropMode(DropMode.INSERT);
		textField_1.setBounds(122, 266, 157, 23);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(64, 0, 64));
		separator.setBounds(46, 299, 750, 7);
		panel.add(separator);
		
		JLabel lblNewLabel_5 = new JLabel("Class  : ");
		lblNewLabel_5.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(63, 373, 110, 29);
		panel.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bussiness");
		rdbtnNewRadioButton.setToolTipText("");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(230, 230, 250));
		rdbtnNewRadioButton.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 22));
		rdbtnNewRadioButton.setBounds(146, 378, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Economy ");
		rdbtnNewRadioButton_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 22));
		rdbtnNewRadioButton_1.setBounds(146, 417, 103, 21);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Premium Economy");
		rdbtnNewRadioButton_2.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		rdbtnNewRadioButton_2.setBounds(270, 379, 157, 21);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("First Class");
		rdbtnNewRadioButton_3.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 22));
		rdbtnNewRadioButton_3.setBounds(270, 417, 103, 21);
		panel.add(rdbtnNewRadioButton_3);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bangladesh ", "India", "USA", "UK", "RASSIA", "Chaina", "Pakistan", "Canada"}));
		comboBox.setBounds(122, 168, 157, 21);
		panel.add(comboBox);
		
		final JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(536, 173, 157, 19);
		panel.add(dateChooser_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TO");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(46, 215, 70, 29);
		panel.add(lblNewLabel_1_1);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Bangladesh ,DSC", "India ,  ICS", "Uk, ACM"}));
		comboBox_1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		comboBox_1.setBounds(122, 220, 157, 21);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Wlcome to Air Ticket POS");
		lblNewLabel_6.setBounds(213, 101, 518, 52);
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 37));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\logosm.png"));
		lblNewLabel_7.setBounds(349, 20, 157, 95);
		panel.add(lblNewLabel_7);
		
	
		
		
		JButton btnNewButton = 	new JButton("Enter your Info");
		
		btnNewButton.addActionListener(new ActionListener(){
		

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Reg regiFrame = new Reg();
				String from_destination = comboBox.getSelectedItem().toString();
				String to_destination = comboBox_1.getSelectedItem().toString();
				String person = textField_1.getText();
				
				
				//frame.lblNewLabel_1.setText(textField_1.getText());
				//comboBox.getToolTipText();
				
				regiFrame.setVisible(true);
				
			}	
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\icones-d-administration-orange.png"));
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 19));
		btnNewButton.setBounds(558, 430, 215, 52);
		panel.add(btnNewButton);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel_1, lblNewLabel_2, dateChooser, lblNewLabel_3, lblNewLabel_4, textField_1, separator, lblNewLabel_5, rdbtnNewRadioButton, rdbtnNewRadioButton_1, rdbtnNewRadioButton_2, rdbtnNewRadioButton_3, dateChooser.getCalendarButton(), comboBox, dateChooser_1, lblNewLabel_1_1, comboBox_1, lblNewLabel_6, lblNewLabel_7, btnNewButton}));
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\final1.jpg"));
		lblNewLabel.setBounds(-29, 0, 1275, 872);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(613, 15, 2, 2);
		contentPane.add(scrollPane_1);
	}
}
