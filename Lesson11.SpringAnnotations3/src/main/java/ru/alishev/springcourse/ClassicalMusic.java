package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @autho
 */
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
