package decorator;

import java.time.LocalTime;

import java.time.Duration;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TimedDocument implements Document{
    private Document document;

    @Override
    public String parse() {
        LocalTime startTime = LocalTime.now();
        String parsed = document.parse();
        LocalTime endTime = LocalTime.now();
        System.out.println("Time: " + Duration.between(startTime, endTime).getSeconds());
        return parsed;
    }

    @Override
    public String getGcsPath() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGcsPath'");
    }
}
