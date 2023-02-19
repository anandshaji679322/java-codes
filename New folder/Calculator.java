import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel jl;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b0;
	JButton badd;
	JButton bsub;
	JButton bdiv;
	JButton bmul;
	JButton bclr;
	JButton bdot;
	JButton bequ;

	String oldvalue;
	float result;
	int operator=0;
	boolean isOperatorClicked=false;

	public Calculator(){
		jf=new JFrame("Calculator");
		jf.setSize(600,600);
		jf.setLocation(200,50);
		
		jl=new JLabel("");
		jl.setBounds(30,30,300,50);
		jf.add(jl);
		//jl.setBackground(Color.blue);
		jl.setOpaque(true);
		
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdot=new JButton(".");
		badd=new JButton("+");
		bsub=new JButton("-");
		bmul=new JButton("*");
		bdiv=new JButton("/");
		bclr=new JButton("C");
		bequ=new JButton("=");

		//first row
		b7.setBounds(30,100,80,80);
		jf.add(b7);
		b7.addActionListener(this);

		b8.setBounds(150,100,80,80);
		jf.add(b8);
		b8.addActionListener(this);
 
		b9.setBounds(270,100,80,80);
		jf.add(b9);
		b9.addActionListener(this);


		//second row
		b4.setBounds(30,220,80,80);
		jf.add(b4);
		b4.addActionListener(this);

		b5.setBounds(150,220,80,80);
		jf.add(b5);
		b5.addActionListener(this);

		b6.setBounds(270,220,80,80);
		jf.add(b6);
		b6.addActionListener(this);


		//third row
		b1.setBounds(30,340,80,80);
		jf.add(b1);
		b1.addActionListener(this);

		b2.setBounds(150,340,80,80);
		jf.add(b2);
		b2.addActionListener(this);

		b3.setBounds(270,340,80,80);
		jf.add(b3);
		b3.addActionListener(this);
	

		//fourth row
		bdot.setBounds(30,460,80,80);
		jf.add(bdot);
		bdot.addActionListener(this);

		b0.setBounds(150,460,80,80);
		jf.add(b0);
		b0.addActionListener(this);

		bequ.setBounds(270,460,80,80);
		jf.add(bequ);
		bequ.addActionListener(this);
		

		//operators
		badd.setBounds(390,100,80,80);
		jf.add(badd);
		badd.addActionListener(this);

		bsub.setBounds(390,220,80,80);
		jf.add(bsub);
		bsub.addActionListener(this);

		bdiv.setBounds(390,340,80,80);
		jf.add(bdiv);
		bdiv.addActionListener(this);

		bmul.setBounds(390,460,80,80);
		jf.add(bmul);
		bmul.addActionListener(this);

		bclr.setBounds(500,100,80,80);
		jf.add(bclr);
		bclr.addActionListener(this);



		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b7){
			if(isOperatorClicked==true){
				jl.setText("7");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"7");
			}
		}
		else if(e.getSource()==b8){
			if(isOperatorClicked==true){
				jl.setText("8");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"8");
			}
		}
		else if(e.getSource()==b9){
			if(isOperatorClicked==true){
				jl.setText("9");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"9");
			}
		}
		else if(e.getSource()==b6){
			if(isOperatorClicked==true){
				jl.setText("6");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"6");
			}
		}
		else if(e.getSource()==b5){
			if(isOperatorClicked==true){
				jl.setText("5");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"5");
			}
		}
		else if(e.getSource()==b4){
			if(isOperatorClicked==true){
				jl.setText("4");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"4");
			}
		}
		else if(e.getSource()==b3){
			if(isOperatorClicked==true){
				jl.setText("3");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"3");
			}
		}
		else if(e.getSource()==b2){
			if(isOperatorClicked==true){
				jl.setText("2");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"2");
			}
		}
		else if(e.getSource()==b1){
			if(isOperatorClicked==true){
				jl.setText("1");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"1");
			}
		}
		else if(e.getSource()==b0){
			if(isOperatorClicked==true){
				jl.setText("0");
				isOperatorClicked=false;
			}else{
				jl.setText(jl.getText()+"0");
			}
		}
		else if(e.getSource()==bclr){
			jl.setText("");
		}
		else if(e.getSource()==bdot){
			jl.setText(jl.getText()+".");
		}
		else if(e.getSource()==badd){
			isOperatorClicked=true;
			operator=1;
			oldvalue=jl.getText();
		}
		else if(e.getSource()==bsub){
			isOperatorClicked=true;
			operator=2;
			oldvalue=jl.getText();
		}
		else if(e.getSource()==bdiv){
			isOperatorClicked=true;
			operator=3;
			oldvalue=jl.getText();
		}
		else if(e.getSource()==bmul){
			isOperatorClicked=true;
			operator=4;
			oldvalue=jl.getText();
		}
		else if(e.getSource()==bequ){
			String newvalue=jl.getText();
			float oldvaluef=Float.parseFloat(oldvalue);
			float newvaluef=Float.parseFloat(newvalue);
			isOperatorClicked=true;
			switch(operator){
				case 1:result=oldvaluef+newvaluef;
					   operator=0;
					   jl.setText(result+"");
					   break;
				case 2:result=oldvaluef-newvaluef;
					   operator=0;
					   jl.setText(result+"");
					   break;
				case 3:result=oldvaluef/newvaluef;
					   operator=0;
					   jl.setText(result+"");
					   break;
				case 4:result=oldvaluef*newvaluef;
					   operator=0;
					   jl.setText(result+"");
					   break;
			}
		}
		
	}

	public static void main(String ar[]){
		new Calculator();
	}
}