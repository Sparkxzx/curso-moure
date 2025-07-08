package BasicTwo.c02_operators;

public class OperatorsExcercises {

    public static void main(String[] args){
        // 1. Crea una variable con el resultado de cada operación aritmética.
            int a = 20;

            System.out.println(a + 15);
            System.out.println(a - 13);
            System.out.println(a * 10);
            System.out.println(a / 12);
            System.out.println(a * 4);
        // 2. Crea una variable para cada tipo de operación de asignación.
            int b = 5;

            b = 6;

            b += 6;
            System.out.println(b);
            b -= 6;
            System.out.println(b);
            b *= 6;
            System.out.println(b);
            b /= 6;
            System.out.println(b);
            b %= 6;
            System.out.println(b);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
            System.out.println(a > b);
            System.out.println(b == 0);
            System.out.println(b < a);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
            System.out.println(a == b);
            System.out.println(b > a);
            System.out.println(a < b);
        // 5. Utiliza el operador lógico and.
            System.out.println(a < b && a > b);
            System.out.println(a == b && b == a);
            // 6. Utiliza el operador lógico or.
            System.out.println(a > b  || b == a);
        // 7. Combina ambos operadores lógicos.
            System.out.println(b == a && a < b || b > a);
        // 8. Añade alguna negación.
            System.out.println(b != a);
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
            b  =  8;
            System.out.println(++b);
            System.out.println(--b);
            System.out.println(+b);
            System.out.println(-b);
        // 10. Combina operadores aritméticos, de comparación y lógicos.Sy
           System.out.println(a == b + 8 && b < a * 4 || a > b);
    }
}
