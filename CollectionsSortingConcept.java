/*
 * Following are the key points of Concepts used in this code:
 * 1. Collections is a class of Collection Framework which has sort method
 * 2. If we want to sort on the basis of our own logic, we can use Comparator
 * 3. We have implemented Comparable interface for Student class and overridden compareTo() method
 * 4. We don't need Comparator for Integer because Integer class implemented the compare method 
 *    itself, but we need it in case of Student  class as we have defined our own logic for sorting
 * 5. Difference between Comparator and Comparable:
 *      - Comparable : It is an interface that provides a natural order for objects. Any object of a class  that implements Comparable can be compared with another object
 *                     It provides the implementation of compareTo() method
 *                     The object implements the natural ordering by implementing Comparable interface
 *                     In Comparable, we only override compareTo() method
 *      - Comparator : It is an interface that helps us to provide customized logic  for comparison
 *                     Instead of using Comparable, we can also use Comparator
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Creating a Student class with attributes name and age with constructor and toString method
class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return "Name : " + this.name + "\tAge : " + this.age;
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class CollectionsSortingConcept {

    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(47);
        nums.add(12);

        Collections.sort(nums, com);
        System.out.println(nums);

        Comparator<String> scom = new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else
                    return -1;
            }
        };

        List<String> s = new ArrayList<>();
        s.add("Kartik");
        s.add("John");
        s.add("Alexander");
        s.add("Alice");

        // Sort the list based on length of strings using comparator
        Collections.sort(s, scom);
        System.out.println(s);

        Comparator<Student> stuCom = (s1, s2) -> s1.age > s2.age ? 1 : -1;

        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student("Kartik", 23));
        stuList.add(new Student("John", 20));
        stuList.add(new Student("Alexander", 26));
        stuList.add(new Student("Riya", 24));

        // Sorting the list of students based on their age
        // Collections.sort(stuList, stuCom);

        // Sorting the list of students using Comparable interface in Student class
        // itself
        Collections.sort(stuList);
        System.out.println(stuList);

    }
}
