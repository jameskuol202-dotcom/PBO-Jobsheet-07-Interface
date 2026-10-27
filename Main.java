public class Main {

    public static void main(String[] args) {
        Kipas kipas = new Kipas("Kipas Angin", 150000, "Putih", "Miyako");
        TV tv = new TV("LED", 20, 2500000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 2800000, "Silver", "Sharp");
        SmartFridge smartFridge = new SmartFridge(10, 3, 9500000, "Hitam", "LG");

        System.out.println(kipas.getInfo());
        System.out.println();
        System.out.println(tv.getInfo());
        System.out.println();
        System.out.println(kulkas.getInfo());
        System.out.println();
        System.out.println(smartFridge.getInfo());

        System.out.println();
        System.out.println("--- Uji Audible ---");
        tv.naikkanVolume(5);
        smartFridge.turunkanVolume(4);
        System.out.println("Volume TV setelah naik 5            : " + tv.getVolume());
        System.out.println("Volume SmartFridge setelah turun 4  : " + smartFridge.getVolume());
    }
}
