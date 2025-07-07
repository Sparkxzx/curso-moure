package BasicTwo.c01_beginner;

public class DataTypes {

    public static void main(String[] args){
        // Tipos de datos primitivos

        int myInt = 26;//Dato entero
        System.out.println(myInt);

        int myInt2;

        double myDouble = 1.77;
        System.out.println(myDouble);// Dato con decimales

        char myChar = 'a';//Character dato de un solo caracter
        System.out.println(myChar);
        //float
        //Byte
        //long

        boolean myBoolean = true; // tipo de dato verdadero o falso
        System.out.println(myBoolean);
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println((myString));

        // Tipo de dato en tiempo de compilación
        System.out.println(myString.getClass().getSimpleName());
    }
}
