package JavaClass.parteII.aula02;
//na linha de cima: é o pacote, é o namespace --> FQCN - fully qualificaded class name
//classe main, é a classe principal, e vai USAR a classe Carro

public class ProgramaCarro {
    public static void main(String[] args) {
        //criação dos OBJETOS por intermédio das instâncias da classe Carro
        //cada objeto criado é UMA CÓPIA da classe Carro, porém com seus próprios valores
        System.out.println("Criando o primeiro carro ...");
        Carro meuFusca = new Carro("Laranja", "Fusca", 1975);
        System.out.println("Criando o segundo carro ...");
        Carro minhaFerrari = new Carro("Vermelho", "Ferrari", 1960);

        //usando os objetos --> utilizamos os métodos
        //ver as informações dos carros

        //ver as informações do Fusca
        System.out.println("\n --- Ações do Fusca ---");
        meuFusca.mostrarInformacoes();
        meuFusca.ligar();
        meuFusca.mostrarInformacoes();
        meuFusca.desligar();

        //ver as informações da Ferrari
        System.out.println("\n--- Ações da Ferrari ---");
        minhaFerrari.mostrarInformacoes();
        minhaFerrari.ligar();
        minhaFerrari.desligar();
        minhaFerrari.mostrarInformacoes();

        System.out.println("\n Fim do programa!");




    }
}
