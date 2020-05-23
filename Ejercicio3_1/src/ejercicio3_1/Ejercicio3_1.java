
package ejercicio3_1;

import javax.swing.JOptionPane;

public class Ejercicio3_1 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el tercer número"));
        
        if (num1==num2 && num1==num3){
        System.out.println
        ("Los números ingresado son del mismo valor. No hay un número mayor");   
    }else if (num1>num2 && num1>num3){
        System.out.println("El número mayor es:");
        System.out.println(num1);        
    }else if (num2>num1 && num2>num3){
        System.out.println("El número mayor es:");
        System.out.println(num2);
    }else if (num3>num1 || num3>num2){
        System.out.println("El número mayor es:");
        System.out.println(num3);
    }else if (num1>num2 || num1>num3){
        System.out.println("El número mayor es:");
        System.out.println(num1);
    }else {
        System.out.println("El número mayor es:");
        System.out.println(num2);
    }
    }
    
}
