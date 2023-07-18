public class SmartPhone extends Phone {

    String storage;
    String ram;
    String camera;

    SmartPhone(int price, String name, String id, String phoneNumber, String  storage, String ram, String camera) {
        super(price, name, id, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}
 /*
 *Not: Bir alt-sınıf, super() metodunu kullanarak, üst sınıfının bir
 *nesnesini yaratabilir ve onun değişkenlerine değer atayabilir. Ortak
 * nitelikler this ile tanımlanamadığından super kullanımı gereklidir.
 * */