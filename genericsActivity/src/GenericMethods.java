import java.util.ArrayList;

public class GenericMethods {
    public <T> void printArrayList(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.println(element);
        }
    }
}