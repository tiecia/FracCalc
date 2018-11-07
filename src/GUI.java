import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;



import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GUI {

private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	public static JFrame frame = new JFrame();
	public static JPanel panel_2 = new JPanel();
	public static JPanel panel_1 = new JPanel();
	public static JPanel panel_3 = new JPanel();
	public static JPanel panel = new JPanel();
	public static JPanel panel_5 = new JPanel();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (UnsupportedLookAndFeelException e) {
		    // handle exception
		} catch (ClassNotFoundException e) {
		    // handle exception
		} catch (InstantiationException e) {
		    // handle exception
		} catch (IllegalAccessException e) {
		    // handle exception
		}
		
		frame.setBounds(100, 100, 442, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel TopMargin = new JPanel();
		TopMargin.setBounds(10, 11, 406, 96);
		frame.getContentPane().add(TopMargin);
		TopMargin.setLayout(null);
		

		panel.setBounds(0, 64, 406, 32);
		TopMargin.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 334, 31);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setBounds(334, 0, 72, 31);
		panel.add(btnClear);
		
		JLabel lblFractionCalculator = new JLabel("Fraction Calculator");
		lblFractionCalculator.setBounds(42, 0, 316, 46);
		TopMargin.add(lblFractionCalculator);
		lblFractionCalculator.setFont(new Font("Tahoma", Font.PLAIN, 38));
		

		panel_1.setBounds(10, 119, 215, 248);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		
		
		
		panel_2.setBounds(0, 0, 215, 200);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 5, 5));
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		panel_2.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		panel_2.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		panel_2.add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		panel_2.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		panel_2.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		panel_2.add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		panel_2.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		panel_2.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		panel_2.add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
			}
		});
		panel_2.add(button);
		panel_2.add(button0);
		
		JButton button_1 = new JButton("_");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "_");
			}
		});
		panel_2.add(button_1);
		
		
		panel_3.setBounds(0, 206, 215, 38);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnFractionBar = new JButton("Fraction Bar");
		btnFractionBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		panel_3.add(btnFractionBar);
		

		panel_5.setBounds(233, 118, 183, 249);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 10));
		
		JButton Add = new JButton("+");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + " + ");
			}
		});
		panel_5.add(Add);
		
		JButton Subtract = new JButton("\u2212");
		Subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + " - ");
			}
		});
		panel_5.add(Subtract);
		
		JButton Multiply = new JButton("x");
		Multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + " * ");
			}
		});
		panel_5.add(Multiply);
		
		JButton Divide = new JButton("/");
		Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + " / ");
			}
		});
		panel_5.add(Divide);
		
		JButton Enter = new JButton("Enter");
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String output;
				output = GUICalc.fracCalc(textField.getText());
				textField.setText(output);
				
			}
		});
		panel_5.add(Enter);
		
		JLabel lblNoteYouMust = new JLabel("Note: You MUST use the fraction bar button as the fraction bar. (Not the \"/\" button)");
		lblNoteYouMust.setForeground(Color.BLACK);
		lblNoteYouMust.setBounds(10, 372, 406, 22);
		frame.getContentPane().add(lblNoteYouMust);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mnColor = new JMenuItem("Change Color");
		mnColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ColorSliders.colorChange();
			}
		});
		mnFile.add(mnColor);
	}
}
