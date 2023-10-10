import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Chuyen doi tien te---");
        System.out.println("Nhap so tien USD :");
        long money = scanner.nextInt();
        long total = money*23000;
        System.out.println(money + " USD doi thanh "+ total +" VND");
    }
}
