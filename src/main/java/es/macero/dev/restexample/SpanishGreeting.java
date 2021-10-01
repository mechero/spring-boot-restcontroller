package es.macero.dev.restexample;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class SpanishGreeting {
    
    @Value("${name}")	
    private String message;

    // Required for JSON deserialization
    SpanishGreeting() {
    }

    public SpanishGreeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
