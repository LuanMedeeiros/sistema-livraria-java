import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro(1, "O Hobbit", "J.R.R. Tolkien"));
        biblioteca.adicionarLivro(new Livro(2, "1984", "George Orwell"));
        biblioteca.adicionarLivro(new Livro(3, "Dom Casmurro", "Machado de Assis"));

        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Deseja ver os livros disponíveis para empréstimo? (sim/não)");
            opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("sim")) {
                biblioteca.listarLivrosDisponiveis();
                biblioteca.realizarEmprestimo();
            } else if (opcao.equalsIgnoreCase("não")) {
                System.out.println("Encerrando o sistema. Obrigado por utilizar!");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        } while (!opcao.equalsIgnoreCase("não"));

        scanner.close();
    }
}
