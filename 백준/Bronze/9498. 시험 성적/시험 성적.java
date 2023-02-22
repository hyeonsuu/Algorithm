import java.util.*;

public class Main {

	 public static void main(String[] args) {

	 	Scanner in = new Scanner(System.in);

	 	int id = in.nextInt();

		if(id >= 90 && id <= 100) {
			System.out.println("A");
		} else if(id >= 80 && id < 90) {
			System.out.println("B");
		} else if(id >= 70 && id < 80) {
			System.out.println("C");
		} else if(id >= 60 && id < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	 }
}