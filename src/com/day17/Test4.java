package com.day17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test4 extends Frame implements ActionListener { // action- 이벤트 감지

	private TextField tf ; //값 입력하는 부분
	private TextArea ta; // 보여지는 부분
	private Button btn;


	public Test4() {

		tf= new TextField();
		ta= new TextArea();
		btn=new Button("추가");

		add(tf,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);

		tf.addActionListener(this);
		btn.addActionListener(this); // test4에서(this) 버튼에서 액션이 발생하면~ action perform 으로간다. 


		setTitle("윈도우");
		setSize(200,300);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {

		new Test4(); // 실행 


	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob=e.getSource();	// 받는 e 값의 자료형을 모르니까. obj 로 받는다. 
		if(ob instanceof Button || ob instanceof TextField) {

			String str = tf.getText();

			if(!str.equals(" ")) { // null인지 검사. ( null 이 아니면) 
				ta.append(str+"\r\n");
			}
			tf.setText(" "); // 지우고
			tf.requestFocus(); // 커서 
			
		}

	}

}
