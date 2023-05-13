
import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args) {


    for (int i = 0; ; i++){
        test();
        }
    }

    public static void test(){
        Scanner input = new Scanner(System.in);


        /*---------------------------------------------------------------------------------------------------------------------*/
        // Input numbers
        System.out.print("Enter numbers separated by commas: ");
        String[] numbers = input.nextLine().split(",");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        // Create Basic Calculator and Scientific Calculator objects
        BasicCalculator basicCalculator = new BasicCalculator(nums) {

        };

        ScientificCalculator scientificCalculator = new ScientificCalculator(nums);

        // Display menu
        System.out.println("Select calculator:");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.print("Choice: ");
        int choice = input.nextInt();

        // Perform operations based on user choice
        int result;
        switch (choice) {
            case 1:
                System.out.println("Select operation:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.print("Choice: ");
                int op = input.nextInt();
                switch (op) {
                    case 1:
                        result = basicCalculator.add();
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = basicCalculator.subtract();
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = basicCalculator.multiply();
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        result = basicCalculator.divide();
                        System.out.println("Result: " + result);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
                break;
            case 2:
                System.out.println("Select operation:");
                System.out.println("1. Factorial");
                System.out.println("2. Square Root");
                System.out.println("3. Exponent");
                System.out.print("Choice: ");
                int op2 = input.nextInt();
                switch (op2) {
                    case 1:
                        result = scientificCalculator.factorial();
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        System.out.print("Enter number: ");
                        int num = input.nextInt();
                        result = scientificCalculator.squareroot(num);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        System.out.print("Enter base: ");
                        int base = input.nextInt();
                        System.out.print("Enter exponent: ");
                        int exp = input.nextInt();
                        result = scientificCalculator.exponent(base, exp);
                        System.out.println("Result: " + result);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            default:
                break;
        }
    }
}