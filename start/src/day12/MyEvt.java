package day12;

import java.awt.Color;
import java.awt.event.*;

public class MyEvt implements ActionListener {
	MyWin main;
	
	public MyEvt(MyWin main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		
		Color c = new Color(red, green, blue);
		
		main.mainP.setBackground(c);
	}

}
