
package ejercicio5_4;

import javax.swing.JOptionPane;


public class Ejercicio5_4 {

    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar un número del 1 al 10"));
        if (num>10 || num<1){
            System.out.println
        ("Error. El número ingresado no cumple las condicioens solicitadas");
        }else{
            for (int i=1;i<12;i++){
            int tabla = num*i;
            System.out.println(num+" * "+i+" = "+tabla);
           
            }
        }
    }
    
}
