package sesion34delrealed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Sesion34DelRealED_Pilas {

    public static void main(String[] args) {
        //Declaracion de pila
        Stack<Integer> pilaDelReal = new Stack<>();
        pilaDelReal.push(1);
        pilaDelReal.push(2);
        pilaDelReal.push(3);
        pilaDelReal.push(4);
        
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es: \n" +pilaDelReal);
        
        JOptionPane.showMessageDialog(null, "Autor: Del Real");
    }
    
}
