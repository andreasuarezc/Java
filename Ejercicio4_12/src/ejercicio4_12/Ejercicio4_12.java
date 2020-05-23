
package ejercicio4_12;



public class Ejercicio4_12 {

    
    public static void main(String[] args) {
        
        int multiplo = 1;
        int resultado = 0;
        
        while (resultado<500){
            resultado = 8*multiplo;            
            System.out.println("8 * "+ multiplo + " = "+ resultado);
            multiplo ++;
        }
        
    }
    
}
