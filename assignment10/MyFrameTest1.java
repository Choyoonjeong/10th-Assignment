package assignment10;

import java.awt.FlowLayout;
import javax.swing.*;
  
class MyFrame1 extends JFrame {
	JPanel p1;
  
	public MyFrame1() {
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++)
			p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true); // 프레임을 화면에 표시한다.
	}
}

public class MyFrameTest1 {
	public static void main(String args[]) {
		MyFrame1 f = new MyFrame1();
	}
}

