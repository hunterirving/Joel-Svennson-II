/*A note from Hunter Irving:

  Here is the original Joel Svensson Text-Based Adventure Game,
  created by Ashlynn Jones and Quentin Hickam in under 3 hours
  at the first Iota Omicron Iota game jam at Appalachian State University
  in September of 2015.

  This game is a lighthearted parody of beloved ASU Computer Science professor
  Joel Swanson, and took home first place in a community-choice vote at the
  game jam where it was created (check out the trophy they won here: https://skfb.ly/G7HZ).

  As it was such a hit among our circle of friends, my brother Josh and I were inspired
  to create a fan-sequel to the game which, to our surprise and delight, became
  officially recognized by Quentin and Ashlynn as canonical to the series.

  If there were to be a Joel Svensson III, I think it should be a VR game.

  -Hunter
*/


import java.util.Scanner;
public class JoelSvensson
{

    //THIS IS THE SWANSON TEXT BASED ADVENTURE!!!!!!!!!!!! It's a parody dude, not to be taken seriously. 

    private boolean consumedTears = false;
    private boolean rudeToSparks = false;
    private boolean ashlynnRevenge = false;
    private boolean svennyHumiliated = false;

    public static void main(String[] args)
    {
        JoelSvensson js = new JoelSvensson();
        js.starter();
        js.onYourWay();
        js.facultyLounge();
        js.discreteMath();
        js.officeHours();
        js.endOfTheDay();
    }

    public void starter()
    {
        System.out.println("This is a day in the life of computer science professor Joel Svensson. \n If you were magic, "
            + "then you could win this game. \n Type \"magic\" to start.");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        if (choice.equals("magic"))
        {
            System.out.println("Svensson time!");
        }
        else
        {  
            System.out.println("Well, SOMEBODY isn't listening.");
        }
    }

    public void onYourWay()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("You are on your way to teach your first class of the day at UNC Tweetsie. However, you need to eat your breakfast first.");
        System.out.println("What do you eat?");
        System.out.println("A. Raisin Bran\n" + "B. Eggs\n" + "C. The Tears of Your Students\n");
        String choice = s.nextLine();
        if (choice.equals("A") || choice.equals("a"))
        {
            System.out.println("Ahh, sweet regularity. +1 to Constitution.");
        }
        else if (choice.equals("B") || choice.equals("b"))
        {
            System.out.println("Protein! +1 to Strength.");
        }
        else
        {
            System.out.println("You drink your last bottle of tears from the Discrete Math final next semester. "
                + "You feel their power rejuvenating your spirit and making your body younger. "
                + "'Oh yeaaaah,\' you say, and burst through the wall of your home. +1 to Strength and Constitution.");
            consumedTears = true;
        }

