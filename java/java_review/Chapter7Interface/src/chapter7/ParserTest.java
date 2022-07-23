

public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document.html");
	}
}


interface Parseable {
	// êµ¬ë¬¸ ë¶„ì„�
	void parse(String fileName); // public static void parse(String fileName);
}

class ParserManager {
	// Return type is interface
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser(); // ì�¸í„°íŽ˜ì�´ìŠ¤ êµ¬í˜„í•œ ê°�ì²´ ë°˜í™˜
		} else {
			Parseable p = new HTMLParser();
			return p; // return new HTMLParser();
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		// êµ¬ë¬¸ ë¶„ì„� ìˆ˜í–‰
		System.out.println(fileName + " - XML parsing completed.");
	}
}

class HTMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed.");
	}
}