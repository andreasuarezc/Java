
package ejercicio4_13;

import javax.swing.JOptionPane;


public class Ejercicio4_13 {

    
    public static void main(String[] args) {
        int count = 0;
        int suma1 = 0;
        int suma2 = 0;
        
        while(count<15){
            int lista1 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar un valor a la lista 1"));
            int lista2 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar un valor a la lista 2"));
            suma1 = suma1+lista1;
            suma2 = suma2+lista2;
            if (suma1==suma2){
                System.out.println
        ("Las dos listas tienen valor acumulado igual");
            }else if(suma1>suma2){
                System.out.println("La lista 1 tiene un valor acumulado mayor");
            }else{
                System.out.println("La lista 2 tiene un valor acumulado mayor");
            }count ++;                    
        }
    }
    
}
