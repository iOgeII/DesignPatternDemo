package example._2logger_basic;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	public static Object getBean() {
		try {
			// xml文件对象创建
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src//example//_2logger_basic//logger-config.xml"));
			
			// 读取包含类名的文本结点
			NodeList nl = doc.getElementsByTagName("className");
			Node node = nl.item(0).getFirstChild();
			String className = node.getNodeValue();
			
			// 生成类对象
			Class c = Class.forName(className);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
