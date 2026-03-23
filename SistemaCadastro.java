import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Cadastro ===");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("\n=== Dados Cadastrados ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if (idade >= 18) {
            System.out.println("Status: Maior de idade");
        } else {
            System.out.println("Status: Menor de idade");
        }

        scanner.close();
    }
}