
//Clase Ejercicio3_ErrorRecursividad.Main corregida

package Ejercicio3_ErrorRecursividad;

public class MainCorregido {
    public static void main(String[] args) {
        double result = recursive(1, -2);
        System.out.println(result);
    }

    public static double recursive(double a, int b) {
        if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else if (b < 0) {
            return 1 / (a * recursive(a, -b - 1));
        } else {
            return a * recursive(a, b - 1);
        }
    }
}