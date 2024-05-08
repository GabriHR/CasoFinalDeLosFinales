
//Ejercicio 4

package Ejercicio4_CalculoNumeroRecursividad;

public class CalculoNumeroRecursividad {
    public static void main(String[] args) {
        int number = 102;
        int sum = sumOfDigits(number);
        System.out.println("Número: " + number);
        System.out.println("Operación: Suma de sus dígitos");
        System.out.println("Resultado: " + sum);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}