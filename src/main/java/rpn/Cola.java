package rpn;
/**
 *
 * @author Morty
 */
public class Cola {

    private Character[] queue;// Arreglo para almacenar
    private int frente, fondo;
    private int tamaño; // Tamaño queue
    private int max;// Tamaño del arreglo

    public Cola(int max) {
        this.max = max;
        queue = new Character[max];
        frente = 0;
        fondo = -1;
        tamaño = 0;
    }

    // Metodo para Encolar un dato entero
    public void Encolar(Character datoEncolado) {
        if (estaLlena()) {
            // throw new Exception("Cola Llena");
            return;
        }
        fondo = (fondo + 1) % max;
        queue[fondo] = datoEncolado;
        tamaño++;
    }

    // Metodo para Desencolar un dato
    public Character Desencolar() {
        Character aux = 0;
        if (estaVacia()) {
            // throw new Exception("Cola Vacia");
            return aux;
        }
        frente = (frente + 1) % max;
        Character data = queue[frente];
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
    public Character peek() {
        Character auxpeek = 0;
        if (estaVacia()) {
            // throw new Exception("Cola Vacia");
            return auxpeek;
        }
        return queue[frente];
    }

    // Metodo de conteo para conocer el tamaño de la queue
    public int size() {
        return tamaño;
    }

}