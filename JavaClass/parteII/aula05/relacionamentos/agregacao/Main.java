package JavaClass.parteII.aula05.relacionamentos.agregacao;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Livro
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Dracula", "Bram Stoker");

        // Criando uma instância de Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Mostrando os livros na biblioteca
        biblioteca.mostrarLivros();
    }
}
