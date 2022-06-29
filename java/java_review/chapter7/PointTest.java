
public class PointTest {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		

	}

}

class Point2 {
	int x, y;
	
	// Constructor
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
}

class Point3D extends Point2 {
	int z;
	
	Point3D(int x, int y, int z) {
		// super() 없을 시 컴파일 시 super() 자동 호출
		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
