// • Escreva um método calculaFatorial que receba por parâmetro um numero inteiro e retorne o fatorial deste número. 
// • O método main deve ler do teclado um número, chamar o método criado e imprimir na tela o resultado.
import java.util.Scanner;

public class Ex6 {

    public static int calculaFatorial(int valor) {
        int fatorial = 1;
        int c = valor;

        while(c > 0){
            fatorial = fatorial * c;
            c--;
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite o valor");
        int valor = in.nextInt();

        int resposta = calculaFatorial(valor);
        System.out.println("O fatorial é: " + resposta);

    }

}