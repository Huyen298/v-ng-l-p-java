import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số a");
        int number1= scanner.nextInt();
        System.out.println("Nhập số b");
        int number2= scanner.nextInt();
        number1= Math.abs(number1);
        number2= Math.abs(number2);
        while (number1!=number2){
            if (number1>number2){
                number1-=number2;
            }else {
                number2-=number1;
            }
        }
        System.out.println("Ước chung lớn nhất la "+number2);
    }
}
