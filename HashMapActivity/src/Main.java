public class Main {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.addKeyValuePair("apple", "red");
        myHashMap.addKeyValuePair("banana", "yellow");
        myHashMap.addKeyValuePair("cherry", "red");

        myHashMap.displayKeyValuePairs();

        myHashMap.removeKeyValuePair("cherry");

        System.out.println("\nAfter removing cherry:");

        myHashMap.displayKeyValuePairs();
    }
}