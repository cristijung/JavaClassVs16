package JavaClass.parteII.aula05.abstracao;

abstract class Animal {
    //este é o atributo comum a todas as subclasses
    String name;

    //construtor
    public Animal(String name) {
        this.name = name;
    }

    //método concreto
    public void eat() {
        System.out.println(name + " está comendo.");
    }

    //método abstrato
    public abstract void makeSound();
}
