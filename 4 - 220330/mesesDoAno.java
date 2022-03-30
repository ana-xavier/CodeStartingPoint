import java.util.Scanner;

public class mesesDoAno
{
    public static void main(String[] args)
    {
        //introducao
        int mesDesejado;
        String mesExtenso = "";
        Scanner entrada = new Scanner(System.in);
        
        //desenvolvimento
        System.out.print("Insira o número correspondente ao mês desejado: ");
        mesDesejado = entrada.nextInt();
        
        switch (mesDesejado){
            case 1:
                mesExtenso = "Janeiro";
                break;
            case 2:
                mesExtenso = "Fevereiro";
                break;
            case 3:
                mesExtenso = "Março";
                break;
            case 4:
                mesExtenso = "Abril";
                break;
            case 5:
                mesExtenso = "Maio";
                break;
            case 6:
                mesExtenso = "Junho";
                break;
            case 7:
                mesExtenso = "Julho";
                break;
            case 8:
                mesExtenso = "Agosto";
                break;
            case 9:
                mesExtenso = "Setembro";
                break;
            case 10:
                mesExtenso = "Outubro";
                break;
            case 11:
                mesExtenso = "Novembro";
                break;
            case 12:
                mesExtenso = "Dezembro";
                break;
            default:
                mesExtenso = "é necessário inserir um número de 1 (jan) a 12 (dez) para ser válido.";
                break;
        }
        //conclusao
        System.out.println("O número " + mesDesejado + " corresponde a " + mesExtenso);
        
    }
}
