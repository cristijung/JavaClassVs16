# StreamAPI

Stream API, introduzida no Java 8, revolucionou a maneira como os desenvolvedores processam coleções de dados (como Listas, Sets e Arrays). Ela permite que possamos executar operações complexas de filtro, mapeamento e redução de dados de uma forma muito mais limpa, legível e eficiente.

### Podemos pensar na Stream API como uma linha de montagem para seus dados:
- Fonte (Source): Podemos colocar uma coleção de itens brutos (ex: uma lista de produtos) no início da esteira.
- Operações Intermediárias (Intermediate Operations): Cada estação na linha de montagem realiza uma transformação específica (ex: selecionar apenas os eletrônicos, descartar os que estão fora de estoque, alterar a embalagem).
- Operação Terminal (Terminal Operation): No final da esteira, coletamos o produto acabado (ex: uma nova lista com os nomes dos produtos filtrados ou a soma total dos preços).

### O que a Stream API Faz?
Em vez de escrever laços `for` e `if` aninhados para iterar e manipular dados manualmente (o jeito "imperativo"), podemos descrever o que quer fazer com os dados de forma declarativa.

## As principais funções são:
- Filtrar (`Filtering`): Selecionar elementos que atendem a um critério.
- Mapear (`Mapping`): Transformar cada elemento em outra coisa (ex: de um objeto Produto para apenas seu nome ou preço).
- Reduzir (`Reducing`): Combinar todos os elementos para chegar a um único resultado (ex: somar todos os preços, encontrar o produto mais caro).
- Ordenar (`Sorting`): Classificar os elementos.
- Agrupar (`Grouping`): Agrupar elementos por uma característica em comum (ex: agrupar produtos por categoria).

## Características Essenciais da Stream API
- Não armazena dados: Uma Stream não é uma estrutura de dados. Ela apenas transporta os dados da fonte através de um pipeline de operações.
- É declarativa e funcional: Você diz "o que" quer fazer, não "como" fazer. Isso torna o código mais legível e menos propenso a erros.
- Operações em Pipeline: As operações são encadeadas. Isso permite otimizações, como a execução "preguiçosa" (lazy evaluation), onde os dados só são processados quando a operação terminal é chamada.
- Consumível: Uma Stream só pode ser usada uma vez. Após a operação terminal, ela é "fechada".
- Processamento Paralelo Fácil: Com uma simples chamada (.parallelStream()), a API pode dividir o trabalho em múltiplos núcleos do processador, melhorando drasticamente a performance em grandes volumes de dados, sem a complexidade de gerenciar threads manualmente.