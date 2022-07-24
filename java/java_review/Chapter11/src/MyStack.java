// 스택 구현해보기
import java.util.EmptyStackException;
import java.util.Vector;

class MyStack extends Vector {
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek(); // If stack is empty, peek() methods occurs EmptyStackException(Runtime)
		removeElementAt(size() - 1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if (len == 0) {
			throw new EmptyStackException();
		}
		return elementAt(len - 1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object obj) {
		int i = lastIndexOf(obj);
		
		if (i >= 0) {
			return size() - i; // Stack은 맨위에 저장된 객체의 인덱스가 1
		}
		return -1;
	}
}
