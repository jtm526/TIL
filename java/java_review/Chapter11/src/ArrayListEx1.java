import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {
		List list1 = new ArrayList(10); // 10개짜리 ArrayList 생성
		list1.add(4);
		list1.add(3);
		list1.add(5);
		list1.add(3);
		list1.add(6);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		System.out.println(list2);
		list2.add(3, "A");
		System.out.println(list2); // Python insert처럼 사용
		System.out.println();
		
		print(list1, list2);
		// list1, list2 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들 삭제
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i))) { // get(int index) index에 있는 요소 반환
				list2.remove(i); // 첫 자리부터 삭제하면 원소들이 이동하기에 제대로된 삭제 불가
			}
		}
	}
	
	static void print(List list1, List list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}
