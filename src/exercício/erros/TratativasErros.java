package exercício.erros;

import java.util.Scanner;

public class TratativasErros {

    public static void main(String[] args) {
        try {
            var entrada = new Scanner(System.in);
            String[] opcoes = { "Bola", "Carro", "Escada" };
            System.out.println("Digite uma das opções %s".formatted(String.join(",", opcoes)));
            String escolha = entrada.nextLine().trim();
            if (!opcoes[0].equalsIgnoreCase(escolha)
                    && !opcoes[1].equalsIgnoreCase(escolha)
                    && !opcoes[2].equalsIgnoreCase(escolha)) {
                throw new EscolhaIncorretaException(escolha, opcoes);
            }
        } catch (EscolhaIncorretaException e) {
            e.printStackTrace();
        }

    }

    private void testeTryCatch() {
        try {
            var entrada = new Scanner(System.in);
            System.out.println("DIGITE UM NUMERO: ");
            int num1 = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Valor informado invalido");
        }

        System.out.println("Fim");
    }
}
