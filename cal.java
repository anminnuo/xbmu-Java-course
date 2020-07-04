package calculator;
import java.util.Date;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class cal {
	private JFrame frame;
	private JTextField textField_0;
	private JTextField textField_1;
	private Timer time;	
//launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cal window = new cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//create the application.
	public cal() {
		initialize();
	}

//	initialize the contents of the frame.
	private void initialize() {
	
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		frame = new JFrame("simple calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//frame.setBounds(100, 100, 450, 400);
		frame.setBounds(400,400, 450, 400);
		//frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.getContentPane().setLayout(null);
		//显示时间
		JLabel timelabel = new JLabel("AM"); 
		frame.add(timelabel);
		timelabel.setBounds(90, 61, 280, 32);
		timelabel.setFont(new Font("宋体", Font.BOLD, 16));
	    timelabel.setForeground(new Color(0, 0, 0)); 
	    time = new Timer(1000,new ActionListener(){
		  public void actionPerformed(ActionEvent arg0) {
		  timelabel.setText(new SimpleDateFormat("yyyy年MM月dd日 EEEE hh:mm:ss").format(new Date()));
		  } 
		  });
		time.start(); 
		
		JButton button = new JButton("1");
		button.setBackground(Color.LIGHT_GRAY);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "1");
	            button.setBackground(Color.GREEN);
			}
		});
		
		JButton button_0 = new JButton("2");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "2");
				button_0.setBackground(Color.green);
			}
		});
		button_0.setBackground(Color.LIGHT_GRAY);
		button_0.setBounds(111, 142, 68, 38);
		frame.getContentPane().add(button_0);
		button.setBounds(33, 142, 68, 38);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "3");
				button_1.setBackground(Color.GREEN);
			}
		});
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(189, 142, 68, 38);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "4");
				button_2.setBackground(Color.CYAN);
			}
		});
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(33, 194, 68, 38);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "5");
				button_3.setBackground(Color.CYAN);
			}

		});
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(111, 194, 68, 38);
		frame.getContentPane().add(button_3);
		
		

		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "6");
				button_4.setBackground(Color.CYAN);
			}
		});
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(189, 194, 68, 38);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "7");
				button_5.setBackground(Color.pink);
			}
		});
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(33, 242, 68, 38);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "8");
				button_6.setBackground(Color.pink);
			}
		});
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(111, 242, 68, 38);
		frame.getContentPane().add(button_6);
	
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "9");
				button_7.setBackground(Color.pink);
			}
		});
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setBounds(189, 242, 68, 38);
		frame.getContentPane().add(button_7);

		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "0");
				button_8.setBackground(Color.YELLOW);
			}
		});
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setBounds(111, 290, 68, 38);
		frame.getContentPane().add(button_8);

		JButton button_9 = new JButton("(");
		button_9.setBackground(Color.ORANGE);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "(");
				button_9.setBackground(Color.PINK);
			}
		});
		button_9.setBounds(33, 93, 68, 38);
		frame.getContentPane().add(button_9);

		JButton button_10 = new JButton(")");
		button_10.setBackground(Color.ORANGE);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + ")");
				button_10.setBackground(Color.pink);
			}
		});
		button_10.setBounds(109, 94, 70, 38);
		frame.getContentPane().add(button_10);

		JButton button_11 = new JButton("+");
		button_11.setBackground(Color.ORANGE);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "+");
				button_11.setBackground(Color.pink);
			}
		});
		button_11.setBounds(267, 142, 44, 38);
		frame.getContentPane().add(button_11);

		JButton button_12 = new JButton("-");
		button_12.setBackground(Color.ORANGE);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "-");
				button_12.setBackground(Color.pink);
			}
		});
		button_12.setBounds(267, 194, 44, 38);
		frame.getContentPane().add(button_12);

		JButton button_13 = new JButton("*");
		button_13.setBackground(Color.ORANGE);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "*");
				button_13.setBackground(Color.pink);
			}
		});
		button_13.setBounds(267, 242, 44, 38);
		frame.getContentPane().add(button_13);

		JButton button_14 = new JButton("/");
		button_14.setBackground(Color.ORANGE);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + "/");
				button_14.setBackground(Color.ORANGE);
			}
		});
		button_14.setBounds(267, 290, 44, 38);
		frame.getContentPane().add(button_14);

		JButton button_15 = new JButton("=");
		button_15.setBackground(Color.GREEN);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ScriptEngine js = new ScriptEngineManager().getEngineByName("JavaScript");// 将字符串公式转换为计算公式
				String formula = textField_0.getText();
				try
				{
					textField_1.setText(js.eval(formula).toString());

				} catch (Exception e) 
				{
				}
			}
		});
		button_15.setBounds(334, 252, 44, 76);
		frame.getContentPane().add(button_15);
		textField_0 = new JTextField();
		textField_0.setBounds(33, 21, 345, 37);
		frame.getContentPane().add(textField_0);
		textField_0.setColumns(10);
		textField_0.addKeyListener(new KeyAdapter()//键盘监听
		        {
		             public void keyPressed(KeyEvent e)
		             {
		            	 ScriptEngine js = new ScriptEngineManager().getEngineByName("JavaScript");// 将字符串公式转换为计算公式
		 				String formula = textField_0.getText();
		                 if(e.getKeyCode()==KeyEvent.VK_ENTER)
		                 {
		                	 try {
		     					textField_1.setText(js.eval(formula).toString());

		     				} catch (Exception e1)
		                	 {
		     				}     
		                 }
		                 else System.out.println(e.getKeyChar()+"..."+KeyEvent.getKeyText(e.getKeyCode()));
		             }
		         });	
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(189, 94, 189, 37);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		JButton button_16 = new JButton("C");
		button_16.setBackground(Color.MAGENTA);
		button_16.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String text = textField_0.getText();
				int t = text.length() - 1;
				if (t < 0)
				{
					JOptionPane.showMessageDialog(null, "已经没有了！");
				} else 
				{
					text = text.substring(0, t);
					textField_0.setText(text);
				}
			}
		});
		button_16.setBounds(334, 142, 44, 38);
		frame.getContentPane().add(button_16);
		JButton button_17 = new JButton("X");
		button_17.setBackground(Color.RED);
		button_17.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				textField_0.setText("");
				textField_1.setText("");
			}
		});
		button_17.setBounds(334, 202, 44, 38);
		frame.getContentPane().add(button_17);
		JButton button_18 = new JButton(".");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField_0.getText();
				textField_0.setText(text + ".");
			}
		});
		button_18.setBackground(Color.ORANGE);
		button_18.setBounds(33, 290, 68, 38);
		frame.getContentPane().add(button_18);
		JButton button_19 = new JButton("%");
		button_19.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String text = textField_0.getText();
				textField_0.setText(text + "%");
			}
		});
		button_19.setBackground(Color.ORANGE);
		button_19.setBounds(189, 290, 68, 38);
		frame.getContentPane().add(button_19);
		JLabel informationTeam = new JLabel("Constructed by An Min");
		informationTeam.setSize(40,40);
		informationTeam.setFont(new Font("Times New Roman", Font.BOLD, 16));
		informationTeam.setBackground(Color.ORANGE);
		informationTeam.setBounds(240,330, 260, 36);
		frame.getContentPane().add(informationTeam);
	}
}