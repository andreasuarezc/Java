
package ejercicio4_4;

import javax.swing.JOptionPane;

public class Ejercicio4_4 {

    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el tercer número"));
        
        if (num1<10 || num2<10 || num3<10){
            System.out.println("Al menos uno de los números es nemor a 10");
        }
    }
    
}
