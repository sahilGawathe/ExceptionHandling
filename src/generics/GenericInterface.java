package generics;
//Generic interface
interface Pair<K, V> {
 K getKey();
 V getValue();
}

//Implementation of the generic interface
class KeyValuePair<K, V> implements Pair<K, V> {
 private K key;
 private V value;

 public KeyValuePair(K key, V value) {
     this.key = key;
     this.value = value;
 }

 @Override
 public K getKey() {
     return key;
 }

 @Override
 public V getValue() {
     return value;
 }
}

public class GenericInterface {
 public static void main(String[] args) {
     Pair<String, Integer> pair = new KeyValuePair<>("Age", 30);
     System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
 }
}
