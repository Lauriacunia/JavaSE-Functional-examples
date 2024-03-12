package supplier.examples;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExamples {
    public static void main(String[] args) {
        Supplier<String> obtenerFechaActual = () -> {
            //Donde T es el tipo de dato que se va a retornar.
            // en este caso String
            return LocalDate.now().toString();
        };

        String fechaActual = obtenerFechaActual.get();

        System.out.println(fechaActual); // Imprime la fecha actual
    }
}
