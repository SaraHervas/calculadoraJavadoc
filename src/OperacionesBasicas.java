/**
 * La clase OperacionesBasicas proporciona métodos para realizar
 * operaciones matemáticas sencillas como suma, resta, multiplicación y división.
 * 
 * @author Sara Hervás
 * @version 1.0
 */
public class OperacionesBasicas {

    /**
     * Suma dos números reales.
     * 
     * @param a Primer número.
     * @param b Segundo número.
     * @return La suma de a y b.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta el segundo número al primero.
     * 
     * @param a Minuendo.
     * @param b Sustraendo.
     * @return La diferencia entre a y b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números reales.
     * 
     * @param a Primer factor.
     * @param b Segundo factor.
     * @return El producto de a y b.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide el primer número entre el segundo.
     * 
     * @param a Dividendo.
     * @param b Divisor.
     * @return El cociente entre a y b.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
