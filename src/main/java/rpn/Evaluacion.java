package rpn;
/**
 *
 * @author Morty
 */
public class Evaluacion {
    public static int Evaluara(String rpn) {
        PilaEnteros pilaEnt = new PilaEnteros(10);

        for (int i = 0; i < rpn.length(); i++) {
            char c = rpn.charAt(i);

            if (Character.isDigit(c)) {
                pilaEnt.push(c - '0');
            } else {
                int a = pilaEnt.pop();
                int b = pilaEnt.pop();

                switch (c) {
                    case '+':
                        pilaEnt.push(b + a);
                        break;
                    case '-':
                        pilaEnt.push(b - a);
                        break;
                    case '*':
                        pilaEnt.push(b * a);
                        break;
                    case '/':
                        pilaEnt.push(b / a);
                        break;
                }
            }
        }
        return pilaEnt.mostrarTope();
    }
}
