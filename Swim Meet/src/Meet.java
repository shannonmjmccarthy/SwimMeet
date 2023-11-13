import java.util.ArrayList;
public class Meet {
	static  ArrayList <Swimmer> meet = new ArrayList <Swimmer>();
	public static void fillMeet() {
		
		//1 for sprinter, 2 for distance, 3 for specialty
		
				//name, prepared, food, main events, what they swim in the meet 
		 meet.add(new Swimmer("Jesus", 10, 10, 2, 2));
		 meet.add(new Swimmer("Adam Sandler", 9, 5, 1, 1));
		 meet.add(new Swimmer("Missy Franklen", 7, 5, 3, 2));
		 meet.add(new Swimmer("Alex", 5, 5, 2, 3));
		 meet.add(new Swimmer("Jack Sparrow",8,5,3,3 ));
		 meet.add(new Swimmer("Oprah ",1,1,3,1));
		 

	}

}
