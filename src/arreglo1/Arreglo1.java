/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1;

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Arreglo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("tamaño");
        int tam= leer.nextInt();
        int[]vectorA=new int [tam];
        int[]vectorB=new int [tam];
        
        for(int i=0;i<tam;i++){
            System.out.println("dato"+i+"A");
            vectorA[i]=leer.nextInt();
            System.out.println("dato"+i+"B");
            vectorB[i]=leer.nextInt();
        }
        
        int[] resultado= SumaVectores(vectorA,vectorB);
        System.out.println("Resultado/s:");
        for(int i=0;i<tam;i++){            
            System.out.println(resultado[i]);
        }
        // TODO code application logic here
    }
    static int[]SumaVectores(int[]A,int[]B){
        int r[]=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            r[i]=A[i]+B[i];
        }
    return r;
    }
    
}
