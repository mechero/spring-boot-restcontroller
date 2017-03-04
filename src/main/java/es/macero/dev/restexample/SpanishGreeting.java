package es.macero.dev.restexample;

class SpanishGreeting {

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
