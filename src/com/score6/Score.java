package com.score6;
// 데이터 입력하고 폴더-> 파일 생성하고 그안에 데이터를 저장한다.
// 파일에 저장된 데이터를 재실행 했을 때 불러올 수 있어야한다. 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Score {

	private List<ScoreVO> lists ;
	//ArrayList<ScoreVO> lists= new ArrayList<ScoreVO>();
	// new 로 생성하면 실행할 때 마다 생성되기때문에 문제가 생길 수 있다.  정의만 한다. 
	private String path= System.getProperty("user.dir"); //user.dir 현재 내 프로젝트 위치를 읽어오기때문에 demo에 생성되는것. 
	private File f= new File(path,"//data//score.txt"); 

	public Score() { // 기본생성자. 
		try {

			if(!f.getParentFile().exists()) { // 경로 없으면 만들고 
				f.getParentFile().mkdirs();  //mkdirs ssss 만 쓴다. 
			}

			if(f.exists()) { // 경로가 있다면 그 안에 내용을 읽어온다. 
				FileInputStream fis= new FileInputStream(f);
				ObjectInputStream ois= new ObjectInputStream(fis);

				lists=(ArrayList<ScoreVO>)ois.readObject();
				fis.close();
				ois.close();

			}
		} catch (Exception e) {
		}
	}


	public void input() {
		Scanner sc= new Scanner(System.in);
		ScoreVO vo = new ScoreVO();

		System.out.print(" 이름 : " );
		vo.setName(sc.next());

		System.out.print(" 생일 : ");
		vo.setBirth(sc.next());

		System.out.print("점수 : ");
		vo.setScore(sc.next());

		if(lists==null) { // 처음 만드는거면 새로 만든다. 
			lists=new ArrayList<>();
		}
		lists.add(vo);
	}

	public void write() {

		Iterator<ScoreVO> it= lists.iterator();
		while(it.hasNext()) {
			ScoreVO data=it.next();
			System.out.print(data.toString());
		}	
	}

	public void writeFile() { //파일 저장 

		try {

			if(lists !=null) { // 데이터가 존재할떄. 

				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos); // 들어있는 데이터를 내보내는 것. 

				oos.writeObject(lists);
				fos.close();
				oos.close();

				System.out.println("파일 저장 성공 !" );
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}







