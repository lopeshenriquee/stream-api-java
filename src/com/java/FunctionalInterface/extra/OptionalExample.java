package com.java.FunctionalInterface.extra;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");
        System.out.println(result);

        Optional<String> optionalValue2 = Optional.ofNullable("2");
        String result2 = optionalValue2.orElseThrow(() -> new RuntimeException("Value not present"));

        Optional<String> optionalValue3 = Optional.of("Hello");
        optionalValue3.ifPresent(value -> System.out.println("Valor presente: " + value));
    }
}
