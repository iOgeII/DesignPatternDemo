package example._2charts;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {

	public static String getChartType() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src//example//_2charts//chart-config.xml"));
			
			NodeList nl = doc.getElementsByTagName("chartType");
			Node node = nl.item(0).getFirstChild();
			String chartType = node.getNodeValue().trim();
			return chartType;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
