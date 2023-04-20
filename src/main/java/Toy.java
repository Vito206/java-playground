public class Toy implements Action {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Robot " + name + " is trying to stand up");

    }
    public void play(Toy toy) {
        System.out.println("Robot " + name + " is happy to see another toy " + toy);
    }

    public String toString() {
        return name;
    }
}
