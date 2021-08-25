package project02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class DiaryImpl2 {

	/*public String checkId(String loginid) {
		
		return loginid;
		
	}*/
	
	private HashMap<String, DiaryVO2> h = new HashMap<String, DiaryVO2>();
	private String path = System.getProperty("user.dir");
	private File f = new File(path, "\\data\\diary.txt"); // 로그인한 아이디로 txt파일이 만들어져야됨

	public DiaryImpl2() {
		try {
			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdir();
			}
			if (f.exists()) {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				h = (HashMap<String, DiaryVO2>) ois.readObject();

				fis.close();
				ois.close();
			}

		} catch (Exception e) {

		}
	}

	Scanner sc = new Scanner(System.in);
	int y, m, w, d;
	String date;// key
	String findDay;
	String y1, m1, d1, cnt;

	// 1.일기쓰기 input()
	public void input() {

		Calendar now = Calendar.getInstance();

		do {
			System.out.println("일기를 작성할 년도를 입력하세요.");
			y = sc.nextInt();
			if (y != 2021) {
				System.out.println("올해의 일기만 작성이 가능합니다..");
			}

		} while (y < 2021 || y > 2021);

		do {
			System.out.println("일기를 작성할 월을 입력하세요.");
			m = sc.nextInt();
			if (m < 1 || m > 12) {
				System.out.println("존재하지 않는 달입니다...");
			}
		} while (m < 1 || m > 12);

		now.set(y, m - 1, 1);
		w = now.get(Calendar.DAY_OF_WEEK);

		System.out.println("\t [ " + y + "년 " + m + "월 ]\n");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("=====================================");
		for (int i = 1; i < w; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= now.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d", i);
			w++;
			if (w % 7 == 1) {
				System.out.println();
			}
		}
		if (w % 7 != 1) {
			System.out.println();
			System.out.println("-------------------------------\n\n");
		}

		DiaryVO2 vo = new DiaryVO2();

		do {
			System.out.print("원하는 일을 선택해주세요");
			d = sc.nextInt();
			if (d > now.getActualMaximum(Calendar.DATE) || d < 0) {
				System.out.println("존재하지 않는 일입니다...");
			}
		} while (d > now.getActualMaximum(Calendar.DATE) || d < 0);

		/*
		 * date = sc.next(); if(date.length()!=8) {
		 * System.out.println("날짜 입력 오류! 다시 입력하세요.."); return; }
		 */

		y1 = Integer.toString(y);
		m1 = Integer.toString(m);
		d1 = Integer.toString(d);
		if (m1.length() == 1) {
			m1 = 0 + m1;

		}
		if (d1.length() == 1) {

			d1 = 0 + d1;

		}
		date = y1 + m1 + d1;

		if (!h.containsKey(date)) {
			h.put(date, vo);
		}

		System.out.print(y1 + "년" + m1 + "월" + d1 + "일" + " 일기를 작성하세요.\n> ");

		// "." 단어를 입력 할 때까지 엔터칠 수 있음
		int i = 0;
		String talking = "";
		String check = "";
		while (true) {
			talking = sc.nextLine();
			
			if (talking.equals(".")) {
				
				break;
				
			}
			
			check += talking + "\n";
			
		}
		vo.setDiary(check);

		System.out.println();

		if (h == null) {
			h = new HashMap<String, DiaryVO2>();
		}
		h.put(date, vo);
		System.out.print("일기 작성완료!!\n ");
		System.out.println("");

	}

	// 2. 일기보기 print()

	public void print() {

		Iterator<String> it = h.keySet().iterator();
		while (it.hasNext()) {
			
			date = it.next();// key를 반환
			DiaryVO2 vo = h.get(date);
			// System.out.println(date + " 일기 : " +vo.toString());
			System.out.printf("%s 년 %s 월 %s 일 ┃ %.10s", date.substring(0, 4),date.substring(4, 6),date.substring(6, 8), vo.toString().replaceAll("\n", ""));
			System.out.println("");
		}

	}

	public void DiaryChoice() {
		Iterator<String> it = h.keySet().iterator();
		while (it.hasNext()) {
			date = it.next();// key를 반환
			DiaryVO2 vo = h.get(date);
		}
		System.out.println("");
		System.out.print("보고싶은 날짜를 선택해 주세요 (ex : 20210202) : ");

		String date2 = sc.next();
		if (h.containsKey(date2)) {
			DiaryVO2 vo = h.get(date2);
			h.put(date2, vo);

			// 존재하는 일기 전체 출력
			// System.out.printf("%s일 일기입니다. : %s\n",date2,vo.toString());
			System.out.println("");
			System.out.println(date2.substring(0, 4) + " 년 " + date2.substring(4, 6) + " 월 " +date2.substring(6, 8) + " 일 "  + "Diary ");
			System.out.println(vo.toString());

			while (true) {

				int cho;
				System.out.println("1.수정하기  ┃  2.삭제하기  ┃  3.뒤로가기");
				System.out.print("선택 : ");
				cho = sc.nextInt();
				System.out.println("");
				switch (cho) {
				case 1:
					update(date2);
					writeFile();
					break;

				case 2:
					delete(date2);
					writeFile();
					break;

				case 3:
				default:
					break;
				}

				break;

			}

		} else {
			// 해당 날짜에 일기가 없다면
			System.out.println("입력하신 " + date2 + "일에 일기가 존재하지 않습니다.");
		}

	}

	// 3.일기수정 update()

	public void update(String findDay) {
		Iterator<String> it = h.keySet().iterator();
		while (it.hasNext()) {
			date = it.next();// key를 반환
			DiaryVO2 vo = h.get(date);
		}
		/*
		 * System.out.println("수정할 일기의 날짜를 입력하세요\n\n>"); findDay = sc.next();
		 */

		if (h.containsKey(findDay)) {
			DiaryVO2 vo = h.get(findDay);
			h.put(findDay, vo);

			// 존재하는 일기 전체 출력
			System.out.printf("%s일 일기입니다. : %s\n", findDay, vo.toString());
			System.out.println("");

			// 일기 변경
			System.out.print("변경 내용을 입력하세요.\n> ");
			String fake1 = sc.nextLine();
			int i = 0;
			String talking = "";
			String check = "";
			while (true) {
				talking = sc.nextLine();
				if (talking.equals(".")) {
					break;
				}
				check += talking;
			}
			vo.setDiary(check);

			h.put(findDay, vo);
			System.out.println("정상적으로 일기가 변경되었습니다.");
			System.out.println("");

		}
	}

	// 4.일기지우기 delete()

	public void delete(String date) {
		Iterator<String> it = h.keySet().iterator();

		/*
		 * System.out.println("삭제할 일기의 날짜를 검색하세요 ex)20201010"); String delDate =
		 * sc.next();
		 */

		String delDate = date;

		int cnt = 0;
		while (it.hasNext()) {
			date = it.next();
			if (date.equals(delDate)) {
				h.keySet().remove(date);// date와 delDate 같으면 keyset의 date삭제
				cnt++;// 카운트+1
				System.out.println("일기가 삭제되었습니다.");
				System.out.println("-------------------------------");
				break;// while문 깨고 나와서 delete() 종료
			} else {//// date와 delDate 다르면 카운트 0
				continue;// 다음 문장 실행
			}
		}
		if (cnt == 0) {// 카운트 0이므로 아래 실행하고 delete() 종료
			System.out.println("입력하신 " + delDate + "일에 일기가 존재하지 않습니다.");
			System.out.println("-------------------------------");
			return;
		}
	}

	// 5.일기저장 writeFile()

	public void writeFile() {
		try {

			if (h != null) {

				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(h);

				fos.close();
				oos.close();

			}

		} catch (Exception e) {

			System.out.println(e.toString());

		}

	}

}
