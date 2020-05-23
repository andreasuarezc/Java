
package ejercicio3_3;

import javax.swing.JOptionPane;

public class Ejercicio3_3 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar un número entero posotivo de hasta tres cifras"));
        if (num/10 >=100 || num<0){
            System.out.println
        ("Error. El número ingresado no es positivo o es superior a tres cifras.");
        }else if (num/10<1){
            System.out.println("El número es de una cifra");
        }else if (num/10<10){
            System.out.println("El número es de dos cifras");
        }else{
            System.out.println("El número es de tres cifras");
        }
    }
    
}
