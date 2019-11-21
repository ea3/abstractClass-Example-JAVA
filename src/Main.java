public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        System.out.println("++++++++++++++++++");
        Parrot parrot = new Parrot("Colombian ringNeck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();
        System.out.println("+++++++++++++++++++++");
        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
        System.out.println("+++++++++++++++++++++++++");

    }


}
