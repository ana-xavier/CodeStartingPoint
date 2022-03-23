/**
 * A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
 * Considerando para este problema que π = 3.14159:
 * Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
 * Entrada = area.
 */
import java.util.Scanner;

public class areaCirculo
{
    public static void main(String[] args)
    {
        //declarando variáveis 
        // --> double para número com virgula (variavel de dupla precisão)
        
        double n = 3.14159, raio;  //variaveis de entrada
        double area;  //variaveis de saída
        
        //entrada do raio
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        raio = entrada.nextDouble();
        
        //realizar calulo
        area = n*(raio*raio);
        
        //apresentar resultado
        //System.out.println("A = " + area);
        System.out.printf("A = %.4f", area);
        // --> printf = mecanismo de formatação.
        // --> f = imprime o conteúdo da variável com representação com ponto decimal.
        // --> "4" define que são 4 casas decimais.
    }
}
