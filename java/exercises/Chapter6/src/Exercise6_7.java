
public class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2, 2));
	}
	
}

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int a, int b) {
		double d = (a - this.x) * (a - this.x) + (b - this.y) * (b - this.y);
		return Math.sqrt(d);
	}
}
