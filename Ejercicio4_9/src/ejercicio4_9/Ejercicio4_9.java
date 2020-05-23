
package ejercicio4_9;

import javax.swing.JOptionPane;

public class Ejercicio4_9 {

    
    public static void main(String[] args) {
        
        int count=0;
        int divisor=1;
        double suma = 0;
        while (count>=0){
            double altura = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Ingresar la altura de la persona"));
            suma = suma+altura;
            double promedio = suma/divisor;
            System.out.println("El promedio de alturas ingresadas es:");
            System.out.println(promedio);
            divisor ++;
            count ++;
        }
    }
    
}
