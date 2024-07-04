import java.util.*;
class Game
{
	public static void main(String ar[])
	{
		Scanner sin = new Scanner(System.in);
		System.out.println("Welcome to Guess Number Game\nYou Will Be Asked To guess A Number To Win The Game\nYou have Maximum of 5 Attempts");
		int at = 0;
		Random rand = new Random();
		int no = rand.nextInt(100);
		do{
			System.out.println("Enter a guess number between 1 to 100");
			int g= sin.nextInt();
			if(g == no)
			{
				System.out.println("OOhOOO!, Your number is Correct. You Win the Game!");
				break;
			}
			else if(g > no)
			{
				if((g-no) < 15)
				System.out.println("Your guess number is greater.");
				else
				System.out.println("Your guess number is more greater.");
			}
			else
			{
				if((no-g) < 15)
				System.out.println("Your guess number is smaller.");
				else
				System.out.println("Your guess number is more smaller.");
			}
			if(at==3)
			{
				System.out.println("Its Your Last Chance. Be Careful.");
			}
			at++;
		}while(at<5);
		if(at == 5)
		System.out.println("The Number is " + no);
	}
}