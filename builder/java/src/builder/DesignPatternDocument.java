package builder;

public class DesignPatternDocument {

    private DocumentBuilder builder;

    public DesignPatternDocument(DocumentBuilder builder) {
        this.builder = builder;
    }

    String createDocument() {
        builder.createHeader("design Patterns");

        builder.createSubHeader("Introduction");
        builder.createParagraph("Here is a basic introduction to design patterns");
        builder.createParagraph("And then there is a bit more info");

        builder.createSubHeader("Examples");
        builder.createList(new String[]{
                "Abstract Factory",
                "Builder",
                "Prototype"
        });
        return builder.getDocument();
    }
}
