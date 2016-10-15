package create;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Create {
	
	private JFrame frame;
	private JPanel startpanel, homepanel, creditpanel;
	private JButton startbutton, creditbutton, backbutton;
	
	private final int gamewidth = 400, gamehight = 400;
	
	public Create() {
		//create frame
		frame = new JFrame();
		frame.setTitle("BuddyPet");
		frame.setSize(gamewidth, gamehight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		//create panel
		startpanel = new JPanel();
		homepanel = new JPanel();
		creditpanel = new JPanel();
		
		//create button
		startbutton = new JButton("Start");
		creditbutton = new JButton("Credit");
		backbutton = new JButton("Back");
		startbutton.setBounds(150, 150, 80, 50);
		creditbutton.setBounds(150, 150, 80, 50);
		backbutton.setBounds(150, 150, 80, 50);
		
		
	}
	
	public JFrame getFrame(){
		return frame;
	}
	
	public JPanel getstartPanel() {
		return startpanel;
	}
	
	public JPanel gethomePanel() {
		return homepanel;
	}
	
	public JPanel getcreditPanel() {
		return creditpanel;
	}
	
	public JButton getstartButton() {
		return startbutton;
	}
	
	public JButton getcreditButton() {
		return creditbutton;
	}
	
	public JButton getbackButton() {
		return backbutton;
	}
}
