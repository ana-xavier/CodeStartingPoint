import java.util.Scanner;

public class podeDirigir
{
    public static void main(String[] args)
    {
        int ano;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o ano de seu nascimento: ");
        ano = entrada.nextInt();
        
        int calculoAno = 2022 - ano;
        
        if(calculoAno >= 18 && calculoAno < 70){
            System.out.println("Com " + calculoAno + " anos, você pode dirigir :)");
        }else{
            System.out.println("Com " + calculoAno + " anos, você não pode dirigir :(");
        }
    }
}

/*
 * int anoDeNascimento, idade;
   Scanner entrada = new Scanner(System.in);
   System.out.print("Informe o ano de seu nascimento: ");
   anoDeNascimento = entrada.nextInt();
   boolen podeDirigir = false;
   
   idade = 2022 - anoDeNascimento;
   
   if(idade >= 18) && (idade < 70){
       podeDirigir = true;
   }
   
   if(podeDirigir){
            System.out.println("Com " + idade + " anos, você pode dirigir :)");
        }else{
            System.out.println("Com " + idade + " anos, você não pode dirigir :(");
        }
 */