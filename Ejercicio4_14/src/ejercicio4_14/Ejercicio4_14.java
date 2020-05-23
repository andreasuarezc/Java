
package ejercicio4_14;

import javax.swing.JOptionPane;


public class Ejercicio4_14 {

    
    public static void main(String[] args) {
        
        int count = 0;
        int suma1 = 0;
        int suma2 = 0;
        
        while (count<=0){
            int num = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar un número entero"));
            if (num%2==0){
                suma1=suma1+1;
            }else{
                suma2=suma2+1;
            }
            System.out.println("La cantidad de números pares ingresados es:");
            System.out.println(suma1);
            System.out.println("La cantidad de números impares ingresados es:");
            System.out.println(suma2);
        }
    }
    
}
