import java.util.ArrayList;
import java.util.ListIterator;

public class removeElement {
    
	public static void main(String[] args)
	{

		// Create an ArrayList
		ArrayList<String> colors = new ArrayList<String>();

		// Add elements to above ArrayList
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Pink");
		colors.add("Black");
		colors.add("Green");

		// ArrayList ={Red, White, Blue, Pink, Black, Green}
		ListIterator<String> listIterator
			= colors.listIterator();

		System.out.println("List Before remove() method = "
						+ colors);

		
		for (int i = 0; i < 3; i++) {
			listIterator.next();
		}

		listIterator.remove();

		System.out.println("List After remove() method = "
						+ colors);
	}
}

