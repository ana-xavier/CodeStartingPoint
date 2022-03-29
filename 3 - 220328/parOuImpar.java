import java.util.Scanner;

public class parOuImpar
{
    public static void main(String[] args)
    {
        int numero;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        
        if((numero % 2) == 0){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}

/*
 * int numero;
   Scanner entrada = new Scanner(System.in);
   numero = entrada.nextInt();
   boolean ehPar = false;
        
        if((numero % 2} == 0){
            ehPar = true;
        } else {
            ehPar = false;
        }
        
        if(ehPar){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
 */

/*
 * int valor;
   Scanner entrada = new Scanner(System.in);
   valor = entrada.nextInt();
   boolean ehPar = false;
   
 * int resultado;
 * resultado = valor/2;
 * 
 *      if(((resultado*2)-valor) == 0){
 *          ehPar = true;
        } else {
            ehPar = false;
        }
        
        if(ehPar){
           System.out.println("O número " + valor + " é par.");
        } else {
            System.out.println("O número " + valor + " é ímpar.");
        }
 */