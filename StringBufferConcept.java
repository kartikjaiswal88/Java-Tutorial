public class StringBufferConcept {
    public static void main(String[] args) {

        // To have a string which is mutable
        StringBuffer sb = new StringBuffer("Kartik");
        System.out.println("Length of string is:" + sb.length());

        // Uses 16bytes in case of no contiguous memory available
        System.out.println("Capacity of string is:" + sb.capacity());

        sb.append(" Jaiswal");
        String str = sb.toString();
        System.out.println(str);

        sb.deleteCharAt(3);
        sb.insert(0, " Java");
        sb.setLength(30);
        sb.ensureCapacity(5);
        System.out.println("After deleting character at 3: " + (sb));
    }
}
