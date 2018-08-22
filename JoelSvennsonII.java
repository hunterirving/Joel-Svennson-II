// JOEL SVENNSON II
// A GAME BY HUNTER AND JOSH
// this game is a parody and not to be taken very seriously

import java.util.Scanner;

public class JoelSvennsonII
{
    private Scanner kb;
    private String current;

    private final int HANG = 1000;
    private final int TEXT = 50;

    public JoelSvennsonII()
    {
    kb = new Scanner(System.in);
    }

    public void hang()
    {
    try
    {
        Thread.sleep(HANG);
    }
    catch(InterruptedException e)
    {
        System.out.println("Error or somethin");
    }
    }

    public void doot(String dootme)
    {
        hang();
        for(int i = 0; i < dootme.length(); i++)
        {
            System.out.print(dootme.charAt(i));
            try
            {
				
                Thread.sleep(TEXT);
            }
            catch(InterruptedException e)
            {
                System.out.println("Whups");
            }   
        }
        System.out.print("\n");
    }

    public void medic()
	{
		doot("You feel your eyes roll back in your head.");
		doot("Everything goes dark.");
		hang();
		hang();
		doot("You wake up in a hospital bed.");
		doot("How long have you been out..?");
		doot("As the World Turns plays on a nearby TV.");
		doot("\"Good morning, Joel. Looks like you've made a full recovery~\"");
		doot("Whoa. The nurse is a total babe.");
		doot("Do you (a) Attempt to woo her with your extensive knowledge of decoders and multiplexors or (b) Talk about Banjo-Kazooie?");
		current = kb.nextLine();
		while (!current.equals("a") && !current.equals("A") && !current.equals("b") && !current.equals("B"))
                {
                        doot("Choose your destiny.");
						doot("The nurse is a total babe.");
						doot("Do you (a) Attempt to woo her with your extensive knowledge of decoders and multiplexors or (b) Talk about Banjo-Kazooie?");
                        current = kb.nextLine();
                }
		if(current.equals("a") || current.equals("A"))
        {
            doot("She unplugs your life support.");
        }
		else
		{
			doot("\"You mean Yooka-Laylee?? It looks great!!\"");
			doot("The two of you wax nostalgic about Gobi the Camel\'s excursion to Hailfire Peaks over hospital ice-cream.");
			doot("Could this be love..?");
			doot(" ");
			doot(" ");
			doot(" ");
			doot("<3");
			System.out.println(" ");
		}
	}

