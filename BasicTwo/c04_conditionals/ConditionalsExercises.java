package BasicTwo.c04_conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 26;

        if (age > 18){
            System.out.println("El usuario puede votar");
        }else if (age == 18){
            System.out.println("El usuario cumplio 18 años");
        }else{
            System.out.println("El usuario no puede votar");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var num = 15;
        var num2 =  18;
        if (num > num2){
            System.out.println("El número 1 es mayor");
        }else{
            System.out.println("El número 2 es mayor");
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        num = 10;

        if(num > 0){
            System.out.println("Es un número positivo");
        }else if (num < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es 0");
        }
        // 4. Crea un programa que diga si un número es par o impar.
        num = 5;
        if ( num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        num = 35;
        if (num >= 1 && num <= 100) {
            System.out.println("El número esta en el rango de 1 a 100");
        } else {
            System.out.println("El número no esta en el rango");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var day = 5;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No es un día de la semana");
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        var nota = 60;

        if (nota >= 0 && nota <= 59) {
            System.out.println("Suspenso");
        }else if (nota >= 60 && nota <= 79){
            System.out.println("Aprobado");
        }else if (nota >= 80 && nota <= 100){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("No es un rango valido");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        age = 15;
        boolean isCompany = false;

        if (age >= 15) {
            System.out.println("Puedes entrar al cine");
        }else if (age < 15 && isCompany == true ) {
            System.out.println("Puedes entrar al cine");
        }else{
            System.out.println("No puedes entrar al cine");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String vocal = "aeiouAEIOU";
        String consonant = "bcdfghjklmnñpqrstvwyzBCDFGHJKLMNÑPQRSTVWYZ";
        String letter = "A";

        if (vocal.indexOf(letter) != -1){
            System.out.println("Es una vocal");
        }else if(vocal.indexOf(letter) != +1){
            System.out.println("Es una consonante");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var a = 25;
        var b = 5;
        var c = 15;

        if (a >  b && a > c){
            System.out.println("el número " + a + " es el mayor");
        } else if (b > a && b > c) {
            System.out.println("el número " + b + " es el mayor");
        } else {
            System.out.println("el número " + c + " es el mayor");
        }

    }
}
