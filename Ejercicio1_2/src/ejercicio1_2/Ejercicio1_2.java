
package ejercicio1_2;

import javax.swing.JOptionPane;

public class Ejercicio1_2 {
    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Imgresar el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Imgresar el segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Imgresar el tercer número"));
        int num4 = Integer.parseInt(JOptionPane.showInputDialog("Imgresar el cuarto número"));
        
        int suma = num1+num2;
        int producto = num3*num4;
        
        System.out.println("La suma de los dos primeros números es:");
        System.out.println(suma);
        System.out.println("El producto del tercer y el cuarto número es:");
        System.out.println(producto);
    }
    
}