        System.out.println("You get in your car and drive to school.");
    }

    public void facultyLounge()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("You arrive at Anne Sears Hall, the home of the computer science department. You enter the faculty lounge. Dr. Sparks, resident theory expert, is chilling out, playing Irritated Birds on her phone.");
        System.out.println("\'Hi, Joel,' she says warmly. Radiant goodness emanates from her eyes. 'How are you?'");
        System.out.println("A. I\'m great! How are you?\n" + "B. 'I\'m fine.'\n" + "C. Growl at her.\n");
        String choice = s.nextLine();
        if (choice.equals("A") || choice.equals("a"))
        {
            System.out.println("'I\'m just great, Joel! Thanks for asking!' Dr. Sparks grabs her coffee and happily leaves.");
        }
        else if (choice.equals("B") || choice.equals("b"))
        {
            System.out.println("\"That\'s good to hear, Joel!\" Dr. Sparks grabs her coffee and leaves.");
        }
        else
        {
            System.out.println("Dr. Sparks looks daggers at you. 'Don\'t make me use my cats on you, Joel.' She coldly turns away from you and leaves the lounge. You hear a faint, angry meow in the distance.");
            rudeToSparks = true;
        }
    }

    public void discreteMath()
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("You enter the building and see a room of 80 students anxiously awaiting your arrival. They quake in fear, awaiting the dastardly trickery that you may have in store for them.");
        System.out.println("What do you do?");
        System.out.println("A. Give a normal lecture.\n" + "B. Give a quiz.\n" + "C. Talk about Banjo-Kazooie.\n");
        String choice = s.nextLine();
        if (choice.equals("A") || choice.equals("a"))
        {
            System.out.println("The students watch you as you lecture. As you discuss the merits of 16-bit floating point numbers, you notice a young man in the third row who is using his phone.");
            System.out.println("A. Ignore him.\n" + "B. Call him out playfully.\n" + "C. Smack him with your yardstick.\n");
            String choice1 = s.nextLine();
            if (choice1.equals("A") || choice1.equals("a"))
            {
                System.out.println("You finish the lecture with minor issues.");
            }
            else if (choice1.equals("B") || choice1.equals("b"))
            {
                System.out.println("You say to the student, *Ehhhh... what\'s up doc?*"
                    + " He looks at you bemusedly for a second and then returns to his phone.");
            }
            else
            {
                System.out.println("You would get fired for that, so instead you wave it above his head. He squeals and falls back onto the floor.");
            }
        }
        else if (choice.equals("B") || choice.equals("b"))
        {
            System.out.println("You announce that it is a quiz day. The students scream in panic and scramble for their iClickers in a mad frenzy.");
            System.out.println("A. Do nothing as the students take their quiz.\n" + "B. Flick the lights on and off.\n" + "C. Smack the projector screen with your yard stick.\n");
            String choice1 = s.nextLine();
            if (choice1.equals("A") || choice.equals("a"))
            {
                System.out.println("Students frantically finish their quizzes as you watch with silent malice.");
            }
            else
            {
                System.out.println("The students flail about in a mad panic, helpless victims of your treachery.");
            }
        }
        else
        {
            System.out.println("You spend 50 minutes waxing nostalgic about Gobi the Camel\'s excursion to Hailfire Peaks.");
        }
    }

    public void officeHours()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("A wild student appears!");
        System.out.println("Mr. Svensson, help! You gave me a 30 on an assignment when I should have made a 70!");
        System.out.println("What do you do?");
        System.out.println("A. Apologize and fix her grade immediately.\n" + "B. Placate her with frozen yogurt.'\n" + "C. \"Miley, what\'s good?\"\n");
            String choice = s.nextLine();
        if (choice.equals("A") || choice.equals("a"))
        {
            System.out.println("She profusely thanks you and leaves your office.");
        }
        else if (choice.equals("B") || choice.equals("b"))
        {
            System.out.println("With your profound basketball skills, you fling a spoonful of frozen yogurt into her mouth. She seems confused, but happy. She leaves your office, rubbing her stomach.");
        }
        else
        {
            System.out.println("She flips her hair in defiance and vows revenge.");
            ashlynnRevenge = true;
        }
    }
    public void endOfTheDay()
    {
        System.out.println("You've had a long day. Now it's time to go home.");
        if (ashlynnRevenge)
        {
            System.out.println("A wild student reappears! \"I\'ll tell you what\'s good, Svenny! My banana cream pie!\" She tosses the pie at your face!");
            if (consumedTears)
            {
                System.out.println("You dodge the pie skilfully and give her an F in the class. She cries and runs away.");
            }
            else
            {
                System.out.println("The pie hits you directly in the face. She laughs and runs away. You clean yourself off sadly.");
                svennyHumiliated = true;
            }
        }
        if (rudeToSparks)
        {
            System.out.println("On your way out of the building, you again encounter Dr. Sparks. She glares at you. \"This is your second chance, Joel. How are you doing?\"");
            System.out.println("A. \"I\'m well, Dr. Sparks. Yourself? Sorry for being rude earlier.\"");
            System.out.println("B. \"Move it, lady.\"");
            Scanner s = new Scanner(System.in);
            String choice = s.nextLine();
            if (choice.equals("A") || choice.equals("a"))
            {
                System.out.println("\"Oh, it\'s fine, Joel! Have a great day!\" She leaves.");
            }
            else
            {
                System.out.println("She glares at you, penetrating your soul with her gaze. \"You butthead,\" she says. A swarm of cats emerge from her office and begin chasing you.");
                if (consumedTears)
                {
                    System.out.println("You leap out the window and land gracefully amidst the shards of glass. You begin to run to your car.");
                }
                else
                {
                    System.out.println("The cats maul you and leave you in a shambles. Dr. Sparks laughs at you as you go to tend your wounds.");
                    svennyHumiliated = true;
                }
            }
        }
        System.out.println("You make your way back to your car.");

        if (svennyHumiliated)
        {
            System.out.println("This was a bad day. You think you'll give two quizzes tomorrow.");
        }
        else
        {
            System.out.println("This was a good day. Maybe you won't give a quiz this week. You go home and happily dream of the new Banjo-Kazooie.");
        }
    }


}
