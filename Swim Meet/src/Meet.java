import java.util.ArrayList;
public class Meet {
	static  ArrayList <Swimmer> meet = new ArrayList <Swimmer>();
	public static void fillMeet() {
		
		 meet.add(new Swimmer("Jesus", 10, 10, 4,4));
		 meet.add(new Swimmer("Adam Sandler", 9, 5, 2,3));
		 meet.add(new Swimmer("Missy Franklen", 7, 5,3,2));
		 meet.add(new Swimmer("Alex", 12, 5,2,2));
		 meet.add(new Swimmer("Max", 1, 3, 3,5));
		 meet.add(new Swimmer("Joe Biden", 1, 3, 1,1));

	}

}
