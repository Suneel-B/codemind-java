import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();
        int product = num1*num2;
        System.out.println(product);
    }
}