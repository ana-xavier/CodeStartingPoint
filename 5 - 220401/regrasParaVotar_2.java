import java.util.Scanner;

public class regrasParaVotar_2
{
    public static void main(String[] args)
    {
    //solução do professor (introdução, desenvolvimento  conclusão)
    //introução
    //declarar todos os recursos para o desenvolvimento
    int anoNascimento, idade;
    int situacao = ' '; //0 = não pode votar;
                       //1 = voto é obrigatório
                       //2 = pode votar mas é opcional  
    Scanner in = new Scanner(System.in);                   
    //desenvolvimento
    //1. coletar ano de nascimento
    System.out.print("Informe o seu ano de nascimento: ");
    anoNascimento = in.nextInt();

    //2. calcular a idade              
    idade = 2022 - anoNascimento;
 
    //3. analisar a situação do vivente
    if(idade < 16){
       situacao = 0;
    }else if((idade >= 18)&&(idade < 70)){
        situacao = 1;
    }else if( ((idade >= 16)&&(idade < 18))||(idade >= 70)){
        situacao = 2;
    }else{
        situacao = ' ';
    }
    //conclusão
    switch(situacao){
      case 0:
           System.out.println("Você não pode votar com " + idade + " anos.");
           break;
      case 1:
           System.out.println("Você deve obrigatoriamente votar com " + idade + " anos.");
           break;
      case 2:
           System.out.println("Você pode votar com " + idade + " anos, mas não é obrigaório.");
           break;
      default:
          System.out.println("Situação não esperada para " + idade + " anos.");
          break;
    }
  }    
}
