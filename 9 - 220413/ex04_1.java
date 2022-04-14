/**
 * Faça laços em Java usando while para mostrar:
 * As 10 primeiras potências de 2
 */

public class ex04_1
{
   public static void main(String[] args)
   {
       //introducao
       //atribuir valores para base e potencia 
       int base = 2, potencia = 10, resultado = 1;
       
       //desenvolvimento
       // ---> loop while irá continuar multiplicando a var de resultado pela var de base (2) até que a var potencia (10) se torne 0.
       while(potencia != 0){
           resultado = resultado * base ;
           System.out.println("---> " + resultado);
           potencia--;
       } 
       //conclusao
   }
}
