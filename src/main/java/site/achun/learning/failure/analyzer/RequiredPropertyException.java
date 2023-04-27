package site.achun.learning.failure.analyzer;

public class RequiredPropertyException extends RuntimeException{
    private final String propertyName;

    public RequiredPropertyException(String propertyName) {
        super(String.format("Required property '%s' not found", propertyName));
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
