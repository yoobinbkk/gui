package a_sample;

import javax.swing.*;

public class BTest extends JFrame {								// 상속을 받아 JFrame을 사용하는 방법
	
	JButton btn;
	
	BTest(){
		super("나의 두 번째 창");									// title을 적기 위해 super()을 씀
		btn = new JButton("확인2");
	}
	void addLayout() {											// 
		
		add(btn);
		
		setBounds(100, 100, 500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		BTest b = new BTest();
		b.addLayout();
		
	}

}
