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
		//lunch();
		//arrival();
		test();
		lunch();
		arrival();
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

}

