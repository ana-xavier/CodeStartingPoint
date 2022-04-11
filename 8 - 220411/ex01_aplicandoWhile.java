public class ex01_aplicandoWhile {
    public static void main(String[] args)
    {
        int i = 0, sum = 0;
        
        while (sum < 10){
            i++;
            sum+=i;
            System.out.println(i + " " + sum);
        }
    }
}

/*
 * //subtrai, porém com a representação limite 
 * while (sum > 10){
    i++;
    sum-=i;
    System.out.println(i + " " + sum);
 */

/* //subtrai, e sempre será 0 (caso infinito)
 * while (sum > 10){
    i++;
    sum-=(i-i);
    System.out.println(i + " " + sum);
 */

/*
 * {
 *     int i = 0;
 *     int sum = 0;
 *     
 *     while(sum<10); <--- ponto e vírgula está limitando o comando. ou seja, vai
 *                         sempre ficar analisando a condição sem sair do lugar.
 *     {
 *         i++;
 *         sum+=i;
 *         System.out.println(i + " " + sum");
 *     }
 }
 }
 */