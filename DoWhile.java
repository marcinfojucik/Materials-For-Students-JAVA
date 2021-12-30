// Prykład Pętli Do-While
class DoWhile {
    public static void main(String args[])
            throws java.io.IOException {
        char x;
        do {
            System.out.print("Naciśnij dowolny klawisz a po nim ENTER: ");
            x = (char) System.in.read(); //wczytuje znak
        } while(x != 'q');
    }
}