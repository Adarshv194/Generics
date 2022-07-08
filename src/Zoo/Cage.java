package Zoo;

// we use the generics where the classes are containers or a collection of things
// Generics with multiple upper bound types


public class Cage<E extends Animal & Eats & Runs> {
    private E animal1;
    private E animal2;

    public Cage(E animal1, E animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public E getAnimal1() {
        return animal1;
    }

    public E getAnimal2() {
        return animal2;
    }

    public static <T extends Animal> Boolean isCompatible(T animal1, T animal2) {
        return animal1.getType().equals(animal2.getType());
    }

    public void feedAnimal() {
        animal1.eat();
        animal2.eat();
    }

    public void runAnimal() {
        animal1.runs();
        animal2.runs();
    }
}



//public class Cage<T extends Animal> {
//    private T animal1;
//    private T animal2;
//
//    public Cage() {
//    }
//
//    public Cage(T animal1, T animal2) {
//        this.animal1 = animal1;
//        this.animal2 = animal2;
//    }
//
//    public T getAnimal1() {
//        return animal1;
//    }
//
//    public void setAnimal1(T animal1) {
//        this.animal1 = animal1;
//    }
//
//    public T getAnimal2() {
//        return animal2;
//    }
//
//    public void setAnimal2(T animal2) {
//        this.animal2 = animal2;
//    }
//
//    public void test() {
//
//    }
//}
