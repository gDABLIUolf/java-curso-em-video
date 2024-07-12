import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero, soma = 0;
        String resposta;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            soma += numero;
            System.out.print("Quer continuar? [S/N]: ");
            resposta = sc.next();
            } while(resposta.equals("S"));
        System.out.println("A soma de todos os valores é: " + soma);
    }
}