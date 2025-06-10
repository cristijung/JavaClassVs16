package JavaClass.parteII.aula05.interfacesSobrecarga.interfaces;

public class Jacare implements Animal {
    private final String name;

    public Jacare(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " está comendo.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " ele não diz, ele come!");
    }
}
