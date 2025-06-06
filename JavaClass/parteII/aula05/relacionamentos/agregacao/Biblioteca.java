package JavaClass.parteII.aula05.relacionamentos.agregacao;
import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private String nome;
    private List<Livro> livros; // agregação - Biblioteca contém uma lista de Livros

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>(); // inicializando a lista de livros
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    public void mostrarLivros() {
        System.out.println("Livros na biblioteca " + nome + ":");
        for (Livro livro : livros) {
            livro.mostrarDetalhes();
        }
    }
    public String getNome() {
        return nome;
    }
}
