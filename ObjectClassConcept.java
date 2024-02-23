class Book {
    int price;
    String brand;


    public String toString() {
        return "Book [price=" + price + ", brand=" + brand + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (price != other.price)
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }

}

public class ObjectClassConcept {
    public static void main(String[] args) {
        Book ob = new Book();
        ob.brand = "Best Seller";
        ob.price = 250;
        System.out.println(ob);
        System.out.println(ob.toString());

        Book ob1 = new Book();
        ob1.brand = "Best Seller";
        ob1.price = 250;

        boolean result = ob.equals(ob1);
        System.out.println(result);

    }
}
