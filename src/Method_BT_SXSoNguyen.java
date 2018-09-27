import java.util.Scanner;

public class Method_BT_SXSoNguyen {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so thu nhat: ");
        num1 = scanner.nextDouble();
        System.out.print("Nhap vao so thu hai: ");
        num2 = scanner.nextDouble();
        System.out.print("Nhap vao so thu ba: ");
        num3 = scanner.nextDouble();
        System.out.println("SX theo thu tu tang dan la: ");
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        System.out.println(+num1 + "," + num2 + "," + num3);
    }
}
