package day19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.net.*;

public class MsgWrite {
	Jjokji main;
	
	JFrame frame;
	JTextField field; // 이름을 기록할 필드
	JTextArea area;
	JButton sendB, resetB, closeB;
	
	public MsgWrite(Jjokji main) {
		this.main = main;
		
		frame = new JFrame("### 메세지 작성 ###");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		// 버튼
		sendB = new JButton("보내기");
		resetB = new JButton("다시작성");
		closeB = new JButton("닫  기");
		
		JPanel bPan = new JPanel(new GridLayout(1, 3));
		
		bPan.add(sendB);
		bPan.add(resetB);
		bPan.add(closeB);
		
		// 버튼 이벤트
		WriteEvt evt = new WriteEvt(this);
		sendB.addActionListener(evt);
		resetB.addActionListener(evt);
		
		closeB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				main.frame.setVisible(true);
				frame.dispose(); // 현재 창만 닫아야 한다.
			}
		});
		
		frame.add(field, BorderLayout.NORTH);
		frame.add(sp, BorderLayout.CENTER);
		frame.add(bPan, BorderLayout.SOUTH);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
	}

}
