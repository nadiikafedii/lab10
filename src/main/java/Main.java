import decorator.MockedDocument;
import decorator.TimedDocument;

public class Main {
    public static void main(String[] args) {
        
        MockedDocument mockedDocument = new MockedDocument("path");
        TimedDocument timedDocument = new TimedDocument(mockedDocument);
        System.out.println(timedDocument.parse());
    }
}
