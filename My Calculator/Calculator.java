import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	JFrame frame;
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
		
		textDisplay = new JTextField();
		textDisplay.setBounds(0, 0, 204, 140);
		textDisplay.setForeground(new Color(255, 255, 204));
		textDisplay.setBackground(SystemColor.inactiveCaptionText);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton btnBack = new JButton("\u2B38");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(2, 142, 50, 50);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnClear.setBounds(53, 142, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnPL = new JButton("(");
		btnPL.setBounds(104, 142, 50, 50);
		frame.getContentPane().add(btnPL);
		
		JButton btnPR = new JButton(")");
		btnPR.setBounds(154, 142, 50, 50);
		frame.getContentPane().add(btnPR);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(53, 292, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNum = textDisplay.getText()+btn7.getText();
				textDisplay.setText(enterNum);
				
			}
		});
		btn7.setBounds(2, 192, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(53, 192, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(104, 192, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(154, 192, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(2, 292, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(2, 242, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(53, 242, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(104, 242, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(154, 242, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(104, 292, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("x");
		btnMul.setBounds(154, 292, 50, 50);
		frame.getContentPane().add(btnMul);
		
		JButton btnCubeR = new JButton("\u221b");
		btnCubeR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCubeR.setBounds(2, 392, 67, 50);
		frame.getContentPane().add(btnCubeR);
		
		JButton btnRoot = new JButton("n\u221a");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRoot.setBounds(70, 392, 67, 50);
		frame.getContentPane().add(btnRoot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(137, 392, 67, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnMol = new JButton("%");
		btnMol.setBounds(2, 342, 50, 50);
		frame.getContentPane().add(btnMol);
		
		JButton btnEx = new JButton("x\u207F");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEx.setBounds(53, 342, 50, 50);
		frame.getContentPane().add(btnEx);
		
		JButton btnFac = new JButton("!");
		btnFac.setBounds(104, 342, 50, 50);
		frame.getContentPane().add(btnFac);
		
		JButton btnDivide = new JButton("\u00f7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDivide.setBounds(154, 342, 50, 50);
		frame.getContentPane().add(btnDivide);
	}
}
