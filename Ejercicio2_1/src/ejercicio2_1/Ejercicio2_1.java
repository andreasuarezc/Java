
package ejercicio2_1;

import javax.swing.JOptionPane;

public class Ejercicio2_1 {

    
    public static void main(String[] args) {
       
        int num1 = Integer
                .parseInt(JOptionPane
                        .showInputDialog(null, "Ingresar un número"));
        int num2 = Integer
                .parseInt(JOptionPane
                        .showInputDialog(null, "Ingresar el segundo número"));
        
        if(num1>num2){
            int suma = num1+num2;
            int diferencia = num1-num2;
            System.out.println("La suma de los números es:");
            System.out.println(suma);
            System.out.println("La diferencia de los números es:");
            System.out.println(diferencia);
        }else{
            int producto = num1*num2;
            int division = num1/num2;
            System.out.println("El productos de los números es:");
            System.out.println(producto);
            System.out
                    .println("La división del primero respecto al segundo es:");
            System.out.println(division);
            }
        
        
    }
    
}
