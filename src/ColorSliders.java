import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class ColorSliders {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorSliders window = new ColorSliders();
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
	public ColorSliders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private int red = 240;
	private int green = 240;
	private int blue = 240;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		JPanel colorPanel = new JPanel();
		colorPanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		colorPanel.setBounds(41, 174, 260, 45);
		frame.getContentPane().add(colorPanel);
		
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
		frame.getContentPane().add(redSlider);
		
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
		frame.getContentPane().add(greenSlider);
		
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
		frame.getContentPane().add(blueSlider);
		
		JLabel lblRed = new JLabel("Red");
		lblRed.setBounds(280, 29, 46, 14);
		frame.getContentPane().add(lblRed);
		
		JLabel lblGreen = new JLabel("Green");
		lblGreen.setBounds(280, 81, 46, 14);
		frame.getContentPane().add(lblGreen);
		
		JLabel lblBlue = new JLabel("Blue");
		lblBlue.setBounds(280, 137, 46, 14);
		frame.getContentPane().add(lblBlue);
		
		JButton okButton = new JButton("OK");
		okButton.setBounds(323, 32, 89, 174);
		frame.getContentPane().add(okButton);
		
		

	}
}
