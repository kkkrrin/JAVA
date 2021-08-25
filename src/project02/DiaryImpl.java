package project02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("");
		System.out.print("정보 확인중");
		for(int i=0; i<5; i++) {
			System.out.print(".");
			try {
				sleep(1000);
			} catch (Exception e) {
				System.out.println(e.toString());

			}
		}
		System.out.println("");
	}
}
public class DiaryImpl implements Diary {

	Scanner sc = new Scanner(System.in);
	private ArrayList<DiaryVO> lists = new ArrayList<DiaryVO>(); // 여기가 문제인가 ?
	
	private int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private String email[] = { "naver.com", "gmail.com", "daum.net", "nate.com", "hanmail.net" };

	private String path = System.getProperty("user.dir");
	private File f = new File(path, "//project01//userinfo.txt");

	DiaryImpl2 DI = new DiaryImpl2();
	
	public DiaryImpl() {
		try {

			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			if (f.exists()) {
				// System.out.println("파일존재"); 확인용
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				lists = (ArrayList<DiaryVO>) ois.readObject();

				fis.close();
				ois.close();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void join() {
		Scanner sc = new Scanner(System.in);
		DiaryVO da = new DiaryVO();
		String id;

		do {
			System.out.println("");
			System.out.print("아이디 입력 [8~15자 이내 영문, 숫자 혼합] : ");
			id = sc.next();
		} while (!checkCid(id));
		da.setId(id);
		System.out.println("");
		System.out.print("비밀번호 입력 : ");
		String pw1 = sc.next();
		String pw2 = null;

		do {
			System.out.println("");
			System.out.print("비밀번호 확인 : ");
			pw2 = sc.next();
		} while (!checkPw(pw1, pw2));
		da.setPw(pw1);

		System.out.println("");
		System.out.print("이름을 입력 : ");
		String name = sc.next();
		da.setName(name);

		String birth = null;
		do {
			System.out.println("");
			System.out.print("생년월일을 입력 [ex)20001125] : ");
			birth = sc.next();
			if (birth.length() == 7) {
				String h = "0";
				h += birth.substring(6);
				birth = birth.substring(0, 6) + h;
			}
		} while (!checkBirth(birth));

		String start = birth.substring(0, 4);
		String middle = birth.substring(4, 6);
		String end = birth.substring(6);
		birth = start + "-" + middle + "-" + end;
		da.setBirth(birth);

		String tel = null;
		do {
			System.out.println("");
			System.out.print("휴대전화 번호를 입력하세요 : [-제외] : ");
			tel = sc.next();
		} while (!checkTel(tel));

		start = tel.substring(0, 3);
		middle = tel.substring(3, 7);
		end = tel.substring(7);
		tel = start + "-" + middle + "-" + end;
		da.setTel(tel);

		String mail = null;
		do {
			System.out.println("");
			System.out.print("E-Mail을 입력해주세요");
			mail = sc.next();
		} while (!checkMail(mail));
		da.setMail(mail);

		if (lists == null) {
			lists = new ArrayList<>();
		}
		lists.add(da);
		
		String checklength = "*        " + da.getName() + "님의 ID : " + da.getId();
		
		System.out.println("**************************************************************");
		System.out.println("*                    회원가입이 완료되었습니다!              *");
		System.out.println("*                           환영합니다!                      *");
		System.out.println("*                                                            *");
		System.out.print(checklength);
		
		for(int i = 1; i >= 54-checklength.length(); i++) {
			
		System.out.print("  ");
		
		}
		
		System.out.println("*");
		System.out.println("**************************************************************");

	}

	@Override
	public boolean checkCid(String id) {
		id = id.trim();
		if (!checkId(id)) {
			if (id.length() >= 8 && id.length() <= 15) {

				int eng = 0;
				int cnt = 0;

				char ch = ' ';
				for (int i = 0; i < id.length(); i++) {
					ch = id.charAt(i);
					if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
						eng++;
					} else if (ch >= '0' && ch <= '9') {
						cnt++;
					}
				}

				if (eng == 0) {
					System.out.println("! 영문 혼용");
					return false;
				}
				if (cnt == 0) {
					System.out.println("! 숫자 혼용");
					return false;
				}
				return true;
			} else { // 입력 숫자 초과
				System.out.println("! 아이디는 8~15자 이내로 입력해주세요.");
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean checkId(String id) {
		id = id.trim();
		if (lists.size() > 0) {
			Iterator<DiaryVO> it = lists.iterator();
			while (it.hasNext()) {
				DiaryVO da = it.next();
				if (da.getId().equals(id)) {
					System.out.println("존재하는 아이디 입니다");
					return true;
				} else {
					System.out.println(" 사용 가능한 아이디 입니다.");
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

	@Override
	public void writeFile() {
		try {

			if (lists != null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				// Iterator<DiaryVO> it = lists.iterator();

				fos.close();
				oos.close();
				// System.out.println(" 회원 정보 저장완료 "); 확인용

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void print() {

		Iterator<DiaryVO> it1 = lists.iterator();
		while (it1.hasNext()) {
			DiaryVO data = it1.next();
			System.out.println(data.toString());
		}
		System.out.println("");
		
	}

	@Override
	public boolean checkPw(String pw1, String pw2) {
		pw1 = pw1.trim();
		pw2 = pw2.trim();
		if (!(pw1.equals(pw2))) {
			System.out.println();
			System.out.println("!!일치하지 않습니다!!");
			return false;
		} else {
			System.out.println("");
			System.out.println("*일치*");
			return true;
		}
	}

	@Override
	public boolean checkMail(String mail) {
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";
		if (!Pattern.matches(pat, mail)) {
			System.out.println("이메일 형식으로 입력해주세요");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkTel(String tel) {
		tel = tel.trim();
		if (tel.length() != 11 || !(tel.substring(0, 3).equals("010"))) {
			System.out.println("! 정확히 입력해주세요 [-제외] ");
			return false;
		} else if (tel.length() == 11 && tel.substring(0, 3).equals("010")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkBirth(String birth) {
		birth = birth.trim();
		if (!(birth.length() == 8)) {
			System.out.println("! 정확히 입력해주세요 [-제외]");
			return false;
		}

		int year = Integer.parseInt(birth.substring(0, 4));
		int month = Integer.parseInt(birth.substring(4, 6));
		int day = Integer.parseInt(birth.substring(6));

		if (!(year >= 1900 && year <= 2021)) {
			System.out.println("! 1900~2021년 중 입력해주세요");
			return false;
		}
		if (!(month >= 1 && month <= 12)) {
			System.out.println("! 1월~12월 중 입력해주세요 ");
			return false;
		}
		days[1] = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;

		if (days[month - 1] < day || 1 > day) {
			System.out.printf("! 일수는 1~%d까지 입력해주세요.\n", days[month - 1]);
			return false;
		}

		return true;
	}

	public void login() {

		while (true) {

			String loginid = "", loginpass = "";

			System.out.print("아이디를 입력해 주세요 : ");
			loginid = sc.next();
			System.out.print("\n비밀번호를 입력해 주세요 : ");
			loginpass = sc.next();
			
			Iterator<DiaryVO> it = lists.iterator();

			int cnt = 0;

			while (it.hasNext()) {

				DiaryVO da = it.next();

				if (da.getId().equals(loginid) && da.getPw().equals(loginpass)) {
					
					MyThread ob = new MyThread();
					
					ob.start();
					
					try {
						
						ob.join();
						
					} catch (Exception e) {
						
						System.out.println(e.toString());
						
						// TODO: handle exception
					}
					
					System.out.println("");
					System.out.println("로그인 되었습니다.");
					cnt++;
					
					myidpage(loginid);

				}

			}

			if (cnt > 0) {
				break;
			}
			
			MyThread ob = new MyThread();
			
			ob.start();
			
			try {
				
				ob.join();
				
			} catch (Exception e) {
				
				System.out.println(e.toString());
				
				// TODO: handle exception
			}
			
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.println("");
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.println("");
		}

	}
	
	public void myidpage(String loginid) {
		System.out.println("");
		System.out.println("***********************************");
		System.out.println("");
		System.out.println("\t" + loginid + "님 환영합니다.");
		System.out.println("");
		System.out.println("***********************************");
		System.out.println("");
		
		//DI.checkId(loginid);
		
		int ch;
		while(true) {
			do {
				System.out.println("1.일기쓰기  ┃  2.일기보기  ┃  3.종료");
				System.out.println("");
				System.out.print("선택 : ");
				ch =sc.nextInt();
			}while(ch<1|| ch>6);

			switch(ch) {
			case  1:
				System.out.println("");
				DI.input();
				DI.writeFile();
				break;
				
			case 2:
				System.out.println("");
				DI.print();
				DI.DiaryChoice();
				break;
				
			case 3:
			default:
				System.out.println("");
				System.out.println("일기장을 종료합니다.");            
				System.exit(0);
			}
		}

	}
	
}
