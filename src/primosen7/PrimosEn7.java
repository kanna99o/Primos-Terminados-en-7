/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primosen7;

/**
 *
 * @author andres_fernandez
 */
public class PrimosEn7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se utiliza criba de Eratostenes para hallar los numeros primos desde 2 hasta n.
        // Si se encuentra un primo, se aumenta el contador "result" y se añade al String "out"
        
        int n = 10000; //número arbitrario lo suficientemente largo como para tener 60 primos terminados en 7
        int result = 0; // contador de números primos terminados en 7
        String out = ""; // lista de números primos terminados en 7
        boolean[] primo = new boolean[n]; // arreglo de números primos
        
        for(int i = 0; i < n; i++){ // iterar sobre el arreglo de primos
            primo[i] = true; // como condiciòn inicial, todos los numeros son primos
        }
        
        for(int j = 2; j < n; j++){ // iterar sobre el arreglo de primos
            if(primo[j]==false) continue; // si numero no es primo, se debe seguir con la siguiente iteración
            
            // si se llega acá, el número es primo
            for(int k = 2 ; k < n/j; k++){ // todos los multiplos de j no son primos
                primo[j*k] = false;
            }
            
            if(j%10 == 7) { // si número primo termina en 7
                result++; // aumentar contador
                out = out + j + ", "; // añadir al string de resultado
            }
            
            if(result == 60) break; // si hay 60 números primos terminados en 7, terminar la busqueda
        }
        
        //imprimir reesultados
        System.out.println(result);
        System.out.println(out);
    }
    
}
