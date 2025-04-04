/**
 * La clase OperacionesAvanzadas proporciona métodos para realizar
 * operaciones matemáticas como potencias, raíces, módulo y valor absoluto.
 * 
 * @author Sara Hervás
 * @version 1.0
 */
public class OperacionesAvanzadas {

    /**
     * Calcula la potencia de una base elevada a un exponente.
     * 
     * @param base La base de la potencia.
     * @param exponente El exponente al que se eleva la base.
     * @return El resultado de base elevado a exponente.
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * 
     * @param numero Número del que se desea obtener la raíz cuadrada.
     * @return La raíz cuadrada del número.
     * @throws IllegalArgumentException Si el número es negativo.
     */
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No existe raíz real de números negativos");
        }
        return Math.sqrt(numero);
    }

    /**
     * Calcula el módulo (resto) de una división entre dos números.
     * 
     * @param dividendo Número que se va a dividir.
     * @param divisor Número por el cual se divide.
     * @return El módulo del dividendo entre el divisor.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public double modulo(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo % divisor;
    }

    /**
     * Devuelve el valor absoluto de un número.
     * 
     * @param numero Número del que se desea obtener el valor absoluto.
     * @return El valor absoluto del número.
     */
    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }
}
