package com.day20;

import java.awt.im.InputContext;
import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test1 {

	public static void main(String[] args) {

		try {
			//DOM Document 객체를 생성하기위해 팩토리 생성 

			DocumentBuilderFactory f= DocumentBuilderFactory.newInstance();  // 객체생성
			DocumentBuilder parser = f.newDocumentBuilder();

			Document xmlDoc=null;
			String url="book.xml";
			if(url.indexOf("http://")!=-1) {
				URL u= new URL(url);
				InputStream is = u.openStream(); // 빨대를 꽂아?
				xmlDoc=parser.parse(is);

			}else {		 
				xmlDoc=parser.parse(url);	 
			}

			// Element : XML문서의 요소를 표현하기위한 사용 

			Element root = xmlDoc.getDocumentElement();
			System.out.println(root.getTagName());

			//Node : 각 요소를 읽고 쓰기 위해 사용

			Node book1 = root.getElementsByTagName("book").item(0);
			System.out.println(((Element)book1).getAttribute("kind")); // down, up,형변환

			Node title = book1.getFirstChild();
			Node title1= title.getNextSibling(); // 타이틀 태그 <title>
			System.out.println(title1.getNodeName());

			Node title1_1 =title1.getFirstChild();
			System.out.println(title1_1.getNodeValue());

			// 전체 데이터
			NodeList books = root.getElementsByTagName("book");
			String out="";
			String str;

			for(int i=0; i<books.getLength();i++) {
				Node book= books.item(i);
				str=book.getNodeName();
				out += "노드명 :" + str;

				NamedNodeMap bookMap= book.getAttributes(); // 속성 읽어오기
				str= bookMap.getNamedItem("kind").getNodeValue();

				out +=" , kind :" + str;

				NodeList eList = book.getChildNodes(); 
				for(int j=0; j<eList.getLength(); j++) {
					Node e= eList.item(j);
					str="";
					if(e.getNodeType()==Node.ELEMENT_NODE) { //검증

						str=","+e.getNodeName();
						out+=str+": ";
						out+=e.getChildNodes().item(0).getNodeValue();

					}				 
				}
				out+="\n";	 
			}

			System.out.println(out);


		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
