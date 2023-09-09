// • Escreva 3 métodos para cada uma das seguintes tarefas:
// a) Calcule e retorne a parte inteira do quociente quando um número inteiro “a” é dividido por outro número inteiro “b”;
// b) Calcule e retorne o resto inteiro quando um inteiro “a” é dividido por outro número inteiro “b”;
// c) Utilize os métodos desenvolvidos nos itens (a) e (b) para escrever um método displayDigits que recebe apenas um número inteiro entre 1 e 99999 e o exibe na tela como uma sequência de dígitos separados por espaços. Esse método não retorna valor algum.
// Por exemplo, o inteiro 4562 deve aparecer na tela como 4 5 6 2
// • O método main deve ler do teclado um número inteiro e chamar o método displayDigits. Caso o número não esteja no intervalo de 1 a 99999, um novo número deve ser solicitado (use estrutura de repetição)26.

import java.util.Scanner;

public class Ex5 {

    public static int divisao(int valor1, int valor2) {
        int dividido;
        dividido = valor1 / valor2;
        return dividido;
    }

    public static int resto(int valor1, int valor2) {
        int sobra;
        sobra = valor1 % valor2;
        return sobra;
    }

    public static void displayDigits(int numero){
        String result ="";
        int resto;
        int c = 0;
        while(c <= numero){
         resto = resto(numero, 10);
         numero = divisao(numero, 10);
         result = resto + " " + result;
            c++;
        }
        System.out.printf("Resultado é "+result);
    }

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite o numero");
        int numero = in.nextInt();

        displayDigits(numero);
    }

}