import java.time.LocalDate;
import java.time.LocalDateTime;

public class Livro {
  private int id;
  private String titulo;
  private String autor;
  private boolean disponivel;
  private LocalDate dataCadastro;
  private LocalDate dataAtualizacao;

  public Livro(int id, String titulo, String autor) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = true;
    this.dataCadastro = LocalDate.now();
    this.dataAtualizacao = LocalDate.now();
  }

  public int getId() {
    return id;
  }

  public String getTitulo() {
      return titulo;
  }

  public boolean isDisponivel() {
      return disponivel;
  }

  public void setDisponivel(boolean disponivel) {
      this.disponivel = disponivel;
      this.dataAtualizacao = LocalDate.now();
  }

  @Override
  public String toString() {
      return "Livro ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Disponível: " + disponivel;
  }
}
