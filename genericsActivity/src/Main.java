import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();

        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        genericMethods.printArrayList(integerList);

        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));
        genericMethods.printArrayList(stringList);

        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(1.2, 2.3, 3.4, 4.5));
        genericMethods.printArrayList(doubleList);

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));
        genericMethods.printArrayList(charList);
    }
}