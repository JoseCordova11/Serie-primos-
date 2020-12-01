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
public class SeriePrimos {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num = 0; int den =  0; double suma = 0; //serie
        int n = 0; // limite de la serie
        int primo = 2; int divisor = 0; boolean bandera = false; //genera primos
        
        System.out.println("Programa para generear la serie"
                         +"1/2 - 2/3 + 3/5 - 4/7 + 5/11 -6/13 +__+ n \n " );
        
        System.out.println("Ingrese el limite de la serie \n");
        n = leer.nextInt();
        
        for (int i = 1; i <= n; i++){
            num = num + 1;
            bandera = false;
            
            while(bandera == false){
                
                for (int j = 1; j <= primo; j++){
                    
                    if(primo % j == 0){
                        divisor = divisor + 1;
                    }
                }
                
                if (divisor == 2){
                     bandera = true;
                     den = primo;
                     primo = primo + 1;             
                }
                else{
                    primo = primo + 1;
                }
                divisor = 0;
            }
            if(i % 2 == 0){
                System.out.println(1+"  -"+num +"/" +den);
                suma = suma - (double)num/den; 
            }
            else{
                System.out.println(1+"  +"+num +"/" +den);
                suma = suma + (double)num/den; 
            }
            
        }
        
        System.out.println("");
        System.out.println("La sema de la serie es: "+suma +"\n");
    }
}
