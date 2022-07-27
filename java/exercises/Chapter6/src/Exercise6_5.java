
public class Exercise6_5 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	public float getAverage() {
		return (int)((this.getTotal() / 3.0f) * 10 + 0.5) / 10.0f;
	}
	
	public String info() {
		return this.name + "," + this.ban + "," + this.no + "," 
				+ this.kor + "," + this.eng + "," +this.math + "," 
				+ this.getTotal() + "," + this.getAverage();
	}
}