package example._2skin;

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
			Document doc = builder.parse(new File("src//example//_2skin//skin-config.xml"));
			
			NodeList nl = doc.getElementsByTagName("skinType");
			Node n = nl.item(0).getFirstChild();
			String className = n.getNodeValue();

			Class c = Class.forName(className);
			Object obj = c.newInstance();
			return obj;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
