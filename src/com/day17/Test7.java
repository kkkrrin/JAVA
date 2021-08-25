package com.day17;
//Swing 


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Test7 extends JFrame implements ActionListener {

	private JLabel lbl; 
	public Test7() {
		lbl = new JLabel("Message",JLabel.CENTER);
		add(lbl);
		//메뉴 
		JMenuBar mbar = new JMenuBar();
		JMenu menu ;
		JMenuItem mi; //메뉴바에 들어갈 아이템

		menu = new JMenu("메세지대화상자");
		mi= new JMenuItem("메세지");
		menu.add(mi);

		mi= new JMenuItem("입력");
		menu.add(mi);
		mi.addActionListener(this);

		mi= new JMenuItem("종료");
		menu.add(mi);
		mi.addActionListener(this);

		mbar.add(menu);// 위 구조를 메세지 대화상자 하위에 넣기.

		setJMenuBar(mbar); // 위 구조를 bar에 넣기. 

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("대화상자");
		setSize(300,300);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Test7();

	}


	@Override
	public void actionPerformed(ActionEvent e) {

		String str = e.getActionCommand(); //문자비교 
		if(str.equals("메세지")) {

			JOptionPane.showMessageDialog(this,"내일은 금요일","불금",JOptionPane.INFORMATION_MESSAGE);

		}else if(str.equals("입력")) {
			String msg= JOptionPane.showInputDialog(this,"오늘은 무슨 요일 입니까?","요일확인"
					,JOptionPane.QUESTION_MESSAGE);

			lbl.setText("오늘은 " + msg + "요일 입니다.");


		}else if(str.equals("종료")){

			int result;
			result = JOptionPane.showConfirmDialog(this, "프로그램을 종료 하시겠습니까?","종료확인",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if(result == JOptionPane.YES_OPTION) {
				System.exit(0);
			}

		}

	}

}
