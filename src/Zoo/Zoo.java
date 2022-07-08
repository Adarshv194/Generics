package Zoo;

public class Zoo {
    public static void main(String[] args) {
        Cage<Monkey> monkeyCage = new Cage(new Monkey(), new Lion());
        // As here the right side of the expression gets evaluated and the compiler thinks that it's just a normal constructor
        // for creating cage with not the generic type
        // and then it assigns it to the left hand side to the reference variable of type Cage<Monkey>
        // this doesn't make any issue at the compiler level because the java provides the support for the backward compability
        // which says Primitive(List<String> or new Cage<>()) can be stored in the (List or new Cage()) and vice versa
        // to solve this issue we should make the

        /*Cage<Monkey> monkeyCage1 = new Cage<>(new Monkey(), new Lion());*/  // this will return in required type is Cage<Monkey>
        // at the left hand side but the right side is providing the Cage<Object>

        Cage<Monkey> monkeyCage2 = new Cage<Monkey>(new Monkey(), new Monkey());

       /*Cage<Monkey> monkeyCage = new Cage<Monkey>();
       monkeyCage.setAnimal1(new Monkey());
       monkeyCage.setAnimal2(new Monkey());

       Cage<Lion> lionCage = new Cage<Lion>();
       lionCage.setAnimal1(new Lion());
       lionCage.setAnimal2(new Lion());

       Cage<Tiger> tigerCage = new Cage<Tiger>();
       tigerCage.setAnimal1(new Tiger());
       tigerCage.setAnimal2(new Tiger());*/

        Cage<Monkey> monkeyCage1 = new Cage<Monkey>(new Monkey(), new Monkey());
        Monkey animal1 = monkeyCage1.getAnimal1();

        new Cage<>();

        /*Monkey monkey1 = new Monkey();
        monkey1.setType("medium");
        Monkey monkey2 = new Monkey();
        monkey2.setType("small");
        Lion lion = new Lion();
        lion.setType("medium");

        System.out.println(Cage.isCompatible(monkey1, lion));*/
    }
}
