import java.util.Scanner;
public class Swim {
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner scanner = new Scanner(System.in);
	static int ready;
	static String name;
	static int player;
	static int officialEvents;
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
		 officialEvents = Meet.meet.get(player).getSwimming();
		if(officialEvents == 3){
			System.out.println("100 Back, 200 I.M.");	
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
		System.out.println();
		System.out.println("It is time for your race! The buzzer goes off and you dive in the water.");
		//Meet.meet.get(player)
		//Specialty
		if(officialEvents == 3) {
		specialty();
			System.out.println(Meet.meet.get(3).getName());
			System.out.println(Meet.meet.get(4).getName());
		}
		//distance
		else if(officialEvents == 2) {
			distance();
			System.out.println(Meet.meet.get(0).getName());
			System.out.println(Meet.meet.get(2).getName());
		}
		//sprints
		else if(officialEvents == 1) {
			sprinter();
			System.out.println(Meet.meet.get(1).getName());
			System.out.println(Meet.meet.get(5).getName());
		}
		
		//so this sorts through and finds the most prepared but i dont know what to do with this
		int prepMax = 0;
		for(int i = 0; i < 6; i++) {
			int check = Meet.meet.get(i).getPrep();
			if(check > prepMax) {
			prepMax = check;
		}
	}
		System.out.println(prepMax);

}
	private static void specialty() {
		
		int total = Meet.meet.get(player).getPrep() +  Meet.meet.get(player).getFood();
		int Jack = Meet.meet.get(4).getPrep() +  Meet.meet.get(4).getFood();
		int Alex = Meet.meet.get(3).getPrep() +  Meet.meet.get(3).getFood();
		System.out.println(total);
		System.out.println(Jack);
		System.out.println(Alex);
		
		if(total > Jack && total > Alex) {
			System.out.println("You Win!!");
		}else if(total < Jack && total < Alex) {
			System.out.println("You Lost!!");
		}
	}
	
	private static void sprinter() {
		
		int total = Meet.meet.get(player).getPrep() +  Meet.meet.get(player).getFood();
		int Adam = Meet.meet.get(1).getPrep() +  Meet.meet.get(1).getFood();
		int Oprah = Meet.meet.get(5).getPrep() +  Meet.meet.get(5).getFood();
		System.out.println(total);
		System.out.println(Adam);
		System.out.println(Oprah);
		
		if(total > Oprah && total > Adam) {
			System.out.println("You Win!!");
		}else if(total < Oprah && total < Adam) {
			System.out.println("You Lost!!");
		}
	}
	
	private static void distance() {
		
		int total = Meet.meet.get(player).getPrep() +  Meet.meet.get(player).getFood();
		int Jesus = Meet.meet.get(0).getPrep() +  Meet.meet.get(0).getFood();
		int Missy = Meet.meet.get(5).getPrep() +  Meet.meet.get(5).getFood();
		System.out.println(total);
		System.out.println(Jesus);
		System.out.println(Missy);
		
		if(total > Jesus && total > Missy) {
			System.out.println("You Win!!");
		}else if(total < Jesus && total < Missy) {
			System.out.println("You Lost!!");
		}
	}
}

