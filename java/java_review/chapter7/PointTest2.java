
public class PointTest2 {

	public static void main(String[] args) {
		Point3D2 p = new Point3D2(2, 3, 4);
		System.out.println("p.x = " + p.x);
		System.out.println("p.y = " + p.y);
		System.out.println("p.z = " + p.z);

	}

}

class Point3 {
	int x = 10;
	int y = 20;
	
	Point3(int x, int y) {
		// super() 자동 추가
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point3 {
	int z = 30;
	
	Point3D2() {
		this(100, 200, 300);
	}
	
	Point3D2(int x, int y, int z) {
		// 생성자 없을 시 super() 호출 그러나 Point3에는 Point3() 기본 생성자가 없음!
		super(x, y);
		this.z = z;
	}
}