
package ejercicio5_2;

import javax.swing.JOptionPane;


public class Ejercicio5_2 {

    
    public static void main(String[] args) {
        int suma = 0;
        for (int i=0; i<10; i++ ){
            int num = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar un número entero"));
            if (i>=5){
                suma = suma +num;
            }
        }System.out.println
        ("La suma de los últimos cinco valores ingresados es:");
        System.out.println(suma);
    }
    
}
