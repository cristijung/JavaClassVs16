package JavaClass.parteII.aula04.polimorfismo.modeloVeiculo;
// SUBCLASSE Carro --> polimorfismo)
class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando com o motor V6!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o método da superclasse
        System.out.println("Tipo: Carro de passeio");
    }
}
