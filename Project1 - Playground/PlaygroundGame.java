import java.util.Scanner;

public class PlaygroundGame
{   
    private boolean isOpen = true;
    Scanner sc = new Scanner(System.in);
    int choice = 0;

    //Initialization of the main program
    public PlaygroundGame()
    {
        System.out.println("Welcome to the local playground. What would you like to do?\n");
    }
    
    //Prints a message of using the slide.
    public void useSlide()
    {
        System.out.println("You joyfully slide down the slide.\n");
    } 

    //Prints a message of using the monkey bars.
    public void useMonkeyBars()
    {
        System.out.println("You swing from rung to rung until you reach the other side.\n");
    }

    //Prints a message of playing basketball. Your action is 1/3 randomly chosen things.
    public void playBasketball()
    {
        int basketballAction = (int) (Math.random()*6 + 1);
        
        if(basketballAction >= 5)
        {
            System.out.println("You made a 3-pointer!\n");
        }
        else if(basketballAction >= 2)
        {
            System.out.println("You made a 2-pointer!\n");
        }
        else
        {
            System.out.println("Talk about an air-ball.\n");
        }
    }

    //Instead of actually punting a child, you're reprimanded and the program ends.
    public void puntChild()
    {
        System.out.println("Why would you do such a thing? Just for that you don't get to use the playground anymore.");
        System.exit(0);
    }

    //Prompts you how many times to swing before swinging
    public void useSwings()
    {
        System.out.println("How many times do you want to swing?");
        choice = sc.nextInt();


        for(int t = 0; t < choice; t++)
        {
            System.out.println("*Swing*\n");
        }
        
    }
}
