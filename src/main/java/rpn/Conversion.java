package rpn;

/**
 *
 * @author Morty
 */
public class Conversion {

    public static String toRPN(String expresion) {
        StringBuilder output = new StringBuilder();
        Pila stack = new Pila(10);

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (Character.isDigit(c)) {
                output.append(c);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!stack.estaVacia() && esOperador(stack.mostrarTope())) {
                    output.append(stack.pop());
                }
                stack.push(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (stack.mostrarTope() != '(') {
                    output.append(stack.pop());
                }
                stack.pop();
            }
        }

        while (!stack.estaVacia()) {
            output.append(stack.pop());
        }

        return output.toString();
    }

    // Metodo si es operador
    private static boolean esOperador(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }
}
