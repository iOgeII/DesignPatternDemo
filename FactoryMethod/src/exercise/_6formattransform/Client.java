package exercise._6formattransform;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataFactory dataFactory;
		Data data;
		dataFactory = (DataFactory)XMLUtil.getBean();
		data = dataFactory.getData();
		data.dataTransform();
	}

}
