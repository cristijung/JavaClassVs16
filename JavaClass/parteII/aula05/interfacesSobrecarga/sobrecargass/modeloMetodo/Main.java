package JavaClass.parteII.aula05.interfacesSobrecarga.sobrecargass.modeloMetodo;
//chamada da Main: O compilador Java sabe qual dos métodos somar chamar com
//base no número de argumentos que você passa ao chamar o método.
//se passarmos dois números, ele usa o da interface; se passar três, usa o sobrecarregado. \o/
//classe de execução
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //método 'somar' com dois argumentos
        int resultado1 = calc.somar(10, 20);
        System.out.println("Resultado da soma de dois números: " + resultado1);

        System.out.println("--------------------");

        //método 'somar' sobrecarregado com três argumentos
        int resultado2 = calc.somar(10, 20, 30);
        System.out.println("Resultado da soma de três números: " + resultado2);
    }
}