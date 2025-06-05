package JavaClass.parteII.aula04.heranca.modeloVeiculo;

public class TesteHeranca {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("Genérica", "XYZ");
        Carro meuCarro = new Carro("Porsche", "Carrera", 2);

        System.out.println("Veículo: " + meuVeiculo.marca + " " + meuVeiculo.modelo);
        meuVeiculo.acelerar();

        System.out.println("\nCarro: " + meuCarro.marca + " " + meuCarro.modelo + ", Portas: " + meuCarro.numeroDePortas);
        meuCarro.acelerar(); //chama o método sobrescrito
        meuCarro.frear();    //chama o método herdado
        meuCarro.abrirPortas(); //chama método específico da subclasse
    }

}