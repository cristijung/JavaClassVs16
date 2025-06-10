package JavaClass.parteIII.aula06.collections;

import java.util.TreeSet;

//TreeSet é um conjunto ORDENADO baseado em árvore binária de busca
public class MainTreeSet {
    public static void main(String[] args) {
        //criação
        TreeSet<Integer> numeros = new TreeSet<>();

        //add elementos
        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(9);
        numeros.add(1);

        //exibindo
        System.out.println("Números no conjunto: " + numeros);
        //remove
        numeros.remove(9);
        System.out.println("Depois de remover o 9: " + numeros);

        //iterando
        System.out.println("Iterando sobre o conjunto:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        //obter o menor e o maior num do conjunto
        int menorNum = numeros.first();
        int maiorNum = numeros.last();

        System.out.println("Menor número: " + menorNum);
        System.out.println("Maior número: " + maiorNum);
    }
}
