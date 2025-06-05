package JavaClass.parteII.aula04.heranca.modeloVeiculo;
//SUBCLASSE ou classe derivada
class Carro extends Veiculo {
    int numeroDePortas;

    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo); //chama o construtor da superclasse
        this.numeroDePortas = numeroDePortas;
    }

    //sobrescrevendo o método acelerar
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando rapidamente!");
    }

    public void abrirPortas() {
        System.out.println("As " + numeroDePortas + " portas do carro estão abrindo.");
    }
}