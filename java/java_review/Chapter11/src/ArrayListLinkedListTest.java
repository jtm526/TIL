//import java.awt.List;
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class ArrayListLinkedListTest {
//	public static void main(String[] args) {
//		// 충분한 공간 생성
//		List al = new ArrayList(2000000);
//		List ll = new LinkedList();
//		
//		System.out.println("===순차적으로 추가하기===");
//		System.out.println("ArrayList: " + add1(al));
//		System.out.println("LinkedList: " + add1(ll));
//	}
//	
//	public static long add1(List list) {
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//			list.add(i + "");
//		}
//		long end = System.currentTimeMillis();
//		return end - start;
//	}
//	
//	public static long add2(List list) {
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 10000; i++) {
//			list.add(500, "X");
//		}
//		long end = System.currentTimeMillis();
//		return end - start;
//	}
//	
//	public static long remove1(List list) {
//		long start = System.currentTimeMillis();
//		for (int i = (int)list.size() - 1; i >= 0; i--) {
//			list.remove(i);
//		}
//		long end = System.currentTimeMillis();
//		return end - start;
//	}
//	
//	public static long remove2(List list) {
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 10000; i++) list.remove(i);
//		long end = System.currentTimeMillis();
//		return end - start;
//	}
//}
