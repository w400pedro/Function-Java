// • Escreva um método calculaNeperiano que calcule e retorne o número neperiano e, e = 2,71828183, usando a série a seguir: 
// 1/n! = 1/0! + 1/1! + 1/2! + 1/3!...
// • O método deve receber como parâmetro somente um número inteiro N que representa a quantidade de termos que serão somados. Note que quanto maior esse número, mais próximo do valor e estará a resposta. 
// • Use o método calculaFatorial do exercício anterior. 
// • O método main deve ler via teclado um valor para N, usar o método criado e imprimir na tela o resultado da série. 
// • Exemplo: Se N for igual a 3, então a saída do programa deve ser: “Numero neperiano = 2.666667”.
import java.util.Scanner;

public class Ex7 {

        public static float calculaFatorial(int n) {
        float fatorial = 1;
        int c = n;

        while(c > 0){
            fatorial = fatorial * c;
            c--;
        }
        return fatorial;
    }

    public static float calculaNeperiano(int n) {
        float calculo = 0;
        int c = 0;

            while(c <= n){
                System.out.println(1/calculaFatorial(c));
                calculo += 1/calculaFatorial(c);
                c++;
            }

        return calculo;
    }

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite o valor de n");
        int n = in.nextInt();

        float resposta = calculaNeperiano (n);
        System.out.println("O resultado é "+resposta);

    }

}