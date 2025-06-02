package JavaClass.ParteI.Aula01;

import java.util.Arrays;

public class ArraysExemplos {
    public static void main(String[] args) {
        //declarando e inicializando um Array
        int[] numeros = {5, 3, 8, 1, 9, 7};

        System.out.println("Array original: " + Arrays.toString(numeros)); //'formata' a exibição do array como uma String
        System.out.println(numeros); //exibe o endereço da memória onde o Array está sendo armazenado

        //ordenando o array
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

        //buscar um elemento
        int posicao = Arrays.binarySearch(numeros, 8);
        System.out.println("Posição do número 8: " + posicao);

        //preenchendo 1 arrau com 1 valor específico
        int[] arrayPreenchido = new int[5];
        Arrays.fill(arrayPreenchido, 102);
        System.out.println("Array preenchido com 102: " + Arrays.toString(arrayPreenchido));

        //1. copiando e 2. comparando Arrays
        int[] copiaArray = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Cópia do Array: " + Arrays.toString(copiaArray));

        boolean iguais = Arrays.equals(numeros, copiaArray);
        System.out.println("Os Arrays são iguais?  " + iguais);

        //iterando sobre o array
        System.out.println("Elementos do Array com loop 'for': ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        //iterando sobre o array usando o forEach
        System.out.println("Elementos do Array com loop 'forEach': ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();



    }


}
