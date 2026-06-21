package calculatorpackage;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
public class CalculatorPl   {
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13
	,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	TextField t;
	public CalculatorPl(String string){
		 try {
			 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			 } catch (Exception e) {
			 	// TODO Auto-generated catch block
			 		e.printStackTrace();} 
		JWindow splash=new JWindow();
		
		ImageIcon i=new ImageIcon("C:\\Users\\CBA\\eclipse-workspace\\Calculator\\calculator.png");
		JLabel jl=new JLabel(i);
		splash.add(jl);
		splash.setLocation(200, 200);
		splash.setSize(350,540);
		splash.setVisible(true);
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {
			
		}
		splash.dispose();
		f=new JFrame(string);
		java.util.List<Image> icons= new ArrayList<Image>();
		Image im=new BufferedImage(1,1, BufferedImage.TYPE_INT_ARGB);
		icons.add(im);
		Image im2=new ImageIcon("C:\\Users\\CBA\\eclipse-workspace\\Calculator\\calculator.png").getImage();
		icons.add(im2);
		f.setIconImages(icons);
		f.setLocation(200, 200);
		f.setBackground(new Color(243,243,243));	
		t=new TextField();
		t.setFont(new Font("Arial",Font.BOLD,20));
		t.setBackground(Color.cyan);
		t.setBounds(50, 40, 260, 40);
		b1=new JButton("1");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setBounds(50, 340, 50, 50);
		b2=new JButton("2");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setBounds(120, 340, 50, 50);
		b3=new JButton("3");
		b3.setFont(new Font("Arial",Font.BOLD,20));
		b3.setBounds(190, 340, 50, 50);
		b4=new JButton("4");
		b4.setFont(new Font("Arial",Font.BOLD,20));
		b4.setBounds(50, 270, 50, 50);
		b5=new JButton("5");
		b5.setFont(new Font("Arial",Font.BOLD,20));
		b5.setBounds(120, 270, 50, 50);
		b6=new JButton("6");
		b6.setFont(new Font("Arial",Font.BOLD,20));
		b6.setBounds(190, 270, 50, 50);
		b7=new JButton("7");
		b7.setFont(new Font("Arial",Font.BOLD,20));
		b7.setBounds(50, 200, 50, 50);
		b8=new JButton("8");
		b8.setFont(new Font("Arial",Font.BOLD,20));
		b8.setBounds(120, 200, 50, 50);
		b9=new JButton("9");
		b9.setFont(new Font("Arial",Font.BOLD,20));
		b9.setBounds(190, 200, 50, 50);
		b10=new JButton("+/-");
		b10.setFont(new Font("Arial",Font.BOLD,17));
		b10.setMargin(new Insets(0, 0, 0, 0));
		b10.setBounds(50, 410, 50, 50);
		b11=new JButton("0");
		b11.setFont(new Font("Arial",Font.BOLD,20));
		b11.setBounds(120, 410, 50, 50);
		b12=new JButton(".");
		b12.setFont(new Font("Arial",Font.BOLD,20));
		b12.setBounds(190, 410, 50, 50);
		b13=new JButton("=");
		b13.setFont(new Font("Arial",Font.BOLD,20));
		b13.setBounds(260, 410, 50, 50);
		b14=new JButton("+");
		b14.setFont(new Font("Arial",Font.BOLD,20));
		b14.setBounds(260, 340, 50, 50);
		b15=new JButton("-");
		b15.setFont(new Font("Arial",Font.BOLD,20));
		b15.setBounds(260, 270, 50, 50);
		b16=new JButton("x");
		b16.setFont(new Font("Arial",Font.BOLD,20));
		b16.setBounds(260, 200, 50, 50);
		b17=new JButton("CE");
		b17.setFont(new Font("Arial",Font.BOLD,17));
		b17.putClientProperty("Nimbus.Overrides", new UIDefaults() {{
			put("Button.contentMargins", new Insets(0, 0, 0, 0));
			
		}});
		b17.setBounds(50, 130, 50, 50);
		b18=new JButton("Back");
	b18.setFont(new Font("Arial",Font.BOLD,17));
	b18.putClientProperty("Nimbus.Overrides", new UIDefaults() {{
		put("Button.contentMargins", new Insets(0, 0, 0, 0));
		
	}});
		b18.setBounds(120, 130, 50, 50);
		b19=new JButton("%");
		b19.setFont(new Font("Arial",Font.BOLD,18));
		b19.setMargin(new Insets(0, 0, 0, 0));
		b19.setBounds(190, 130, 50, 50);
		b20=new JButton("/");
		b20.setFont(new Font("Arial",Font.BOLD,20));
		b20.setBounds(260, 130, 50, 50);
	MyActionEvent m=new MyActionEvent(this);
	b1.addActionListener(m);
	b2.addActionListener(m);
	b3.addActionListener(m);
	b4.addActionListener(m);
	b5.addActionListener(m);
	b6.addActionListener(m);
	b7.addActionListener(m);
	b8.addActionListener(m);
	b9.addActionListener(m);
	b10.addActionListener(m);
	b11.addActionListener(m);
	b12.addActionListener(m);
	b13.addActionListener(m);
	b14.addActionListener(m);
	b15.addActionListener(m);
	b16.addActionListener(m);
	b17.addActionListener(m);
	b18.addActionListener(m);
	b19.addActionListener(m);
	b20.addActionListener(m);
		
		JPanel p=new JPanel();
		
		p.setLayout(null);
		p.setPreferredSize(new Dimension(350,540));
		p.setMinimumSize(new Dimension(350,540));
		p.setMaximumSize(new Dimension(350,540));
		
		p.add(t);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(b5);
	p.add(b6);
	p.add(b7);
	p.add(b8);
	p.add(b9);
	p.add(b10);
	p.add(b11);
	p.add(b12);
	p.add(b13);
	p.add(b14);
	p.add(b15);
	p.add(b16);
	p.add(b17);
	p.add(b18);
	p.add(b19);
	p.add(b20);
		f.setLayout(new GridBagLayout());
		f.add(p);
		
		f.setSize(350,540);
f.setVisible(true);
f.addWindowListener(new MyWindowAdapter());}
	public static void main(String[] args) {
		CalculatorPl CalculatorPlLogic=new CalculatorPl("Calculator");}}
