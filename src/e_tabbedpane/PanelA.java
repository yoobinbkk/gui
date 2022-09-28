package e_tabbedpane;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PanelA extends JPanel {

	JLabel aLa = new JLabel("판데기 A");
	JButton aBtn = new JButton("A 버튼");
	
	MainTest parent;

	public PanelA (MainTest mainTest) {
		parent = mainTest;
		
		setBackground(new Color(255,0,0));			// RGB (Red, Green, Blue)
		setLayout(new GridLayout(2,2));
		
		addLayout();
		eventProc();
	}

	void addLayout() {
		add(aLa);
		add(aBtn);
	}

	void eventProc() {
		aBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.la.setText("안녕하세요");
			}	// end of ActionListener
		});	// end of addActionListener
	}	// end of eventProc
}
