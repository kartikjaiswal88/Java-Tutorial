/*
 * Only private constructor is allowed
 * No. of Objects of Enum == Call for constructor
 * To get all the objects of enum  use values() method
 */
enum Mobile1 {
    Redmi(10000), Realme, Iphone(100000), Samsung(20000);

    private int price;

    private Mobile1() {
        price = 5000;
    }

    private Mobile1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumAdvanceConcept {
    public static void main(String[] args) {
        Mobile1 myMobile = Mobile1.Iphone;
        System.out.println(myMobile + ": " + myMobile.getPrice());

        for (Mobile1 mob : Mobile1.values()) {
            System.out.println(mob + ": " + mob.getPrice());
        }
    }
}
