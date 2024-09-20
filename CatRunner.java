public class CatRunner {

    public static void main(String [] args) {
        Cat cat1 = new Cat("Penelope", 10, 22.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Marcus", 3, 12);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
