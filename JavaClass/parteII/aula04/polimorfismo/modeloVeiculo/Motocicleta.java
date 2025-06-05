package JavaClass.parteII.aula04.polimorfismo.modeloVeiculo;
// NOVA SUBCLASSE MOTOCICLETA
class Motocicleta extends Veiculo {
    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está empinando e acelerando!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Motocicleta esportiva");
    }
}