package consumer.examples;

import java.util.function.Consumer;

public class ConsumerExamples {
    public static void main(String[] args) {
        Consumer<String> imprimirLongitud = s -> System.out.println(s.length());

        imprimirLongitud.accept("Hola!"); // Imprime 5
    }
}
