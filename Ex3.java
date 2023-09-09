// • Escreva um método calculaOperacao que receba por parâmetro dois valores numéricos (float) e um símbolo (char). 
// • Esse símbolo representará a operação que se deseja efetuar com os números. Assim, se o símbolo for “+”, deverá ser realizada uma adição, se for “−”, uma subtração, se for “/”, uma divisão, e, se for “*”, será efetuada uma multiplicação. 
// • Se um símbolo for inválido, o método imprime a mensagem “Símbolo invalido!” e retorna -1. 
// • O método main deve ler do teclado os dois valores e o símbolo, chamar o método criado e imprimir na tela o resultado da operação.
// import java.util.Scanner;

import java.util.Scanner;

public class Ex3 {

    public static float calculaOperacao(float valor1, float valor2, char simbolo) {
        float answer;

        if(simbolo == '+'){
           answer = valor1 + valor2;
        }else if( simbolo == '*'){
            answer = valor1 * valor2;
        }else if(simbolo == '-'){
            answer = valor1 - valor2;
        }else if(simbolo == '/'){
            answer = valor1 / valor2;
        }else{
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Digite o valor 1");
        int valor1 = in.nextInt();

        System.out.println("Digite o valor 2");
        int valor2 = in.nextInt();

        System.out.println("Digite o simbolo da operação");
        char simbolo = in.next().charAt(0);

        Float resposta = calculaOperacao(valor1, valor2, simbolo);

        if(resposta != -1.0){
        System.out.println("A resposta é " + resposta);
        }else{
            System.out.println(resposta + " Simbolo Inválido");
        }
    }

}