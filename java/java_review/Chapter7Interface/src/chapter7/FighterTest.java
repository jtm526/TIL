//package chapter7;
//
//public class FighterTest {
//	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		
//		if (f instanceof Unit) {
//			System.out.println("f is child of Unit class");
//		}
//		
//		if (f instanceof Fightable) {
//			System.out.println("f implemented Fightable interface");
//		}
//		
//		if (f instanceof Moveable) {
//			System.out.println("f implemented Moveable interface");
//		}
//		
//		if (f instanceof Attackable) {
//			System.out.println("f implemented Attackable interface");
//		}
//		
//		if (f instanceof Object) {
//			System.out.println("f is child of Object class");
//		}
//	}
//}
//
//class Fighter extends Unit implements Fightable {
//	public void move(int x, int y) {
//		System.out.printf("Move to (%d, %d)%n", x, y);
//	}
//	
//	public void attack(Unit u) {
//		System.out.printf("Attack unit at position (%d, %d)%n", u.x, u.y);
//	}
//}
////
////class Unit {
////	int currentHP;
////	int x;
////	int y;
////}
//
//interface Fightable extends Moveable, Attackable { }
//
//interface Moveable {
//	void move(int x, int y);
//}
//
//interface Attackable {
//	void attack(Unit u);
//}