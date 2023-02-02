import java.util.Scanner;

public class App {
    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws Exception {
        cls();
        Robots robot = new Robots();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Cheong-sun Fast Food Restaurant");
        System.out.println("Here are some packages we have");
        System.out.println("1. Package A (Hotdogs + French Fries + Drinks)");
        System.out.println("2. Package B (Hamburgers + French Fries + Drinks)");
        System.out.println("3. Package C (Fried Chicken + French Fries + Drinks)");
        System.out.println("Which packages you want to choose?");
        System.out.print(">>");
        int choice = sc.nextInt();

        long startTime = System.currentTimeMillis();

        switch (choice) {
            case 1:
                robot.HotdogsRobot();
                robot.FrenchfriesRobot();
                robot.DrinksRobot();
                System.out.println("\nYour food and drink are ready!!");

                break;

            case 2:
                robot.HamburgersRobot();
                robot.FrenchfriesRobot();
                robot.DrinksRobot();
                System.out.println("\nYour food and drink are ready!!");

                break;

            case 3:
                robot.FriedchickenRobot();
                robot.FrenchfriesRobot();
                robot.DrinksRobot();
                System.out.println("\nYour food and drink are ready!!");

                break;

            default:
                break;
        }

        long endTime = System.currentTimeMillis();

        System.out.println(
                "\n\n -------Thank you for ordering from our restaurant------- \n             -------See you next time------- ");

        System.out.println(
                "\n\n\nTime taken for program to run (from switch case until program ended) without Multithread: "
                        + (endTime - startTime) + "ms");
    }
}
