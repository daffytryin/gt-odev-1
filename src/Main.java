public class Main {

    public static void main(String[] args) {
        SmartPhone[] smartPhoneArray = new SmartPhone[5];
        smartPhoneArray[0] = new SmartPhone(5000, "SP1", "123123", "507123456","123GB", "6GB","20MP");
        smartPhoneArray[1] = new SmartPhone(6000, "SP2", "123124", "507123457","128GB", "8GB","20MP");
        smartPhoneArray[2] = new SmartPhone(7502, "SP3", "123125", "507123458","64GB", "12GB","32MP");
        smartPhoneArray[3] = new SmartPhone(10000, "SP4", "123126", "507123459","128GB", "6GB","32MP");
        smartPhoneArray[4] = new SmartPhone(12000, "SP5", "123127", "507123460","128GB", "12GB","48MP");
        /*5 adet smartphone tanımladım*/
        double totalPrice = PhoneApp.calculateTotalPrice(smartPhoneArray); //PhoneApp sınıfı içerisindeki metodu çağırdım
        System.out.println("Total prize = " +totalPrice); //class içerisinde tanımladığım değer toplamını yazdırdım
    }
}
