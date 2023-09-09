// • Escreva um método calculaPotencia que receba por parâmetros dois valores inteiros “base” e “exponente” e calcule e retorne (int) o resultado de baseexponente para o programa principal.
// • Assuma que “exponente” seja um inteiro não zero e positivo.
// • Não utilize métodos da classe Math.
// • Use uma estrutura de repetição.
// • O método main deve solicitar ao usuário os valores inteiros para base e exponente, chamar o método calculaPotencia e mostrar na tela o resultado da operação.

import java.util.Scanner;

public class Ex1 {

    public static int calculaPotencia(int base, int expoente) {
        int answer = base;
        int c = 1;
        while (c < expoente) {
            answer = answer * base;
            c++;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite o valor da base");
        int base = in.nextInt();

        System.out.println("Digite o valor do expoente");
        int expoente = in.nextInt();

        int resposta = calculaPotencia(base, expoente);

        System.out.println("A resposta é " + resposta);

    }

}