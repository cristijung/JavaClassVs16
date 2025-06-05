package JavaClass.parteII.aula04.polimorfismo.modeloVeiculo;

public class TestarPolimorfismo {
    public static void main(String[] args) {
        //criando objetos de diferentes subclasses
        Veiculo meuVeiculoGenerico = new Veiculo("Genérico", "Padrão");
        Veiculo meuCarro = new Carro("Honda", "Civic"); //objeto Carro referenciado por Veiculo
        Veiculo minhaMoto = new Motocicleta("Yamaha", "MT-07");  //objeto Moto referenciado por Veiculo

        System.out.println("--- Acelerações ---");
        meuVeiculoGenerico.acelerar(); //chama o método de Veiculo
        meuCarro.acelerar();           //chama o método de Carro (sobrescrito)
        minhaMoto.acelerar();          //chama o método de Moto (sobrescrito)

        System.out.println("\n--- Detalhes ---");
        meuVeiculoGenerico.exibirDetalhes();
        System.out.println();
        meuCarro.exibirDetalhes(); //chama o método de Carro (sobrescrito)
        System.out.println();
        minhaMoto.exibirDetalhes();  //chama o método de Moto (sobrescrito)

        System.out.println("\n--- Usando um array de Veiculo ---");
        Veiculo[] frota = new Veiculo[3];
        frota[0] = new Veiculo("Outro Genérico", "Modelo X");
        frota[1] = new Carro("Ford", "Ranger");
        frota[2] = new Motocicleta("BMW", "S1000RR");

        for (Veiculo v : frota) {
            v.exibirDetalhes(); //método correto (da subclasse específica) é chamado
            v.acelerar();       //método correto é chamado dinamicamente
            System.out.println("-----");
        }
    }
}