    public void run()
    {
        doot("You are Joel Svennson, UNC Tweetsie's most moustached Computer Science professor.");
        doot("Today was a bad day. You have several open wounds from Dr. Spark's attack cats.");
        doot("Do you (a) Seek medical attention, or (b) hobble to your car and drive home?");
        current = kb.nextLine();
        while (!current.equals("a") && !current.equals("A") && !current.equals("b") && !current.equals("B"))
                {
                        doot("Choose your destiny.");
                        doot("Do you (a) Seek medical attention, or (b) hobble to your car and drive home?");
                        current = kb.nextLine();
                }
        if(current.equals("a") || current.equals("A"))
        {
            medic();
        }
        else
        {
            doot("Yeah... it'll probably be fine. You stumble towards your car and drive home.");
            doot("As you enter the threshold, your iPod touch (4G) enters wifi range. You have three emails.");
			System.out.print("\n");
            doot(".");
			doot(".");
			doot(".");
			doot(" ");
            System.out.println("UNC TWEETSIE WEBMAIL\t\tSVENNSONJA@TWEETSIE.EDU");
            System.out.println("-------------------------------------------------------");
            System.out.println("somedude@hotmail.com\t\t- lol \t\t\t\t- 1 attachment (toodrunktohavesex.mp3");
            System.out.println("rewards@banjokazooiefanclub.net\t- Congratulations, BanjoFan42!!");
            System.out.print("brusselcb@tweetsie.edu\t\t- Joel, have you seen this??\t- 1 attachment (JoelSwanson.java)");
            doot("\n");
			hang();
			doot("Your iPod touch (4G) is dying and your charger is all the way over there.");
			doot("You only have enough battery life left to open one email. Which do you read?");
			doot("(a) toodrunktohavesex.mp3   (b) BanjoFan42   (c) JoelSwanson.java");
			current = kb.nextLine();
			while (!current.equals("a") && !current.equals("A") && !current.equals("b") && !current.equals("B") && !current.equals("c") && !current.equals("C"))
                {
                doot("Choose your destiny.");  
				doot("Your iPod touch (4G) is dying and your charger is all the way over there.");
				doot("You only have enough battery life left to open one email. Which do you read?");
				doot("(a) toodrunktohavesex.mp3   (b) BanjoFan42   (c) JoelSwanson.java");
				current = kb.nextLine();
                }
			if(current.equals("a") || current.equals("A"))
			{
				doot("Your iPod touch (4G) falls to the ground as you rush to your desktop computer.");
				doot("You immediately download the attachment to your desktop and open it with Windows Media Player.");
				doot("Your Beats by Dre (tm) headphones relay the sounds to your ears with unparalleled accuracy and crispness.");
				doot("You feel sadness...");
				doot("jealousy...");
				doot("love...");
				doot("regret...");
				doot("guilt...");
				doot("and.. joy.");
				doot("Exhausted from this overwhelming sensory experience, you pass out in your computer chair.");
				hang();
				doot("Press (w) to wait.");
				current = kb.nextLine();
				while (!current.equals("w") && !current.equals("W"))
                {
					doot("Just press (w).");
					
					current = kb.nextLine();
                }
				doot("Time passes.");
				hang();
				doot("You wake up in a cold sweat, clutching your favorite yardstick to your chest.");
				doot("Do you (a) Get up and get ready for another day of work, or (b) Roll over and go back to sleep?");
				current = kb.nextLine();
				while (!current.equals("a") && !current.equals("A") && !current.equals("b") && !current.equals("B"))
                {
					doot("Choose your destiny.");  
					doot("You wake up in a cold sweat, clutching your favorite yardstick to your chest.");
					doot("Do you (a) Get up and get ready for another day of work, or (b) Roll over and go back to sleep.");
					current = kb.nextLine();
                }
				if(current.equals("a") || current.equals("A"))
				{
					doot("Svennson time!");
					doot("Breakfast is the most important meal of the day.");
					doot("Do you have (a) Raisin Bran, (b) Eggs, or (c) the Tears of Your Students?");
					current = kb.nextLine();
					while (!current.equals("a") && !current.equals("A") && !current.equals("b") && !current.equals("B") && !current.equals("c") && !current.equals("C"))
					{
						doot("Breakfast is the most important meal of the day.");
						doot("Do you have (a) Raisin Bran, (b) Eggs, or (c) the Tears of Your Students?");
						current = kb.nextLine();
					}
					doot("OH SHIT. SOMEONE POSISONED YOUR BREAKFAST.");
					doot("WHO COULD HAVE DONE THIS.");
					doot("WHY WOULD THEY DO THIS.");
					doot("YOU'RE DEAD GAME OVER SEEYA IN THE JOEL SVENNSON ADVENTURE GAME PART III.");
					doot("releasing \"maybe someday\"");
					hang();
				}
				else if(current.equals("b") || current.equals("B"))
				{
					doot("Hey, you need your beauty sleep after all.");
					hang();
					doot("You wake up around a quarter to five and play some COD.");
					doot("Today was a good day. Maybe you won't give a quiz this week.");
				}
				
			}
			else if(current.equals("b") || current.equals("B")) //you chose banjo email
			{
				System.out.print("\n");
				doot(".");
				doot(".");
				doot(".");
				doot(" ");
				doot("Congratulations, BanjoFan42!!");
				doot("As the grand finalist in our Banjo-Kazooie trivia contest, you have been selected to meet Banjo-Kazooie composer GRANT KIRKHOPE!!");
				doot("Pack your bags broh!!!");
				System.out.print("\n");
				hang();
				doot("This is a dream come true.");
				hang();
				doot("As you pack your bags, you whistle the Spiral Mountain theme giddily.");
				doot("You purchase a first-class plane ticket on expedia.com and hop in your car.");
				doot("The drive to the airport is a long one. Let's crank up some tunes.");
				doot("Do you listen to (a) FM 107.5, (b) FM 98.7, or (c) AM 100.5 ?");
				current = kb.nextLine();
				if(current.equals("a") || current.equals("A"))
				{	
					doot("107.5 SQL.. a pop station. I wonder what the kids are listening to these days?");
					hang();
					doot("You jam out to Taylor Swift\'s \"Bad Blood\" Like nobody\'s watching.");
				}
				else if(current.equals("b") || current.equals("B"))
				{	
					doot("Oldies 98, your favorite!! You sing along to \"16 Candles\" by The Crests.");
				}
				else if(current.equals("c") || current.equals("C"))
				{	
					doot("It's just static.");
				}
				else
                {
					doot("Silence is golden. There's nothing good on the radio these days anyway.");
                }
				
				doot("You arrive at the airport and board your plane.");
				hang();
				doot("The in-flight movie is Kung-Fu Panda. Most excellent.");
				hang();
				doot("You feel your eyelids getting heavy.");
				doot("You fall asleep and dream you are a Kung Fu master.");
				doot("Evil ninjas are attacking you from all directions.");
				doot("Do you (a) do a kung-fu kick, or (b) a kung-fu punch?");
				current = kb.nextLine();
				doot("The ninjas overtake you.");
				doot("Everything goes black.");
				hang();
				doot("You jolt awake. Your plane has arrived in sunny San Diego California.");
				doot("What a dream...");
				doot("You enter the airport. Grant Kirkhope is there, holding a sign that reads \"Svennson.\"");
				doot("After a lengthy discussion about the golden age of video games, the two of you hop into Grant Kirkhope\'s \'95 Ford Escort to head out to lunch.");
				doot("Duran Duran's \"Hungry Like the Wolf\" plays on the radio.");
				doot("(a) I love Duran Duran!! (b) I love Duran Duran!!");
				current = kb.nextLine();
				while (!current.equals("a") && !current.equals("A") && !current.equals("b") && !current.equals("B"))
                {
					doot("Choose your destiny.");  
					doot("Duran Duran's \"Hungry Like the Wolf\" plays on the radio.");
					doot("(a) I love Duran Duran!! (b) I love Duran Duran!!");
					current = kb.nextLine();
                }
				if(current.equals("a") || current.equals("A"))
				{
					doot("The \'95 Ford Escort grinds to a screeching halt.");
					doot("\"Get out.\"");
					doot("Your childhood hero throws you out of his modest consumer automobile.");
					
					doot("\"It's pronounced \'Duran Duran,\' you bloody wanker.\"");
					doot("Grant Kirhope speeds off into the sunset. All you can do is watch.");
					doot("A single tear rolls down your cheek.");
					doot("The only friend you have now is your moustache.");
					
					doot(" ");
					doot("THE END");
					System.out.print("\n");
					
				}
				else if(current.equals("b") || current.equals("B"))
				{
					doot("\"Me too!!\"");
					doot("You ride off into the sunset with your new best friend.");
					
					doot(" ");
					doot("THE END");
					System.out.print("\n");
				}
				
			}
			else if(current.equals("c") || current.equals("C")) //you chose the java game one
			{
				System.out.print("\n");
				doot(".");
				doot(".");
				doot(".");
				doot(" ");
				System.out.print("Joel, have you seen this?? Dr. Sparks sent me this text-based java game... the main character reminds me of someone ;)");
				System.out.println("\n");
				doot("You download the attachment and use the \"javac\" command to compile the java source code into an executable.");
				doot("You type \"java JoelSwanson\" to run the executable.");
				doot("Enraged by the fact that you have become a living meme...");
				
				doot("...you use the \"rm\" command to delete the files.");
				doot(" ");
			}
        }
    }

    public static void main(String args[])
    {
        JoelSvennsonII game = new JoelSvennsonII();
        game.run();
    }
}

