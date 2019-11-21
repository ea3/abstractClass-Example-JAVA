public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println(" this is my penguin name: " + getName() );
        System.out.println("I'm not very good at that, but I can swim");
    }
}
