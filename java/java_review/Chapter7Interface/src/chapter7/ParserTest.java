package chapter7;

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document.html");
	}
}


interface Parseable {
	// 구문 분석
	void parse(String fileName); // public static void parse(String fileName);
}

class ParserManager {
	// Return type is interface
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser(); // 인터페이스 구현한 객체 반환
		} else {
			Parseable p = new HTMLParser();
			return p; // return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		// 구문 분석 수행
		System.out.println(fileName + " - XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed.");
	}
}