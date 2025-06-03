package JavaClass.parteII.aula02;
//anatomia de uma Classe no Java
public class Carro {
    //atributos --> características --> variáveis
    String cor;
    String modelo;
    int ano;
    boolean ligado;

    //construtor (opcional, mas extremamente útil)
    //é um método especial q vai ser chamado qdo se CRIAR um novo carro
    //ele serve para definir os valores iniciais dos atributos
    public Carro(String corDoCarro, String modeloDoCarro, int anoDoCarro) {
        System.out.println("Construindo um carro novo!");
        cor = corDoCarro;
        modelo = modeloDoCarro;
        ano = anoDoCarro;
        ligado = false;
    }

    //métodos --> ações --> operações, comportamentos
    //são funções que definem o que o carro PODE FAZER
    //método p ligar o carro
    public void ligar() {
        if (ligado) {
            System.out.println("O " + modelo + " já está ligado!");
        } else {
            ligado = true;
            System.out.println("O " + modelo + " ligou e roncou o motor!");
        }
    }

    //método p desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O " + modelo + " desligou");
        } else {
            System.out.println("O " + modelo + " já está desligado!");
        }
    }

    //método p mostrar as infos do carro
    public void mostrarInformacoes() {
        System.out.println("------- Informações do Carro -------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        if (ligado) {
            System.out.println("Estado: ligado");
        } else {
            System.out.println("Estado: desligado");
        }
        System.out.println("-----------------------------------------");
    }
}
