/**
 * Clase principal que prueba el funcionamiento de la clase Calculadora
 * y muestra los resultados de operaciones básicas y avanzadas por consola.
 * 
 * @author Sara Hervás
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que ejecuta la aplicación.
     * Crea una calculadora y realiza varias operaciones para mostrar los resultados.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Operaciones básicas
        System.out.println("Suma: " + calculadora.getBasicas().sumar(5, 3));
        System.out.println("Resta: " + calculadora.getBasicas().restar(10, 4));
        System.out.println("Multiplicación: " + calculadora.getBasicas().multiplicar(6, 7));
        System.out.println("División: " + calculadora.getBasicas().dividir(20, 5));

        // Operaciones avanzadas
        System.out.println("Potencia: " + calculadora.getAvanzadas().potencia(2, 3));
        System.out.println("Raíz cuadrada: " + calculadora.getAvanzadas().raizCuadrada(25));
        System.out.println("Módulo: " + calculadora.getAvanzadas().modulo(10, 3));
        System.out.println("Valor absoluto: " + calculadora.getAvanzadas().valorAbsoluto(-7.5));
    }
}

