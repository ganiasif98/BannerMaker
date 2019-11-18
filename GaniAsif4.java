import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GaniAsif4 {
	public static void main (String args []) {
		BannerMaker gui = new BannerMaker ();
		gui.setVisible(true);
		}
	
}

   class BannerMaker extends JFrame {
	   
	   private Container content;
	   private JTextField message;
	   
	   
	public BannerMaker () {
		super();
		setSize (600,600);
		setTitle("Banner Maker");
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setTitle ("Banner Maker");
		Container content = new Container ();
		content = getContentPane ();
		content.setLayout(new BorderLayout ());
		content.setBackground (Color.WHITE);
		
		JTextField message = new JTextField ();
		content.add(message, BorderLayout.CENTER);
		
		JPanel BackgroundPanel = new JPanel ();
		content.add(BackgroundPanel, BorderLayout.EAST);
		JButton White = new JButton ("WHITE");
		White.addActionListener(new ColorButtonListener (message));
		BackgroundPanel.add(White);
		JButton Blue = new JButton ("BLUE");
		Blue.addActionListener(new ColorButtonListener (message));
		BackgroundPanel.add(Blue);
		JButton Red = new JButton ("RED");
		Red.addActionListener(new ColorButtonListener (message));
		BackgroundPanel.add(Red);
		
		JPanel Style = new JPanel ();
		content.add(Style, BorderLayout.SOUTH);
		JButton Bold = new JButton ("BOLD");
		Bold.addActionListener(new StyleButtonListener (message));
		Style.add(Bold);
		JButton Italic = new JButton ("ITALIC");
		Italic.addActionListener(new StyleButtonListener (message));
		Style.add(Italic);
		JButton Plain = new JButton ("PLAIN");
		Plain.addActionListener(new StyleButtonListener (message));
		Style.add(Plain);
		
		JPanel Font = new JPanel ();
		content.add(Font, BorderLayout.WEST);
		JButton Serif= new JButton ("SERIF");
		Serif.addActionListener(new FontButtonListener (message));
		Font.add(Serif);
		JButton SanSerif = new JButton ("SAN SERIF");
		SanSerif.addActionListener(new FontButtonListener (message));
		Font.add(SanSerif);
	}
	
	class ColorButtonListener implements ActionListener {
		private JTextField message;
		
		ColorButtonListener (JTextField message) {
			this.message = message;
		}
		
		
		
		public void actionPerformed (ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("WHITE")) message.setBackground(Color.WHITE);
			if (command.equals ("BLUE")) message.setBackground(Color.BLUE);
			if (command.equals ("RED")) message.setBackground(Color.RED);
			
		}
	}
	
	class StyleButtonListener implements ActionListener {
		private JTextField message;
		
		StyleButtonListener (JTextField message) {
			this.message = message;
		}
		
		public void actionPerformed (ActionEvent e) {
			Font Bold = new Font ("PLAIN", Font.BOLD, 20);
			Font Italic = new Font ("ITALIC", Font.ITALIC, 20);
			Font Plain = new Font ("PLAIN", Font.PLAIN, 20);
			String command = e.getActionCommand();
			if (command.equals("BOLD")) message.setFont((Bold));
			if (command.equals ("ITALIC")) message.setFont(Italic);
			if (command.equals ("PLAIN")) message.setFont(Plain);
		}
	}
	
	class FontButtonListener implements ActionListener {
		private JTextField message;
		
		FontButtonListener (JTextField message) {
			this.message = message;
		}
		
		public void actionPerformed (ActionEvent e) {
			Font Serif = new Font ("SERIF", Font.PLAIN, 20 );
			Font San_Serif = new Font ("SAN_SERIF", Font.PLAIN, 20);
			
			String command = e.getActionCommand();
			if (command.equals ("SERIF")) message.setFont((Serif));
			if (command.equals ("SAN SERIF")) message.setFont((San_Serif));
		}
	}
 
	


}