public class DoubleInvestment
{
   public static void main(String[] args)
   {
       //introdução
       final double RATE = 5;
       final double INITIAL_BALANCE = 10000;
       final double TARGET = 2 * INITIAL_BALANCE;
       
       double balance = INITIAL_BALANCE;
       int year = 0;
       
       //desenvolvimento
       while (balance < TARGET){
           year++;
           double interest = balance * (RATE / 100);
           balance += interest; //(= balance + interest --> a variavel recebe ela mesma somado com algo.)
       }
       
       //conclusão
       System.out.printf("O valor final de %.2f foi alcançado em %d anos\n", balance, year);
   }
}
