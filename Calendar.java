import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.*;

public class Calendar {

	private JFrame frame;
	private JLabel lb1_1;
	private JLabel lb1_2;
	private JLabel lb1_3;
	private JLabel lb1_4;
	private JLabel lb1_5;
	private JLabel lb1_6;
	private JLabel lb1_7;

	private JLabel lb2_1;
	private JLabel lb2_2;
	private JLabel lb2_3;
	private JLabel lb2_4;
	private JLabel lb2_5;
	private JLabel lb2_6;
	private JLabel lb2_7;

	private JLabel lb3_1;
	private JLabel lb3_2;
	private JLabel lb3_3;
	private JLabel lb3_4;
	private JLabel lb3_5;
	private JLabel lb3_6;
	private JLabel lb3_7;

	private JLabel lb4_1;
	private JLabel lb4_2;
	private JLabel lb4_3;
	private JLabel lb4_4;
	private JLabel lb4_5;
	private JLabel lb4_6;
	private JLabel lb4_7;

	private JLabel lb5_1;
	private JLabel lb5_2;
	private JLabel lb5_3;
	private JLabel lb5_4;
	private JLabel lb5_5;
	private JLabel lb5_6;
	private JLabel lb5_7;
	
	private JLabel lb6_1;
	private JLabel lb6_2;
	private JLabel lb6_3;
	private JLabel lb6_4;
	private JLabel lb6_5;
	private JLabel lb6_6;
	private JLabel lb6_7;


	private JLabel lbcn;
	private JLabel lbt2;
	private JLabel lbt3;
	private JLabel lbt4;
	private JLabel lbt5;
	private JLabel lbt6;
	private JLabel lbt7;
	
	private JLabel lbmonth;
	
	private JButton btnext;
	private JButton btback;
	
	int month=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar window = new Calendar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Calendar() {
		initialize();
	}


