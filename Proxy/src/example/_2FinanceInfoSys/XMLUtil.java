package example._2FinanceInfoSys;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	public static Object getBean() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc = builder.parse(new File("src//example//_2FinanceInfoSys//proxy-config.xml"));
			
			NodeList nl = doc.getElementsByTagName("className");
			Node n = nl.item(0).getFirstChild();
			String className = n.getNodeValue();
			
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
