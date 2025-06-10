package JavaClass.parteIII.aula07.funcional;
//ex. de Lambda
//expressões Lambdas p implementar uma interface funcional

//anotação q indica q a interface foi criada para ter um método abstrato
//método executar
@FunctionalInterface
interface Operacao {
    int executar(int a, int b);
}

//classe Lambda e o método
//a operação soma é a expressão lambda e implementa o método executar
public class Lambda {
    public static void main(String[] args) {
        Operacao soma = (a, b) -> a + b;
        Operacao multiplicacao = (a, b) -> a * b;

        System.out.println("Soma: " + soma.executar(4, 8));
        System.out.println("Multiplicação: " + multiplicacao.executar(10, 4));
    }
}

//uma das maiores características das funções Lambdas no Java é a simplicidade
//aplicada às expressões aliada a implementação de métodos.
