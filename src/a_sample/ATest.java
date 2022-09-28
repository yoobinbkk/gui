package a_sample;

import java.awt.*;

/*
	자바의 GUI (화면)
	- AWT : 1.2 이전
	- Swing : 1.2 이후
			  대부분 클래스 앞에 J
*/

import javax.swing.*;

public class ATest {
	
	JFrame f;
	JButton btn, btn2;
	JCheckBox cb, cb2;
	JRadioButton rb, rb2;
	JTextField tf;
	JTextArea ta;
	
	ATest() {											// 객체 생성을 해서 JFrame을 사용하는 방법
		f = new JFrame("나의 첫창");
		btn = new JButton("클릭");
		btn2 = new JButton("취소");
		cb = new JCheckBox("자바");
		cb2 = new JCheckBox("오라클");
		rb = new JRadioButton("남자");
		rb2 = new JRadioButton("여자");
		ButtonGroup group = new ButtonGroup();
		group.add(rb);
		group.add(rb2);
		tf = new JTextField(20);			// 평균 알파벳 20자
		ta = new JTextArea(40, 20);
	}
	
	void addLayout() {									// 변수명을 사용하지 않고 바로 넣는 걸 개발자는 선호한다
		// f.setLayout(new FlowLayout());						// 한 줄에 배치
		// f.setLayout(new GridLayout(3, 3));					// 행, 열에 맞춰 배치
		f.setLayout(new BorderLayout());						// 동/서/남/북/가운데 배치
		
		// 붙이기 작업
		f.add(btn	, BorderLayout.NORTH);						// 하나밖에 못 붙는다
		f.add(btn2	, BorderLayout.SOUTH);
		// f.add(cb);
		// f.add(cb2);
			JPanel pEast = new JPanel();
			pEast.add(rb);
			pEast.add(rb2);
		f.add(pEast	, BorderLayout.EAST);
		// f.add(rb	, BorderLayout.EAST);
		// f.add(rb2	, BorderLayout.EAST);
		f.add(new JLabel("입력하세요")	, BorderLayout.WEST);
		// f.add(tf);
		f.add(ta	, BorderLayout.CENTER);
		
		// 화면 출력
		f.setBounds(100, 100, 500, 350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		ATest a = new ATest();
		a.addLayout();
		
	}

}
