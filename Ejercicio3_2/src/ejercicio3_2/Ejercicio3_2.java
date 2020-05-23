
package ejercicio3_2;

import javax.swing.JOptionPane;

public class Ejercicio3_2 {

    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar un número entero"));
        
        if (num==0){
        System.out.println("El número ingresado es un número nulo");
    }else if (num>0){
        System.out.println("El número ingresado es positivo");
    }else{
        System.out.println("El número ingresado es negativo");
    }
    }
}
