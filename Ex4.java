// • Escreva um método squareOfAsterisks que exibe na tela um quadrado sólido (mesmo número de linhas e colunas) de asteriscos cujo lado é especificado por um parâmetro inteiro “side”. Esse método não retorna valor algum.
// • Por exemplo, se side for 4, o método deverá exibir na tela:
// ****
// ****
// ****
// ****
// • O método main deve ler do teclado um valor para side e gerar a saída
// dos asteriscos com o método squareOfAsterisks.
import java.util.Scanner;

public class Ex4 {

    public static void squareOfAsterisks(int side) {
        int c = 0;
        int cc = 1;
        while (c < side) {
            cc = 0;
            while (cc < side) {
                System.out.print("*");
                cc++;
            }
            System.out.println("");
            c++;
        }
    }

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite o valor do side");
        int side = in.nextInt();

        squareOfAsterisks(side);

    }

}