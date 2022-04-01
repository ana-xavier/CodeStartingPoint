import java.util.Scanner;

public class regrasParaVotar
{
    public static void main(String[] args)
    {
        //declarando vaiáveis
        int ano;
        Scanner entrada = new Scanner(System.in);
        
        //entrada
        System.out.print("Informe seu ano de nascimento: ");
        ano = entrada.nextInt();
        
        //operando e saída do produto
        int calculoIdade = 2022 - ano;
        //System.out.print("Sua idade é " + calculoIdade + " anos. ");
        
        //condição e saída das condições
        if (calculoIdade >= 18 && calculoIdade < 70){
            System.out.println("Sua idade é " + calculoIdade + " anos. " +"Você é obrigado a votar.");
        }else if (calculoIdade >= 16 || calculoIdade >= 70){
            System.out.println("Sua idade é " + calculoIdade + " anos. " + "Seu voto é opcional.");
        }else{
            System.out.println("Sua idade é " + calculoIdade + " anos. " + "Você não pode votar");
        }
    }
}



