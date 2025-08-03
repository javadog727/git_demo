import java.util.Scanner;

public class Desmo0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位的整数");
        int s = scanner.nextInt();

        System.out.println(s % 10);
        System.out.println(s / 10 % 10);
        System.out.println(s / 100 % 10);
    }
}
