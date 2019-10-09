import java.awt.EventQueue;
import java.lang.Math;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Calculator.Factorial;

import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends Factorial {

	JFrame frame;
double firstNum,secNum,result;
String answer,operation;
private JTextField textDisplay;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 222, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("<<");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length()-1);
					backspace = strB.toString();
					textDisplay.setText(backspace);
				}
			}
		});
		btnBack.setBounds(2, 142, 50, 50);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(null);
				
				
			}
		});
		btnClear.setBounds(53, 142, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnPL = new JButton("(");
		btnPL.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPL.setBounds(104, 142, 50, 50);
		frame.getContentPane().add(btnPL);
		
		JButton btnPR = new JButton(")");
		btnPR.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPR.setBounds(154, 142, 50, 50);
		frame.getContentPane().add(btnPR);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn2.getText();
				textDisplay.setText(enterNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn2.setBounds(53, 292, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn7.getText();
				textDisplay.setText(enterNum);
				
			}
		});
		btn7.setBounds(2, 192, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn8.getText();
				textDisplay.setText(enterNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn8.setBounds(53, 192, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn9.getText();
				textDisplay.setText(enterNum);
			}
		});
		btn9.setBounds(104, 192, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation="+";
			}
			
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlus.setBounds(154, 192, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn1.getText();
				textDisplay.setText(enterNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn1.setBounds(2, 292, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn4.getText();
				textDisplay.setText(enterNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn4.setBounds(2, 242, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn5.getText();
				textDisplay.setText(enterNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn5.setBounds(53, 242, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn6.getText();
				textDisplay.setText(enterNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn6.setBounds(104, 242, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMinus.setBounds(154, 242, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn3.getText();
				textDisplay.setText(enterNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn3.setBounds(104, 292, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("x");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation="x";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMul.setBounds(154, 292, 50, 50);
		frame.getContentPane().add(btnMul);
		
		JButton btnCubeR = new JButton("\u221b");
		btnCubeR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				firstNum=Math.cbrt(firstNum);
				result=firstNum;
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
				operation="\u221b";
				
			}
		});
		btnCubeR.setBounds(2, 392, 67, 50);
		frame.getContentPane().add(btnCubeR);
		
		JButton btnRoot = new JButton("n\u221a");
		btnRoot.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRoot.setBounds(70, 392, 67, 50);
		frame.getContentPane().add(btnRoot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secNum = Double.parseDouble(textDisplay.getText());
			if(operation=="+") {
				
				result=firstNum+secNum;
				answer = String.format("%.2f", result);
				textDisplay.setText(firstNum+"+"+secNum+"="+answer);
				
			} else if(operation=="-") {
				
				result=firstNum-secNum;
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
				
			} else if(operation=="x") {
				
				result=firstNum*secNum;
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
			} else if(operation=="%") {
				
				result=firstNum%secNum;
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
			} else if(operation=="\u00f7") {
				
				result=firstNum/secNum;
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
		
			} 
			
			
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.setBounds(137, 392, 67, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnMol = new JButton("%");
		btnMol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation="%";
			}
			
			
		});
		btnMol.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMol.setBounds(53, 342, 50, 50);
		frame.getContentPane().add(btnMol);
		
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btnZero.getText();
				textDisplay.setText(enterNum);
			}
		});
		btnZero.setBounds(2, 342, 50, 50);
		frame.getContentPane().add(btnZero);
		
		JButton btnFac = new JButton("!");
		btnFac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				Factorial fact = new Factorial();
				result=fact.factorial(firstNum);
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
				operation="!";
			}
		});
		btnFac.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFac.setBounds(104, 342, 50, 50);
		frame.getContentPane().add(btnFac);
		
		JButton btnDivide = new JButton("\u00f7");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation="\u00f7";
			}
		});
		btnDivide.setBounds(154, 342, 50, 50);
		frame.getContentPane().add(btnDivide);
		
		textDisplay = new JTextField();
		textDisplay.setBackground(SystemColor.inactiveCaptionText);
		textDisplay.setForeground(new Color(255, 250, 250));
		textDisplay.setBounds(2, 0, 204, 144);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
	}
}
