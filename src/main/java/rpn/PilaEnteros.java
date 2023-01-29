package rpn;

public class PilaEnteros {
    // Atributos de Pila
    private int max, tope;// Variables de control de pila
    private int datos[]; // Arreglo

    // Constructor de Pila
    public PilaEnteros(int max) {
        this.max = max;
        tope = -1;
        datos = new int[max];
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
    public void push(int ponerElemento) {
        if (estaLlena()) {
            // System.out.println("Pila Llena");
        } else {
            tope++;
            datos[tope] = ponerElemento;
        }
    }

    // Metodo desapilado
    public int pop() {
        int aux;
        if (estaVacia()) {
            // System.out.println("Pila Vacia");
            return 0;
        }
        aux = datos[tope];
        datos[tope] = 0;
        tope--;
        return aux;
    }

    // Metodo peek (MostrarTope)
    public int mostrarTope() {
        if (!estaVacia()) {
            return datos[tope];
        } else {
            // System.out.println("Pila Vacia");
            return 0;
        }
    }
}
