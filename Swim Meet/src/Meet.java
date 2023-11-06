import java.util.ArrayList;
public class Meet {
	static  ArrayList <Swimmer> meet = new ArrayList <Swimmer>();
	public static void fillMeet() {
		
		 meet.add(new Swimmer("Jesus", 10, 10));
		 meet.add(new Swimmer("Meg", 9, 5));
		 meet.add(new Swimmer("Water", 7, 5));
		 meet.add(new Swimmer("Ice", 12, 5));

	}

}
