package JavaClass.ParteI.Aula01;

public class ExeWhile {
    public static void main(String[] args) {
        int contador = 5;
        System.out.println("Iniciando um loop com While: ");

        while (contador < 5) {
            System.out.println("Após o loop while - Contador: " + contador);
            contador++;
        }
        System.out.println("Após o loop while - Contador Final: " + contador);


        contador = 0;
        System.out.println("\nIniciando outro loop while: ");
        while (contador < 3) {
            System.out.println("Dentro do while - Contador: " + contador);
            contador++;
        }
        System.out.println("Dentro do while - Contador: " + contador);
    }
}
