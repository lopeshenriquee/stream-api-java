package com.java.FunctionalInterface;

import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "olá, seja bem-vindo";

        List<String> ListaSaudacoes = Stream.generate(
                () -> "olá, seja bem-vindo")
                .limit(3)
                .collect(Collectors.toList());

        ListaSaudacoes.forEach(System.out::println);
    }
}
