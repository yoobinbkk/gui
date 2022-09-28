package e_tabbedpane.copy;

import java.awt.*;
import javax.swing.*;

public class PanelA extends JPanel {
	
	JLabel aLa = new JLabel("판데기 A");
	JButton aBtn = new JButton("A 버튼");
	
	public PanelA () {
		setBackground(new Color(255,0,0));			// RGB (Red, Green, Blue)
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		add(aLa);
		add(aBtn);
	}
	
	void eventProc() {
		
	}
}
