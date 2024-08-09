package com.java.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {
        //Lista de inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Criando consumer
//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0){
//                System.out.println(numero);
//            }
//        };

        //Criando o consumer dentro do stream e usando para imprimir com lambda
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}


