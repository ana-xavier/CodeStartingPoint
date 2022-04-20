import java.util.Scanner;
import java.util.Random;

public class ex01
{
    public static void main(String[] args)
    {
        //introdução
        int nAleatorio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um valor: ");
        nAleatorio = entrada.nextInt();
        
        Random rand = new Random();
        
        int n = 0;
        
        //desenvolvimento
        while(n < nAleatorio){
            double altura;
            altura = 1.05 + (1.15 * rand.nextDouble());
            System.out.printf("Criatura %d -> altura %.2f\n",n,altura);
            n++;
        }
    }
}
