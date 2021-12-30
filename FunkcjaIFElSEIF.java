//Przykład Zagnieżdzonej Funkcji IF-Else-IF
class IFElseIF {
    public static void main(String args[]) 
            throws java.io.IOException {
        char ch, answer = 'S';
        System.out.println("Pomyślałem literem z przedziału od A do Z.");
        System.out.println("Spróbuj ją odgadnąć: ");
        ch = (char) System.in.read(); //wczytuje znak
        if(ch == answer) System.out.println("***Dobrze***");
        else {
            System.out.print("...Niestety nie trafiłeś");
            if(ch < answer) System.out.println("zbyt nisko");
            //zagnieżdzona instukcja if
            else System.out.println("za wysoko");
        }
    }
}