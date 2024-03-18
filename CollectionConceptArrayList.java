/*
 * Collection objects doesn't work with indexes but List objects do!
 * Collection is an interface which is implemented by various classes like Arraylist
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionConceptArrayList {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(50);
        nums.add(34);
        nums.add(90);
        nums.add(12);

        for (int n : nums) {
            System.out.println(n);
        }

        List<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(66);
        arr.add(90);

        System.out.println(arr.get(0));
        System.out.println(arr.indexOf(66));

    }
}
