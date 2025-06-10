package JavaClass.parteIII.aula06.collections;

import java.util.LinkedList;

//LinkedList --> lista ligada, vinculada
//implementa da List e Deque
public class MainLinkedList {
    public static void main(String[] args) {
        //criação
        LinkedList<String> tarefas = new LinkedList<>();

        //add elementos
        tarefas.add("Acordar cedo.");
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Ler um livro");

        //exibir
        System.out.println("Tarefas para fazer: " + tarefas);
        //add tarefa no início da lista
        tarefas.addFirst("Desligar o despertador!!");
        System.out.println("Ajuste de tarefas: " + tarefas);
        //add tarefa no final
        tarefas.addLast("Assistir seriado!");
        System.out.println("Ajuste de tarefas: " + tarefas);

        //iterando
        System.out.println("Iterando nas tarefas ....");
        for (String tarefa : tarefas) {
            System.out.println(tarefas);
        }

    }
}
