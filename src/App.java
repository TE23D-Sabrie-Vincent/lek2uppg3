import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String val;
        val = scanner.next();

        double num1;
        num1 = scanner.nextDouble();

        double num2;
        num2 = scanner.nextDouble();


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
            System.out.println("Meny");
            System.out.println("1.Addition");
            System.out.println("2.Subtraktion");
            System.out.println("3.Multiplikation");
            System.out.println("4.division");
            System.out.println("5.Avsluta");
            System.out.println("Välj 1-5: ");

            if (val == "1") {
                System.out.println("Du valde Addition");
                 double result = 0;
                result = num1 + num2;

            }

            // switch (val) {
                
            //     case "1":
            //         result = num1 + num2;
                    
            //     case "2":
            //         result = num1 - num2;
                    
            //     case "3":
            //         result = num1 * num2;   

            //     case "4":
            //         result = num1 / num2;

            //     case "5":
            //         break;
            // }
            // System.out.println(result);
        // }
        scanner.close();
    }
}
