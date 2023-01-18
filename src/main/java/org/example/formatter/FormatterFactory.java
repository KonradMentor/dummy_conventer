package org.example.formatter;

public class FormatterFactory {

    public Formatter createInstance(String type) {
        return switch (type.toUpperCase()) {
            case "XML" -> new XmlFormatter();
            case "JSON", default -> new JsonFormatter();
        };
    }
}
