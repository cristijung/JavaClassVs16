# Explicação
## Classe Livro: 
- Representa um livro com atributos titulo e autor. 
- Possui métodos para exibir os detalhes do livro.
## Classe Biblioteca: 
- Representa uma biblioteca que agrega múltiplos livros. 
- A agregação é demonstrada pelo atributo livros, que é uma lista de instâncias da classe Livro. 
- O construtor da classe Biblioteca inicializa essa lista.
## Classe Main: 
- Classe principal onde criamos instâncias de Livro e Biblioteca. 
- Adicionamos os livros à biblioteca usando o método adicionarLivro e exibimos os detalhes dos livros na biblioteca com o método mostrarLivros.

### Neste exemplo, a relação de agregação é clara porque a Biblioteca mantém uma lista de referências a objetos Livro. Os objetos Livro podem existir independentemente da Biblioteca, e a Biblioteca agrega esses objetos.