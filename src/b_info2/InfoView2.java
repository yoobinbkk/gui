package b_info2;

import javax.swing.*;
import java.awt.*;

public class InfoView2 {
	
	// 1. 멤버 변수 선언
	JFrame f;
	JTextField tfName, tfID, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
	// 2. 멤버 변수 객체 생성
	InfoView2() {
		f = new JFrame("DB Test");
		
		tfName = new JTextField();
		tfID = new JTextField();
		tfTel = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();
		
		ta = new JTextArea(40, 30);
		
		bAdd = new JButton("Add", new ImageIcon("src\\b_info\\imgs\\book.PNG"));
		bShow = new JButton("Show", new ImageIcon("src\\b_info\\imgs\\book.PNG"));
		bSearch = new JButton("Search", new ImageIcon("src\\b_info\\imgs\\book.PNG"));
		bDelete = new JButton("Delete", new ImageIcon("src\\b_info\\imgs\\book.PNG"));
		bCancel = new JButton("Cancel", new ImageIcon("src\\b_info\\imgs\\book.PNG"));
		bExit = new JButton("Exit (alt+x)", new ImageIcon("src\\b_info\\imgs\\iexit.PNG"));
			bAdd.setVerticalTextPosition(JButton.BOTTOM);										// Text를 vertical에서 어떻게 배치?
			bAdd.setHorizontalTextPosition(JButton.CENTER);										// Text를 Horizontal에서 어떻게 배치?
			bAdd.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\lightbulb.PNG"));
			bAdd.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\brain.PNG"));
			bExit.setVerticalTextPosition(JButton.BOTTOM);
			bExit.setHorizontalTextPosition(JButton.CENTER);
			bExit.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\lightbulb.PNG"));
			bExit.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\brain.PNG"));
		
	}
	
	// 3. 화면 구성하고 출력
		// 전체 프레임 BorderLayout 지정
		// - West : JPanel 붙이기 (GridLayout(6,2))
		// - Center : TextArea
		// - South : JPanel 붙이기 (GridLayout(1,6))
	
	void addLayout() {
		f.setLayout(new BorderLayout());
		
		// 붙이기 작업
			JPanel pWest = new JPanel(new GridLayout(6,2));
			pWest.setPreferredSize(new Dimension(250,1));
			JLabel Name = new JLabel("Name");
			Name.setHorizontalAlignment(JLabel.CENTER);
			JLabel ID = new JLabel("ID");
			ID.setHorizontalAlignment(JLabel.CENTER);
			JLabel Tel = new JLabel("Tel");
			Tel.setHorizontalAlignment(JLabel.CENTER);
			JLabel Sex = new JLabel("Sex");
			Sex.setHorizontalAlignment(JLabel.CENTER);
			JLabel Age = new JLabel("Age");
			Age.setHorizontalAlignment(JLabel.CENTER);
			JLabel Home = new JLabel("Home");
			Home.setHorizontalAlignment(JLabel.CENTER);
			
			pWest.add(Name);
			pWest.add(tfName);
			pWest.add(ID);
			pWest.add(tfID);
			pWest.add(Tel);
			pWest.add(tfTel);
			pWest.add(Sex);
			pWest.add(tfGender);
			pWest.add(Age);
			pWest.add(tfAge);
			pWest.add(Home);
			pWest.add(tfHome);
			
		f.add(pWest, BorderLayout.WEST);
		f.add(ta , BorderLayout.CENTER);
			JPanel pSouth = new JPanel(new GridLayout(1,6));
			pSouth.add(bAdd);
			pSouth.add(bShow);
			pSouth.add(bSearch);
			pSouth.add(bDelete);
			pSouth.add(bCancel);
			pSouth.add(bExit);
		f.add(pSouth, BorderLayout.SOUTH);
		
		// 화면 출력
		f.setBounds(600, 300, 820, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		
		InfoView2 info = new InfoView2();
		info.addLayout();
		
		
	}

}
