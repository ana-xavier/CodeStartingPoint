/**
 * Gere um programa que divide dois números e imprime na tela.
 */
import java.util.Scanner; //objeto scanner que não há na biblioteca padrão

//javadoc

public class ex2
{
    public static void main(String[] args)
    {
    int n1, n2; //entrada
    int r; //saída
    
    //leitura dos dados
    System.out.println("Informe dois valores inteiros quaisquer.");
    
    Scanner entrada = new Scanner(System.in);
    System.out.print(" Primeiro valor (dividendo): ");
    n1 = entrada.nextInt();
    System.out.print(" Segundo valor (divisor): ");
    n2 = entrada.nextInt();
    
    //realizar a operação
    r = n1 / n2;
    
    //apresentar resultado
    System.out.println("O resultado é: " + r);
    }
}
        

