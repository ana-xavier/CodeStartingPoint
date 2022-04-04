import java.util.Scanner;

public class tabelaInvestimento
{
    public static void main(String[] args)
    {
        //introducao
        double taxa, investimento;
        int nroAnos;
        Scanner entrada = new Scanner(System.in);
    
        //desenvolvimento
        System.out.print("Informe a taxa a ser aplicada ao ano: ");
        taxa = entrada.nextDouble();
    
        System.out.print("Informe o valor inicial de investimento: ");
        investimento = entrada.nextDouble();
    
        System.out.print("Informe o nro de anos de investimentos: ");
        nroAnos = entrada.nextInt();
    
        for(int anoCorrente = 1; anoCorrente <= nroAnos; anoCorrente++){
            double ganho = investimento * (taxa/100);
            investimento = investimento + ganho;
            System.out.printf("%4d ----> %10.2f\n", anoCorrente, investimento);
        }
    
        //conclusao
        System.out.println("That's all folks"); 
    }
}
