import java.util.Scanner;

public class thuchanh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int so = scanner.nextInt();
        if (so < 2) {
            System.out.println(so + "không phải số nguyên tố");
        }
        if (so >= 2) {
            int i;
            boolean check = true;
            for (i = 2; i <= Math.sqrt(so); i++) {
                if (so % i == 0) {
                    check = false;

                } else {
                    check = true;

                }
            }
            if (check) {
                System.out.println(so + "là số nguyên tố");
            } else {
                System.out.println(so + "không là số nguyên tố");
            }
        }
    }
}

