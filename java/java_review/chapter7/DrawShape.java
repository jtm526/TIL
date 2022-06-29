// Example of a composite

public class DrawShape {
	public static void main(String[] args) {
		// 참조배열 선언과 동시에 초기화
		Point[] p = {
				new Point(100, 200),
				new Point(140, 50),
				new Point(200, 100)
		};
		Triangle t = new Triangle(p);
        Circle c1 = new Circle(new Point(150, 150), 50);
        Circle c2 = new Circle(); // 기본 생성자 활용
        
        t.draw();
        c1.draw();
        c2.draw();
	}

}


class Shape {
	String color = "black";
	
	void draw() {
		System.out.printf("[color = %s]%n", color);
	}
}

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Basic constructor
	Point() {
		this(0, 0);
	}
	
	String getXY() {
		return "(" + x + "," + y + ")"; // Return x, y with string value
	}
}

class Circle extends Shape {
	Point center; // 참조변수 선언
	int r;
	
	// Basic constructor
	Circle() {
		this(new Point(0, 0), 100); // Circle(Point center, r) 호출
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	// Describe circle using overriding
	void draw() {
		System.out.printf("[center = (%d, %d), r = %d, color = %s]%n", center.x, center.y, r, color);
	}
	
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	// Constructor
	Triangle(Point[] p) {
		this.p = p; // 배열을 한 번에 저장???
	}
	
	// Describe a triangle
	void draw() {
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}