public class Bintang {

    public static void main(String[] args) {
        int input = 5;

        for (int i = input; i >=1; i--) { 
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        for (int i = 1; i < input; i++) { 
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
