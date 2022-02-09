import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng số nguyên tố muốn in ra");
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }

    }

    private static boolean isPrime(int i) {
        if (i<2){
            return false;
        }else {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    return false;
                }

            }
            return true;
        }
    }

}
