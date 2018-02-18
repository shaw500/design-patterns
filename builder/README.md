# Builder

A builder abstracts away from the task of constructing a complex 
object. This means that the director of the builder (in this case
the **DesignPatternDocument**) does not need to understand the
complexity of constructing the document. By abstracting away, it 
also means that the director of the builder does not need to know
what type of document being constructed. 

The example director, **DesignPatternDocument**, takes a
**DocumentBuilder** which it uses to construct a document. By
providing either a **PlainTextDocumentBuilder** or a 
**HTMLDocumentBuilder** the document can be built in each format.  
```
String plainDocument = new DesignPatternDocument(new PlainTextDocumentBuilder()).createDocument();
String htmlDocument = new DesignPatternDocument(new HTMLDocumentBuilder()).createDocument();

System.out.println(plainDocument);
System.out.println(htmlDocument);
```