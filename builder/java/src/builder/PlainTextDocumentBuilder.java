package builder;

import java.util.Collections;

public class PlainTextDocumentBuilder implements DocumentBuilder {

    private static final String NEW_LINE = "\n";

    private StringBuilder document = new StringBuilder();

    @Override
    public void createHeader(String text) {
        String border = String.join("", Collections.nCopies(text.length(), "="));
        document.append(border);
        document.append(NEW_LINE);
        document.append(text);
        document.append(NEW_LINE);
        document.append(border);
        document.append(NEW_LINE);
    }

    @Override
    public void createSubHeader(String text) {
        String border = String.join("", Collections.nCopies(text.length(), "-"));
        document.append(NEW_LINE);
        document.append(text);
        document.append(NEW_LINE);
        document.append(border);
        document.append(NEW_LINE);
        document.append(NEW_LINE);
    }

    @Override
    public void createParagraph(String text) {
        document.append(text);
        document.append(NEW_LINE);
    }

    @Override
    public void createList(String[] list) {
        for (String item : list) {
            document.append(" - ");
            document.append(item);
            document.append(NEW_LINE);
        }
    }

    @Override
    public String getDocument() {
        return document.toString();
    }
}
