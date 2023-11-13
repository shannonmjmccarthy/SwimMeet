import java.util.Scanner;
public class Swim {
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner scanner = new Scanner(System.in);
	static int ready;
	static String name;
	static int player;
	public static void main(String[] args) {
		Meet.fillMeet();
		intro();
		test();
		lunch();
		arrival();
		sortedEvents();
		calc();
		//second pull accomplished 
}

	
	private static void intro(){
		System.out.println("Good Morning Sunshine! What is your name?");
		 name = scanner.nextLine();
		System.out.println("So, " + name + " do you know what day it is?");
		String answer =  scanner.nextLine();
		if(answer.equals("yes")) {
			System.out.println("Good! You have you swimsuit and goggles packed!");
			System.out.println("You have emailed your coach so you are put in the right events");
			ready = 10;
			
		}else {
			System.out.println("Thats ok, it's time for school!");
			ready = 5;
		}
		Meet.meet.add(new Swimmer(name, ready, 0,0,0));
		player = Meet.meet.size() -1;
	}
	private static void test(){
		System.out.println(Meet.meet.get(player).getPrep());
		//System.out.println(Meet.meet.get(player).getFood());
	}
	private static void lunch() {
		System.out.println("quick question-would you rather have");
		System.out.println("(press 1) chick fil a (yum), or (press 2) the nourishing lunch mom packed?");
		int answer = scanner.nextInt();
		if(answer==1) {
			Meet.meet.get(player).setFood(5);
		}else if(answer ==2){
			Meet.meet.get(player).setFood(10);
		}else {
			System.out.println("Oh no! You forgot to eat! This might be a rough day.");
			Meet.meet.get(player).setFood(0);
		}
	}
	private static void arrival() {
		System.out.println("Many hours later...");
		System.out.println("");
		System.out.println("It was a long day at school, but its time for your swim meet!");
		System.out.println("What kind of swimmer are you?");
		System.out.println("(1)Sprinter, (2)Distance or (3)Specialty?");
		int events = scanner.nextInt();
		Meet.meet.get(0).setEvents(events);
		int preped = Meet.meet.get(player).getPrep();
		int rand = (int)(Math.random()*3)+1;
		if(preped <=5) {
			Meet.meet.get(player).setSwimming(rand);
		}else{
			Meet.meet.get(player).setSwimming(events);
		}
	}
	private static void sortedEvents() {
		System.out.println("The events are posted!");
		System.out.println("You are swimming :");
		int officialEvents = Meet.meet.get(player).getSwimming();
		if(officialEvents == 3){
			System.out.println("100 Back, 200 I.M. ");	
			System.out.println("You are swimming against Jack Sparrow and Alex");
		}else if(officialEvents == 2){
			System.out.println("200 Free, 500 Free ");
			System.out.println("You are swimming agianst Jesus and Missy Franklen ");
		}else {
			System.out.println("50 Free, 100 Free");
			System.out.println("You are Swimming against Adam Sandler and Oprah");
		}
	}
	private static void calc() {
		//compare results and build a table
		
		//Meet.meet.get(player)
	}

}

