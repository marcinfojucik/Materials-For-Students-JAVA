// Przykład Funkcji Switch
class Switch {
    public static void main(String args[]) {
        int x;
        for(x = 0; x < 10; x++)
            switch(x) {
                case 0:
                System.out.println("x jest równe zero");
                break;
                case 1:
                System.out.println("x jest równe jeden");
                break;
                case 2: 
                System.out.println("x jest równe dwa");
                break;
                case 3:
                System.out.println("x jest równe trzy");
                break;
                case 4:
                System.out.println("x jest równe cztery");
                break;
                default:
                System.out.println("x równe pięć lub więcej");
                    
            }
    }
}