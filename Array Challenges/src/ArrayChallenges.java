import java.util.Scanner;

public class ArrayChallenges
	{
		static boolean playAgain=true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput2= new Scanner(System.in);
		public static void main(String[] args)
			{
				do
					{
				System.out.println("Which challenge would you like to run? "
						+ "\n \n"
						+ "1) String Array \n"
						+ "2) Int Array Text \n"
						+ "3) Print Vertically \n"
						+ "4) Average Numbers"
						+ "\n \n"
						+ "Type the number that corresponds with your choice.");
				int userChoice = userInput2.nextInt();
				switch(userChoice)
				{
					case 1:
						runStringArray();
						break;
					case 2:
						runIntArray();
						break;
					case 3:
						printVertically();
						break;
					case 4:
						averageNumbers();
						break;
					default:
						System.out.println("User input not recognized.");
						break;
				}
				runAgain();
			}
			while(playAgain);
			}
			
			
			
			
		public static void runStringArray()
		{
			String holder = "Hello World";
			String[] strings = new String [5];
			for(int i=0; i<strings.length; i++)
				{
					strings[i]=holder.substring(i, i+1);
				}
			System.out.println(strings[2]);
		}
		public static void runIntArray()
		{
			int[] numbers = new int [5];
			for(int i=0; i<numbers.length; i++)
				{
					numbers[i]=i;
				}
			System.out.println(numbers[4]);
		}
		public static void printVertically()
		{
			int[] numbers = new int [5];
			for(int i=0; i<numbers.length; i++)
				{
					numbers[i]=i;
					System.out.println(numbers[i]);
				}
		}
		public static void averageNumbers()
		{
			double counter=0;
			int[] numbers = new int [5];
			
			for(int i=0; i<numbers.length; i++)
				{
					numbers[i]=i;
					counter+=numbers[i];
				}
			System.out.println(counter/numbers.length);
		}
		public static void runAgain()
			{
				System.out.println("");
				System.out.println("Would you like to run another challenge? (Type y/n for yes/no respectively)");
				String userChoice= userInput.nextLine();
				if((userChoice.equalsIgnoreCase("n")))
				{
				System.out.println("See you later!");
				playAgain=false;
				}
				
			}

	}