	JLabel[] list = null;

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calendar");
		frame.setBounds(10, 10, 780, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		lbmonth= new JLabel("Tháng 1");
		lbmonth.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbmonth.setBounds(310, 20 ,200, 35);
		lbmonth.setForeground(Color.GREEN);
		frame.getContentPane().add(lbmonth);

		
		lbt2= new JLabel("Thứ Hai");
		lbt2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbt2.setBounds(50, 80, 100, 25);
		lbt2.setForeground(Color.RED);
		frame.getContentPane().add(lbt2);
		
		lbt3= new JLabel("Thứ Ba");
		lbt3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbt3.setBounds(150, 80, 100, 25);
		lbt3.setForeground(Color.RED);
		frame.getContentPane().add(lbt3);
		
		lbt4= new JLabel("Thứ Tư");
		lbt4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbt4.setBounds(250, 80, 100, 25);
		lbt4.setForeground(Color.RED);
		frame.getContentPane().add(lbt4);
		
		lbt5= new JLabel("Thứ Năm");
		lbt5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbt5.setBounds(345, 80, 100, 25);
		lbt5.setForeground(Color.RED);
		frame.getContentPane().add(lbt5);
		
		lbt6= new JLabel("Thứ Sáu");
		lbt6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbt6.setBounds(450, 80, 100, 25);
		lbt6.setForeground(Color.RED);
		frame.getContentPane().add(lbt6);
		
		lbt7= new JLabel("Thứ Bảy");
		lbt7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbt7.setBounds(550, 80, 100, 25);
		lbt7.setForeground(Color.RED);
		frame.getContentPane().add(lbt7);
		
		lbcn= new JLabel("Chủ Nhật");
		lbcn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbcn.setBounds(650, 80, 100, 25);
		lbcn.setForeground(Color.RED);
		frame.getContentPane().add(lbcn);
		
		lb1_1= new JLabel("label");
		lb1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1_1.setBounds(50, 110, 100, 100);
		frame.getContentPane().add(lb1_1);
		
		lb1_2= new JLabel("label");
		lb1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1_2.setBounds(150, 110, 100, 100);
		frame.getContentPane().add(lb1_2);
		
		lb1_3= new JLabel("label");
		lb1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1_3.setBounds(250, 110, 100, 100);
		frame.getContentPane().add(lb1_3);
		
		lb1_4= new JLabel("label");
		lb1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1_4.setBounds(350, 110, 100, 100);
		frame.getContentPane().add(lb1_4);
		
		lb1_5= new JLabel("label");
		lb1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1_5.setBounds(450, 110, 100, 100);
		frame.getContentPane().add(lb1_5);
		
		lb1_6= new JLabel("label");
		lb1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1_6.setBounds(550, 110, 100, 100);
		frame.getContentPane().add(lb1_6);
		
		lb1_7= new JLabel("label");
		lb1_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb1_7.setBounds(650, 110, 100, 100);
		frame.getContentPane().add(lb1_7);
		
		lb2_1= new JLabel("label");
		lb2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb2_1.setBounds(50, 210, 100, 100);
		frame.getContentPane().add(lb2_1);
		
		lb2_2= new JLabel("label");
		lb2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb2_2.setBounds(150, 210, 100, 100);
		frame.getContentPane().add(lb2_2);
		
		lb2_3= new JLabel("label");
		lb2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb2_3.setBounds(250, 210, 100, 100);
		frame.getContentPane().add(lb2_3);
		
		lb2_4= new JLabel("label");
		lb2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb2_4.setBounds(350, 210, 100, 100);
		frame.getContentPane().add(lb2_4);
		
		lb2_5= new JLabel("label");
		lb2_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb2_5.setBounds(450, 210, 100, 100);
		frame.getContentPane().add(lb2_5);
		
		lb2_6= new JLabel("label");
		lb2_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb2_6.setBounds(550, 210, 100, 100);
		frame.getContentPane().add(lb2_6);
		
		lb2_7= new JLabel("label");
		lb2_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb2_7.setBounds(650, 210, 100, 100);
		frame.getContentPane().add(lb2_7);
		
		lb3_1= new JLabel("label");
		lb3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb3_1.setBounds(50, 310, 100, 100);
		frame.getContentPane().add(lb3_1);
		
		lb3_2= new JLabel("label");
		lb3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb3_2.setBounds(150, 310, 100, 100);
		frame.getContentPane().add(lb3_2);
		
		lb3_3= new JLabel("label");
		lb3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb3_3.setBounds(250, 310, 100, 100);
		frame.getContentPane().add(lb3_3);
		
		lb3_4= new JLabel("label");
		lb3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb3_4.setBounds(350, 310, 100, 100);
		frame.getContentPane().add(lb3_4);
		
		lb3_5= new JLabel("label");
		lb3_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb3_5.setBounds(450, 310, 100, 100);
		frame.getContentPane().add(lb3_5);
		
		lb3_6= new JLabel("label");
		lb3_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb3_6.setBounds(550, 310, 100, 100);
		frame.getContentPane().add(lb3_6);
		
		lb3_7= new JLabel("label");
		lb3_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb3_7.setBounds(650, 310, 100, 100);
		frame.getContentPane().add(lb3_7);
		
		lb4_1= new JLabel("label");
		lb4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb4_1.setBounds(50, 410, 100, 100);
		frame.getContentPane().add(lb4_1);
		
		lb4_2= new JLabel("label");
		lb4_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb4_2.setBounds(150, 410, 100, 100);
		frame.getContentPane().add(lb4_2);
		
		lb4_3= new JLabel("label");
		lb4_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb4_3.setBounds(250, 410, 100, 100);
		frame.getContentPane().add(lb4_3);
		
		lb4_4= new JLabel("label");
		lb4_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb4_4.setBounds(350, 410, 100, 100);
		frame.getContentPane().add(lb4_4);
		
		lb4_5= new JLabel("label");
		lb4_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb4_5.setBounds(450, 410, 100, 100);
		frame.getContentPane().add(lb4_5);
		
		lb4_6= new JLabel("label");
		lb4_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb4_6.setBounds(550, 410, 100, 100);
		frame.getContentPane().add(lb4_6);
		
		lb4_7= new JLabel("label");
		lb4_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb4_7.setBounds(650, 410, 100, 100);
		frame.getContentPane().add(lb4_7);
		
		lb5_1= new JLabel("label");
		lb5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb5_1.setBounds(50, 510, 100, 100);
		frame.getContentPane().add(lb5_1);
		
		lb5_2= new JLabel("label");
		lb5_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb5_2.setBounds(150, 510, 100, 100);
		frame.getContentPane().add(lb5_2);
		
		lb5_3= new JLabel("label");
		lb5_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb5_3.setBounds(250, 510, 100, 100);
		frame.getContentPane().add(lb5_3);

		lb5_4= new JLabel("label");
		lb5_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb5_4.setBounds(350, 510, 100, 100);
		frame.getContentPane().add(lb5_4);
		
		lb5_5= new JLabel("label");
		lb5_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb5_5.setBounds(450, 510, 100, 100);
		frame.getContentPane().add(lb5_5);
		
		lb5_6= new JLabel("label");
		lb5_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb5_6.setBounds(550, 510, 100, 100);
		frame.getContentPane().add(lb5_6);
		
		lb5_7= new JLabel("label");
		lb5_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb5_7.setBounds(650, 510, 100, 100);
		frame.getContentPane().add(lb5_7);
		
		lb6_1= new JLabel("label");
		lb6_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb6_1.setBounds(50, 610, 100, 100);
		frame.getContentPane().add(lb6_1);
		
		lb6_2= new JLabel("label");
		lb6_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb6_2.setBounds(150, 610, 100, 100);
		frame.getContentPane().add(lb6_2);
		
		lb6_3= new JLabel("label");
		lb6_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb6_3.setBounds(250, 610, 100, 100);
		frame.getContentPane().add(lb6_3);

		lb6_4= new JLabel("label");
		lb6_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb6_4.setBounds(350, 610, 100, 100);
		frame.getContentPane().add(lb6_4);
		
		lb6_5= new JLabel("label");
		lb6_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb6_5.setBounds(450, 610, 100, 100);
		frame.getContentPane().add(lb6_5);
		
		lb6_6= new JLabel("label");
		lb6_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb6_6.setBounds(550, 610, 100, 100);
		frame.getContentPane().add(lb6_6);
		
		lb6_7= new JLabel("label");
		lb6_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb6_7.setBounds(650, 610, 100, 100);
		frame.getContentPane().add(lb6_7);

		
		btback= new JButton("|<");
		btback.setBackground(Color.ORANGE);
		btback.setBounds(580, 710, 60, 35);
		frame.getContentPane().add(btback);
		
		btnext= new JButton(">|");
		btnext.setBackground(Color.ORANGE);
		btnext.setBounds(650, 710, 60, 35);
		frame.getContentPane().add(btnext);
		
		list = new JLabel[] {
				lb1_1, lb1_2, lb1_3, lb1_4, lb1_5, lb1_6, lb1_7,
				lb2_1, lb2_2, lb2_3, lb2_4, lb2_5, lb2_6, lb2_7,
				lb3_1, lb3_2, lb3_3, lb3_4, lb3_5, lb3_6, lb3_7,
				lb4_1, lb4_2, lb4_3, lb4_4, lb4_5, lb4_6, lb4_7,
				lb5_1, lb5_2, lb5_3, lb5_4, lb5_5, lb5_6, lb5_7,
				lb6_1, lb6_2, lb6_3, lb6_4, lb6_5, lb6_6, lb6_7
		};
		Init();
		
		ActionListener listen = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()== btnext) {
					month++;
					if(month<=12) {
					lbmonth.setText("Tháng "+String.valueOf(month));
					Init();}
					else {
						month=12;
						JOptionPane.showMessageDialog(null, "Đã hết số tháng trong năm !");
					}
				}
				else if(e.getSource()==btback) {
					month--;
					if(month>=1) {
					lbmonth.setText("Tháng "+String.valueOf(month));
					Init();}
					else {
						month=1;
						JOptionPane.showMessageDialog(null, "Đã hết số tháng trong năm !");
					}
				}
			}
		};
		btnext.addActionListener(listen);
		btback.addActionListener(listen);
	}
	
	
	private void Init() {
		DateUtil util = new DateUtil();
		int days = util.getDays(2020, month);
		String dayNameOfFirstDay = util.getDayOfWeek(2020, month, 1);
		
		int begin = getBeginday(dayNameOfFirstDay);
		
		int start=1; 
		for(int i=0; i<list.length;i++) {
			if(i<begin || start>days) {
				list[i].setText("");
			}
			else {
				list[i].setText(String.valueOf(start));
				start++;
			}
		}
	}
	/**
	 * Create the application.
	 */
	private int getBeginday(String dayNameOfFirstDay) {
		// TODO Auto-generated method stub
		int beginDate=0;
		switch (dayNameOfFirstDay) {
		case "Monday":
			beginDate=0;
			break;
		case "Tuesday":
			beginDate=1;
			break;
		case "Wednesday":
			beginDate=2;
			break;
		case "Thursday":
			beginDate=3;
			break;
		case "Friday":
			beginDate=4;
			break;
		case "Saturday":
			beginDate=5;
			break;
		case "Sunday":
			beginDate=6;
			break;

		default:
			break;
		}
		return beginDate;
	}
	

}
