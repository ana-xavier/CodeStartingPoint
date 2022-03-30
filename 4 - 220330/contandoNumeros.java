/*
 * comando switch case;
 * funciona com int, byte, short, char, string, 
 * enumerados, character, interger
 * 
 * break -> comando de término de caso
 * default -> tratamento de situações gerais (algo que não está mapeado)
 * 
 * não permite indicação de intervalo ou condição.
 * ----> análise de vaiável.
 */

public class contandoNumeros
{
    public static void main(String[] args)
    {
        int numero = 1;
        
        //uma expressão pode ser definida por uma variável (no caso, "numero")
        switch (numero){ 
            case 0: // dentro de " ", será caracter
                System.out.println("zero");
                break;
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            default: //"else"
                System.out.println("many");
                break;
        }
    }
}
