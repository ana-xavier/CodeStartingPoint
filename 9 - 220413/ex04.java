/**
 * Faça laços em Java usando while para mostrar:
 * As potências informadas pelo usuário, de base 2.
 */
import java.util.Scanner;

public class ex04
{
   public static void main(String[] args)
   {
       //introducao
       //atribuir valores para base e potencia 
       int base = 2, potencia, resultado = 1;
       Scanner entrada = new Scanner(System.in);
       
       //-->titulo
       System.out.println("Algoritmo para calcular a potência de base 2.");
       //-->usuário insere a potencia elevada
       System.out.print("Insira o valor da potência: ");
       potencia = entrada.nextInt();
       
       //desenvolvimento
       // ---> loop while irá continuar multiplicando a var de resultado pela var de base (2) até que a var resultado se torne 0.
       while(potencia != 0){
           resultado = resultado * base ;
           potencia--;
       }
       //conclusao
       System.out.println("O valor da potência é: " + resultado);
   }
}
