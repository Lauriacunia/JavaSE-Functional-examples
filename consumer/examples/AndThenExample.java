package consumer.examples;

import java.util.function.Consumer;

public class AndThenExample {
    public static void main(String[] args) {
        // Consumidor para imprimir una cadena en mayúsculas
        Consumer<String> imprimirMayusculas = str -> System.out.println(str.toUpperCase());

        // Consumidor para agregar un prefijo a una cadena
        Consumer<String> agregarPrefijo = str -> System.out.println("¡" + str + "!");

        // Combinar las funciones usando andThen
        Consumer<String> imprimirConPrefijoMayusculas = imprimirMayusculas.andThen(agregarPrefijo);

        // Aplicar la función combinada
        imprimirConPrefijoMayusculas.accept("Hola Laurita");
        /* Imprime:
        HOLA LAURITA
        ¡Hola Laurita!

        Esto se debe a que el método andThen ejecuta el primer consumidor y luego el segundo.
        En Java, las variables no se pasan por referencia por defecto, sino por valor.
        Esto significa que cuando se pasa una variable como argumento a una función,
        se crea una copia independiente de la variable original.
        En este caso, la variable str dentro de la función imprimirMayusculas
        es una copia de la variable str que se pasa como argumento a la función imprimirConPrefijoMayusculas.
         */

    }
}
