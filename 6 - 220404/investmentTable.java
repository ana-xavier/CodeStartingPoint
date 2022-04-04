import java.util.Scanner;

public class investmentTable
{
    public static void main(String[] args)
    {
        final double avaliacao = 5;
        final double saldo_inicial = 10000;
        double saldo = saldo_inicial;
        
        System.out.print("Insira o número de anos: ");
        Scanner in = new Scanner(System.in);
        int nyears = in.nextInt();
        
        for (int year = 1; year <= nyears; year++){
            double interest = saldo * avaliacao / 100;
            saldo = saldo + interest;
            System.out.printf("%4d %10.2f\n", year, saldo);
        }
    }
}
