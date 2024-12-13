package decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CachedDocument implements Document {
    private Document document;
    @Override
    public String parse() {
        String cashed = DBConnection.getInstance().getDocument(
            document.getGcsPath());
        if (cashed != null) {
            return cashed;
        } else {
            String parsed = document.parse();
            DBConnection.getInstance().createDocument(
                document.getGcsPath(), parsed);
            return parsed;
        }
    }
    @Override
    public String getGcsPath() {
        return "";
    }
}

