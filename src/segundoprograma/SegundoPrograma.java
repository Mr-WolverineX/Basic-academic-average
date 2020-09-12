
package segundoprograma;

import java.util.Scanner;

public class SegundoPrograma {

    // Agregar while para que solo ingrese numeros y no letras 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
         int [] califica = new  int [10];
         
         
         System.out.println(" Ingrese calificaciones del 0 al 100"); // Estos valores se ingrsasn al vector
         for (int i = 0; i < califica.length; i++){
             System.out.print(" Inice del vector[" + i + "]Nota 1 = "); // imprime los indice desde cero
             califica[i] =  sc.nextInt();     // lee  los valores que el usuario quiere q valla dentro del vector en Double
             } 
             System.out.print(" Calificaciones = [ ");
             for (int i = 0; i < califica.length; i++){
                 System.out.print(+ califica[i]+", ");
             }
             System.out.println("]");
             
             
             int promedio = 0;
             
             for (int i = 0; i < califica.length; i++){
             
                 promedio += califica[i] / califica.length;
                 }
//                 System.out.println(" El pomedio de sus calificacion es: " + promedio );
                 
                 if (promedio >= 90){
                     System.out.println(" Su promedio es: "+ promedio +" letra [A] ");
                 }
                 if (promedio >= 80 && promedio <=89){
                     System.out.println(" Su promedio es: "+ promedio +" letra [B] ");
                 }
                 if (promedio >= 71 && promedio <=79){
                     System.out.println(" Su promedio es: "+ promedio +" letra [C] ");
                 }
                 if (promedio >= 60 && promedio <=70){
                     System.out.println(" Su promedio es: "+ promedio +" letra [D] ");
                 }
                 if (promedio <=59){
                     System.out.println(" Su promedio es: "+ promedio +" letra [F] ");
                 }
        
             
             
    }
    
}
