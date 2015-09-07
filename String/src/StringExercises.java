import java.util.Scanner;

public class StringExercises {
	public static boolean forgivingPrompt(String question) {
		//take in question
		System.out.println(question);
		while(true) { //for repeated prompting when user submits invalid repsonse
		System.out.println("Tell your response");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		
		if(response.equals("Y") ||response.equals("Yes") || response.equals("Yep") ||response.equals("y") ||response.equals("yes") || response.equals("yep") ||response.equals("YES") || response.equals("YEP")){
			return true;
		}
		if(response.equals("N") ||response.equals("No") || response.equals("Nope") ||response.equals("n") ||response.equals("no") || response.equals("nope") ||response.equals("NO") || response.equals("NOPE")){
			return false;
		}
	}
}
	public static int add(String line) {
		String[] splitted = (line.replaceAll("\\s","")).split("\\+"); //remove + and whitespace
		
		int sum = 0;
		
		for(int i = 0; i < splitted.length; i++)
		{
			sum += Integer.parseInt(splitted[i]); //adding to sum
		}
		System.out.println(sum);
		return sum;
	}
	public static String[] parseName(String s) {
		
		String[] splitted = s.split(","); //removing commas in string
	    String[] ordered = new String[3];
	    ordered[0] = splitted[1]; //returning correct order of names
	    ordered[1] = splitted[2];
	    ordered[2] = splitted[0];
	    return ordered;
		}
	

	public static void main(String[] args) {
		//testing forgivingPrompt
		boolean response = forgivingPrompt("Are you a Grinnellian?");
		if(response == true) {
			System.out.println("You answered yes");
		}
		if(response == false) {
			System.out.println("You answered no");
		}
		
		//testing parseName
		String names = "Turing,Alan,Mathison";
		String[] names2 = parseName(names);
		
		for(int i = 0; i < 3;i++)
		{
			System.out.print(names2[i] + " ");
		}
		//testing whitespace and + 
		String numbers = "0 + 8+6     + 9+3";
		add(numbers);
		
	}

}
