package builder;

public interface DocumentBuilder {
    void createHeader(String text);
    void createSubHeader(String text);
    void createParagraph(String text);
    void createList(String[] list);
    String getDocument();
}
