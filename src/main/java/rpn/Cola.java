package rpn;
/**
 *
 * @author Morty
 */
public class Cola {

    private int[] queue;// Arreglo para almacenar
    private int frente, fondo;
    private int tamaño; // Tamaño queue
    private int max;// Tamaño del arreglo

    public Cola(int max) {
        this.max = max;
        queue = new int[max];
        frente = 0;
        fondo = -1;
        tamaño = 0;
    }

    // Metodo para Encolar un dato entero
    public void Encolar(int datoEncolado){
        if (estaLlena()) {
            //throw new Exception("Cola Llena");
            return;
        }
        fondo = (fondo + 1) % max;
        queue[fondo] = datoEncolado;
        tamaño++;
    }

    // Metodo para Desencolar un dato
    public int Desencolar() throws Exception {
        if (estaVacia()) {
            //throw new Exception("Cola Vacia");
            return Integer.MIN_VALUE;
        }

        frente = (frente + 1) % max;
        int data = queue[frente];
        tamaño--;
        return data;

    }

    // Metodo para ver si la cola esta vacia
    public boolean estaVacia() {
        return (size() == 0);
    }

    // Metodo para ver si la cola esta llena
    public boolean estaLlena() {
        return (size() == max);
    }

    // Metodo para visualizar el frente (1er elemento agregado)
    public int peek(){
        if (estaVacia()) {
            //throw new Exception("Cola Vacia");
            return Integer.MIN_VALUE;
        }
        return queue[frente];
    }

    // Metodo de conteo para conocer el tamaño de la queue
    public int size() {
        return tamaño;
    }

}