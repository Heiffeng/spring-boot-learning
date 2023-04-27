package site.achun.learning.failure.analyzer;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RequiredPropertyChecker {

    @Value("${required.property:null}")
    private String requiredProperty;

    @PostConstruct
    public void checkRequiredProperty() {
        if (requiredProperty == null || requiredProperty.equals("null")) {
            throw new RequiredPropertyException("required.property");
        }
    }
}
