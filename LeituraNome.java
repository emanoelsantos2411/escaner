import java.util.Scanner;

public class LeituraNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao laboratório de programação!");
        
        scanner.close();
    }
}