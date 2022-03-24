package day19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReceiveDlg {
	Jjokji main;
	JTextField field;
	JTextArea area;
	JButton reB, closeB;
	JFrame frame;
	
	public ReceiveDlg(Jjokji main) {
		this.main = main;
	}
	
	public void setGui() {
		frame = new JFrame("받은 메세지");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		// 버튼
		reB = new JButton("답장");
		closeB = new JButton("닫기");
		
		closeB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				main.frame.setVisible(true);
			}
		});
	}
}
