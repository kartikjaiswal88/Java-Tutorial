/*
 * Set:
 * Not allowed duplicates
 * Not following the sequence 
 * It doesn't have index value
 * HashSet doesn't give the sorted values while the TreeSet does
 */

// import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class CollectionConceptSet {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(5);
        nums.add(50);
        nums.add(34);
        nums.add(90);
        nums.add(12);
        nums.add(12);

        // for (int n : nums) {
        //     System.out.println(n);
        // }

        Iterator<Integer> values = nums.iterator(); 
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
