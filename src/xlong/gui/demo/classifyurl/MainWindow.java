package xlong.gui.demo.classifyurl;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainWindow {
	static JFrame aWindow = new JFrame("This is the Window Title");
	
	public static void main(String[] args) {
		
		UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
		for(UIManager.LookAndFeelInfo look : looks) {
			System.out.println(look.getClassName());
		}
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		} catch(Exception e) {
			System.err.println("Look and feel not set.");
		}
		
		
//		Toolkit theKit = aWindow.getToolkit(); // Get the window toolkit
//		Dimension wndSize = theKit.getScreenSize(); // Get screen size
//		aWindow.setBounds(wndSize.width/4, wndSize.height/4, // Position
//			wndSize.width/2, wndSize.height/2); // Size
		
		
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		int windowWidth = 400;
		int windowHeight = 150;
		aWindow.setBounds(center.x-windowWidth/2, center.y-windowHeight/2,
				windowWidth, windowHeight);
		
		aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aWindow.setVisible(true); // Display the window
		

	}
}
