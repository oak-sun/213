package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public String toString() {
        return "Я муррр-ЧАЛО!";
    }
}