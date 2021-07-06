package web_test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class test2 {

    
	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\한길\\Downloads\\C0010102-004-두계천 목차\\C0010102-004-두계천 목차.xml");
			DocumentBuilderFactory docBuildFact = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuild = docBuildFact.newDocumentBuilder();
			Document doc = docBuild.parse(file);
			doc.getDocumentElement().normalize();

 
			// person엘리먼트 리스트
			NodeList personlist = doc.getElementsByTagName("Drawing_administration_information");
			Node personNode = personlist.item(0);
			
			NodeList nameList = null;
			NodeList nameList2 = null;
			NodeList nameList3 = null;
			NodeList nameList4 = null;
			NodeList nameList5 = null;
			NodeList nameList6 = null;
			NodeList nameList7 = null;
			NodeList nameList8 = null;
			
			
			if (personNode.getNodeType() == Node.ELEMENT_NODE) {
				// person엘리먼트 
				Element personElmnt = (Element) personNode;
			 
				// name 태그
				System.out.println("---------- Project_Information ------------------");
				nameList= personElmnt.getElementsByTagName("Data1");
				for (int i = 0; i < nameList.getLength(); i++) {
				
					Element nameElmnt = (Element) nameList.item(i);
					Node name = nameElmnt.getFirstChild();
					System.out.println("Data1    : " + name.getNodeValue());
				}
				System.out.println("---------------------------------------------");
				
				// name 태그
				System.out.println("---------- Project_Additional_Information ------------------");
				nameList2= personElmnt.getElementsByTagName("Data2");
				for (int i = 0; i < nameList2.getLength(); i++) {
				
					Element nameElmnt = (Element) nameList2.item(i);
					Node name = nameElmnt.getFirstChild();
					System.out.println("Data2    : " + name.getNodeValue());
				}
				System.out.println("---------------------------------------------");
				
				// name 태그
				System.out.println("---------- Employer_Information ------------------");
				nameList3= personElmnt.getElementsByTagName("Data3");
				for (int i = 0; i < nameList3.getLength(); i++) {
				
					Element nameElmnt = (Element) nameList3.item(i);
					Node name = nameElmnt.getFirstChild();
					System.out.println("Data3    : " + name.getNodeValue());
				}
				System.out.println("---------------------------------------------");
				
				// name 태그
				System.out.println("----------  ------------------");
				nameList4= personElmnt.getElementsByTagName("Data4");
				for (int i = 0; i < nameList4.getLength(); i++) {
				
					Element nameElmnt = (Element) nameList4.item(i);
					Node name = nameElmnt.getFirstChild();
					System.out.println("Data4    : " + name.getNodeValue());
				}
				System.out.println("---------------------------------------------");
				
				// name 태그
				System.out.println("---------- Drawing_Preview_Information ------------------");
				nameList5= personElmnt.getElementsByTagName("Data5");
				for (int i = 0; i < nameList5.getLength(); i++) {
				
					Element nameElmnt = (Element) nameList5.item(i);
					Node name = nameElmnt.getFirstChild();
					System.out.println("Data5    : " + name.getNodeValue());
				}
				System.out.println("---------------------------------------------");
				
				// name 태그
				System.out.println("---------- Drawing_Index_Information ------------------");
				nameList6= personElmnt.getElementsByTagName("Data6");
				for (int i = 0; i < nameList6.getLength(); i++) {
				
					Element nameElmnt = (Element) nameList6.item(i);
					Node name = nameElmnt.getFirstChild();
					System.out.println("Data6    : " + name.getNodeValue());
				}
				System.out.println("---------------------------------------------");
				
				// name 태그
				System.out.println("---------- Drawing_Additional_Information ------------------");
				nameList7= personElmnt.getElementsByTagName("Data7");
				for (int i = 0; i < nameList7.getLength(); i++) {
				
					Element nameElmnt = (Element) nameList7.item(i);
					Node name = nameElmnt.getFirstChild();
					System.out.println("Data7    : " + name.getNodeValue());
				}
				System.out.println("---------------------------------------------");
				
				// name 태그
				System.out.println("---------- Drawing_Change_Information ------------------");
				nameList8= personElmnt.getElementsByTagName("Data8");
				for (int i = 0; i < nameList8.getLength(); i++) {
				
					Element nameElmnt = (Element) nameList8.item(i);
					Node name = nameElmnt.getFirstChild();
					System.out.println("Data8    : " + name.getNodeValue());
				}
				System.out.println("---------------------------------------------");
 
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    }
    
    

}
