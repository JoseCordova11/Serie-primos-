/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;
import java.util.Scanner;
/**
 *
 * @author ASUS GAMER
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n = 0;
        int primero = 0;
        int segundo = 0;
        int fibo = 0;
        
        System.out.println("Ingrese el limite de la serie fibonacci");
        n = leer.nextInt();
        System.out.println("\n");
        /**
        System.out.println(1+","+primero);
        i = i + 1;
        System.out.println(i+","+segundo);
        i = i + 1;
        */
        for(int i = 1; i<=n; i++ ){
            if(1 < 2){
                System.out.println(1+","+primero);
                System.out.println(1+","+segundo);
                i++;
            }
            else{
                fibo = primero + segundo;
                primero = segundo;
                segundo = fibo;
            
                System.out.println(i+","+fibo);
            }
        }
    }
}
