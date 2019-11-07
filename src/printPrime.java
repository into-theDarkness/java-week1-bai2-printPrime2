import java.util.Scanner;

public class printPrime {
    static int N = 2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so lam moc: ");
        int number = input.nextInt();
        for ( int i =2; i < number; i++){
            if(checkPrime(i) ==true){
                System.out.println(i);
            }
        }
    }

    public static boolean checkPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
