public class PhoneApp {


public static double calculateTotalPrice(SmartPhone[] smartPhoneArray){
    int totalPrice = 0;
    for(SmartPhone smartphone : smartPhoneArray)/*array elemanları kadar döngü oluşturuyorum*/ {
        totalPrice += smartphone.getPrice(); //Product sınıfında yazdığımız price değerini çekerek topluyorum
    }
    return totalPrice; //metodu toplam fiyatta bitiriyorum
}
}
