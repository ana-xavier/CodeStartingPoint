/**
 * +Faça laços em Java usando while para mostrar:
   Os elementos de uma progressão geométrica de n elementos que inicia em a
    e tem razão r
 */
import java.util.Scanner;

public class ex07
{
    public static void main(String[] args)
    {
        //introucao
        int nElementos, base, razao;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a base da progressão geométrica: ");
        base = entrada.nextInt();
        
        System.out.print("Informe a razão da progressão geométrica: ");
        razao = entrada.nextInt();
        
        System.out.print("Informe a base da quantidade de elementos da progressão geométrica: ");
        nElementos = entrada.nextInt();
        
        System.out.println("O primeiro elemento é: " + base);
        
        int resultado = base;
        //desenvolvimento
        while(nElementos > 0){
            resultado = resultado*razao;
            System.out.println(" --> " + resultado);
            
            nElementos--;
        }
    }
}
