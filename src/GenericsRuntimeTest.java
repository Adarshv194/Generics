import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsRuntimeTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // the generic is being assigned to the reference variable as it is not assigned to the instance
        // where ever the reference variable goes it gonna check for the type for adding, retrieving and for all the operations
        // the generics is only used by the compiler so that we don't make these types of silly mistakes when it convert the code
        // into the byte code it just simply removes all the generics types and only the core list instance object is being passed to runtime
        // so we can conclude as when we write new ArrayList<>(); it just creates the list of objects but the type of
        // reference variable we use with the list -> List<Something(Java Type)> the java type kind of stick or a property of
        // the reference variable which is being used by the compiler at run time so that all the operation we make over the list object
        // belongs to a particular type
        addToName(names, "Name 1");
        addToName(names, "Name 2");
        /*List names2 = names;*/
        // When the generics are introduced they gets introduced in such a way that it should be backward compatible
        // we are just passing the reference of the instance to the ArrayList<>() which is being hold up by the List<String> names
        incorrectAddToName(names,2);
        /*System.out.println(names);
        String name = names.get(2);
        System.out.println(name);*/

        String []namesArray = new String[5];
        addToArray(namesArray, "Adarsh");
        incorrectAddToArray(namesArray, 10);
        System.out.println(namesArray[0]);
    }

    private static void incorrectAddToArray(Object[] namesArray, int i) {
        namesArray[0] = i;
    }

    private static void addToArray(String[] namesArray, String adarsh) {
        namesArray[0] = adarsh;
    }

    private static void incorrectAddToName(List names, int i) {
        names.add(i);
    }

    private static void addToName(List<String> names, String s) {
        names.add(s);
    }
}
