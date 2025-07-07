package BasicTwo.c01_beginner;

public class BeginnerExercises {

    public static void main(String[] args){
        // 1. Declara una variable de tipo String y asígnale tu nombre.
           String myName = "David";
            System.out.println(myName);
        // 2. Crea una variable de tipo int y asígnale tu edad.
            int age = 26;
            System.out.println(age);
        // 3. Crea una variable double con tu altura en metros.
            double height = 1.68;
            System.out.println(height);
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
            boolean isProgramer =  true;
            System.out.println(isProgramer);
        // 5. Declara una constante con tu email.
            final String EMAIL = "davis44566@gmail.com";
            System.out.println(EMAIL);
        // 6. Crea una variable de tipo char y guárdale tu inicial.
            char initial = 'D';
            System.out.println(initial);
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String local = "Acámbaro";
        System.out.println(local);

        local = "Londres";
        System.out.println(local);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 9;
        int b = 13;
        System.out.print(a + b);
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(EMAIL.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
    }
}
