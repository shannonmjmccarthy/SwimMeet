import java.util.Scanner;
public class Swim {
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner scanner = new Scanner(System.in);
	static int ready;
	static String name;
	public static void main(String[] args) {
		Meet.fillMeet();
		intro();
		test();
		competition();
		test();
}

	
	private static void intro(){
		System.out.println("Good Morning Sunshine! What is your name?");
		 name = scanner.nextLine();
		System.out.println("So, " + name + " do you know what day it is?");
		String answer =  scanner.nextLine();
		if(answer.equals("yes")) {
			System.out.println("Good! You have you swimsuit and goggles packed!");
			System.out.println("Make sure to email your coach so you are put in the right events");
			ready = 10;
			
		}else {
			System.out.println("Thats ok, it's time for school!");
			ready = 5;
		}
		Meet.meet.add(new Swimmer(name, ready, 0));
	}
	private static void test(){
		System.out.println(Meet.meet.get(4).getPrep());
		System.out.println(Meet.meet.get(4).getFood());
	}
	private static void competition() {
		System.out.println("quick question-would you rather have");
		System.out.println("(press 1) chick fil a (yum), or (press 2) the nourishing lunch mom packed?");
		int answer = scanner.nextInt();;
		if(answer==1) {
			Meet.meet.get(4).setFood(5);
		}else if(answer ==2){
			Meet.meet.get(4).setFood(10);
		}else {
			System.out.println("Oh no! You forgot to eat! This might be a rough day.");
			Meet.meet.get(4).setFood(0);
		}
	}

}

