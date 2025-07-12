package BasicTwo.c05_structures;

public class Arrays {

    public static void main(String[] args) {

        // Arreglos (array)

        // Declaracion y creación
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] name =  {"David", "Gómez", "Calzada"};
        System.out.println(name);

        // Acceso
        System.out.println(numbers[0]);
        System.out.println(name[0]);

        System.out.println((new String[3])[0]);

        // Modificación

        numbers[0] = 1;
        numbers[1] = 10;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

       // numbers[3] = 2; Error
        System.out.println(name[2]);
        name[2] = "davis44566@gmail.com";
        System.out.println(name[2]);

        System.out.println(name.length);
        name[2] = null;
        System.out.println(name[2]);

        System.out.println(name.length);

       // numbers[2] = null; Error

        boolean[] booleans =  new boolean[5];
        System.out.println(booleans[2]);
    }
}
