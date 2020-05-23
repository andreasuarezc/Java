
package ejercicio4_7;

import javax.swing.JOptionPane;

public class Ejercicio4_7 {

    
    public static void main(String[] args) {
        
        System.out.println("Debes ingresar tres número de diferente valor c/u");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el primer valor"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el segundo valor"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el tercer valor"));
        
        if (num1==num2 || num2==num3){
            System.out.println("Error. Se ingresaron números de igual valor");
        }else if (num1>num2 && num1>num3){
            System.out.println("El número mayor es:");
            System.out.println(num1);
            if (num2>num3){
                System.out.println("El número menor es;");
                System.out.println(num3);
            }else{
                System.out.println("El número menor es:");
                System.out.println(num2);
            }
        }else if (num2>num1 && num2>num3){
            System.out.println("El número mayor es:");
            System.out.println(num2);
            if (num1>num3){
                System.out.println("El número menor es:");
                System.out.println(num3);
            }else{
                System.out.println("El número menor es:");
                System.out.println(num1);
            }
        }else{
            System.out.println("El número mayor es:");
            System.out.println(num3);
            if(num1>num2){
                System.out.println("El número menor es:");
                System.out.println(num2);
            }else{
                System.out.println("El número menor es:");
                System.out.println(num1);
            }
        }
    }
    
}
