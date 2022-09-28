package b_info3;

import javax.swing.*;
import java.awt.*;


public class AppSecret {
	
	// 멤버 변수
	JFrame f;
	JTextField tfName, tfID, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	// 생성자
	AppSecret () {
		f = new JFrame("DB Test");
		
		tfName = new JTextField();
		tfID = new JTextField();
		tfTel = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		
		ta = new JTextArea();
		
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");
	}
	
	// 전체 프레임 BorderLayout 지정
	// - West : JPanel 붙이기 (GridLayout(6,2))
	// - Center : TextArea
	// - South : JPanel 붙이기 (GridLayout(1,6))
	
	void addLayout() {
		
		// 전체 화면을 BorderLayout 로 설정
		f.setLayout(new BorderLayout());
		
		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(6,2));
		pWest.add(new Label("Name"));
		pWest.add(tfName);
		pWest.add(new Label("ID"));
		pWest.add(tfID);
		pWest.add(new Label("Tel"));
		pWest.add(tfTel);
		pWest.add(new Label("Sex"));
		pWest.add(tfGender);
		pWest.add(new Label("Age"));
		pWest.add(tfAge);
		pWest.add(new Label("Home"));
		pWest.add(tfHome);
		
		f.add(pWest, BorderLayout.WEST);
		
		f.add(ta , BorderLayout.CENTER);
		
		JPanel pSouth = new JPanel();
		pSouth.setLayout(new GridLayout(1,6));
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);
		
		f.add(pSouth, BorderLayout.SOUTH);
		
		// 화면 출력
		f.setBounds(600,300, 820, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[] args) {
		
		AppSecret app = new AppSecret();
		app.addLayout();
		
		
	}

}
