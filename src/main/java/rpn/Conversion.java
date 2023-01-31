package rpn;
/**
 *
 * @author Morty
 */
public class Conversion {

    public static void main(String[] args) {
        System.out.println(toRPN("5+5-3"));
    }

    public static String toRPN(String expresion) {
        StringBuilder output = new StringBuilder();
        PilaStrings stack = new PilaStrings(10);
        Cola queue = new Cola(10);
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (Character.isDigit(c)) {
                queue.Encolar(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!stack.estaVacia() && esOperador(stack.mostrarTope())) {
                    queue.Encolar(stack.pop());
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (stack.mostrarTope() != '(') {
                    queue.Encolar(stack.pop());
                }
                stack.pop();
            }
        }

        while (!stack.estaVacia()) {
            queue.Encolar(stack.pop());
        }
        // Retornamos todo
        while (!queue.estaVacia()) {
            output.append(queue.peek());
            queue.Desencolar();
        }
        return output.toString();
    }

    // Metodo si es operador
    private static boolean esOperador(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }
}
