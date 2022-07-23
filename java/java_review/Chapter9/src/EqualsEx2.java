
public class EqualsEx2 {

	public static void main(String[] args) {
		Person p1 = new Person(950526L);
		Person p2 = new Person(950526L);

		if (p1 == p2) {
			System.out.println("p1 and p2 are same person.");
		} else {
			System.out.println("p1 and p2 are different person.");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1 and p2 are same person.");
		} else {
			System.out.println("p1 and p2 are different person.");
		}
	}

}

class Person { // class Person extends Object
	long id;
	
	// Constructor
	Person(long id) {
		this.id = id;
	}
	
	// Overriding
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return this.id == ((Person)obj).id;
		} else {
			return false;
		}
	}
}
