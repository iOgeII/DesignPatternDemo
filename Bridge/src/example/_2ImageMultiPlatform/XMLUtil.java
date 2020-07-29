package example._2ImageMultiPlatform;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	public static Object getBean(String args) {
		try {		
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();		
			DocumentBuilder builder = dFactory.newDocumentBuilder();		
			Document doc =  builder.parse(new File("src//example//_2ImageMultiPlatform//image-platform-config.xml"));
			
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = null;
			String className = null;
			
			// 取第一个结点 扩充抽象类
			if (args.equals("image")) {
				classNode = nl.item(0).getFirstChild();
			}
			// 取第二个结点 具体实现类
			else if (args.equals("os")) {
				classNode = nl.item(1).getFirstChild();
			}
			className = classNode.getNodeValue();
			
			Class c = Class.forName(className);
			Object object = c.newInstance();
			return object;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}
