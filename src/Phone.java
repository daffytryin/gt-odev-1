public class Phone extends Product {
    String phoneNumber;

    Phone(int price, String id, String name, String phoneNumber) {
        //this.price = price;
        //this.name = name;
        //this.id = id;
        super(price,name,phoneNumber);
        this.phoneNumber = phoneNumber;
    }
}
