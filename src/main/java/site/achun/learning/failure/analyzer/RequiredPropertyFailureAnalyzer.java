package site.achun.learning.failure.analyzer;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class RequiredPropertyFailureAnalyzer extends AbstractFailureAnalyzer<RequiredPropertyException> {

    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, RequiredPropertyException cause) {
        return new FailureAnalysis(getDescription(cause), getAction(cause), cause);
    }

    private String getDescription(RequiredPropertyException ex) {
        return String.format("The required property '%s' is missing.", ex.getPropertyName());
    }

    private String getAction(RequiredPropertyException ex) {
        return String.format("Please provide the property '%s' in your application configuration.", ex.getPropertyName());
    }
}
