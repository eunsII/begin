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
				String name = (String) list.getSelectedValue();
				frame.setVisible(false);
				MsgWrite msg = new MsgWrite(j);
				msg.field.setText(name);
			}
		});
		
		frame.add(sp, BorderLayout.CENTER);
		frame.add(sendB, BorderLayout.SOUTH);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setResizable(false);
		
		/*
			이제 프로그램이 사작되었으므로
			네트워크 구성을 할 차례이다.
			여기서는 UDP 통신을 해야 하므로
			DatagramSocket을 이용해서 네트워클 구성을 해야 한다.
		 */
		try {
			sSocket = new DatagramSocket();
			rSocket = new DatagramSocket(7777);
			/*
				이렇게 하면 누군가에 접속한 것이 아니고
				네트워크 회선에만 접속한 상태가 된다.
				==> 통신이 가능하도록만 해주는 것이다.
			 */
			
			// 이제 네트워크 구성이 완료되었으므로
			// 쪽지를 보내고 받을 수 있다.
			// 받는 프로그램을 시작하자.
			// 받는 프로그램은 다른 프로그램들과 병행해서 처리가 되어야 하므로 스레드로 구성한다.
			
			ReceiveThread t = new ReceiveThread(this); // New Born 상태
			
			// Runnable 상태로 전위
			t.start();
			
		} catch(Exception e) {
			// 위작업이 예외가 발생한 것은 이 프로그램이 더이상 제 기능을 할 수 없는 상태이므로
			// 열려있는 소켓을 모두 닫아준다.
			close();
			e.printStackTrace();
		}
	}
	
	// 자원 반환해주는 함수
	public void close() {
		try {
			sSocket.close();
			rSocket.close();
		} catch(Exception e) {}
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
