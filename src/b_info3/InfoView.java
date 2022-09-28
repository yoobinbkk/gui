package b_info3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

public class InfoView {

	// 1. 멤버 변수 선언
	JFrame f;
	JTextField tfName, tfID, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;

	// 2. 멤버 변수 객체 생성
	InfoView() {
		f = new JFrame("DB Test");

		tfName = new JTextField();
		tfID = new JTextField();
		tfTel = new JTextField();
		tfGender = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();

		ta = new JTextArea(40, 30);

		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("Exit");

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

	// 이벤트 처리 함수
	public void eventProc() {		// 버튼이 눌렸을 때 "이벤트 발생" 띄움
		bAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트 발생");}});
		bShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트 발생");}});
		bSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트 발생");}});
		bDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트 발생");}});
		bCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "텍스트 필드 삭제");}});
		bExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "창을 닫으려면 상단 X를 누르세요.");}});

		// 주민번호 입력창에서 엔터 쳤을 때
		tfID.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getJuminInfo();

				tfID.addFocusListener(new FocusListener() {

					public void focusGained(FocusEvent e) {

					}

					public void focusLost(FocusEvent e) {
						getJuminInfo();
					}


				});	// end of addFocusListener

			}	// end of actionPerformed
		});	// end of addActionListener
		
		bCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearTextField();
			}	// end of ActionListener
		});	// end of addActionListener

	}	// end of eventProc()
		
		// 각각의 텍스트 필드의 값을 지우기
		
		void clearTextField() {
			ta.setText(null);
			tfName.setText(null);
			tfID.setText(null);
			tfTel.setText(null);
			tfGender.setText(null);
			tfAge.setText(null);
			tfHome.setText(null);
			// 나머지 텍스트 필드도 지우기
			
		}	// end of clearTextField()

	void getJuminInfo () {
		String jumin = tfID.getText();
		if (jumin.length() < 14) {
			JOptionPane.showMessageDialog(null, "- 포함한 15자를 맞춰주세요");
		} else {JOptionPane.showMessageDialog(null, jumin);}

		// (1) 주민번호의 7번째 문자로 성별을 구하여 성별창에 출력
		char gen = jumin.charAt(7);
		if (gen == '1') {
			JOptionPane.showMessageDialog(null, "남자");
		} else if (gen == '2') {
			JOptionPane.showMessageDialog(null, "여자");
		} else {}

		// (2) 주민번호의 8번째 문자로 출신지를 구하여 출신지창에 출력
		char chul = jumin.charAt(8);
		switch (chul) {								// 1.5 이후부터는 문자, 정수, **문자열
		case '1' : JOptionPane.showMessageDialog(null, "서울");	break;
		case '2' : JOptionPane.showMessageDialog(null, "인천");	break;
		case '3' : JOptionPane.showMessageDialog(null, "부산");	break;
		case '4' : JOptionPane.showMessageDialog(null, "경기");	break;
		case '9' : JOptionPane.showMessageDialog(null, "제주");	break;			// 마지막 줄에는 break; 없어도 된다.
		}

		// (3) 주민번호의 연도에 의해 나이를 구해여 나이창에 출력
		String nai = jumin.substring(0, 2);
		int snai = Integer.parseInt(nai);			// snai = 94
		int age = 0;

		Calendar c = Calendar.getInstance();		// .getInstance 클래스 안에 있는 객체를 불러오기
		int year = c.get(Calendar.YEAR);			// 2022

		int century = year / 100;
		int kiloYear = century * 100;

		int yearIndex = year - kiloYear;			// 29
		int youngYear = kiloYear;					// 2000
		int oldYear = kiloYear - 100;				// 1900

		if (snai > yearIndex) {
			age = year - (oldYear + snai) + 1;
			JOptionPane.showMessageDialog(null, age);
		} else if (snai <= yearIndex && snai >= 0) {
			age = year - (youngYear + snai) + 1;
			JOptionPane.showMessageDialog(null, age);
		}
	}	// end of getJuminInfo



	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();


	}

}
