
package ejercicio5_1;

import javax.swing.JOptionPane;


public class Ejercicio5_1 {

   
    public static void main(String[] args) {
        
        int count = 0;
        int suma = 0;
        
        while (count<5){
            
            int base = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar la medida de la base del triángulo"));
            int altura = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar la medida de la altura del triángulo"));
            int superficie = (base*altura)/2;
            
            System.out.println("La base del tiangulo es:");
            System.out.println(base);
            System.out.println("La altura del tiangulo es:");
            System.out.println(altura);
            System.out.println("La superficie del tiangulo es:");
            System.out.println(superficie);
            
            if (superficie>12){
                suma = suma+1;
            }
            System.out.println
        ("La cantidad de triángulos cuya superficie es mayor a 12, es:");
            System.out.println(suma);
            count ++;
        }
    }
    
}
