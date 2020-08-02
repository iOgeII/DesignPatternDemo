package exercise._6FileEditor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory ff = FlyweightFactory.getInstance();
		Jpg j = (Jpg)ff.getInsertItem("jpg");
		Gif g = (Gif)ff.getInsertItem("gif");
		Mp4 m = (Mp4)ff.getInsertItem("mp4");
		
		j.showFlyweight(new Location(10, 200));
		g.showFlyweight(new Location(26, 470));
		m.showFlyweight(new Location(32, 985));
		
	}

}
