import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void realizarEmprestimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do livro que deseja emprestar:");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha

        Livro livroSelecionado = null;
        for (Livro livro : livros) {
            if (livro.getId() == id && livro.isDisponivel()) {
                livroSelecionado = livro;
                break;
            }
        }

        if (livroSelecionado != null) {
            System.out.println("Digite seu nome:");
            String nomeUsuario = scanner.nextLine();
            livroSelecionado.setDisponivel(false);
            System.out.println("Livro '" + livroSelecionado.getTitulo() + "' foi emprestado com sucesso para " + nomeUsuario);
        } else {
            System.out.println("Livro não disponível ou ID inválido.");
        }
    }
}
