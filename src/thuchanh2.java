import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        int money= scanner.nextInt();
        System.out.println("Số tháng gửi");
        int month= scanner.nextInt();
        System.out.println("Tỉ lệ lãi suất");
        double ratio = scanner.nextDouble();
        System.out.println("Số tiền lãi là ");
        double interest=0;
        for (int i = 0; i < month; i++) {
            interest += money*(ratio/100)/12*month;
            System.out.println(interest);
        }
    }
}
