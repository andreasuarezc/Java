
package ejercicio4_8;

import javax.swing.JOptionPane;

public class Ejercicio4_8 {

    
    public static void main(String[] args) {
        
        int count = 0;
        int suma1 = 0;
        int suma2 = 0;
        
        while (count<10){
            double num = Integer.parseInt(JOptionPane.showInputDialog
        ("Ingresar la nota del alumno"));
            if (num>=7){
                suma1 = suma1+1;
            }else{
                suma2 = suma2+1;
            }
            count ++;
        }
        System.out.println("La cantidad de notas superiores o iguales a 7 es:");
        System.out.println(suma1);
        System.out.println("La cantidad de notas inferiores a 7 es:");
        System.out.println(suma2);
    }
    
}
