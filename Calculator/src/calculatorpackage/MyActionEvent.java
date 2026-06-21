package calculatorpackage;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class MyActionEvent implements ActionListener  {
	CalculatorPl calculatorPl;
	 char operator;
	 String s1,s2,s3,s4,s5,s6;
	Double de1,de2,de3;
	public MyActionEvent(CalculatorPl calculatorPl) {
		this.calculatorPl=calculatorPl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b=(JButton)e.getSource();
		
		if(b==calculatorPl.b1) {
	        s3=calculatorPl.t.getText();
	        s4="1";
	        s5=s3+s4;
	        calculatorPl.t.setText(s5);
		}
		else if(b==calculatorPl.b2) {
			 s3=calculatorPl.t.getText();
		        s4="2";
		        s5=s3+s4;
		        calculatorPl.t.setText(s5);}
		else if(b==calculatorPl.b3) {
			 s3=calculatorPl.t.getText();
		        s4="3";
		        s5=s3+s4;
		        calculatorPl.t.setText(s5);}
		else if(b==calculatorPl.b4) {
			 s3=calculatorPl.t.getText();
		        s4="4";
		        s5=s3+s4;
		        calculatorPl.t.setText(s5);}
		else if(b==calculatorPl.b5) {
			 s3=calculatorPl.t.getText();
		        s4="5";
		        s5=s3+s4;
		        calculatorPl.t.setText(s5);}
		
		
		else if(b==calculatorPl.b6) {
			 s3=calculatorPl.t.getText();
		        s4="6";
		        s5=s3+s4;
		        calculatorPl.t.setText(s5);}
		else if(b==calculatorPl.b7) {
			 s3=calculatorPl.t.getText();
		        s4="7";
		        s5=s3+s4;
		        calculatorPl.t.setText(s5);}
		else if(b==calculatorPl.b8) {
			 s3=calculatorPl.t.getText();
		        s4="8";
		        s5=s3+s4;
		        calculatorPl.t.setText(s5);}
		else if(b==calculatorPl.b9) {
			 s3=calculatorPl.t.getText();
		        s4="9";
		        s5=s3+s4;
		        calculatorPl.t.setText(s5);}
		else if(b==calculatorPl.b10) {
			
			String s6=calculatorPl.t.getText();
			  int v=Integer.parseInt(s6);
			  v=v*-1;
			  calculatorPl.t.setText(String.valueOf(v));
			
		}
		else if(b==calculatorPl.b11) {
			s3=calculatorPl.t.getText();
	        s4="0";
	        s5=s3+s4;
	        calculatorPl.t.setText(s5);}
		else if(b==calculatorPl.b12) {
			s3=calculatorPl.t.getText();
	        s4=".";
	        s5=s3+s4;
	        calculatorPl.t.setText(s5);
			
		}
		else if(b==calculatorPl.b14) {
			s1=calculatorPl.t.getText();
			calculatorPl.t.setText("");
			operator='+';
			
			
			}
		else if(b==calculatorPl.b15) {
			s1=calculatorPl.t.getText();
			

			calculatorPl.t.setText(" ");
			operator='-';}
		else if(b==calculatorPl.b16) {
			s1=calculatorPl.t.getText();
			calculatorPl.t.setText("");
			operator='*';}
		else if(b==calculatorPl.b17) {
			calculatorPl.t.setText("");}
		else if(b==calculatorPl.b18) {
			String str=calculatorPl.t.getText();
			if(!str.contains("=")) {
			if(str.length()>0) {
				String newS=str.substring(0, str.length()-1);
			calculatorPl.t.setText(newS);
			}}
			
		}
		else if(b==calculatorPl.b19) {
			operator='%';}
		
		
		
		else if(b==calculatorPl.b20) {
			s1=calculatorPl.t.getText();
			calculatorPl.t.setText("");
			operator='/';}
		else if(b==calculatorPl.b13) {
			s2=calculatorPl.t.getText();
			
			switch(operator)
			{
			
			case '+':
				
				de1= Double.parseDouble(s1);
				 de2=Double.parseDouble(s2);
				 de3=de1+de2;
				calculatorPl.t.setText(s1+operator+s2+"="+String.valueOf(de3));
				
				break;
			case '-':
				de1= Double.parseDouble(s1);
				 de2=Double.parseDouble(s2);
				 de3=de1-de2;
				calculatorPl.t.setText(s1+operator+s2+"="+String.valueOf(de3));
				
				break;
			case '*':
				
				de1= Double.parseDouble(s1);
				 de2=Double.parseDouble(s2);
				 de3=de1*de2;
				calculatorPl.t.setText(s1+operator+s2+"="+String.valueOf(de3));
				
				break;
			case '/':
				de1= Double.parseDouble(s1);
				 de2=Double.parseDouble(s2);
				 de3=de1/de2;
				calculatorPl.t.setText(s1+operator+s2+"="+String.valueOf(de3));
				
				break;
			case '%':
				de1= Double.parseDouble(s1);
				 de2=Double.parseDouble(s2);
				 de3=de1*de2/100;
				calculatorPl.t.setText(String.valueOf(de3));
					break;
			}
			
			
			
		}
	}

	

}
