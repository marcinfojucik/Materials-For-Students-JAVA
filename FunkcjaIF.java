class If {
    public static void main(String args[]) 
            throws java.io.IOException {
        char ch, answer = 'S';
        System.out.println("Pomyslałem literę z przedziału od A do Z.");
        System.out.print("Spróbuj odgadnąć: ");
        ch = (char) System.in.read(); //wczytuje znak z klawiatury
        if(ch == answer) System.out.println("***Dobrze***");
    }
        
    
}
