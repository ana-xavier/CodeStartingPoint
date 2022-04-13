/**
 * +Faça laços em Java usando while para mostrar:
   Os números pares entre a e b (com a b)
 */
import java.util.Scanner;

public class ex03
{
    public static void main(String[] args)
    {
        //introucao
        int a, b, aux;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o valor de a: ");
        a = entrada.nextInt();
        
        System.out.print("Informe o valor de b (maior que a): ");
        b = entrada.nextInt();
        
        aux = a;
        
        //desenvolvimento
        System.out.println("O valor de a é " +a+ " e o valor de b é ");
        while(aux<=b){
            //computo aux para sabe se é par ou ímpar
            // --> se par apresenta o numero
            if((aux % 2) == 0){
                System.out.println(aux);
            }
            //atualizar o aux
            aux++;
        }
    }
}
