package builder;

public class Main {
    public static void main(String[] args) {
        String plainDocument = new DesignPatternDocument(new PlainTextDocumentBuilder()).createDocument();
        String htmlDocument = new DesignPatternDocument(new HTMLDocumentBuilder()).createDocument();

        System.out.println(plainDocument);
        System.out.println(htmlDocument);
    }
}
