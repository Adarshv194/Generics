import java.util.*;

public class GenericInheritance {
    public static void main(String[] args) {
        /*List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
        displayListElements(names);*/

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        /*displayListElements(integers);*/
        sumAllTheNumbers(integers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(10D);
        doubles.add(20D);
        sumAllTheNumbers(doubles);

        List<String> stringList = new ArrayList<>();
        /*sumAllTheNumbers(stringList);*/

        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2D);
        numbers.add(3F);
        addNumberToList(numbers, 1);
        addNumberToList(numbers, 1D);
        addNumberToList(numbers, 1F);

    }

    // Lower Bound Wildcard
    private static void addNumberToList(List<? super Number> numbers, Number number) {
        //      Parent can hold the reference of the child classes objects
        //      List<Number> numbers can add the objects of all the sub-classes in its list
        //      to be sure for that we have to confirm to the compiler that we always gonna pass
        //      at least the Number type in the method parameter
        //      if Number can hold the reference of all it's sub-classes objects then all the Number super classes too
        //      can hold the references of all the child classes objects of the Number class (Polymorphism)

        numbers.add(number); // I will be sure that it gonna at least be the List<Number>
    }

    // Upper Bound Wildcard
    private static void sumAllTheNumbers(List<? extends Number> numbers) {
        Number total = 0;
        for(Number number : numbers) {
        }
    }

    private static void displayListElements(List<?> list) {
        list.forEach(System.out::println);
        Object object = list.get(0);
//        names.add(1);
//        names.add("Test");
    }
}
