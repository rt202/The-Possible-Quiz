import java.util.Scanner;
import java.util.Random;
public class impossiblequiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean again = true;
		boolean exit = false;
		int score = 0;
		Random randomGenerator = new Random();
		int answer = 1;
System.out.println("WELCOME TO THE POSSIBLE QUIZ!!!");
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
}
System.out.println("This quiz will ask you several questions.");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("Depending on your score, we will tell how smart you are.");
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
}



if (again == true) {
	int randomInt = randomGenerator.nextInt(3);
	System.out.println("QUESTION 1");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
	}
	System.out.println("Jacob's mother has three children. One's name is April, and another's name is May. What is the 3rd child's name?");
	String input = in.nextLine();
	if (input.equals("Jacob")||(input.equals("jacob"))){
		score = score+1;

	}
	else {
	}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("QUESTION 2!");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("A Ford Focus travels south at 40 MPH. Which direction is the exhaust moving?");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("Please answer the letter of your choice.");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("A - North");
System.out.println("B - South");
System.out.println("C - East");
System.out.println("D - West");
System.out.println("E - Up");
System.out.println("F - Nowhere");
String input2 = in.nextLine();
if (input2.equals("A")){
	
}
if (input2.equals("B")){
	
}
if (input2.equals("C")){
	
}
if (input2.equals("D")){
	
}
if (input2.equals("E")){
	
}
if (input2.equals("F")||(input2.equals("f"))){
	score = score+1;
}
else{
	
}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("QUESTION 3!");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("IS THE NUMBER ONE OR TWO????");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("This may require a bit of luck.");
String input3 = in.nextLine();
if (input3.equals(randomInt)){
	score = score+1;

}
else {
}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("QUESTION 4!");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("What town was this code made in?");
String input4 = in.nextLine();
if (input4.equals("Skillman")||(input4.equals("skillman"))){
	score = score + 1;

}
else{
}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("QUESTION 5!");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("Who is the artist of We are the World? Make sure to spell the name right!");
String input5 = in.nextLine();
if (input5.equals("USA for Africa")){
	score = score+1;

}
else{}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("Question 6!");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("What was different about this question? Please answer the letter of your choice.");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("A - The context");
System.out.println("B - The Capitalization");
System.out.println("C - The Question");
String input6 = in.nextLine();
if (input6.equals("B")||(input6.equals("b")||(input6.equals("C"))||(input6.equals("c")))){
	score = score+1;

}
else{
}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("QUESTION 7!");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("What goes after July 3rd?");
String input7 = in.nextLine();
if (input7.equals("?")){
	score = score + 1;

}
else {
}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("What state called the Bluegrass State?");
String input8 = in.nextLine();
if (input8.equals("Kentucky")||(input8.equals("kentucky"))){
	score = score + 1;

}
else{
}
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("LAST QUESTION!!!!!!");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("Did you enjoy this?");
String input9 = in.nextLine();
score = score + 1;

try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println("YOUR SCORE IS....");
try {
	Thread.sleep(1500);
} catch (InterruptedException e) {
}
System.out.println("LOADING...");try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
}
System.out.println("COLLECTING DATA...");
try {
	Thread.sleep(1900);
} catch (InterruptedException e) {
}
System.out.println("OTHER THINGS THAT RELATE TO WAITING...");
try {
	Thread.sleep(500);
} catch (InterruptedException e) {
}
System.out.println(score + " /9!");

while (answer == 1){
System.out.println("Would you like to play again? Please say Yes or No.");
String repeat = in.nextLine();
if (repeat.equals("yes")||(repeat.equals("Yes"))){
	again = true;
	answer = 0;
}
else if (repeat.equals("no")||(repeat.equals("No"))){
	again = false;
	answer = 0;
}
else{
	System.out.println("PLEASE ANSWER YES OR NO.");
	answer = 1;
}
}

	}
System.out.println("Thank you for playing");
}
}



	




