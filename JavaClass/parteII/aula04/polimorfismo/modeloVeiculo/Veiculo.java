package JavaClass.parteII.aula04.polimorfismo.modeloVeiculo;
//SUPERCLASSE
class Veiculo {
    String marca;
    String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("O veículo genérico está acelerando.");
    }

    public void exibirDetalhes() {
        System.out.println("Veículo: " + marca + " " + modelo);
    }
}
