
/**
 * Gere um programa quem imprime “Hello” na tela e em seguida o seu
nome em uma linha separada.
 */
import java.util.Scanner;

public class ex01_1
{
    public static void main(String[] atgs)
    {
        System.out.println("Hello");
        System.out.println("Ana Carolina Xavier");
        
        String nome;
        Scanner in = new Scanner(System.in);
        nome = in.nextLine();
        
        System.out.println("Hello again");
        System.out.println(nome);
    }
}
