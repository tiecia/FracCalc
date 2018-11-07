import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class sliderFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sliderFrame frame = new sliderFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private static int red = 240;
	private static int green = 240;
	private static int blue = 240;
	private static String color = null;
	
	public sliderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel colorPanel = new JPanel();
		colorPanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		colorPanel.setBounds(41, 174, 260, 45);
		getContentPane().add(colorPanel);
		
		JSlider redSlider = new JSlider();
		redSlider.setValue(240);
		redSlider.setMaximum(255);
		redSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				red = redSlider.getValue();
				colorPanel.setBackground(new Color(red, green, blue));
			}
		});
		redSlider.setBounds(41, 29, 200, 26);
		getContentPane().add(redSlider);
		
		JSlider greenSlider = new JSlider();
		greenSlider.setValue(240);
		greenSlider.setMaximum(255);
		greenSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				green = greenSlider.getValue();
				colorPanel.setBackground(new Color(red, green, blue));
			}
		});
		greenSlider.setBounds(41, 81, 200, 26);
		getContentPane().add(greenSlider);
		
		JSlider blueSlider = new JSlider();
		blueSlider.setValue(240);
		blueSlider.setMaximum(255);
		blueSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				blue = blueSlider.getValue();
				colorPanel.setBackground(new Color(red, green, blue));
			}
		});
		blueSlider.setBounds(41, 137, 200, 26);
		getContentPane().add(blueSlider);
		
		JLabel lblRed = new JLabel("Red");
		lblRed.setBounds(280, 29, 46, 14);
		getContentPane().add(lblRed);
		
		JLabel lblGreen = new JLabel("Green");
		lblGreen.setBounds(280, 81, 46, 14);
		getContentPane().add(lblGreen);
		
		JLabel lblBlue = new JLabel("Blue");
		lblBlue.setBounds(280, 137, 46, 14);
		getContentPane().add(lblBlue);
		
		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color = red +" "+ green + " " + blue;
			}
		});
		okButton.setBounds(323, 32, 89, 174);
		getContentPane().add(okButton);
		
		return color;
	}

}
