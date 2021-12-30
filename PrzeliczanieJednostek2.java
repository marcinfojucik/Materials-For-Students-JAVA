// Progam przeliczający  jednostki litrów na galony Warian nr 2
class GalToLit {
    public static void main(String args[]) {
        double gallons, litres;
        int counter;
        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            litres = gallons * 3.7854; //zmiana na litry
            System.out.println(gallons + "galonów to" + litres + "litrów");
            counter++;
            // co dziesiąty wiersz wyświetla pusty wiersz(odstęp)
            if(counter == 10) {
                System.out.println();
                counter = 0; //zeruje licznik wierszy
            }
        }
    }
}