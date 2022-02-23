package day02;

import javax.swing.*;
public class Ex02 {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("만나고 싶은 가수를 입력하세요!");
		JOptionPane.showMessageDialog(null, "당신이 만나고 싶은 가수는 "  + str + " 입니다.");
	}
}
