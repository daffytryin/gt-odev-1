/*Sınıfları product -> phone -> smartphone sırayla birbirlerinin alt
 sınıfları olacak şekilde oluştururuz.(inheritance)
 Tablo üzerinde verilen tüm değerleri her sınıfa yazmaktansa en üst sınıf olan Product
 sınıfında id, name, price, Phone sınıfında phoneNumber, SmartPhone sınıfında storage,
 ram ve camera tanımlarız.
 Sınıflar içerisinde toplam fiyat bulunması isteniyor, bu nedenle price integer değer olarak
 tanımlanır.

* */

public class Product {
    int price;
    String id;
    String name;

    public Product(){

    } //no args Constructor
    Product(int price, String id, String name) {
        this.price = price;
        this.id = id;
        this.name = name;
    }//all args Constructor


    public int getPrice(){
        return price; //class içersinden fiyat birimini çeker, toplam fiyatı hesaplamak gerekli
    }
}
