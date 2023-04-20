import java.util.Scanner;

public class PlaygroundGame
{
    Scanner sc = new Scanner(System.in);
    
    private boolean isOpen = true;
    private int timeOfDay = 7;

    public void useSlide()
    {
        System.out.println("You joyfully slide down the slide.");
        timeOfDay++;
    } 

    public void useMonkeyBars()
    {
        System.out.println("You swing from rung to rung until you reach the other side.");
    }

    public void playBasketball()
    {
        int basketballAction = (int) (Math.random()*6 + 1);
        
        if(basketballAction >= 5)
        {
            System.out.println("You made a 3-pointer!");
        }
        else if(basketballAction >= 2)
        {
            System.out.println("You made a 2-pointer!");
        }
        else
        {
            System.out.println("Talk about an air-ball.");
        }
    }


    public void puntChild()
    {
        System.out.println("Why would you do such a thing? Just for that you don't get to use the playground anymore.");
        System.exit(0);
    }

    public void useSwings(int t)
    {
        System.out.println("How many times do you want to swing?");
        String choice = sc.nextLine();
    }
}