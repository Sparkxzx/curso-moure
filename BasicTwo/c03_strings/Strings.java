package BasicTwo.c03_strings;

public class Strings {
    public static void main(String[] args){

        // Cadenas de texto
        //Declaración de texto
        String name = "David";
        var surname = new String("Gomez");
        // var name = "David";

        // Operaciones básicas

        //Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        //Obtener caracter
        System.out.println(name.charAt(2));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3)); // Excluye el inidce final

        // Mayúsculas y Minusculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        //Comparación equals
        System.out.println(name .equals("David"));
        System.out.println(name .equals("david"));
        System.out.println(name .equalsIgnoreCase("david"));

        // == vs. equals

        var a = "Davis";
        var b = "Davis";
        var c = new String("Davis");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // == es comparación del propio objeto
        // equals comparación de contenido

        // Trim
        // Limpia los datos en una cadena de texto
        System.out.println(" Hola, me llamo David ".trim());

        // Replace

        System.out.println(" Hola, me llamo David ".replace("David", "Spark"));

        // format
        var age =  26;
        System.out.println(String.format("Hola, %s. Tengo %d años.", name, age)); // %s para string %d para entero


     }
}
