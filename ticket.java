package rupees;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class ticket {

	private JFrame frame;
	private JTextField tn2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tnum;
	private JTextField tpr;
	private JTextField trou;
	private JTextField tn1;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField ttot;
	private JTable tb;
	static int id=10001;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 153));
		frame.setBounds(100, 100, 799, 616);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 91, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(455, 108, 46, 14);
		frame.getContentPane().add(lblName_1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(455, 149, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(455, 182, 46, 14);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(455, 220, 46, 14);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(455, 252, 46, 14);
		frame.getContentPane().add(lblTime);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setBounds(670, 108, 46, 14);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(670, 164, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(670, 220, 46, 14);
		frame.getContentPane().add(lblRoute);
		
		tn2 = new JTextField();
		tn2.setBounds(511, 105, 99, 20);
		frame.getContentPane().add(tn2);
		tn2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(511, 146, 99, 20);
		frame.getContentPane().add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(511, 182, 99, 20);
		frame.getContentPane().add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(511, 220, 99, 20);
		frame.getContentPane().add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setBounds(511, 252, 99, 20);
		frame.getContentPane().add(tf6);
		tf6.setColumns(10);
		
		tpr = new JTextField();
		tpr.setBounds(670, 189, 86, 20);
		frame.getContentPane().add(tpr);
		tpr.setColumns(10);
		
		trou = new JTextField();
		trou.setBounds(670, 249, 86, 20);
		frame.getContentPane().add(trou);
		trou.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(439, 79, 334, 338);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"No:of Seats", "1", "2", "3", "4", "5"}));
		cb3.setBounds(306, 231, 109, 20);
		frame.getContentPane().add(cb3);
		JRadioButton rd4 = new JRadioButton("First Class");
		rd4.setBounds(23, 188, 75, 23);
		frame.getContentPane().add(rd4);
		JRadioButton rd5 = new JRadioButton("AC");
		rd5.setBounds(129, 188, 46, 23);
		frame.getContentPane().add(rd5);
		
		JRadioButton rd6 = new JRadioButton("Sleeper");
		rd6.setBounds(190, 188, 61, 23);
		frame.getContentPane().add(rd6);
		
		JRadioButton rd7 = new JRadioButton("Child");
		rd7.setBounds(279, 188, 66, 23);
		frame.getContentPane().add(rd7);
		
		ButtonGroup g2=new ButtonGroup();
		
		g2.add(rd4);
		g2.add(rd5);
		g2.add(rd6);
		g2.add(rd7);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=tn2.getText();
				String str2=tnum.getText();
				String str3=tf3.getText();
				String str4=tf4.getText();
				String str5=(String)cb3.getSelectedItem();
				String str6=tf6.getText();
				String str7=tf5.getText();
				String str8="";
				if(rd4.isSelected())
				{
					str8="Non AC";
					
				}
				if(rd5.isSelected())
				{
					str8=" AC";
				}
				if(rd6.isSelected())
				{
					str8="Non Ac";
			    }
				if(rd7.isSelected())
				{
					str8="Non Ac";
				}
				String str9=tpr.getText();
				DefaultTableModel model=(DefaultTableModel) tb.getModel();
				model.addRow(new String[] {str1,str2,str3,str4,str5,str6,str7,str8,str9});
				}
		});
		btnConfirm.setBounds(139, 242, 89, 23);
		panel.add(btnConfirm);
		
		JLabel lblTicketDetails = new JLabel("Ticket Details");
		lblTicketDetails.setBounds(156, 0, 82, 14);
		panel.add(lblTicketDetails);
		
		tnum = new JTextField();
		tnum.setBounds(238, 54, 86, 20);
		panel.add(tnum);
		tnum.setColumns(10);
		
		tn1 = new JTextField();
		tn1.setBounds(91, 88, 119, 20);
		frame.getContentPane().add(tn1);
		tn1.setColumns(10);
		String name1=tn1.getText();
		
		JRadioButton rd1 = new JRadioButton("Standard");
		rd1.setBounds(23, 145, 89, 23);
		frame.getContentPane().add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Single Ticket");
		rd2.setBounds(129, 145, 99, 23);
		frame.getContentPane().add(rd2);
		
		JRadioButton rd3 = new JRadioButton("Adult");
		rd3.setBounds(250, 145, 109, 23);
		frame.getContentPane().add(rd3);
		ButtonGroup g1=new ButtonGroup();
		g1.add(rd1);
		g1.add(rd2);
		g1.add(rd3);
		
		
		
		
		
		
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"From", "Trivandrum", "Kollam", "Ernakulam", "Goa", "Bangalure"}));
		cb1.setBounds(23, 231, 109, 20);
		frame.getContentPane().add(cb1);

		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"To", "Trivandrum", "Kollam", "Ernakulam", "Goa", "Bangalure"}));
		cb2.setBounds(160, 231, 119, 20);
		frame.getContentPane().add(cb2);
		
		
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(23, 277, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(23, 308, 61, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(23, 345, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		tf1 = new JTextField();
		tf1.setBounds(129, 274, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		String tax=tf1.getText();
		
		tf2 = new JTextField();
		tf2.setBounds(129, 305, 86, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		String subtot=tf2.getText();
		
		ttot = new JTextField();
		ttot.setEditable(false);
		ttot.setBounds(129, 342, 86, 20);
		frame.getContentPane().add(ttot);
		ttot.setColumns(10);
		String total=ttot.getText();
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=tn1.getText();
				tn2.setText(a);
				String b=(String)cb3.getSelectedItem();
				float c=Float.parseFloat(b);
				float tax=0,subtot=0,total=0;
				if(rd4.isSelected());
				{
					tax=(float)(200*c);
					subtot=(float)(500*c);
					total=tax+subtot;
				}
				if(rd5.isSelected());
				{
					tax=(float)(200*c);
					subtot=(float)(600*c);
					total=tax+subtot;
				}
				if(rd6.isSelected());
				{
					tax=(float)(200*c);
					subtot=(float)(700*c);
					total=tax+subtot;
				}
				
				if(rd7.isSelected());
				{
					tax=(float)(200*c);
					subtot=(float)(800*c);
					total=tax+subtot;
				}
				String t1=String.valueOf(tax);
				String sub1=String.valueOf(subtot);
				String tot1=String.valueOf(total);
				tf1.setText(t1);
				tf2.setText(sub1);
				ttot.setText(tot1);
				String comb1=(String)cb1.getSelectedItem();
	            tf3.setText(comb1);	
	            String comb2=(String)cb2.getSelectedItem();
	            tf4.setText(comb2);	
				tpr.setText(tot1);
				trou.setText("Any");
				LocalTime time1=java.time.LocalTime.now();
				String time2=String.valueOf(time1);
				tf6.setText(time2);
				LocalDate date1=java.time.LocalDate.now();
				String date2=String.valueOf(date1);
				tf5.setText(date2);
				id++;
				String id1=String.valueOf(id);
				tnum.setText(id1);
				
			}
		});
		btnTotal.setBounds(9, 381, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g1.clearSelection();
				g2.clearSelection();
				tn1.setText("");
				tn2.setText("");
				tf1.setText("");
				tf2.setText("");
				ttot.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tnum.setText("");
				tpr.setText("");
				trou.setText("");
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				cb3.setSelectedIndex(0);
				tf6.setText(" ");
				tf5.setText(" ");
				;
				
				
				
				
				
			}
		});
		btnReset.setBounds(129, 381, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(256, 381, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(225, 11, 292, 41);
		frame.getContentPane().add(panel_1);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		panel_1.add(lblTicketBooking);
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 116, 419, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 262, 419, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 415, 424, 2);
		frame.getContentPane().add(separator_2);
		
		tb = new JTable();
		tb.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No:", "From", "To", "No: of seats", "Time", "Date", "AC No:", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		tb.setBounds(10, 440, 763, 127);
		frame.getContentPane().add(tb);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 204, 255));
		panel_2.setBounds(0, 428, 783, 150);
		frame.getContentPane().add(panel_2);
	}
}
