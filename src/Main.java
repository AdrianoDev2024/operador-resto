import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        double numero = input.nextDouble();
        String mensagem = "Número digitado foi : ";

        if (numero % 2 == 0) {
            System.out.println("O número é PAR");
            System.out.println(mensagem + numero);

        } else{
            System.out.println("O número é IMPAR");
        System.out.println("Número digitado foi : " + numero);

    }
    }
}