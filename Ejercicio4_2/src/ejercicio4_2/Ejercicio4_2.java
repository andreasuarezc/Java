
package ejercicio4_2;

import javax.swing.JOptionPane;

public class Ejercicio4_2 {

    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingresar el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingresar el segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Ingresar el tercer número"));
        
        if (num1==num2 && num1==num3){
            int suma =  num1+num2;
            int producto = suma*num3;
            
            System.out.println("La suma del primer número con el segundo es:");
            System.out.println(suma);
            System.out.println
        ("La multiplicación de la suma con el tercer número es:");
            System.out.println(producto);
        }
    }
    
}
