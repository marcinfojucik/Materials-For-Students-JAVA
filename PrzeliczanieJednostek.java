// Program przeliczający jednostki litrów na galony Wariant nr 1
class GalToLit {
    public static void main(String args[]) {
        double gallons; //przechowuje liczbę galonów
        double litres; // przechowuje liczbę litrów
        gallons = 10;
        litres = gallons * 3.7854; // zmiana na litry
        System.out.println(gallons + "galonów odpowiada " + litres + "litrom.");
    }
}