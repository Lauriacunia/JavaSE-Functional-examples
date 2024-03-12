package function.examples;

import java.util.function.Function;

public class FunctionExamples {
    public static void main(String[] args) {
        /* version 1 sobrescribiendo el metodo apply
         Function es una interfaz funcional que define un método abstracto apply(T)
         que toma un valor de tipo T como entrada y
        devuelve un valor de tipo R como salida */

        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5)); // 25

        /* version 2 usando lambda */
        Function<Integer, Integer> square2 = x -> x * x;
        System.out.println(square2.apply(6)); // 25


        // Función que convierte una cadena a mayúsculas
        Function<String, String> aMayusculas = (s) -> s.toUpperCase();

        // Aplicando la función a una cadena
        String nombre = "juan";
        String nombreEnMayusculas = aMayusculas.apply(nombre);

        System.out.println(nombreEnMayusculas); // Imprime "JUAN"

    }
}
