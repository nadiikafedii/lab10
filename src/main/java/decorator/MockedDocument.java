package decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class MockedDocument implements Document{
    public String gcdPath;
    @Override
    public String parse() {
        return "Mocked Document Parse";
    }

    @Override
    public String getGcsPath() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGcsPath'");
    }
}
