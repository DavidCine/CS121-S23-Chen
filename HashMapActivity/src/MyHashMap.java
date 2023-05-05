import java.util.HashMap;

public class MyHashMap {
    private HashMap<String, String> hashMap = new HashMap<>();

    public void addKeyValuePair(String key, String value) {
        hashMap.put(key, value);
    }

    public void removeKeyValuePair(String key) {
        hashMap.remove(key);
    }

    public String getValueByKey(String key) {
        return hashMap.get(key);
    }

    public void displayKeyValuePairs() {
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}