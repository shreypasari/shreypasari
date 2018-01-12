
public class HomeDesignerApp {
public static void main(String[] args) {
		
		HomeDesigner houseType = new WoodenHouse();
		System.out.println("Woodenhouse");
		houseType.buildHouse();
		
		
		houseType = new GlassHouse();
		System.out.println("Glasshouse");
		houseType.buildHouse();
	}

}
