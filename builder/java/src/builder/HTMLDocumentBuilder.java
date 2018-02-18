package builder;

public class HTMLDocumentBuilder implements DocumentBuilder {

    private StringBuilder document = new StringBuilder("<html><body>");

    @Override
    public void createHeader(String text) {
        document.append("<h1>");
        document.append(text);
        document.append("</h1>");
    }

    @Override
    public void createSubHeader(String text) {
        document.append("<h2>");
        document.append(text);
        document.append("</h2>");
    }

    @Override
    public void createParagraph(String text) {
        document.append("<p>");
        document.append(text);
        document.append("</p>");
    }

    @Override
    public void createList(String[] list) {
        document.append("<ul>");
        for (String item : list) {
            document.append("<li>");
            document.append(item);
            document.append("</li>");
        }
        document.append("</ul>");
    }

    @Override
    public String getDocument() {
        document.append("</body></html>");
        return document.toString();
    }
}
