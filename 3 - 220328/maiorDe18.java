import java.util.Scanner;

public class maiorDe18
{
    public static void main(String[] args){
        
        int idade;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();
        
        if(idade >= 18){
            System.out.println("Com " + idade + " anos, você é de maior :)");
        } else {
            System.out.println("Com " + idade + " anos, você é de menor :(");
        }
    }
}