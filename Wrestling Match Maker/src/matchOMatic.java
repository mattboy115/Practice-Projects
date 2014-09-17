
public class matchOMatic {
	public static void main (String [] args) {
	
	String [] wordListOne = {"The Crusher", "The Main Man", "The Macho-man, Randy Savage", "The Nature Boy, Rick Flare", "Batista", "Hollywood Hulk Hogan", "Vader", "The Undertaker", "Stone Cold Steve Austin" };
	String [] wordListThree = {"The Crusher", "The Main Man", "The Macho-man, Randy Savage", "The Nature Boy, Rick Flare", "Batista", "Hollywood Hulk Hogan", "Vader", "The Undertaker", "Stone Cold Steve Austin"};
	
	int oneLength = wordListOne.length;
	int threeLength = wordListThree.length;
	
	int rand1 = (int) (Math.random() * oneLength);
	int rand3 = (int) (Math.random() * threeLength);
	
	while(rand3 == rand1) {
	    rand3 = (int) (Math.random() * threeLength);
	}
	
	String phrase = wordListOne[rand1] + " and in the opposite corner is his opponent, " + wordListThree[rand3];
	
	System.out.print("In this corner we have " + phrase);
	System.out.println("!");
	}
}

