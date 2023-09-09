// Escreva um método isMultiple que receba por parâmetro um par de inteiros e determine se o segundo inteiro é um múltiplo do primeiro, ou seja, retorna true se o segundo for um múltiplo do primeiro e false caso contrário. 
// • O método main deve ler via teclado uma série de pares inteiros (um par por vez), determinar (chamando o método isMultiple) e imprimar na tela se o segundo valor, em cada par, é um múltiplo do primeiro.
import java.util.Scanner;

public class Ex2 {

    public static boolean isMultiple(int valor1, int valor2) {
        boolean multiplo;
        if (valor2 % valor1 == 0) {
            multiplo = true;
        } else {
            multiplo = false;
        }
        return multiplo;
    }

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite o valor 1");
        int valor1 = in.nextInt();

        System.out.println("Digite o valor 2");
        int valor2 = in.nextInt();

        boolean resposta = isMultiple(valor1, valor2);

        if (resposta == true) {
            System.out.println(valor2 + " é multiplo de " + valor1);
        } else {
            System.out.println(valor2 + " não é multiplo de " + valor1);
        }

    }

}