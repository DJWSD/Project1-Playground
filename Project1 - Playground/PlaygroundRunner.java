import java.util.Scanner;

public class PlaygroundRunner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        PlaygroundGame temp = new PlaygroundGame();
        int choice = 0;
        boolean consoleRunner = false;
       
            //Main runner of the program. Actions occur through here.
            while(!consoleRunner)
            {
                System.out.println("Now what would you like to do?");
                System.out.println("1. Use the monkey bars.");
                System.out.println("2. Play basketball.");
                System.out.println("3. Punt a child on the playground.");
                System.out.println("4. Use the swings.");
                System.out.println("5. Leave.");

                choice = sc.nextInt();
                
                //Runs the appropriate method based on user choice.
                if(choice == 1)
                {
                    consoleRunner = true;
                    temp.useMonkeyBars();
                    consoleRunner = false;
                }
                else if (choice == 2)
                {
                    consoleRunner = true;
                    temp.playBasketball();
                    consoleRunner = false;
                }
                else if (choice == 3)
                {
                    consoleRunner = true;
                    temp.puntChild();
                    consoleRunner = false;
                }
                else if (choice == 4)
                {
                    consoleRunner = true;
                    temp.useSwings();
                    consoleRunner = false;
                }
                else if (choice == 5)
                {
                    System.out.println("Come back anytime!");
                    consoleRunner = true;
                }
                else
                {
                    System.out.println("\nPlease type one of the numbers of the presented options.\n");
                }
            }
    }
}
