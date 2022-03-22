
/**
 * Gere um programa que calcula a média aritmética de 3 valores dados
como entrada
 */
import java.util.Scanner;

public class ex4
{
   public static void main(String[] args)
   {
       int n1, n2, n3; //entrada
       int r; //saída
       
       //leitura dos dados
       System.out.println("Informe três valores inteiros quaisquer.");
       
       Scanner entrada = new Scanner(System.in);
       //primeiro número
       System.out.print(" Primeiro valor: ");
       n1 = entrada.nextInt();
       //segundo número
       System.out.print(" Segundo valor: ");
       n2 = entrada.nextInt();
       //terceiro valor
       System.out.print(" Terceiro valor: ");
       n3 = entrada.nextInt();
       
       //realizar calculo artimético
       r = (n1 + n2 + n3) /3;
       
       //mostrando resultado
       System.out.println("O resultado é: " + r);
   }
}
