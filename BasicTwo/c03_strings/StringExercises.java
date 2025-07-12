package BasicTwo.c03_strings;

public class StringExercises {
    public static void main(String[] args){
    // 1. Concatena dos cadenas de texto.
        String name = "Asminda";
        String surName = "Acosta";

        System.out.println(name + " " + surName);

    // 2. Muestra la longitud de una cadena de texto.

        System.out.println(name.length());
    // 3. Muestra el primer y último carácter de un string.
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(6));
    // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toUpperCase());
    // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String a = "Minda no puede mimir";
        System.out.println(a.contains("mimir"));
    // 6. Formatea un string con un entero.
        var age =  27;
    System.out.println(String.format("%s tiene %d años", name, age));
    // 7. Elimina los espacios en blanco al principio y final de un string.
        String b =  " A Minda le gusta el morado ";
        System.out.println(b.trim());
    // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(a.replace(" ", "-"));
    // 9. Comprueba si dos strings son iguales.
        a = "Minda es chida";
        b =  "Minda es chida";

        System.out.println(a == b);
        System.out.println(a.equals(b));
    // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(a.length() == b.length());
    }
}

