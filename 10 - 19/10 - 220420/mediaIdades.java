/*
 * Algoritmo para gerar números entre 15 e 45 (para simular idades),
 * apontar quantos são menores de 18
 * e por fim, a média entre as idades.
 */

import java.util.Scanner;
import java.util.Random;

public class mediaIdades
{
    public static void main(String[] args)
    {
        Random valor = new Random();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int nValores = entrada.nextInt();
        
        int menores = 0;
        double mediaDeIdades = 0;
        
        for(int x = 0; x < nValores; x++){
            int idade = 15 + valor.nextInt(31);
            System.out.println(x + "--> " + idade);
            
            if(idade < 18){
                menores++;
            }
            mediaDeIdades = mediaDeIdades + idade;
        }
        
        //System.out.println("Menores --> " + menores);
        mediaDeIdades = mediaDeIdades/nValores;
        
        System.out.printf("O numero é %d (%.2f) de %d consultados\n",menores,((menores+0.0)/(nValores+0.0)),nValores);
        System.out.printf("A idade dos consultados é %.2f anos\n",mediaDeIdades);
    }
}
