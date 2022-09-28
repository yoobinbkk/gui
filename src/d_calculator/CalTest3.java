package d_calculator;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class CalTest3 {

	// 1. 멤버변수
	JFrame f;
	JTextField tf;
	JButton [] bNum;	// 0 ~ 9 숫자 표현할 버튼
	JButton [] bOp;		// +, -, *, / 연산자를 표현할 버튼
	JButton bEqual;
	
	int first, second;
	String op;

	// 2. 객체 생성
	CalTest3 () {

		// JFrame
		f = new JFrame("유치원 계산기");

		tf = new JTextField();

		bNum = new JButton [10];
		for (int i=0 ; i<bNum.length ; i++) {
			bNum[i] = new JButton();
			bNum[i].setText(String.valueOf(i));
		}
		bOp = new JButton [4];
		bOp[0] = new JButton("+");
		bOp[1] = new JButton("-");
		bOp[2] = new JButton("*");
		bOp[3] = new JButton("/");
		bEqual = new JButton("=");


	}	// end of CalTest()

	// 3. 화면 구성 및 화면 출력
	void addLayout () {

		f.setLayout(new BorderLayout());

		f.add(tf, BorderLayout.NORTH);

		JPanel pCenter = new JPanel(new GridLayout(5, 3));
		pCenter.setPreferredSize(new Dimension(250, 1));
		for (int i=1 ; i<bNum.length ; i++) {
			pCenter.add(bNum[i]);
		}
		pCenter.add(bOp[0]);
		pCenter.add(bNum[0]);
		pCenter.add(bEqual);
		pCenter.add(bOp[1]);
		pCenter.add(bOp[2]);
		pCenter.add(bOp[3]);

		f.add(pCenter, BorderLayout.CENTER);

		// 화면 출력
		f.setBounds(600, 300, 420, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}	// end of addLayout()

	// 4. 이벤트 처리
	void eventProc () {
		
		// 숫자 버튼이 눌렸을 때
		for (int i=0 ; i<bNum.length ; i++) {
			bNum[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton evt = (JButton) e.getSource();				// e : 지금 받는 이벤트 정보	// JButton으로 다운 캐스팅이 되어야 함.
					tf.setText(tf.getText() + evt.getText());
				}	// end of actionPerformed
			});	// end of addActionListener
		}
		
		// 연산자 버튼 눌렸을 때
		for (int i=0 ; i<bOp.length ; i++) {
			bOp[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton evt = (JButton) e.getSource();
					op = evt.getText();
					first = Integer.parseInt(tf.getText());
					tf.setText("");
//					tf.setText(tf.getText()+evt.getText());
				}	// end of actionPerformed
			});	// end of addActionListener
		}
		
		// = 버튼이 눌렸을 때
		bEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Integer.parseInt(tf.getText());
				int result = 0;
				switch (op) {
				case "+" : result = first + second; break;
				case "-" : result = first - second; break;
				case "*" : result = first * second; break;
				case "/" : result = first / second; break;
				}
				tf.setText(String.valueOf(result));
				
				
				
//				ArrayList <String> cal = new ArrayList <String> ();
//				String word = tf.getText();
//				for (String k : word.split("+")) {
//					cal.add(k);
//				}
				
				
				
			}	// end of actionPerformed
		});	// end of addActionListener
		


	}	// end of eventProc()


	public static void main(String[] args) {

		CalTest3 cal = new CalTest3();
		cal.addLayout();
		cal.eventProc();

	}

}
