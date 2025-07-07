package BasicTwo.c02_operators;

public class Operators {
    public static void main(String[] args){

        // Operadores

        //  Aritmeticos
        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);// Double para divisiones
        System.out.println(a % b);

        // Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a =  a + 1
        System.out.println(a);

        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Comparación (Relacionales)
        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Operadores Lógicos

        // Y (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 >2 && 5 == 2);

        // Solo se es verdadero si todas las expreciones son verdaderas
        // Y se cumplen dentro de la condición

        // O (OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2 );

        // Solo se es verdadero si una o dos de las expresiones se cumplen
        // Si ninguna de las dos es verdadera la condición es falsa

        // No (NOT)

       System.out.println(!true);
       System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2 );

       // La negación sirve para cambiar la condición y contradecir el resultado

        // Unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
