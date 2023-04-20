public class Rabbit extends Animal {
    private String eyeColor;

    public Rabbit(String name, int age, String eyeColor) {
        super(name, age);
        this.eyeColor = eyeColor;
    }

   @Override
    public void play() {

        System.out.println("Rabbit " + name + " is idling");
    }
    public void play(Toy toy) {

        System.out.println("Rabbit " + name + " is jumping with the toy " + toy);
    }

}
