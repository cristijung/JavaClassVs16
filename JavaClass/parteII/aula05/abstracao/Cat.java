package JavaClass.parteII.aula05.abstracao;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " diz: Miau!");
    }
}