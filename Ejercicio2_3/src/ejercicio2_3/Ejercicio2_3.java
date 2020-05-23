
package ejercicio2_3;

import javax.swing.JOptionPane;

public class Ejercicio2_3 {
    
    public static void main(String[] args) {
        
        float num = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar un número positivo de uno o dos dígitos"));
        float prueba = num/10;
        if(num<0){
            System.out.println("El número ingresado no es un numero positivo");
        }else if (prueba>=1){
            System.out.println("El número ingresado tiene dos dígitos");                      
        }else{
            System.out.println("El número ingresado tiene un dígito");
        }
    }
    
}
