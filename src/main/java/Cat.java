public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("Cat " + name + " jumps on table");
    }
}
