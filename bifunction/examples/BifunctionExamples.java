package bifunction.examples;

import java.util.List;
import java.util.function.BiFunction;

public class BifunctionExamples {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> addQuotes = (s, i) -> "\"" + s + "\"";
        BiFunction<String, Integer, String> leftPad = (s, i) -> String.format("%" + i + "s", s);
        List<BiFunction> allFunctions = List.of(addQuotes, leftPad);

        formatTextAndPrintResult(allFunctions, "Hello", 10);
    }

    static void formatTextAndPrintResult(List<BiFunction> padFunctions, String s, Integer i) {
       // Apply all functions to the input and then print the result
        String result = s;
         for (BiFunction<String, Integer, String> function : padFunctions) {
            result = function.apply(result, i);
         }
        System.out.println(result);
    }


}
