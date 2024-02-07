public class StringConcept {
    public static void main(String[] args) {

        // String name = new String("Kartik");
        // name = "Kartik Jaiswal";

        String name = "Kartik"; // Behind the scene, it is creating the object
        System.out.println("Hello! " + name);
        System.out.println(name.concat(" Jaiswal"));
        System.out.println("Charater at index 2:" + name.charAt(2));
        System.out.println(name.hashCode());

        // String Immutable Concept
        String city = "Bhopal";
        city = city + " Karondh Square";
        String s1 = "Jaiswal";
        String s2 = "Jaiswal";
        System.out.println("Is s1 equals to s2?:" + (s1 == s2));


        
    }
}
