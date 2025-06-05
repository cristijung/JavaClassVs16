package JavaClass.parteII.aula04.enums;
//Classe principal
public class Garagem {
    public static void main(String[] args) {
        //criando um objeto da superclasse (se ela não for abstrata)
        Veiculo veiculoGenerico = new Veiculo("Marca Genérica", "Modelo Padrão", 2020, TipoCombustivel.GASOLINA);
        System.out.println("--- Detalhes do Veículo Genérico ---");
        veiculoGenerico.exibirDetalhes();
        veiculoGenerico.abastecer();
        System.out.println();

        //criando um objeto da subclasse Carro
        Carro meuCarro = new Carro("Ferrari", "296 GTS", 2024, TipoCombustivel.ETANOL, 2, true);
        System.out.println("--- Detalhes do Carro ---");
        meuCarro.exibirDetalhes();
        meuCarro.abastecer();
        meuCarro.ligarArCondicionado();
        System.out.println("Combustível da Ferrari: " + meuCarro.getCombustivel()); //acessando o enum
        System.out.println();

        //criando outro carro, elétrico
        Carro carroEletrico = new Carro("BYD", "Dolphin Mini", 2025, TipoCombustivel.ELETRICO, 4, true);
        System.out.println("--- Detalhes do Carro Elétrico ---");
        carroEletrico.exibirDetalhes();
        carroEletrico.abastecer();
        System.out.println();

        //demonstrando o uso do enum diretamente
        System.out.println("--- Informações sobre Tipos de Combustível (Enum) ---");
        for (TipoCombustivel tc : TipoCombustivel.values()) {
            System.out.println("Tipo: " + tc + " - Descrição: " + tc.getDescricaoAmigavel());
        }
    }
}