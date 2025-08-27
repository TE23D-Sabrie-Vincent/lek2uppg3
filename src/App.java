import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        boolean bool = true;

        Scanner scanner = new Scanner(System.in);
        int val;
        val = scanner.nextInt();

        // for (int i = 0; i < args.length; i++) {

        // int input;
        // if (scanner.hasNextInt()) {
        // input = scanner.nextInt();
        // } else {
        // System.out.println("Skriv bara nummer, inga bokstäver!");
        // scanner.next();

        // break;
        // }
        // }

        // for (int i = 0; i < args.length;) {
        while (bool) {

            System.out.println("Meny");
            System.out.println("1.Addition");
            System.out.println("2.Subtraktion");
            System.out.println("3.Multiplikation");
            System.out.println("4.division");
            System.out.println("5.Avsluta");
            System.out.println("Välj 1-5: ");

            if (val == 5) {
                System.out.println("Stänger av");
                bool = false;
            }

            else if (val >= 1 && val <= 4) {
                System.out.println("Ange tal 1: ");

                double num1 = scanner.nextDouble();

                System.out.println("Ange tal 2: ");
                double num2 = scanner.nextDouble();

                double result = 0;

                result = num1 + num2;
                System.out.println(result);
            }

            // switch (val) {

            // case "1":
            // result = num1 + num2;

            // case "2":
            // result = num1 - num2;

            // case "3":
            // result = num1 * num2;

            // case "4":
            // result = num1 / num2;

            // case "5":
            // break;
            // }
            // System.out.println(result);
            // }
        }
        scanner.close();
    }
}
