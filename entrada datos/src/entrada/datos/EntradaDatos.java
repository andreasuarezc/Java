
package entrada.datos;

import javax.swing.JOptionPane;

public class EntradaDatos {


    public static void main(String[] args) {
        //Declarar las variables
        int numeroEntero;
        String cadenaCaracteres;
        
        numeroEntero = 10;
        cadenaCaracteres = "Hola mundo";
        
        numeroEntero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un valor numérico entero"));
        cadenaCaracteres = JOptionPane.showInputDialog(null,"Ingresa una cadena de caracteres");
        
        System.out.println("El número entero es:");
        System.out.println(numeroEntero);
        System.out.println("La cadena dice lo siguiente:");
        System.out.println(cadenaCaracteres);
    }
    
}
