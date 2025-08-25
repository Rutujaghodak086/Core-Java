import java.util.Scanner;

public class IncomeTax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual basic salary: ");
        double basic = sc.nextDouble();
        //sc.close();

        double tax;
        if (basic < 150000) {
            tax = 0;
        } else if (basic <= 300000) {
            tax = basic * 0.20;
        } else {
            tax = basic * 0.30;
        }

        System.out.printf("Income Tax = ₹%.2f%n", tax);
    }
}
