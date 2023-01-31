package rpn;
/**
 *
 * @author Morty
 */
public class PilaStrings {
    // Atributos de PilaStrings
    private int max, tope;// Variables de control de pila
    private Character datos[]; // Arreglo

    // Constructor de PilaStrings
    public PilaStrings(int max) {
        this.max = max;
        tope = -1;
        datos = new Character[max];
    }

    // Metodo para comprobar si la pila esta vacia
    public boolean estaVacia() {
        return (tope == -1);
    }

    // Metodo para comprobar si la pila esta llena
    public boolean estaLlena() {
        return (tope == max - 1);
    }

    // Metodo apilado
    public void push(Character ponerElemento) {
        if (estaLlena()) {
            // System.out.println("PilaStrings Llena");
        } else {
            tope++;
            datos[tope] = ponerElemento;
        }
    }

    // Metodo desapilado
    public Character pop() {
        Character aux;
        if (estaVacia()) {
            // System.out.println("PilaStrings Vacia");
        }
        aux = datos[tope];
        datos[tope] = null;
        tope--;
        return aux;
    }

    // Metodo peek (MostrarTope)
    public Character mostrarTope() {
        if (!estaVacia()) {
            return datos[tope];
        } else {
            // System.out.println("PilaStrings Vacia");
            return null;
        }
    }

    // Mostramos el contenido de la pila
    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("Pila Vacia");
        } else {
            for (int i = tope; i >= 0; i--) {
                System.out.println("Dato en posicion " + i + " de la pila: " + datos[i]);
            }
        }
    }
}
