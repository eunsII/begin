package day19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class Jjokji {
	// 이름을 알려주면 주소를 찾아내는 Map
	// 주소를 알려주면 이름을 찾아내주는 Map
	Properties nameToIp, ipToName;
	
	JList list;
	JButton sendB;
	JFrame frame;
	
	DatagramSocket sSocket, rSocket;
	/*
	 	sSocket 은 쪽지를 보내기 위한 소켓
	 	rSocket 은 쪽지를 받기 위한 소켓
	 	
	 	반드시 두개를 만들어야 하는 것은 아니고
	 	소켓 하나만 가지고 있어도 보내기와 받기를 할 수 있다.
	 	
	 	다만
	 		하나를 공유하는 경우는 
	 		보내는 도중에는 받지를 못할 수 있다.
	 	따라서 안전한 통신을 위해서
	 	보내는 소켓과 받는 소켓을 구분해서 처리하는 것이 좋다.
	 */
	
	public Jjokji() {
		setMap();
		
		// UI 제작
		frame = new JFrame("*** 쪽지 프로그램 ***");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 목록상자에 친구 이름을 기록해서 넣자.
		// Map에서 친구이름만 찾아서 넣어보자.
		Set set = nameToIp.keySet();
		Vector<String> nameList = new Vector<String>(set);
		
		list = new JList(nameList);
		
		JScrollPane sp = new JScrollPane(list);
		
		// 버튼
		sendB = new JButton("쪽지쓰기");
		Jjokji j = this;
		
		sendB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				new MsgWrite(j);
			}
		});
		
		frame.add(sp, BorderLayout.CENTER);
		frame.add(sendB, BorderLayout.SOUTH);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	// 맵을 파일의 내용으로 셋팅해주는 함수
	public void setMap() {
		nameToIp = new Properties();
		ipToName = new Properties();
		
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("src/day19/nameIp_ko.properties");
			fin2 = new FileInputStream("src/day19/ipName_ko.properties");
			
			nameToIp.load(fin1);
			ipToName.load(fin2);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin2.close();
				fin1.close();
			} catch(Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new Jjokji();
	}

}
