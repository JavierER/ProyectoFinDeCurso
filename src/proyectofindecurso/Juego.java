package proyectofindecurso;

import java.util.Random;

/**
 *
 * @author Javii
 */
public class Juego {
    
    public int[] NumeroDeCartas(){
        int[] numeros = new int[20];
        int contador = 0;
        
        while(contador < 20){
            Random aleatorio = new Random();
            int w = aleatorio.nextInt(10) +1;
            int contador2= 0;
            
            for (int i=0;i<20;i++){
                if(numeros[i] ==w)
                    contador2++;
            }
        
        if(contador2<2){
            numeros[contador] = w;
            contador++;
         }
       }  
        return numeros;
    }
}
