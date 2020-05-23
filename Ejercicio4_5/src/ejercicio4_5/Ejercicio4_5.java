
package ejercicio4_5;

import javax.swing.JOptionPane;

public class Ejercicio4_5 {

    
    public static void main(String[] args) {
        
        float coordenadaX = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el valor de la coordenada X."));
        float coordenadaY = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingresar el valor de la coordenada Y."));
        
        if (coordenadaX>0 && coordenadaY>0){
            System.out.println
        ("El punto se encuentra en el primer cuadrante del plano");
        }else if (coordenadaX<0 && coordenadaY>0){
            System.out.println
        ("El punto se encuentra en el segundo cuadrante del plano");
        }else if (coordenadaX<0 && coordenadaY<0){
            System.out.println
        ("El punto se encuentra en el tercer cuadrante del plano");
        }else{
            System.out.println
        ("El punto se encuentra en el cuarto cuadrante del plano");
        }
    }
    
}
