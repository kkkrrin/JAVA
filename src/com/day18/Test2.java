package com.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test2 extends Frame implements ActionListener{

	private TextArea ta;
	private TextField tf;

	public Test2() { //생성자
		ta=new TextArea();
		add(ta);

		tf=new TextField("http://");
		tf.addActionListener(this);
		add(tf,BorderLayout.NORTH);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("HTML Views");
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			String str;
			URL url= new URL(tf.getText());

			// 방법1
			//InputStream is =url.openStream(); 
			//BufferedReader br = new BufferedReader(new InputStreamReader(is));

			//방법2
			URLConnection conn=url.openConnection();
			InputStream is = conn.getInputStream();

			String s= conn.getContentType();
			ta.setText("MIME TYPE:"+s);

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while((str=br.readLine())!=null) {

				if(ta.getText().equals("")) {
					ta.setText(str);
				}else {
					ta.setText(ta.getText()+"\r\n"+str);
				}
			}
			is.close();

		} catch (Exception e2) {

		}
	}
}
