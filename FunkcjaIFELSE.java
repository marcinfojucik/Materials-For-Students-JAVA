//Przykład Funkcji IF-Else
class IfElse {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'S';
        System.out.println("Pomyslałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj ją odgadnąć: ");
        ch = (char) System.in.read();
        if(ch == answer) System.out.println("***Dobrze***");
        else System.out.println("...Niestety, nie trafiłeś.");
    }
}