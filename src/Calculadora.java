/**
 * La clase Calculadora actúa como contenedor de operaciones básicas y avanzadas.
 * Permite acceder a ambas mediante sus respectivos getters.
 * 
 * @author Sara Hervás
 * @version 1.0
 */
public class Calculadora {

    private OperacionesBasicas basicas;
    private OperacionesAvanzadas avanzadas;

    /**
     * Constructor que inicializa las operaciones básicas y avanzadas.
     */
    public Calculadora() {
        this.basicas = new OperacionesBasicas();
        this.avanzadas = new OperacionesAvanzadas();
    }

    /**
     * Devuelve el objeto de operaciones básicas.
     * 
     * @return OperacionesBasicas objeto con las funciones básicas.
     */
    public OperacionesBasicas getBasicas() {
        return basicas;
    }

    /**
     * Devuelve el objeto de operaciones avanzadas.
     * 
     * @return OperacionesAvanzadas objeto con las funciones avanzadas.
     */
    public OperacionesAvanzadas getAvanzadas() {
        return avanzadas;
    }
}
