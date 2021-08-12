import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        Scanner myObj = new Scanner(System.in);

        System.out.print("A: ");
        a = Integer.parseInt(myObj.nextLine());
        System.out.print("B: ");
        b = Integer.parseInt(myObj.nextLine());

        int r = a + b;

        System.out.println("Soma: " + r );
    }
}
