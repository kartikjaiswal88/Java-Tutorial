/*
 * Map comes under the concept of Collection Api
 * It doesn't implement the collection interface
 * Not follow the sequence 
 * Key is always unique
 * Key can be assume as Set<Object> while values as List<Object>
 * .put ---> add + replace
 * HashMap is not synchronized while HashTable is.
 */

// import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CollectionAPIMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new Hashtable<>();
        students.put("kartik", 83);
        students.put("Irtiqa", 75);
        students.put("Jatin", 78);
        students.put("Anuj", 33);

        System.out.println(students);
        System.out.println(students.get("Anuj"));

        System.out.println(students.keySet());
        for (String key : students.keySet()) {
            System.out.println(key + ":" + students.get(key));
        }

    }
}
