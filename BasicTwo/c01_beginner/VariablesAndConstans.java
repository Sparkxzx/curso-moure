package BasicTwo.c01_beginner;

public class VariablesAndConstans {

    public static void main(String[] args){

        //Variables
        //Declaración de una variable del tipo texto (String)
        String name = "David";
        System.out.println(name);

        /*
        * name = "Spark";
        * System.out.println(name);
        */
        // name = 37; Error (No se puede cambiar el tipo de dato)

        int age = 26;
        System.out.println(age);


        var email = "spark@gmail.com";
            System.out.println(email);
        var year = 2025;
        System.out.println(year);
        //Constantes
        final  String EMAIL = "davis44566@gmail.com";
        // email = "spark@gmail.com"; final es una constante
        System.out.println(EMAIL);
    }
}
