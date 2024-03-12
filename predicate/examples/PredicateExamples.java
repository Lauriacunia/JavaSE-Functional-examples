package predicate.examples;
import java.util.Arrays;
import java.util.function.Function;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExamples {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        //Filtrar los números pares usando la función
        List<Integer> numerosPares = numeros.stream().filter(esPar).toList();

        System.out.println("Números pares");
        for (Integer numeroPar : numerosPares) {
          System.out.println(numeroPar);
        }

        // Los predicados también pueden ser compuestos (combinarse)
        Predicate<Integer> esMenorQueCinco = numero -> numero < 5;
        Predicate<Integer> esParYMenorQueCinco = esPar.and(esMenorQueCinco);
        List<Integer> numerosParesYMenoresQueCinco = numeros.stream().filter(esParYMenorQueCinco).toList();
        System.out.println("Números pares y menores que cinco");
        for (Integer numeroParYMenorQueCinco : numerosParesYMenoresQueCinco) {
          System.out.println(numeroParYMenorQueCinco);
        }

    }
}
