package dankcode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel playerOption = new JLabel("How many players?");
		playerOption.setFont(new Font("Tahoma", Font.PLAIN, 20));
		playerOption.setBounds(129, 0, 174, 79);
		frame.getContentPane().add(playerOption);
		
		JButton btn2Players = new JButton("2 Players");
		btn2Players.setBounds(217, 67, 217, 147);
		frame.getContentPane().add(btn2Players);
		
		JButton btn1Player = new JButton("1 Player");
		btn1Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //On 1 Player Selection
				//The user has decided to play solo against the AI (TO DO: ADD AI)
				/**
				 * 
				 * Set up the match, this part can be copied to the setup for the 2 player mode aswell
				 * 
				 */
				int currentPlayer = 1;
				frame.getContentPane().remove(playerOption); //Clears previous layout
				frame.getContentPane().remove(btn1Player); 
				frame.getContentPane().remove(btn2Players); 
				
				JButton btnNewButton = new JButton("");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setBounds(77, 335, 140, 140);
				frame.getContentPane().add(btnNewButton);
				
				JButton button_1 = new JButton("");
				button_1.setBounds(227, 335, 140, 140);
				frame.getContentPane().add(button_1);
				
				JButton button_2 = new JButton("");
				button_2.setBounds(377, 335, 140, 140);
				frame.getContentPane().add(button_2);
				
				JButton button_3 = new JButton("");
				button_3.setBounds(377, 184, 140, 140);
				frame.getContentPane().add(button_3);
				
				JButton button_4 = new JButton("");
				button_4.setBounds(227, 184, 140, 140);
				frame.getContentPane().add(button_4);
				
				JButton button_5 = new JButton("");
				button_5.setBounds(77, 184, 140, 140);
				frame.getContentPane().add(button_5);
				
				JButton button_6 = new JButton("");
				button_6.setBounds(77, 32, 140, 140);
				frame.getContentPane().add(button_6);
				
				JButton button_7 = new JButton("");
				button_7.setBounds(227, 32, 140, 140);
				frame.getContentPane().add(button_7);
				
				JButton button_8 = new JButton("");
				button_8.setBounds(377, 33, 140, 140);
				frame.getContentPane().add(button_8);
				
				
				
			}
		});
		btn1Player.setBounds(0, 67, 217, 147);
		frame.getContentPane().add(btn1Player);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().add(button);
		
		
	}
}
