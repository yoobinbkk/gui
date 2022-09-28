package c_sample;

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;					// * 는 다른 패키지의 내용을 불러오지 못한다. 자신의 클래스만 불러온다.

/*
 * 	화면(JFrame)에 '확인' 버튼 하나 출력
*/

public class EventTest3 {
	
	JFrame f;
	JButton b1;
	
	EventTest3 () {
		f = new JFrame("Test");
		
		b1 = new JButton("확인 3");
		
		// 1. 이벤트 핸들러 만들기
			// 핸들러 - 이벤트 처리 클래스
		// 2. 핸들러 객체 생성
		// 3. 이벤트 발생할 컴포넌트 연결
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "이벤트 발생3");
				
			}
			
		});
	}
	
	public void addLayout() {
		
		f.setLayout(new FlowLayout());
		
		f.add(b1);
		
		f.setBounds(200, 200, 300, 250);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		EventTest3 a = new EventTest3();
		a.addLayout();
		
	}

}
