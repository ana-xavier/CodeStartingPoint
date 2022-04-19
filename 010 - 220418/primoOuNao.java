import java.util.Scanner;

public class primoOuNao
{
    public static void main(String[] args){
        int valorInvestigado, divisor = 1, nroDivisores = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um valor: ");
        valorInvestigado = entrada.nextInt();
        

        while(divisor <= valorInvestigado){
            if((valorInvestigado%divisor) == 0){
                System.out.println("Achei um divisor :)     --> " + divisor);
                nroDivisores++;
            }else{
                System.out.println("Não achei um divisor :( --> " + divisor);
            }
            divisor++;
        }
        if(nroDivisores == 2){
            System.out.println("O valor " + valorInvestigado + " é primo");
        }else{
            System.out.println("O valor " + valorInvestigado + " não é primo");
        }
    }
}
